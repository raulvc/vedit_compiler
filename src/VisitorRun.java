
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author raul
 */

public class VisitorRun extends veditBaseVisitor <Void> {
    
    Map<String,String> props = new OrderedHashMap<String, String>();
    
//    @Override
//    public Void visitScript(veditParser.ScriptContext ctx){        
//        props.put("teste", "teste2");
//        return null;
//    }

    @Override 
    public Void visitEditing(veditParser.EditingContext ctx) { 
        // eliminando as aspas e extraindo o filepath
        String raw_filepath = ctx.FILEPATH().getText();
        String filepath = raw_filepath.substring(1, raw_filepath.length()-1);                 
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
                
        System.out.println(f.getAbsolutePath());
        return visitChildren(ctx);
        
    }
    
    @Override 
    public Void visitCutting(veditParser.CuttingContext ctx) {         
        // o primeiro FILEPATH é o arquivo a ser cortado
        TerminalNode fp = ctx.FILEPATH().get(0);
        String raw_filepath = fp.getText();
        // eliminando as aspas e extraindo o filepath
        String filepath = raw_filepath.substring(1, raw_filepath.length()-1);                 
        File f = new File(filepath);
        // linha do filepath
        Integer pos_filepath = fp.getSymbol().getLine();
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
                
        // testando o alvo (o arquivo que será gerado)
        TerminalNode tp = ctx.FILEPATH().get(1);
        Integer pos_targetpath = tp.getSymbol().getLine();
        String raw_targetpath = tp.getText();
        String targetpath = raw_targetpath.substring(1, raw_targetpath.length()-1);
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
        
        return visitChildren(ctx); 
    }
    
    
}


//public class veditBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements veditVisitor<T> {
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
		
//	@Override public T visitConvert_clause(@NotNull veditParser.Convert_clauseContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitClauses(@NotNull veditParser.ClausesContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */

//	@Override public T visitScript(@NotNull veditParser.ScriptContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitCommands(@NotNull veditParser.CommandsContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitCommand(@NotNull veditParser.CommandContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//}