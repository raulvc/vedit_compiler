import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    
    public static void main(String args[]) throws IOException, RecognitionException {
        // Cria um stream a partir de um arquivo
        FileInputStream stream = new FileInputStream(args[0]);        
        ANTLRInputStream input = new ANTLRInputStream(stream);
        // Cria um lexer e alimenta-o com o input do arquivo
        veditLexer lexer = new veditLexer(input);        
        // Cria um fluxo de tokens alimentados pelo lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Cria um parser que se alimenta do fluxo de tokens
        veditParser parser = new veditParser(tokens);                
        
        ParseTree tree = null;        
        try{
            // apenas usados para interromper o fluxo logo no primeiro erro
            lexer.addErrorListener(new StopFlowErrorListener());
            parser.addErrorListener(new StopFlowErrorListener());
            // Inicia o parser na primeira regra
            tree = parser.script();                
        }catch (ParseCancellationException ex) {
            // parsing cancelado na análise léxica ou sintática            
            System.exit(0);
        }
                
        // Semântico
        SemanticVisitor semantic_loader = new SemanticVisitor();
        try {
            semantic_loader.visit(tree);                            
        }
        catch (ParseCancellationException ex){
            // parsing cancelado na análise semântica
            System.out.println(ex.getMessage());            
            System.exit(0);
        }
        // Geração de código
        CodeVisitor code_loader = new CodeVisitor();
        try{
            code_loader.visit(tree);
        }
        catch (ParseCancellationException ex){
            // parsing cancelado na geração de código
            System.out.println(ex.getMessage());            
            System.exit(0);
        }
        code_loader.writer.close();
        veditUtil.setExecutable();
    }
    
}