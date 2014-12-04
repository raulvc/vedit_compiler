/*
    Visitor responsável pela análise semântica
*/

import java.io.File;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SemanticVisitor extends veditBaseVisitor <Void> {        
    String current_file; 
    Boolean convert_set = false; // flag que indica se em um mesmo arquivo já foi configurado um convert    

    @Override 
    public Void visitEditing(veditParser.EditingContext ctx) { 
        // eliminando as aspas e extraindo o filepath        
        String path = veditUtil.removeQuotes(ctx.FILEPATH().getText());
        String filepath = path.replace("~",System.getProperty("user.home"));        
        File f = new File(filepath);
        // linha do filepath
        Integer pos_filepath = ctx.FILEPATH().getSymbol().getLine();
        if (!f.exists()){
            // arquivo não existe            
            String msg = "Linha " + String.format("%d", pos_filepath) + ": Arquivo " + filepath + " não encontrado";                            
            throw new ParseCancellationException(msg);            
        }
        else if (!f.canWrite()){
            // sem permissão de escrita            
            String msg = "Linha " + String.format("%d", pos_filepath) + ": Arquivo " + filepath + " sem permissão de escrita";                            
            throw new ParseCancellationException(msg);            
        }
        // testando o formato                        
        if (!veditUtil.isVideoFormat(f.getName())){
            // formato desconhecido p/ vídeo (ou é jpg ou é png, caso contrário é barrado no léxico)            
            String msg = "Linha " + String.format("%d", pos_filepath) + ": Extensão do arquivo " + filepath + " não suportada";
            throw new ParseCancellationException(msg);            
        }                
                
        current_file = f.getAbsolutePath();                
        
        visitChildren(ctx);
        convert_set = false;
        return null;
    }
    
    @Override 
    public Void visitCutting(veditParser.CuttingContext ctx) {         
        // o primeiro FILEPATH é o arquivo a ser cortado
        TerminalNode fp = ctx.FILEPATH().get(0);        
        // eliminando as aspas e extraindo o filepath
        String filepath = veditUtil.removeQuotes(fp.getText().replace("~",System.getProperty("user.home")));        
        File f = new File(filepath);
        // linha do filepath
        Integer pos_filepath = fp.getSymbol().getLine();
        if (!f.exists()){
            // arquivo não existe
            String msg = "Linha " + String.format("%d", pos_filepath) + ": Arquivo " + filepath + " não encontrado";
            throw new ParseCancellationException(msg);            
        }
        else if (!f.canRead()){
            // sem permissão de leitura            
            String msg = "Linha " + String.format("%d", pos_filepath) + ": Arquivo " + filepath + " sem permissão de leitura";
            throw new ParseCancellationException(msg);
            
        }        
        else if (!veditUtil.isVideoFormat(f.getName())){            
            // formato desconhecido p/ vídeo (ou é jpg ou é png, caso contrário é barrado no léxico)            
            String msg = "Linha " + String.format("%d", pos_filepath) + ": Extensão do arquivo " + filepath + " não suportada";
            throw new ParseCancellationException(msg);            
        }
        
        // testando o arquivo alvo (o arquivo que será gerado)
        TerminalNode tp = ctx.FILEPATH().get(1);
        Integer pos_targetpath = tp.getSymbol().getLine();
        // eliminando as aspas
        String targetpath = veditUtil.removeQuotes(tp.getText().replace("~",System.getProperty("user.home")));
        File f_target = new File(targetpath);
        if (!veditUtil.canWrite(f_target)){
            // não consegue criar o arquivo
            String msg = "Linha " + String.format("%d", pos_targetpath) + ": Sem permissão para criar o arquivo " + targetpath;                
            throw new ParseCancellationException(msg);
        }
        // testando o formato do alvo        
        if (!veditUtil.isVideoFormat(f_target.getName())){
            // formato desconhecido p/ vídeo (ou é jpg ou é png, caso contrário é barrado no léxico)            
            String msg = "Linha " + String.format("%d", pos_targetpath) + ": Extensão do arquivo " + targetpath + " não suportada";
            throw new ParseCancellationException(msg);
        }
        
        // testando o tempo                
        Long target_max_time_in_ms = veditUtil.stringToMs(ctx.TIME(1).getText());
        Long real_max_time_in_ms = veditUtil.durationInMs(f);
        if (target_max_time_in_ms > real_max_time_in_ms){
            // tempo de corte excede a duração do vídeo
            int pos_time = ctx.TIME(1).getSymbol().getLine();
            String msg = "Linha " + String.format("%d", pos_time) + ": tempo de corte excede a duração do vídeo.";
            throw new ParseCancellationException(msg);
        }
        
        return visitChildren(ctx);
        
    }
    
    @Override 
    public Void visitClause(veditParser.ClauseContext ctx) {        
        String raw_clause = ctx.getText();                               
        if (ctx.SCALE() != null){
            // operação de scale            
            String param = raw_clause.substring(raw_clause.lastIndexOf("scale")+"scale".length());            
            Integer width = Integer.parseInt(param.substring(0,param.lastIndexOf(':')));            
            Integer height = Integer.parseInt(param.substring(param.lastIndexOf(':')+1));
            Integer pos_scale = ctx.SCALE().getSymbol().getLine();
            if (width > 1600 || width < 20){                
                // valores insanos para largura
                String msg = "Linha " + String.format("%d", pos_scale) + ": Largura inviável: " + width;
                throw new ParseCancellationException(msg);
            }
            else if (height > 1600 || height < 20){                
                // valores insanos para altura
                String msg = "Linha " + String.format("%d", pos_scale) + ": Altura inviável: " + height;
                throw new ParseCancellationException(msg);
            }                        
        }
        else if (ctx.SPEEDUP() != null){
            // operação de speedup
            Integer speedup_factor = Integer.parseInt(raw_clause.substring(raw_clause.lastIndexOf("speedup")+"speedup".length()));
            Integer pos_speedup = ctx.SPEEDUP().getSymbol().getLine();
            if (speedup_factor > 200){
                // valor insano para speedup
                String msg = "Linha " + String.format("%d", pos_speedup) + ": Fator de velocidade muito alto: " + speedup_factor;
                throw new ParseCancellationException(msg);
            }
        }
        else if (ctx.SLOWDOWN() != null){
            // operação de slowdown
            Integer slowdown_factor = Integer.parseInt(raw_clause.substring(raw_clause.lastIndexOf("slowdown")+"slowdown".length()));
            Integer pos_slowdown = ctx.SLOWDOWN().getSymbol().getLine();
            if (slowdown_factor > 200){
                // valor insano para slowdown
                String msg = "Linha " + String.format("%d", pos_slowdown) + ": Fator de redução muito alto: " + slowdown_factor;
                throw new ParseCancellationException(msg);
            }
        }
        else if (ctx.WRITE() != null){
            // operação de write
        }
        else if (ctx.WATERMARK() != null){
            // operação de marca d'água
            String param = raw_clause.substring(raw_clause.lastIndexOf("watermark")+"watermark".length());
            // removendo aspas
            String imgpath = veditUtil.removeQuotes(param.replace("~",System.getProperty("user.home")));            
            Integer pos_watermark = ctx.WATERMARK().getSymbol().getLine();
            File imgfile = new File(imgpath);
            if (!veditUtil.canRead(imgfile)){
                // não consegue acessar a imagem
                String msg = "Linha " + String.format("%d", pos_watermark) + ": Não é possível acessar o arquivo " + imgpath;
                throw new ParseCancellationException(msg);
            }            
        }
        else if (ctx.PADDING() != null){
            // operação de padding            
            String param = raw_clause.substring(raw_clause.lastIndexOf("padding")+"padding".length());
            Integer padding = Integer.parseInt(param);
            File f = new File(current_file);
            Integer width = veditUtil.width(f);
            Integer height = veditUtil.height(f);
            if (!(padding < width && padding < height)){                
                // tamanho do padding excede o tamanho do video em uma das coordenadas
                // obs: só estou trabalhando com padding de mesmo tamanho em x e em y
                Integer pos_padding = ctx.PADDING().getSymbol().getLine();
                String msg = "Linha " + String.format("%d", pos_padding) + ": Padding excede o tamanho permitido.";
                throw new ParseCancellationException(msg);
            }
        }
        else if (ctx.VOLUME_BOOST() != null){
            // operação de aumentar o volume
        }
        else if (ctx.HFLIP() != null){
            // operação de virar horizontalmente (espelhar)
        }
        else if (ctx.VFLIP() != null){
            // operação de virar verticalmente
        }
        else if (ctx.ROTATE() != null){
            // operação de rotacionar
        }
        
        return visitChildren(ctx); 
    }
    
    @Override
    public Void visitConvert_clause(veditParser.Convert_clauseContext ctx) {
        // operação de convert        
        String fmt = veditUtil.removeQuotes(ctx.FORMAT().getText());
        Integer pos_convert = ctx.FORMAT().getSymbol().getLine();
        if (!veditUtil.isVideoFormat(fmt)){
            // formato errado para imagem
            String msg = "Linha " + String.format("%d", pos_convert) + ": Formato imcompatível para conversão: " + fmt;
            throw new ParseCancellationException(msg);
        }
        else if (convert_set){
            // mais de um convert no mesmo contexto
            String msg = "Linha " + String.format("%d", pos_convert) + ": Apenas uma conversão é aceita por arquivo.";
            throw new ParseCancellationException(msg);
        }
        convert_set = true;
        return visitChildren(ctx); 
    }
    
    @Override 
    public Void visitClauses(veditParser.ClausesContext ctx) { 
        if (ctx.FROM() != null){
            // é um bloco            
            // testando o tempo                
            Long target_max_time_in_ms = veditUtil.stringToMs(ctx.TIME(1).getText());
            File f = new File(current_file);
            Long real_max_time_in_ms = veditUtil.durationInMs(f);
            if (target_max_time_in_ms > real_max_time_in_ms){
                // tempo do bloco excede a duração do vídeo
                int pos_time = ctx.TIME(1).getSymbol().getLine();
                String msg = "Linha " + String.format("%d", pos_time) + ": tempo do bloco excede a duração do vídeo.";
                throw new ParseCancellationException(msg);
            }            
            visitChildren(ctx);            
            return null;
        }        
        return visitChildren(ctx);
    }
    
    
}