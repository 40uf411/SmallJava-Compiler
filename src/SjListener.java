// Generated from C:/Users/ali25/SmallJava/grammar\Sj.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfInstruction(SjParser.IfInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfInstruction(SjParser.IfInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code afctInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAfctInstruction(SjParser.AfctInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code afctInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAfctInstruction(SjParser.AfctInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallInstruction(SjParser.FuncCallInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallInstruction(SjParser.FuncCallInstructionContext ctx);
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
	 * Enter a parse tree produced by {@link SjParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(SjParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(SjParser.IfConditionContext ctx);
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
	 * Enter a parse tree produced by {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SjParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SjParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addArthExpr}
	 * labeled alternative in {@link SjParser#arthExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddArthExpr(SjParser.AddArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addArthExpr}
	 * labeled alternative in {@link SjParser#arthExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddArthExpr(SjParser.AddArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multArthExpr}
	 * labeled alternative in {@link SjParser#arthExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultArthExpr(SjParser.MultArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multArthExpr}
	 * labeled alternative in {@link SjParser#arthExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultArthExpr(SjParser.MultArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenArthExpr}
	 * labeled alternative in {@link SjParser#arthExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenArthExpr(SjParser.ParenArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenArthExpr}
	 * labeled alternative in {@link SjParser#arthExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenArthExpr(SjParser.ParenArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpCompExpr(SjParser.OpCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpCompExpr(SjParser.OpCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenCompExpr(SjParser.ParenCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenCompExpr(SjParser.ParenCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenLogicExpr(SjParser.ParenLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenLogicExpr(SjParser.ParenLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpLogicExpr(SjParser.OpLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpLogicExpr(SjParser.OpLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotLogicExpr(SjParser.NotLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotLogicExpr(SjParser.NotLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notId}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotId(SjParser.NotIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notId}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotId(SjParser.NotIdContext ctx);
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
	 * Enter a parse tree produced by {@link SjParser#numval}.
	 * @param ctx the parse tree
	 */
	void enterNumval(SjParser.NumvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#numval}.
	 * @param ctx the parse tree
	 */
	void exitNumval(SjParser.NumvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#intAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(SjParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#intAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(SjParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#floatAtom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(SjParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#floatAtom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(SjParser.FloatAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(SjParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(SjParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#idAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(SjParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#idAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(SjParser.IdAtomContext ctx);
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