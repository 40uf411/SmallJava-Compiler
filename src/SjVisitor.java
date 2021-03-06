// Generated from C:/Users/a/Desktop/code source/final 2/grammar\Sj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SjParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SjVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SjParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SjParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(SjParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(SjParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#modificator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificator(SjParser.ModificatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SjParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SjParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SjParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(SjParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(SjParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstruction(SjParser.IfInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code afctInstruction}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfctInstruction(SjParser.AfctInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out_sj_id}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_sj_id(SjParser.Out_sj_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_sj_id}
	 * labeled alternative in {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_sj_id(SjParser.In_sj_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SjParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(SjParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(SjParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(SjParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(SjParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#out_sj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_sj(SjParser.Out_sjContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#in_sj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_sj(SjParser.In_sjContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(SjParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(SjParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpr(SjParser.ParentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arthExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArthExpr(SjParser.ArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpCompExpr(SjParser.OpCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCompExpr(SjParser.ParenCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomCompExpr}
	 * labeled alternative in {@link SjParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCompExpr(SjParser.AtomCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomLogic}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomLogic(SjParser.AtomLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenLogicExpr(SjParser.ParenLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogicExpr(SjParser.OpLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notLogicExpr}
	 * labeled alternative in {@link SjParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotLogicExpr(SjParser.NotLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SjParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#intAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(SjParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#floatAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(SjParser.FloatAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(SjParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#idAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(SjParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SjParser.IdentifierContext ctx);
}