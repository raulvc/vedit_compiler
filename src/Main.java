import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        // Inicia o parser na primeira regra
        ParseTree tree = parser.script();                
        // Semântico
        VisitorRun loader = new VisitorRun();
        try {
            loader.visit(tree);                            
        }
        catch (ParseCancellationException ex){
            // parsing cancelado na análise semântica
            System.out.println(ex.getMessage());
            System.exit(0);
        }
    }
    
}