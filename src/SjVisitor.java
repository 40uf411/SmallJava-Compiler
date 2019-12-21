// Generated from C:/Users/ali25/SmallJava/grammar\Sj.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SjParser.IdentifierContext ctx);
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
	 * Visit a parse tree produced by {@link SjParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(SjParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SjParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(SjParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAffect}
	 * labeled alternative in {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAffect(SjParser.ExprAffectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valAffect}
	 * labeled alternative in {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValAffect(SjParser.ValAffectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SjParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(SjParser.IdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(SjParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SjParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SjParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenIdArthExpr(SjParser.ParenIdArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultIdArthExpr(SjParser.MultIdArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddIdArthExpr(SjParser.AddIdArthExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#idCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCompExpr(SjParser.IdCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIdLogicExpr(SjParser.NIdLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenIdLogicExpr(SjParser.ParenIdLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpIdLogicExpr(SjParser.OpIdLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(SjParser.IntExprContext ctx);
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
	 * Visit a parse tree produced by {@link SjParser#idAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(SjParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenIntArthExpr(SjParser.ParenIntArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddIntArthExpr(SjParser.AddIntArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultIntArthExpr(SjParser.MultIntArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdIntCompExpr(SjParser.IdIntCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intCompExpr2}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCompExpr2(SjParser.IntCompExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code intArthExpr2}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArthExpr2(SjParser.IntArthExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code parenIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenIntCompExpr(SjParser.ParenIntCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntIntCompExpr(SjParser.IntIntCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIntLogicExpr(SjParser.NIntLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLogicExpr2}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLogicExpr2(SjParser.IntLogicExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtomintLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtomintLogicExpr(SjParser.IdAtomintLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtomIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtomIntLogicExpr(SjParser.IntAtomIntLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intCompExprIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCompExprIntLogicExpr(SjParser.IntCompExprIntLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intArthExprIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArthExprIntLogicExpr(SjParser.IntArthExprIntLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenIntLogicExpr(SjParser.ParenIntLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(SjParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultFloatArthExpr(SjParser.MultFloatArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFloatArthExpr(SjParser.AddFloatArthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenFloatArthExpr(SjParser.ParenFloatArthExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#floatCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatCompExpr(SjParser.FloatCompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SjParser#floatLogicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLogicExpr(SjParser.FloatLogicExprContext ctx);
}