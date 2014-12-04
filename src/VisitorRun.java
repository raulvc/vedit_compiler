
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.misc.ParseCancellationException;

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
//    
    @Override 
    public Void visitEditing(veditParser.EditingContext ctx) { 
        // eliminando as aspas e extraindo o filepath
        String raw_filepath = ctx.FILEPATH().getText();
        String filepath = raw_filepath.substring(1, raw_filepath.length()-1);                 
        File f = new File(filepath);        
        if (!f.exists()){
            // arquivo não existe
            try {                
                Integer pos_token = ctx.FILEPATH().getSymbol().getLine();
                String msg = "Linha " + String.format("%d", pos_token) + ": Arquivo " + filepath + " não encontrado";
                throw new FileNotFoundException(msg);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
                throw new ParseCancellationException(ex);
            }
        }
        else if (!f.canWrite()){
            // sem permissão de escrita
            try {                
                Integer pos_token = ctx.FILEPATH().getSymbol().getLine();
                String msg = "Linha " + String.format("%d", pos_token) + ": Arquivo " + filepath + " não encontrado";
                throw new Exception(msg);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                throw new ParseCancellationException(ex);
            }
        }        
        System.out.println(f.getAbsolutePath());
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
//	@Override public T visitClause(@NotNull veditParser.ClauseContext ctx) { return visitChildren(ctx); }
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
//	@Override public T visitCutting(@NotNull veditParser.CuttingContext ctx) { return visitChildren(ctx); }
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
//	@Override public T visitEditing(@NotNull veditParser.EditingContext ctx) { return visitChildren(ctx); }
//}