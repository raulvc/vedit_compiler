// Generated from /home/raul/estudos/cc2/trab2/vedit_compiler/src/vedit.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link veditParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface veditVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link veditParser#convert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvert_clause(@NotNull veditParser.Convert_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#editing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditing(@NotNull veditParser.EditingContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(@NotNull veditParser.CommandsContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull veditParser.CommandContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#cutting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCutting(@NotNull veditParser.CuttingContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(@NotNull veditParser.ScriptContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauses(@NotNull veditParser.ClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link veditParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(@NotNull veditParser.ClauseContext ctx);
}