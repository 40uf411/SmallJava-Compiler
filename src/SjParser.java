// Generated from C:/Users/ali25/SmallJava/grammar\Sj.g4 by ANTLR 4.7.2
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
		STRING_VAL=39, BOOL_T=40, BOOL_F=41, COMMENT=42, WS=43, STRING_val=44;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_import_ = 2, RULE_modificator = 3, 
		RULE_declarations = 4, RULE_declaration = 5, RULE_type = 6, RULE_vars = 7, 
		RULE_instructions = 8, RULE_instruction = 9, RULE_ifStatement = 10, RULE_ifStat = 11, 
		RULE_elseIfStat = 12, RULE_elseStat = 13, RULE_ifCondition = 14, RULE_affectation = 15, 
		RULE_functionCall = 16, RULE_exprList = 17, RULE_expr = 18, RULE_arthExpr = 19, 
		RULE_compExpr = 20, RULE_logicExpr = 21, RULE_val = 22, RULE_numval = 23, 
		RULE_intAtom = 24, RULE_floatAtom = 25, RULE_stringAtom = 26, RULE_idAtom = 27, 
		RULE_identifier = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "import_", "modificator", "declarations", "declaration", 
			"type", "vars", "instructions", "instruction", "ifStatement", "ifStat", 
			"elseIfStat", "elseStat", "ifCondition", "affectation", "functionCall", 
			"exprList", "expr", "arthExpr", "compExpr", "logicExpr", "val", "numval", 
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
			"COMMENT", "WS", "STRING_val"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitStart(this);
		}
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
			setState(58);
			imports();
			setState(59);
			modificator();
			setState(60);
			match(T__0);
			setState(61);
			match(ID);
			setState(62);
			match(T__1);
			setState(63);
			declarations();
			setState(64);
			match(T__2);
			setState(65);
			match(T__1);
			setState(66);
			instructions();
			setState(67);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitImports(this);
		}
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(69);
				import_();
				}
				}
				setState(74);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitImport_(this);
		}
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
			setState(75);
			match(T__4);
			setState(76);
			match(ID);
			setState(77);
			match(T__5);
			setState(78);
			match(ID);
			setState(79);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterModificator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitModificator(this);
		}
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
			setState(81);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitDeclarations(this);
		}
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(83);
				declaration();
				setState(84);
				match(T__6);
				}
				}
				setState(90);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitDeclaration(this);
		}
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
			setState(91);
			type();
			setState(92);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitType(this);
		}
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
			setState(94);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitVars(this);
		}
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
			setState(96);
			identifier();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(97);
				match(T__9);
				setState(98);
				identifier();
				}
				}
				setState(103);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitInstructions(this);
		}
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(104);
				instruction();
				}
				}
				setState(109);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterAfctInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitAfctInstruction(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIfInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIfInstruction(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterFuncCallInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitFuncCallInstruction(this);
		}
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
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new IfInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				ifStatement();
				}
				break;
			case ID:
				_localctx = new AfctInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				affectation();
				setState(112);
				match(T__6);
				}
				break;
			case T__17:
			case T__18:
				_localctx = new FuncCallInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				functionCall();
				setState(115);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIfStatement(this);
		}
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
			setState(119);
			ifStat();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(120);
				elseIfStat();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(126);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIfStat(this);
		}
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
			setState(129);
			match(T__10);
			setState(130);
			match(T__11);
			setState(131);
			ifCondition();
			setState(132);
			match(T__12);
			setState(133);
			match(T__13);
			setState(134);
			match(T__1);
			setState(135);
			instructions();
			setState(136);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitElseIfStat(this);
		}
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
			setState(138);
			match(T__14);
			setState(139);
			match(T__11);
			setState(140);
			ifCondition();
			setState(141);
			match(T__12);
			setState(142);
			match(T__13);
			setState(143);
			match(T__1);
			setState(144);
			instructions();
			setState(145);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitElseStat(this);
		}
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
			setState(147);
			match(T__15);
			setState(148);
			match(T__1);
			setState(149);
			instructions();
			setState(150);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIfCondition(this);
		}
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				logicExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitAffectation(this);
		}
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
			setState(156);
			identifier();
			setState(157);
			match(T__16);
			setState(158);
			expr();
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
		public TerminalNode STRING_VAL() { return getToken(SjParser.STRING_VAL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdFunctionCall(this);
		}
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
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			match(T__11);
			setState(162);
			match(STRING_VAL);
			setState(163);
			match(T__9);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << ID) | (1L << INTEGER_VAL) | (1L << FLOAT_VAL) | (1L << STRING_val))) != 0)) {
				{
				setState(164);
				exprList();
				}
			}

			setState(167);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expr();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(170);
				match(T__9);
				setState(171);
				expr();
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
		public ArthExprContext arthExpr() {
			return getRuleContext(ArthExprContext.class,0);
		}
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				arthExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				compExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				logicExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				val();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				identifier();
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

	public static class ArthExprContext extends ParserRuleContext {
		public ArthExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arthExpr; }
	 
		public ArthExprContext() { }
		public void copyFrom(ArthExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddArthExprContext extends ArthExprContext {
		public Token op;
		public List<NumvalContext> numval() {
			return getRuleContexts(NumvalContext.class);
		}
		public NumvalContext numval(int i) {
			return getRuleContext(NumvalContext.class,i);
		}
		public List<ArthExprContext> arthExpr() {
			return getRuleContexts(ArthExprContext.class);
		}
		public ArthExprContext arthExpr(int i) {
			return getRuleContext(ArthExprContext.class,i);
		}
		public List<IdAtomContext> idAtom() {
			return getRuleContexts(IdAtomContext.class);
		}
		public IdAtomContext idAtom(int i) {
			return getRuleContext(IdAtomContext.class,i);
		}
		public AddArthExprContext(ArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterAddArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitAddArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAddArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultArthExprContext extends ArthExprContext {
		public Token op;
		public List<NumvalContext> numval() {
			return getRuleContexts(NumvalContext.class);
		}
		public NumvalContext numval(int i) {
			return getRuleContext(NumvalContext.class,i);
		}
		public List<ArthExprContext> arthExpr() {
			return getRuleContexts(ArthExprContext.class);
		}
		public ArthExprContext arthExpr(int i) {
			return getRuleContext(ArthExprContext.class,i);
		}
		public List<IdAtomContext> idAtom() {
			return getRuleContexts(IdAtomContext.class);
		}
		public IdAtomContext idAtom(int i) {
			return getRuleContext(IdAtomContext.class,i);
		}
		public MultArthExprContext(ArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterMultArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitMultArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitMultArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenArthExprContext extends ArthExprContext {
		public ArthExprContext arthExpr() {
			return getRuleContext(ArthExprContext.class,0);
		}
		public ParenArthExprContext(ArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArthExprContext arthExpr() throws RecognitionException {
		return arthExpr(0);
	}

	private ArthExprContext arthExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArthExprContext _localctx = new ArthExprContext(_ctx, _parentState);
		ArthExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arthExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ParenArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185);
				match(T__11);
				setState(186);
				arthExpr(0);
				setState(187);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new MultArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				numval();
				setState(190);
				((MultArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((MultArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(191);
					arthExpr(0);
					}
					break;
				case 2:
					{
					setState(192);
					idAtom();
					}
					break;
				case 3:
					{
					setState(193);
					numval();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new MultArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				idAtom();
				setState(197);
				((MultArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((MultArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(198);
					arthExpr(0);
					}
					break;
				case 2:
					{
					setState(199);
					idAtom();
					}
					break;
				case 3:
					{
					setState(200);
					numval();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new AddArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				numval();
				setState(204);
				((AddArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
					((AddArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(205);
					arthExpr(0);
					}
					break;
				case 2:
					{
					setState(206);
					idAtom();
					}
					break;
				case 3:
					{
					setState(207);
					numval();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new AddArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				idAtom();
				setState(211);
				((AddArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
					((AddArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(212);
					arthExpr(0);
					}
					break;
				case 2:
					{
					setState(213);
					idAtom();
					}
					break;
				case 3:
					{
					setState(214);
					numval();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultArthExprContext(new ArthExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arthExpr);
						setState(219);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(220);
						((MultArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((MultArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(221);
							arthExpr(0);
							}
							break;
						case 2:
							{
							setState(222);
							idAtom();
							}
							break;
						case 3:
							{
							setState(223);
							numval();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AddArthExprContext(new ArthExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arthExpr);
						setState(226);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(227);
						((AddArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((AddArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(228);
							arthExpr(0);
							}
							break;
						case 2:
							{
							setState(229);
							idAtom();
							}
							break;
						case 3:
							{
							setState(230);
							numval();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public Token op;
		public List<NumvalContext> numval() {
			return getRuleContexts(NumvalContext.class);
		}
		public NumvalContext numval(int i) {
			return getRuleContext(NumvalContext.class,i);
		}
		public List<IdAtomContext> idAtom() {
			return getRuleContexts(IdAtomContext.class);
		}
		public IdAtomContext idAtom(int i) {
			return getRuleContext(IdAtomContext.class,i);
		}
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public List<ArthExprContext> arthExpr() {
			return getRuleContexts(ArthExprContext.class);
		}
		public ArthExprContext arthExpr(int i) {
			return getRuleContext(ArthExprContext.class,i);
		}
		public OpCompExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterOpCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitOpCompExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenCompExpr(this);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ParenCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(239);
				match(T__11);
				setState(240);
				compExpr(0);
				setState(241);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new OpCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				numval();
				setState(244);
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
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(245);
					idAtom();
					}
					break;
				case 2:
					{
					setState(246);
					numval();
					}
					break;
				case 3:
					{
					setState(247);
					compExpr(0);
					}
					break;
				case 4:
					{
					setState(248);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new OpCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				idAtom();
				setState(252);
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
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(253);
					idAtom();
					}
					break;
				case 2:
					{
					setState(254);
					numval();
					}
					break;
				case 3:
					{
					setState(255);
					compExpr(0);
					}
					break;
				case 4:
					{
					setState(256);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new OpCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				arthExpr(0);
				setState(260);
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
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(261);
					idAtom();
					}
					break;
				case 2:
					{
					setState(262);
					numval();
					}
					break;
				case 3:
					{
					setState(263);
					compExpr(0);
					}
					break;
				case 4:
					{
					setState(264);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpCompExprContext(new CompExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_compExpr);
					setState(269);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(270);
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
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(271);
						idAtom();
						}
						break;
					case 2:
						{
						setState(272);
						numval();
						}
						break;
					case 3:
						{
						setState(273);
						compExpr(0);
						}
						break;
					case 4:
						{
						setState(274);
						arthExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class ParenLogicExprContext extends LogicExprContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ParenLogicExprContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpLogicExprContext extends LogicExprContext {
		public Token op;
		public List<NumvalContext> numval() {
			return getRuleContexts(NumvalContext.class);
		}
		public NumvalContext numval(int i) {
			return getRuleContext(NumvalContext.class,i);
		}
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public List<IdAtomContext> idAtom() {
			return getRuleContexts(IdAtomContext.class);
		}
		public IdAtomContext idAtom(int i) {
			return getRuleContext(IdAtomContext.class,i);
		}
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public List<ArthExprContext> arthExpr() {
			return getRuleContexts(ArthExprContext.class);
		}
		public ArthExprContext arthExpr(int i) {
			return getRuleContext(ArthExprContext.class,i);
		}
		public OpLogicExprContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterOpLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitOpLogicExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterNotLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitNotLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitNotLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotIdContext extends LogicExprContext {
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public NotIdContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterNotId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitNotId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitNotId(this);
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
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new NotLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(283);
				match(T__29);
				setState(284);
				logicExpr(8);
				}
				break;
			case 2:
				{
				_localctx = new NotIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(T__29);
				setState(286);
				idAtom();
				}
				break;
			case 3:
				{
				_localctx = new ParenLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(T__11);
				setState(288);
				logicExpr(0);
				setState(289);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new OpLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				numval();
				setState(292);
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
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(293);
					logicExpr(0);
					}
					break;
				case 2:
					{
					setState(294);
					idAtom();
					}
					break;
				case 3:
					{
					setState(295);
					numval();
					}
					break;
				case 4:
					{
					setState(296);
					compExpr(0);
					}
					break;
				case 5:
					{
					setState(297);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new OpLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				idAtom();
				setState(301);
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
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(302);
					logicExpr(0);
					}
					break;
				case 2:
					{
					setState(303);
					idAtom();
					}
					break;
				case 3:
					{
					setState(304);
					numval();
					}
					break;
				case 4:
					{
					setState(305);
					compExpr(0);
					}
					break;
				case 5:
					{
					setState(306);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new OpLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				compExpr(0);
				setState(310);
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
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(311);
					logicExpr(0);
					}
					break;
				case 2:
					{
					setState(312);
					idAtom();
					}
					break;
				case 3:
					{
					setState(313);
					numval();
					}
					break;
				case 4:
					{
					setState(314);
					compExpr(0);
					}
					break;
				case 5:
					{
					setState(315);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new OpLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				arthExpr(0);
				setState(319);
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
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(320);
					logicExpr(0);
					}
					break;
				case 2:
					{
					setState(321);
					idAtom();
					}
					break;
				case 3:
					{
					setState(322);
					numval();
					}
					break;
				case 4:
					{
					setState(323);
					compExpr(0);
					}
					break;
				case 5:
					{
					setState(324);
					arthExpr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpLogicExprContext(new LogicExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
					setState(329);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(330);
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
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(331);
						logicExpr(0);
						}
						break;
					case 2:
						{
						setState(332);
						idAtom();
						}
						break;
					case 3:
						{
						setState(333);
						numval();
						}
						break;
					case 4:
						{
						setState(334);
						compExpr(0);
						}
						break;
					case 5:
						{
						setState(335);
						arthExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class ValContext extends ParserRuleContext {
		public NumvalContext numval() {
			return getRuleContext(NumvalContext.class,0);
		}
		public StringAtomContext stringAtom() {
			return getRuleContext(StringAtomContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_val);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				numval();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				stringAtom();
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

	public static class NumvalContext extends ParserRuleContext {
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public FloatAtomContext floatAtom() {
			return getRuleContext(FloatAtomContext.class,0);
		}
		public NumvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterNumval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitNumval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitNumval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumvalContext numval() throws RecognitionException {
		NumvalContext _localctx = new NumvalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numval);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				intAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAtomContext intAtom() throws RecognitionException {
		IntAtomContext _localctx = new IntAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intAtom);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__11);
				setState(352);
				intAtom();
				setState(353);
				match(T__12);
				}
				break;
			case INTEGER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterFloatAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitFloatAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatAtomContext floatAtom() throws RecognitionException {
		FloatAtomContext _localctx = new FloatAtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floatAtom);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__11);
				setState(359);
				floatAtom();
				setState(360);
				match(T__12);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
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
		public TerminalNode STRING_val() { return getToken(SjParser.STRING_val, 0); }
		public StringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAtomContext stringAtom() throws RecognitionException {
		StringAtomContext _localctx = new StringAtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stringAtom);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__11);
				setState(366);
				stringAtom();
				setState(367);
				match(T__12);
				}
				break;
			case STRING_val:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(STRING_val);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdAtomContext idAtom() throws RecognitionException {
		IdAtomContext _localctx = new IdAtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_idAtom);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__11);
				setState(373);
				idAtom();
				setState(374);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
			return arthExpr_sempred((ArthExprContext)_localctx, predIndex);
		case 20:
			return compExpr_sempred((CompExprContext)_localctx, predIndex);
		case 21:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arthExpr_sempred(ArthExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 1);
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
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\7\tf\n\t\f\t\16\ti\13\t\3\n\7\nl\n\n\f\n\16\no\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13x\n\13\3\f\3\f\7\f|\n\f\f\f\16\f\177"+
		"\13\f\3\f\5\f\u0082\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\5\20\u009d\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a8"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u00af\n\23\f\23\16\23\u00b2\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00b9\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00c5\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00cc"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d3\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00da\n\25\5\25\u00dc\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e3\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ea\n\25\7\25\u00ec\n\25\f\25\16\25"+
		"\u00ef\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00fc\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0104\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u010c\n\26\5\26\u010e\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0116\n\26\7\26\u0118\n\26\f\26\16\26\u011b\13\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u012d\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0136"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013f\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0148\n\27\5\27\u014a\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0153\n\27\7\27\u0155\n\27\f\27\16\27\u0158\13"+
		"\27\3\30\3\30\5\30\u015c\n\30\3\31\3\31\5\31\u0160\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0167\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u016e\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0175\n\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u017c\n\35\3\36\3\36\3\36\2\5(*,\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\t\3\2\n\13\3\2#%\3\2\24\25\3\2\26\27\3"+
		"\2\30\31\3\2\32\37\3\2!\"\2\u01b4\2<\3\2\2\2\4J\3\2\2\2\6M\3\2\2\2\bS"+
		"\3\2\2\2\nZ\3\2\2\2\f]\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22m\3\2\2\2\24"+
		"w\3\2\2\2\26y\3\2\2\2\30\u0083\3\2\2\2\32\u008c\3\2\2\2\34\u0095\3\2\2"+
		"\2\36\u009c\3\2\2\2 \u009e\3\2\2\2\"\u00a2\3\2\2\2$\u00ab\3\2\2\2&\u00b8"+
		"\3\2\2\2(\u00db\3\2\2\2*\u010d\3\2\2\2,\u0149\3\2\2\2.\u015b\3\2\2\2\60"+
		"\u015f\3\2\2\2\62\u0166\3\2\2\2\64\u016d\3\2\2\2\66\u0174\3\2\2\28\u017b"+
		"\3\2\2\2:\u017d\3\2\2\2<=\5\4\3\2=>\5\b\5\2>?\7\3\2\2?@\7&\2\2@A\7\4\2"+
		"\2AB\5\n\6\2BC\7\5\2\2CD\7\4\2\2DE\5\22\n\2EF\7\6\2\2F\3\3\2\2\2GI\5\6"+
		"\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LJ\3\2\2\2MN\7"+
		"\7\2\2NO\7&\2\2OP\7\b\2\2PQ\7&\2\2QR\7\t\2\2R\7\3\2\2\2ST\t\2\2\2T\t\3"+
		"\2\2\2UV\5\f\7\2VW\7\t\2\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z["+
		"\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]^\5\16\b\2^_\5\20\t\2_\r\3\2\2\2`a\t\3"+
		"\2\2a\17\3\2\2\2bg\5:\36\2cd\7\f\2\2df\5:\36\2ec\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\21\3\2\2\2ig\3\2\2\2jl\5\24\13\2kj\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2om\3\2\2\2px\5\26\f\2qr\5 \21\2rs\7\t"+
		"\2\2sx\3\2\2\2tu\5\"\22\2uv\7\t\2\2vx\3\2\2\2wp\3\2\2\2wq\3\2\2\2wt\3"+
		"\2\2\2x\25\3\2\2\2y}\5\30\r\2z|\5\32\16\2{z\3\2\2\2|\177\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080\u0082\5\34\17\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\27\3\2\2\2\u0083\u0084\7\r\2"+
		"\2\u0084\u0085\7\16\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\17\2\2\u0087"+
		"\u0088\7\20\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5\22\n\2\u008a\u008b\7"+
		"\6\2\2\u008b\31\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\5\36\20\2\u008f\u0090\7\17\2\2\u0090\u0091\7\20\2\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\6\2\2\u0094\33\3\2\2\2\u0095"+
		"\u0096\7\22\2\2\u0096\u0097\7\4\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7"+
		"\6\2\2\u0099\35\3\2\2\2\u009a\u009d\5,\27\2\u009b\u009d\5*\26\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\37\3\2\2\2\u009e\u009f\5:\36"+
		"\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\5&\24\2\u00a1!\3\2\2\2\u00a2\u00a3"+
		"\t\4\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\7)\2\2\u00a5\u00a7\7\f\2\2\u00a6"+
		"\u00a8\5$\23\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\7\17\2\2\u00aa#\3\2\2\2\u00ab\u00b0\5&\24\2\u00ac\u00ad"+
		"\7\f\2\2\u00ad\u00af\5&\24\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1%\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b3\u00b9\5(\25\2\u00b4\u00b9\5*\26\2\u00b5\u00b9\5,\27\2\u00b6\u00b9"+
		"\5.\30\2\u00b7\u00b9\5:\36\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\'\3\2\2\2"+
		"\u00ba\u00bb\b\25\1\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be"+
		"\7\17\2\2\u00be\u00dc\3\2\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c4\t\5\2"+
		"\2\u00c1\u00c5\5(\25\2\u00c2\u00c5\58\35\2\u00c3\u00c5\5\60\31\2\u00c4"+
		"\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00dc\3\2"+
		"\2\2\u00c6\u00c7\58\35\2\u00c7\u00cb\t\5\2\2\u00c8\u00cc\5(\25\2\u00c9"+
		"\u00cc\58\35\2\u00ca\u00cc\5\60\31\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00dc\3\2\2\2\u00cd\u00ce\5\60\31\2\u00ce"+
		"\u00d2\t\6\2\2\u00cf\u00d3\5(\25\2\u00d0\u00d3\58\35\2\u00d1\u00d3\5\60"+
		"\31\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00dc\3\2\2\2\u00d4\u00d5\58\35\2\u00d5\u00d9\t\6\2\2\u00d6\u00da\5("+
		"\25\2\u00d7\u00da\58\35\2\u00d8\u00da\5\60\31\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00ba\3\2"+
		"\2\2\u00db\u00bf\3\2\2\2\u00db\u00c6\3\2\2\2\u00db\u00cd\3\2\2\2\u00db"+
		"\u00d4\3\2\2\2\u00dc\u00ed\3\2\2\2\u00dd\u00de\f\6\2\2\u00de\u00e2\t\5"+
		"\2\2\u00df\u00e3\5(\25\2\u00e0\u00e3\58\35\2\u00e1\u00e3\5\60\31\2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00ec\3\2"+
		"\2\2\u00e4\u00e5\f\3\2\2\u00e5\u00e9\t\6\2\2\u00e6\u00ea\5(\25\2\u00e7"+
		"\u00ea\58\35\2\u00e8\u00ea\5\60\31\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00dd\3\2\2\2\u00eb"+
		"\u00e4\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee)\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\b\26\1\2\u00f1\u00f2"+
		"\7\16\2\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\7\17\2\2\u00f4\u010e\3\2\2\2"+
		"\u00f5\u00f6\5\60\31\2\u00f6\u00fb\t\7\2\2\u00f7\u00fc\58\35\2\u00f8\u00fc"+
		"\5\60\31\2\u00f9\u00fc\5*\26\2\u00fa\u00fc\5(\25\2\u00fb\u00f7\3\2\2\2"+
		"\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u010e"+
		"\3\2\2\2\u00fd\u00fe\58\35\2\u00fe\u0103\t\7\2\2\u00ff\u0104\58\35\2\u0100"+
		"\u0104\5\60\31\2\u0101\u0104\5*\26\2\u0102\u0104\5(\25\2\u0103\u00ff\3"+
		"\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u010e\3\2\2\2\u0105\u0106\5(\25\2\u0106\u010b\t\7\2\2\u0107\u010c\58"+
		"\35\2\u0108\u010c\5\60\31\2\u0109\u010c\5*\26\2\u010a\u010c\5(\25\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u00f0\3\2\2\2\u010d\u00f5\3\2\2\2\u010d"+
		"\u00fd\3\2\2\2\u010d\u0105\3\2\2\2\u010e\u0119\3\2\2\2\u010f\u0110\f\4"+
		"\2\2\u0110\u0115\t\7\2\2\u0111\u0116\58\35\2\u0112\u0116\5\60\31\2\u0113"+
		"\u0116\5*\26\2\u0114\u0116\5(\25\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u010f\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a+\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b\27\1\2\u011d\u011e"+
		"\7 \2\2\u011e\u014a\5,\27\n\u011f\u0120\7 \2\2\u0120\u014a\58\35\2\u0121"+
		"\u0122\7\16\2\2\u0122\u0123\5,\27\2\u0123\u0124\7\17\2\2\u0124\u014a\3"+
		"\2\2\2\u0125\u0126\5\60\31\2\u0126\u012c\t\b\2\2\u0127\u012d\5,\27\2\u0128"+
		"\u012d\58\35\2\u0129\u012d\5\60\31\2\u012a\u012d\5*\26\2\u012b\u012d\5"+
		"(\25\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u014a\3\2\2\2\u012e\u012f\58"+
		"\35\2\u012f\u0135\t\b\2\2\u0130\u0136\5,\27\2\u0131\u0136\58\35\2\u0132"+
		"\u0136\5\60\31\2\u0133\u0136\5*\26\2\u0134\u0136\5(\25\2\u0135\u0130\3"+
		"\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\u014a\3\2\2\2\u0137\u0138\5*\26\2\u0138\u013e\t\b"+
		"\2\2\u0139\u013f\5,\27\2\u013a\u013f\58\35\2\u013b\u013f\5\60\31\2\u013c"+
		"\u013f\5*\26\2\u013d\u013f\5(\25\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u014a\3\2\2\2\u0140\u0141\5(\25\2\u0141\u0147\t\b\2\2\u0142\u0148\5,"+
		"\27\2\u0143\u0148\58\35\2\u0144\u0148\5\60\31\2\u0145\u0148\5*\26\2\u0146"+
		"\u0148\5(\25\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u011c\3\2\2\2\u0149\u011f\3\2\2\2\u0149\u0121\3\2\2\2\u0149\u0125\3\2"+
		"\2\2\u0149\u012e\3\2\2\2\u0149\u0137\3\2\2\2\u0149\u0140\3\2\2\2\u014a"+
		"\u0156\3\2\2\2\u014b\u014c\f\5\2\2\u014c\u0152\t\b\2\2\u014d\u0153\5,"+
		"\27\2\u014e\u0153\58\35\2\u014f\u0153\5\60\31\2\u0150\u0153\5*\26\2\u0151"+
		"\u0153\5(\25\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u014b\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157-\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015c\5\60\31\2\u015a\u015c"+
		"\5\66\34\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c/\3\2\2\2\u015d"+
		"\u0160\5\62\32\2\u015e\u0160\5\64\33\2\u015f\u015d\3\2\2\2\u015f\u015e"+
		"\3\2\2\2\u0160\61\3\2\2\2\u0161\u0162\7\16\2\2\u0162\u0163\5\62\32\2\u0163"+
		"\u0164\7\17\2\2\u0164\u0167\3\2\2\2\u0165\u0167\7\'\2\2\u0166\u0161\3"+
		"\2\2\2\u0166\u0165\3\2\2\2\u0167\63\3\2\2\2\u0168\u0169\7\16\2\2\u0169"+
		"\u016a\5\64\33\2\u016a\u016b\7\17\2\2\u016b\u016e\3\2\2\2\u016c\u016e"+
		"\7(\2\2\u016d\u0168\3\2\2\2\u016d\u016c\3\2\2\2\u016e\65\3\2\2\2\u016f"+
		"\u0170\7\16\2\2\u0170\u0171\5\66\34\2\u0171\u0172\7\17\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0175\7.\2\2\u0174\u016f\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\67\3\2\2\2\u0176\u0177\7\16\2\2\u0177\u0178\58\35\2\u0178\u0179\7\17"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u017c\5:\36\2\u017b\u0176\3\2\2\2\u017b"+
		"\u017a\3\2\2\2\u017c9\3\2\2\2\u017d\u017e\7&\2\2\u017e;\3\2\2\2)JZgmw"+
		"}\u0081\u009c\u00a7\u00b0\u00b8\u00c4\u00cb\u00d2\u00d9\u00db\u00e2\u00e9"+
		"\u00eb\u00ed\u00fb\u0103\u010b\u010d\u0115\u0119\u012c\u0135\u013e\u0147"+
		"\u0149\u0152\u0156\u015b\u015f\u0166\u016d\u0174\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}