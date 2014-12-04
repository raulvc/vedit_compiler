import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CodeVisitor extends veditBaseVisitor <Void> {
    
    PrintWriter writer;
    String current_file; 
    Boolean convert_set = false; // flag que indica se em um mesmo arquivo já foi configurado um convert    
    ArrayList<String> batch; // comandos que devem ser executados por último

    public CodeVisitor() {
        this.batch = new ArrayList<String>();
        try {
            this.writer = new PrintWriter("script.sh", "UTF-8");
        }
        catch (IOException ex){
            String msg = "Não foi possível gerar o script de saída: " + ex.getMessage();
            throw new ParseCancellationException(msg);
        }
    }
    
    @Override 
    public Void visitScript(veditParser.ScriptContext ctx) { 
        visitChildren(ctx); 
        if (!batch.isEmpty()){            
            for (String cmd : batch){
                writer.println(cmd);
            }
        }
        return null;
    }

    @Override 
    public Void visitEditing(veditParser.EditingContext ctx) { 
        // eliminando as aspas e extraindo o filepath        
        String filepath = veditUtil.removeQuotes(ctx.FILEPATH().getText());                 
        File f = new File(filepath);
        current_file = f.getAbsolutePath();                
        return visitChildren(ctx);                
    }
    
    @Override 
    public Void visitCutting(veditParser.CuttingContext ctx) {         
        // o primeiro FILEPATH é o arquivo a ser cortado
        TerminalNode fp = ctx.FILEPATH().get(0);
        TerminalNode tp = ctx.FILEPATH().get(1);
        // eliminando as aspas e extraindo o filepath        
        File f = new File(veditUtil.removeQuotes(fp.getText()));
        String filepath = f.getAbsolutePath();        
        File t = new File(veditUtil.removeQuotes(tp.getText()));
        String targetpath = t.getAbsolutePath();
        String from = ctx.TIME(0).getText();
        String to = ctx.TIME(1).getText();
        
        String cmd = "ffmpeg -i " + filepath + " -ss " + from + " -t " +
                to + " -async 1 -strict -2 -y " + targetpath;
        writer.println("# Cutting video from " + from + " to " + to);
        writer.println(cmd);                  
        return visitChildren(ctx);        
    }
    
    @Override 
    public Void visitClause(veditParser.ClauseContext ctx) {        
        String raw_clause = ctx.getText();               
                
        if (ctx.SCALE() != null){
            // operação de scale            
            String param = raw_clause.substring(raw_clause.lastIndexOf("scale")+"scale".length());
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd = "ffmpeg -i " + current_file + " -vf scale=" + param +
                " -strict -2 -y " + tempfile;
            writer.println("# Scaling to " + param);
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
//        else if (ctx.SPEEDUP() != null){
//            // operação de speedup
//            Integer speedup_factor = Integer.parseInt(raw_clause.substring(raw_clause.lastIndexOf("speedup")+"speedup".length()));
//            Integer pos_speedup = ctx.SPEEDUP().getSymbol().getLine();
//            if (speedup_factor > 200){
//                // valor insano para speedup
//                String msg = "Linha " + String.format("%d", pos_speedup) + ": Fator de velocidade muito alto: " + speedup_factor;
//                throw new ParseCancellationException(msg);
//            }
//        }
//        else if (ctx.SLOWDOWN() != null){
//            // operação de slowdown
//            Integer slowdown_factor = Integer.parseInt(raw_clause.substring(raw_clause.lastIndexOf("slowdown")+"slowdown".length()));
//            Integer pos_slowdown = ctx.SLOWDOWN().getSymbol().getLine();
//            if (slowdown_factor > 200){
//                // valor insano para slowdown
//                String msg = "Linha " + String.format("%d", pos_slowdown) + ": Fator de redução muito alto: " + slowdown_factor;
//                throw new ParseCancellationException(msg);
//            }
//        }
        else if (ctx.WRITE() != null){
            // operação de write
            String param = raw_clause.substring(raw_clause.lastIndexOf("write")+"write".length()); 
            param = param.replaceAll("\"", "\'");
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd = "ffmpeg -i " + current_file + " -vf drawtext=\"fontfile=/usr/share/fonts/TTF/DejaVuSerif.ttf:text=" +
                    param + ":fontsize=20:fontcolor=yellow:x=(w-text_w)/2:y=(h-text_h-line_h)/2\" -strict -2 -y " +
                    tempfile;
            writer.println("# Writing overlay text " + param);
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        else if (ctx.WATERMARK() != null){
            // operação de marca d'água
            String param = raw_clause.substring(raw_clause.lastIndexOf("watermark")+"watermark".length());
            String tempfile = veditUtil.renameFile(current_file, "_out");
            // removendo aspas
            String imgpath = veditUtil.removeQuotes(param);
            String cmd = "ffmpeg -i " + current_file + " -vf \"movie=" + imgpath +
                " [logo]; [in][logo] overlay=W-w-10:H-h-10, fade=in:0:20 [out]\" -strict 2 -y "
                 + tempfile;
            writer.println("# Watermarking");
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        else if (ctx.PADDING() != null){
            // operação de padding            
            String param = raw_clause.substring(raw_clause.lastIndexOf("padding")+"padding".length());
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd = "ffmpeg -i " + current_file + " -vf \"pad=iw+" + param + ":ih+" + param + ":0:0:color=black\" -strict -2 -y " 
                    + tempfile;
            writer.println("# Adding a " + param + "px padding");
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        else if (ctx.VOLUME_BOOST() != null){
            // operação de aumentar o volume
            String param = raw_clause.substring(raw_clause.lastIndexOf("volume_boost")+"volume_boost".length());
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd = "ffmpeg -i " + current_file + " -vol $((256*" + param + ")) -strict -2 -y " 
                    + tempfile;
            writer.println("# Raising volume to a factor of "+param);
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        else if (ctx.HFLIP() != null){
            // operação de virar horizontalmente (espelhar)
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd = "ffmpeg -i " + current_file + " -vf hflip -strict -2 -y " + tempfile;
            writer.println("# HFlipping");
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        else if (ctx.VFLIP() != null){
            // operação de virar verticalmente
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd = "ffmpeg -i " + current_file + " -vf vflip -strict -2 -y " + tempfile;
            writer.println("# VFlipping");
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        else if (ctx.ROTATE() != null){
            // operação de rotacionar
            String param = raw_clause.substring(raw_clause.lastIndexOf("rotate")+"rotate".length());
            String tempfile = veditUtil.renameFile(current_file, "_out");
            String cmd, comment;
            if (param.equals("left")){                
                comment = "# Rotating left";
                cmd = "ffmpeg -i " + current_file + " -vf \"transpose=2\" -strict -2 -y " + tempfile;
            }
            else{
                comment = "# Rotating right";
                cmd = "ffmpeg -i " + current_file + " -vf \"transpose=1\" -strict -2 -y " + tempfile;
            }
            writer.println(comment);
            writer.println(cmd);
            writer.println("mv " + tempfile + " " + current_file);
        }
        
        return visitChildren(ctx); 
    }
    
    @Override
    public Void visitConvert_clause(veditParser.Convert_clauseContext ctx) {
        // operação de convert        
        String fmt = veditUtil.removeQuotes(ctx.FORMAT().getText());        
        String cmd = "ffmpeg -i " + current_file + " " + veditUtil.renameExtension(current_file, fmt);
        batch.add("# convert to " + fmt);
        batch.add(cmd);
        return visitChildren(ctx); 
    }
//    
//    @Override 
//    public Void visitClauses(veditParser.ClausesContext ctx) { 
//        if (ctx.FROM() != null){
//            // é um bloco            
//            // testando o tempo                
//            Long target_max_time_in_ms = veditUtil.stringToMs(ctx.TIME(1).getText());
//            File f = new File(current_file);
//            Long real_max_time_in_ms = veditUtil.durationInMs(f);
//            if (target_max_time_in_ms > real_max_time_in_ms){
//                // tempo do bloco excede a duração do vídeo
//                int pos_time = ctx.TIME(1).getSymbol().getLine();
//                String msg = "Linha " + String.format("%d", pos_time) + ": tempo do bloco excede a duração do vídeo.";
//                throw new ParseCancellationException(msg);
//            }
//            // TODO: criar arquivo para alterar por fora
//            String filepath_backup = current_file;
//            current_file = "temporary.mp4";
//            visitChildren(ctx);
//            current_file = filepath_backup;
//            // TODO: reconstruir o arquivo            
//            return null;
//        }        
//        return visitChildren(ctx);
//    }
//    
//    
}