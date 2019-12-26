// Generated from C:/Users/a/Desktop/code-source/GIT repositories/Other/SmallJava-Compiler/grammar\Sj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SjParser}.
 */
public interface SjListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SjParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SjParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SjParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(SjParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(SjParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(SjParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(SjParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#modificator}.
	 * @param ctx the parse tree
	 */
	void enterModificator(SjParser.ModificatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#modificator}.
	 * @param ctx the parse tree
	 */
	void exitModificator(SjParser.ModificatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SjParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SjParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SjParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SjParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SjParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SjParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(SjParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(SjParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(SjParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(SjParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SjParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SjParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SjParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SjParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SjParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SjParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(SjParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(SjParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(SjParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(SjParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(SjParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(SjParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idFunctionCall}
	 * labeled alternative in {@link SjParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdFunctionCall(SjParser.IdFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idFunctionCall}
	 * labeled alternative in {@link SjParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdFunctionCall(SjParser.IdFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SjParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SjParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExprLogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExprLogic(SjParser.OpExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExprLogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExprLogic(SjParser.OpExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opAndOrlogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpAndOrlogic(SjParser.OpAndOrlogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opAndOrlogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpAndOrlogic(SjParser.OpAndOrlogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentExpr(SjParser.ParentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentExpr(SjParser.ParentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opNotlogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpNotlogic(SjParser.OpNotlogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opNotlogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpNotlogic(SjParser.OpNotlogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(SjParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(SjParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValExpr(SjParser.ValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValExpr(SjParser.ValExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(SjParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(SjParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SjParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SjParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(SjParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(SjParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SjParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SjParser.IdentifierContext ctx);
}