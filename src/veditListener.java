// Generated from /home/raul/estudos/cc2/trab2/vedit_compiler/src/vedit.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link veditParser}.
 */
public interface veditListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link veditParser#convert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConvert_clause(@NotNull veditParser.Convert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#convert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConvert_clause(@NotNull veditParser.Convert_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#editing}.
	 * @param ctx the parse tree
	 */
	void enterEditing(@NotNull veditParser.EditingContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#editing}.
	 * @param ctx the parse tree
	 */
	void exitEditing(@NotNull veditParser.EditingContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(@NotNull veditParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(@NotNull veditParser.CommandsContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull veditParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull veditParser.CommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#cutting}.
	 * @param ctx the parse tree
	 */
	void enterCutting(@NotNull veditParser.CuttingContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#cutting}.
	 * @param ctx the parse tree
	 */
	void exitCutting(@NotNull veditParser.CuttingContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull veditParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull veditParser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#clauses}.
	 * @param ctx the parse tree
	 */
	void enterClauses(@NotNull veditParser.ClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#clauses}.
	 * @param ctx the parse tree
	 */
	void exitClauses(@NotNull veditParser.ClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link veditParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(@NotNull veditParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link veditParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(@NotNull veditParser.ClauseContext ctx);
}