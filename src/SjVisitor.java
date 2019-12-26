// Generated from C:/Users/a/Desktop/code-source/GIT repositories/Other/SmallJava-Compiler/grammar\Sj.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link SjParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(SjParser.InstructionContext ctx);
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
	 * Visit a parse tree produced by {@link SjParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(SjParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(SjParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(SjParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idFunctionCall}
	 * labeled alternative in {@link SjParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFunctionCall(SjParser.IdFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(SjParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExprLogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExprLogic(SjParser.OpExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opAndOrlogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAndOrlogic(SjParser.OpAndOrlogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpr(SjParser.ParentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opNotlogic}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNotlogic(SjParser.OpNotlogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(SjParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExpr(SjParser.ValExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(SjParser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SjParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SjParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(SjParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SjParser.IdentifierContext ctx);
}