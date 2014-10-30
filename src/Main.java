import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class Main {
    
    public static void main(String args[]) throws IOException, RecognitionException {        
        FileInputStream stream = new FileInputStream(args[0]);
        ANTLRInputStream input = new ANTLRInputStream(stream);
        veditLexer lexer = new veditLexer(input);        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        veditParser parser = new veditParser(tokens);
        parser.script();
    }
    
}
