/**
 *
 * @author raul
 */

public class ExtractVeditBaseVisitor extends veditBaseVisitor <Integer> {
        
    @Override
    public Integer visitScript(veditParser.ScriptContext ctx){        
        System.out.println("teste");
        System.out.println(ctx.getText());
        return 3;
    }
    
    @Override 
    public Integer visitEditing(veditParser.EditingContext ctx) { 
        System.out.println("asdada");
        return 3; 
    }
}
