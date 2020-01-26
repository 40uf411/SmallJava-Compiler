// Generated from C:/Users/ali25/SmallJava-Compiler/grammar\Sj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SjParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, INT=33, FLOAT=34, STRING=35, ID=36, INTEGER_VAL=37, FLOAT_VAL=38, 
		STRING_VAL=39, BOOL_T=40, BOOL_F=41, COMMENT=42, WS=43;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_import_ = 2, RULE_modificator = 3, 
		RULE_declarations = 4, RULE_declaration = 5, RULE_type = 6, RULE_vars = 7, 
		RULE_instructions = 8, RULE_instruction = 9, RULE_ifStatement = 10, RULE_ifStat = 11, 
		RULE_elseIfStat = 12, RULE_elseStat = 13, RULE_ifCondition = 14, RULE_affectation = 15, 
		RULE_functionCall = 16, RULE_functionType = 17, RULE_exprList = 18, RULE_expr = 19, 
		RULE_compExpr = 20, RULE_logicExpr = 21, RULE_atom = 22, RULE_intAtom = 23, 
		RULE_floatAtom = 24, RULE_stringAtom = 25, RULE_idAtom = 26, RULE_identifier = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "import_", "modificator", "declarations", "declaration", 
			"type", "vars", "instructions", "instruction", "ifStatement", "ifStat", 
			"elseIfStat", "elseStat", "ifCondition", "affectation", "functionCall", 
			"functionType", "exprList", "expr", "compExpr", "logicExpr", "atom", 
			"intAtom", "floatAtom", "stringAtom", "idAtom", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class_SJ'", "'{'", "'main_SJ'", "'}'", "'import'", "'.'", "';'", 
			"'public'", "'protected'", "','", "'Si'", "'('", "')'", "'Alors'", "'Sinon Si'", 
			"'Sinon'", "'='", "'Out_SJ'", "'In_SJ'", "'*'", "'/'", "'+'", "'-'", 
			"'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'!'", "'&'", "'|'", "'int'", 
			"'float'", "'string'", null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT", "FLOAT", 
			"STRING", "ID", "INTEGER_VAL", "FLOAT_VAL", "STRING_VAL", "BOOL_T", "BOOL_F", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SjParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ModificatorContext modificator() {
			return getRuleContext(ModificatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(SjParser.ID, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			imports();
			setState(57);
			modificator();
			setState(58);
			match(T__0);
			setState(59);
			match(ID);
			setState(60);
			match(T__1);
			setState(61);
			declarations();
			setState(62);
			match(T__2);
			setState(63);
			match(T__1);
			setState(64);
			instructions();
			setState(65);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public List<Import_Context> import_() {
			return getRuleContexts(Import_Context.class);
		}
		public Import_Context import_(int i) {
			return getRuleContext(Import_Context.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(67);
				import_();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SjParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SjParser.ID, i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			match(ID);
			setState(75);
			match(T__5);
			setState(76);
			match(ID);
			setState(77);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModificatorContext extends ParserRuleContext {
		public ModificatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitModificator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificatorContext modificator() throws RecognitionException {
		ModificatorContext _localctx = new ModificatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modificator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(81);
				declaration();
				setState(82);
				match(T__6);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			vars();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SjParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SjParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SjParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			identifier();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(95);
				match(T__9);
				setState(96);
				identifier();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(102);
				instruction();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AfctInstructionContext extends InstructionContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public AfctInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAfctInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfInstructionContext extends InstructionContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIfInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallInstructionContext extends InstructionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFuncCallInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new IfInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				ifStatement();
				}
				break;
			case ID:
				_localctx = new AfctInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				affectation();
				setState(110);
				match(T__6);
				}
				break;
			case T__17:
			case T__18:
				_localctx = new FuncCallInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				functionCall();
				setState(113);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			ifStat();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(118);
				elseIfStat();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(124);
				elseStat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__10);
			setState(128);
			match(T__11);
			setState(129);
			ifCondition();
			setState(130);
			match(T__12);
			setState(131);
			match(T__13);
			setState(132);
			match(T__1);
			setState(133);
			instructions();
			setState(134);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__14);
			setState(137);
			match(T__11);
			setState(138);
			ifCondition();
			setState(139);
			match(T__12);
			setState(140);
			match(T__13);
			setState(141);
			match(T__1);
			setState(142);
			instructions();
			setState(143);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__15);
			setState(146);
			match(T__1);
			setState(147);
			instructions();
			setState(148);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifCondition);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				logicExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				compExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			identifier();
			setState(155);
			match(T__16);
			setState(156);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdFunctionCallContext extends FunctionCallContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public StringAtomContext stringAtom() {
			return getRuleContext(StringAtomContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			_localctx = new IdFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			functionType();
			setState(159);
			match(T__11);
			setState(160);
			stringAtom();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(161);
				match(T__9);
				setState(162);
				exprList();
				}
			}

			setState(165);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expr(0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(170);
				match(T__9);
				setState(171);
				expr(0);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArthExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArthExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ParentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				match(T__11);
				setState(179);
				expr(0);
				setState(180);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new ArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArthExprContext(new ExprContext(_parentctx, _parentState));
						((ArthExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						((ArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						((ArthExprContext)_localctx).right = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ArthExprContext(new ExprContext(_parentctx, _parentState));
						((ArthExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(189);
						((ArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						((ArthExprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompExprContext extends ParserRuleContext {
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
	 
		public CompExprContext() { }
		public void copyFrom(CompExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpCompExprContext extends CompExprContext {
		public CompExprContext left;
		public Token op;
		public CompExprContext right;
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public OpCompExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitOpCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenCompExprContext extends CompExprContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public ParenCompExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomCompExprContext extends CompExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomCompExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAtomCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		return compExpr(0);
	}

	private CompExprContext compExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompExprContext _localctx = new CompExprContext(_ctx, _parentState);
		CompExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_compExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ParenCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197);
				match(T__11);
				setState(198);
				compExpr(0);
				setState(199);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new AtomCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpCompExprContext(new CompExprContext(_parentctx, _parentState));
					((OpCompExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_compExpr);
					setState(204);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(205);
					((OpCompExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						((OpCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(206);
					((OpCompExprContext)_localctx).right = compExpr(3);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicExprContext extends ParserRuleContext {
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	 
		public LogicExprContext() { }
		public void copyFrom(LogicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomLogicContext extends LogicExprContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public AtomLogicContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAtomLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenLogicExprContext extends LogicExprContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ParenLogicExprContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpLogicExprContext extends LogicExprContext {
		public LogicExprContext left;
		public Token op;
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public OpLogicExprContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitOpLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotLogicExprContext extends LogicExprContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public NotLogicExprContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitNotLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		return logicExpr(0);
	}

	private LogicExprContext logicExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExprContext _localctx = new LogicExprContext(_ctx, _parentState);
		LogicExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ParenLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				match(T__11);
				setState(214);
				logicExpr(0);
				setState(215);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new NotLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(T__29);
				setState(218);
				logicExpr(3);
				}
				break;
			case 3:
				{
				_localctx = new AtomLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				compExpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpLogicExprContext(new LogicExprContext(_parentctx, _parentState));
					((OpLogicExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
					setState(222);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(223);
					((OpLogicExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__30 || _la==T__31) ) {
						((OpLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(224);
					((OpLogicExprContext)_localctx).left = logicExpr(3);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public FloatAtomContext floatAtom() {
			return getRuleContext(FloatAtomContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				idAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				intAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				floatAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntAtomContext extends ParserRuleContext {
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public TerminalNode INTEGER_VAL() { return getToken(SjParser.INTEGER_VAL, 0); }
		public IntAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAtomContext intAtom() throws RecognitionException {
		IntAtomContext _localctx = new IntAtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intAtom);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__11);
				setState(236);
				intAtom();
				setState(237);
				match(T__12);
				}
				break;
			case INTEGER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(INTEGER_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatAtomContext extends ParserRuleContext {
		public FloatAtomContext floatAtom() {
			return getRuleContext(FloatAtomContext.class,0);
		}
		public TerminalNode FLOAT_VAL() { return getToken(SjParser.FLOAT_VAL, 0); }
		public FloatAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatAtomContext floatAtom() throws RecognitionException {
		FloatAtomContext _localctx = new FloatAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_floatAtom);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__11);
				setState(243);
				floatAtom();
				setState(244);
				match(T__12);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FLOAT_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringAtomContext extends ParserRuleContext {
		public StringAtomContext stringAtom() {
			return getRuleContext(StringAtomContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(SjParser.STRING_VAL, 0); }
		public StringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAtomContext stringAtom() throws RecognitionException {
		StringAtomContext _localctx = new StringAtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stringAtom);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__11);
				setState(250);
				stringAtom();
				setState(251);
				match(T__12);
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(STRING_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdAtomContext extends ParserRuleContext {
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdAtomContext idAtom() throws RecognitionException {
		IdAtomContext _localctx = new IdAtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_idAtom);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__11);
				setState(257);
				idAtom();
				setState(258);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SjParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
			return compExpr_sempred((CompExprContext)_localctx, predIndex);
		case 21:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean compExpr_sempred(CompExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\7\td\n\t\f\t\16\tg\13\t\3\n\7\nj\n\n\f\n\16\nm\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13v\n\13\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\5"+
		"\f\u0080\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u009b"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a6\n\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00af\n\24\f\24\16\24\u00b2\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ba\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u00c2\n\25\f\25\16\25\u00c5\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00cd\n\26\3\26\3\26\3\26\7\26\u00d2\n\26\f\26\16\26\u00d5"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00df\n\27\3\27\3"+
		"\27\3\27\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\3\30\3\30\3\30\5\30\u00ec"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00f3\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00fa\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0101\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0108\n\34\3\35\3\35\3\35\2\5(*,\36\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\t\3\2\n\13\3\2#%\3\2"+
		"\24\25\3\2\26\27\3\2\30\31\3\2\32\37\3\2!\"\2\u0108\2:\3\2\2\2\4H\3\2"+
		"\2\2\6K\3\2\2\2\bQ\3\2\2\2\nX\3\2\2\2\f[\3\2\2\2\16^\3\2\2\2\20`\3\2\2"+
		"\2\22k\3\2\2\2\24u\3\2\2\2\26w\3\2\2\2\30\u0081\3\2\2\2\32\u008a\3\2\2"+
		"\2\34\u0093\3\2\2\2\36\u009a\3\2\2\2 \u009c\3\2\2\2\"\u00a0\3\2\2\2$\u00a9"+
		"\3\2\2\2&\u00ab\3\2\2\2(\u00b9\3\2\2\2*\u00cc\3\2\2\2,\u00de\3\2\2\2."+
		"\u00eb\3\2\2\2\60\u00f2\3\2\2\2\62\u00f9\3\2\2\2\64\u0100\3\2\2\2\66\u0107"+
		"\3\2\2\28\u0109\3\2\2\2:;\5\4\3\2;<\5\b\5\2<=\7\3\2\2=>\7&\2\2>?\7\4\2"+
		"\2?@\5\n\6\2@A\7\5\2\2AB\7\4\2\2BC\5\22\n\2CD\7\6\2\2D\3\3\2\2\2EG\5\6"+
		"\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JH\3\2\2\2KL\7"+
		"\7\2\2LM\7&\2\2MN\7\b\2\2NO\7&\2\2OP\7\t\2\2P\7\3\2\2\2QR\t\2\2\2R\t\3"+
		"\2\2\2ST\5\f\7\2TU\7\t\2\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\5\16\b\2\\]\5\20\t\2]\r\3\2\2\2^_\t\3"+
		"\2\2_\17\3\2\2\2`e\58\35\2ab\7\f\2\2bd\58\35\2ca\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2f\21\3\2\2\2ge\3\2\2\2hj\5\24\13\2ih\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mk\3\2\2\2nv\5\26\f\2op\5 \21\2pq\7\t"+
		"\2\2qv\3\2\2\2rs\5\"\22\2st\7\t\2\2tv\3\2\2\2un\3\2\2\2uo\3\2\2\2ur\3"+
		"\2\2\2v\25\3\2\2\2w{\5\30\r\2xz\5\32\16\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~\u0080\5\34\17\2\177~\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0082\7\r\2\2\u0082\u0083\7\16\2"+
		"\2\u0083\u0084\5\36\20\2\u0084\u0085\7\17\2\2\u0085\u0086\7\20\2\2\u0086"+
		"\u0087\7\4\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\6\2\2\u0089\31\3\2\2"+
		"\2\u008a\u008b\7\21\2\2\u008b\u008c\7\16\2\2\u008c\u008d\5\36\20\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\7\20\2\2\u008f\u0090\7\4\2\2\u0090\u0091\5"+
		"\22\n\2\u0091\u0092\7\6\2\2\u0092\33\3\2\2\2\u0093\u0094\7\22\2\2\u0094"+
		"\u0095\7\4\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\6\2\2\u0097\35\3\2\2"+
		"\2\u0098\u009b\5,\27\2\u0099\u009b\5*\26\2\u009a\u0098\3\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\37\3\2\2\2\u009c\u009d\58\35\2\u009d\u009e\7\23\2\2\u009e"+
		"\u009f\5(\25\2\u009f!\3\2\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\16\2\2"+
		"\u00a2\u00a5\5\64\33\2\u00a3\u00a4\7\f\2\2\u00a4\u00a6\5&\24\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\17\2\2"+
		"\u00a8#\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa%\3\2\2\2\u00ab\u00b0\5(\25\2"+
		"\u00ac\u00ad\7\f\2\2\u00ad\u00af\5(\25\2\u00ae\u00ac\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\'\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\b\25\1\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\5"+
		"(\25\2\u00b6\u00b7\7\17\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\5.\30\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00c3\3\2\2\2\u00bb\u00bc\f\5"+
		"\2\2\u00bc\u00bd\t\5\2\2\u00bd\u00c2\5(\25\6\u00be\u00bf\f\4\2\2\u00bf"+
		"\u00c0\t\6\2\2\u00c0\u00c2\5(\25\5\u00c1\u00bb\3\2\2\2\u00c1\u00be\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		")\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\26\1\2\u00c7\u00c8\7\16\2"+
		"\2\u00c8\u00c9\5*\26\2\u00c9\u00ca\7\17\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00cd\5(\25\2\u00cc\u00c6\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d3\3\2"+
		"\2\2\u00ce\u00cf\f\4\2\2\u00cf\u00d0\t\7\2\2\u00d0\u00d2\5*\26\5\u00d1"+
		"\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4+\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\27\1\2\u00d7\u00d8"+
		"\7\16\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da\7\17\2\2\u00da\u00df\3\2\2\2"+
		"\u00db\u00dc\7 \2\2\u00dc\u00df\5,\27\5\u00dd\u00df\5*\26\2\u00de\u00d6"+
		"\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0"+
		"\u00e1\f\4\2\2\u00e1\u00e2\t\b\2\2\u00e2\u00e4\5,\27\5\u00e3\u00e0\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"-\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\5\66\34\2\u00e9\u00ec\5\60\31"+
		"\2\u00ea\u00ec\5\62\32\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7\16\2\2\u00ee\u00ef\5\60\31"+
		"\2\u00ef\u00f0\7\17\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\7\'\2\2\u00f2"+
		"\u00ed\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\61\3\2\2\2\u00f4\u00f5\7\16\2"+
		"\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\7\17\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00fa\7(\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\63\3\2\2\2"+
		"\u00fb\u00fc\7\16\2\2\u00fc\u00fd\5\64\33\2\u00fd\u00fe\7\17\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u0101\7)\2\2\u0100\u00fb\3\2\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\65\3\2\2\2\u0102\u0103\7\16\2\2\u0103\u0104\5\66\34\2\u0104"+
		"\u0105\7\17\2\2\u0105\u0108\3\2\2\2\u0106\u0108\58\35\2\u0107\u0102\3"+
		"\2\2\2\u0107\u0106\3\2\2\2\u0108\67\3\2\2\2\u0109\u010a\7&\2\2\u010a9"+
		"\3\2\2\2\30HXeku{\177\u009a\u00a5\u00b0\u00b9\u00c1\u00c3\u00cc\u00d3"+
		"\u00de\u00e5\u00eb\u00f2\u00f9\u0100\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}