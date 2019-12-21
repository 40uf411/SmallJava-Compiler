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
	 * Enter a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SjParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SjParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link SjParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SjParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SjParser.BoolContext ctx);
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
	 * Enter a parse tree produced by the {@code exprAffect}
	 * labeled alternative in {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterExprAffect(SjParser.ExprAffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAffect}
	 * labeled alternative in {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitExprAffect(SjParser.ExprAffectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valAffect}
	 * labeled alternative in {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterValAffect(SjParser.ValAffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valAffect}
	 * labeled alternative in {@link SjParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitValAffect(SjParser.ValAffectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SjParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(SjParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SjParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(SjParser.IdentifierFunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link SjParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SjParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SjParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SjParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SjParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenIdArthExpr(SjParser.ParenIdArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenIdArthExpr(SjParser.ParenIdArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultIdArthExpr(SjParser.MultIdArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultIdArthExpr(SjParser.MultIdArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddIdArthExpr(SjParser.AddIdArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addIdArthExpr}
	 * labeled alternative in {@link SjParser#idArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddIdArthExpr(SjParser.AddIdArthExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#idCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdCompExpr(SjParser.IdCompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#idCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdCompExpr(SjParser.IdCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterNIdLogicExpr(SjParser.NIdLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitNIdLogicExpr(SjParser.NIdLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenIdLogicExpr(SjParser.ParenIdLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenIdLogicExpr(SjParser.ParenIdLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpIdLogicExpr(SjParser.OpIdLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opIdLogicExpr}
	 * labeled alternative in {@link SjParser#idLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpIdLogicExpr(SjParser.OpIdLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(SjParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(SjParser.IntExprContext ctx);
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
	 * Enter a parse tree produced by the {@code parenIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenIntArthExpr(SjParser.ParenIntArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenIntArthExpr(SjParser.ParenIntArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddIntArthExpr(SjParser.AddIntArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddIntArthExpr(SjParser.AddIntArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultIntArthExpr(SjParser.MultIntArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multIntArthExpr}
	 * labeled alternative in {@link SjParser#intArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultIntArthExpr(SjParser.MultIntArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdIntCompExpr(SjParser.IdIntCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdIntCompExpr(SjParser.IdIntCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intCompExpr2}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntCompExpr2(SjParser.IntCompExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code intCompExpr2}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntCompExpr2(SjParser.IntCompExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code intArthExpr2}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntArthExpr2(SjParser.IntArthExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code intArthExpr2}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntArthExpr2(SjParser.IntArthExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code parenIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenIntCompExpr(SjParser.ParenIntCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenIntCompExpr(SjParser.ParenIntCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntIntCompExpr(SjParser.IntIntCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intIntCompExpr}
	 * labeled alternative in {@link SjParser#intCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntIntCompExpr(SjParser.IntIntCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterNIntLogicExpr(SjParser.NIntLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitNIntLogicExpr(SjParser.NIntLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLogicExpr2}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntLogicExpr2(SjParser.IntLogicExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code intLogicExpr2}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntLogicExpr2(SjParser.IntLogicExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtomintLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdAtomintLogicExpr(SjParser.IdAtomintLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtomintLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdAtomintLogicExpr(SjParser.IdAtomintLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtomIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntAtomIntLogicExpr(SjParser.IntAtomIntLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtomIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntAtomIntLogicExpr(SjParser.IntAtomIntLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intCompExprIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntCompExprIntLogicExpr(SjParser.IntCompExprIntLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intCompExprIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntCompExprIntLogicExpr(SjParser.IntCompExprIntLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intArthExprIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntArthExprIntLogicExpr(SjParser.IntArthExprIntLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intArthExprIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntArthExprIntLogicExpr(SjParser.IntArthExprIntLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenIntLogicExpr(SjParser.ParenIntLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenIntLogicExpr}
	 * labeled alternative in {@link SjParser#intLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenIntLogicExpr(SjParser.ParenIntLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(SjParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(SjParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultFloatArthExpr(SjParser.MultFloatArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultFloatArthExpr(SjParser.MultFloatArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddFloatArthExpr(SjParser.AddFloatArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddFloatArthExpr(SjParser.AddFloatArthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenFloatArthExpr(SjParser.ParenFloatArthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenFloatArthExpr}
	 * labeled alternative in {@link SjParser#floatArthExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenFloatArthExpr(SjParser.ParenFloatArthExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#floatCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatCompExpr(SjParser.FloatCompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#floatCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatCompExpr(SjParser.FloatCompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SjParser#floatLogicExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatLogicExpr(SjParser.FloatLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SjParser#floatLogicExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatLogicExpr(SjParser.FloatLogicExprContext ctx);
}