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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, INT=31, FLOAT=32, 
		STRING=33, ID=34, INTEGER_VAL=35, FLOAT_VAL=36, STRING_VAL=37, BOOL_T=38, 
		BOOL_F=39, COMMENT=40, WS=41;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_import_ = 2, RULE_modificator = 3, 
		RULE_identifier = 4, RULE_declarations = 5, RULE_declaration = 6, RULE_type = 7, 
		RULE_vars = 8, RULE_instructions = 9, RULE_instruction = 10, RULE_ifStatement = 11, 
		RULE_ifStat = 12, RULE_elseIfStat = 13, RULE_elseStat = 14, RULE_ifCondition = 15, 
		RULE_bool = 16, RULE_val = 17, RULE_affectation = 18, RULE_functionCall = 19, 
		RULE_exprList = 20, RULE_expression = 21, RULE_idExpr = 22, RULE_idArthExpr = 23, 
		RULE_idCompExpr = 24, RULE_idLogicExpr = 25, RULE_intExpr = 26, RULE_intAtom = 27, 
		RULE_floatAtom = 28, RULE_idAtom = 29, RULE_intArthExpr = 30, RULE_intCompExpr = 31, 
		RULE_intLogicExpr = 32, RULE_floatExpr = 33, RULE_floatArthExpr = 34, 
		RULE_floatCompExpr = 35, RULE_floatLogicExpr = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "import_", "modificator", "identifier", "declarations", 
			"declaration", "type", "vars", "instructions", "instruction", "ifStatement", 
			"ifStat", "elseIfStat", "elseStat", "ifCondition", "bool", "val", "affectation", 
			"functionCall", "exprList", "expression", "idExpr", "idArthExpr", "idCompExpr", 
			"idLogicExpr", "intExpr", "intAtom", "floatAtom", "idAtom", "intArthExpr", 
			"intCompExpr", "intLogicExpr", "floatExpr", "floatArthExpr", "floatCompExpr", 
			"floatLogicExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'main'", "'}'", "'import'", "'.'", "';'", "'public'", 
			"'protected'", "','", "'Si'", "'('", "')'", "'Alors'", "'Sinon Si'", 
			"'Sinon'", "'='", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'=='", 
			"'!='", "'<='", "'<'", "'!'", "'&&'", "'||'", "'int'", "'float'", "'String'", 
			null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "FLOAT", "STRING", "ID", 
			"INTEGER_VAL", "FLOAT_VAL", "STRING_VAL", "BOOL_T", "BOOL_F", "COMMENT", 
			"WS"
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(74);
			imports();
			setState(75);
			modificator();
			setState(76);
			match(T__0);
			setState(77);
			identifier();
			setState(78);
			match(T__1);
			setState(79);
			declarations();
			setState(80);
			match(T__2);
			setState(81);
			match(T__1);
			setState(82);
			instructions();
			setState(83);
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(85);
				import_();
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

	public static class Import_Context extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			{
			setState(91);
			match(T__4);
			setState(92);
			identifier();
			setState(93);
			match(T__5);
			setState(94);
			identifier();
			setState(95);
			match(T__6);
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
			setState(97);
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
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 10, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(101);
				declaration();
				setState(102);
				match(T__6);
				}
				}
				setState(108);
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type();
			setState(110);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		enterRule(_localctx, 16, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			identifier();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(115);
				match(T__9);
				setState(116);
				identifier();
				}
				}
				setState(121);
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
		enterRule(_localctx, 18, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==ID) {
				{
				{
				setState(122);
				instruction();
				}
				}
				setState(127);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruction);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(129);
				affectation();
				setState(130);
				match(T__6);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(132);
				functionCall();
				setState(133);
				match(T__6);
				}
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
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			ifStat();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(138);
				elseIfStat();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(144);
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
		enterRule(_localctx, 24, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__10);
			setState(148);
			match(T__11);
			setState(149);
			ifCondition();
			setState(150);
			match(T__12);
			setState(151);
			match(T__13);
			setState(152);
			match(T__1);
			setState(153);
			instructions();
			setState(154);
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
		enterRule(_localctx, 26, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__14);
			setState(157);
			match(T__11);
			setState(158);
			ifCondition();
			setState(159);
			match(T__12);
			setState(160);
			match(T__13);
			setState(161);
			match(T__1);
			setState(162);
			instructions();
			setState(163);
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
		enterRule(_localctx, 28, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__15);
			setState(166);
			match(T__1);
			setState(167);
			instructions();
			setState(168);
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
		public IdLogicExprContext idLogicExpr() {
			return getRuleContext(IdLogicExprContext.class,0);
		}
		public IdCompExprContext idCompExpr() {
			return getRuleContext(IdCompExprContext.class,0);
		}
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public FloatLogicExprContext floatLogicExpr() {
			return getRuleContext(FloatLogicExprContext.class,0);
		}
		public FloatCompExprContext floatCompExpr() {
			return getRuleContext(FloatCompExprContext.class,0);
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
		enterRule(_localctx, 30, RULE_ifCondition);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				idLogicExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				idCompExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				intLogicExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				intCompExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				floatLogicExpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				floatCompExpr(0);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL_T() { return getToken(SjParser.BOOL_T, 0); }
		public TerminalNode BOOL_F() { return getToken(SjParser.BOOL_F, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==BOOL_T || _la==BOOL_F) ) {
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode INTEGER_VAL() { return getToken(SjParser.INTEGER_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(SjParser.FLOAT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(SjParser.STRING_VAL, 0); }
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
		enterRule(_localctx, 34, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) ) {
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

	public static class AffectationContext extends ParserRuleContext {
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
	 
		public AffectationContext() { }
		public void copyFrom(AffectationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValAffectContext extends AffectationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValAffectContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterValAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitValAffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitValAffect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAffectContext extends AffectationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprAffectContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterExprAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitExprAffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitExprAffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_affectation);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprAffectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				identifier();
				setState(183);
				match(T__16);
				setState(184);
				expression();
				}
				break;
			case 2:
				_localctx = new ValAffectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				identifier();
				setState(187);
				match(T__16);
				setState(188);
				val();
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
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public IdentifierContext function;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		int _la;
		try {
			_localctx = new IdentifierFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((IdentifierFunctionCallContext)_localctx).function = identifier();
			setState(193);
			match(T__11);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__27) | (1L << ID) | (1L << INTEGER_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(194);
				exprList();
				}
			}

			setState(197);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 40, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expression();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(200);
				match(T__9);
				setState(201);
				expression();
				}
				}
				setState(206);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				idExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				intExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				floatExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				val();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
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

	public static class IdExprContext extends ParserRuleContext {
		public IdArthExprContext idArthExpr() {
			return getRuleContext(IdArthExprContext.class,0);
		}
		public IdCompExprContext idCompExpr() {
			return getRuleContext(IdCompExprContext.class,0);
		}
		public IdLogicExprContext idLogicExpr() {
			return getRuleContext(IdLogicExprContext.class,0);
		}
		public IdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExprContext idExpr() throws RecognitionException {
		IdExprContext _localctx = new IdExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idExpr);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				idArthExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				idCompExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				idLogicExpr();
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

	public static class IdArthExprContext extends ParserRuleContext {
		public IdArthExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idArthExpr; }
	 
		public IdArthExprContext() { }
		public void copyFrom(IdArthExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenIdArthExprContext extends IdArthExprContext {
		public IdArthExprContext idArthExpr() {
			return getRuleContext(IdArthExprContext.class,0);
		}
		public ParenIdArthExprContext(IdArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenIdArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenIdArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenIdArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultIdArthExprContext extends IdArthExprContext {
		public IdentifierContext left;
		public Token op;
		public IdentifierContext right;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultIdArthExprContext(IdArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterMultIdArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitMultIdArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitMultIdArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddIdArthExprContext extends IdArthExprContext {
		public IdentifierContext left;
		public Token op;
		public IdentifierContext right;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AddIdArthExprContext(IdArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterAddIdArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitAddIdArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAddIdArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdArthExprContext idArthExpr() throws RecognitionException {
		IdArthExprContext _localctx = new IdArthExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_idArthExpr);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ParenIdArthExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__11);
				setState(221);
				idArthExpr();
				setState(222);
				match(T__12);
				}
				break;
			case 2:
				_localctx = new MultIdArthExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((MultIdArthExprContext)_localctx).left = identifier();
				setState(225);
				((MultIdArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((MultIdArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				((MultIdArthExprContext)_localctx).right = identifier();
				}
				break;
			case 3:
				_localctx = new AddIdArthExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				((AddIdArthExprContext)_localctx).left = identifier();
				setState(229);
				((AddIdArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((AddIdArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				((AddIdArthExprContext)_localctx).right = identifier();
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

	public static class IdCompExprContext extends ParserRuleContext {
		public IdentifierContext left;
		public Token op;
		public IdentifierContext right;
		public IdCompExprContext idCompExpr() {
			return getRuleContext(IdCompExprContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdCompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idCompExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdCompExprContext idCompExpr() throws RecognitionException {
		IdCompExprContext _localctx = new IdCompExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_idCompExpr);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__11);
				setState(235);
				idCompExpr();
				setState(236);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((IdCompExprContext)_localctx).left = identifier();
				setState(239);
				((IdCompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((IdCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				((IdCompExprContext)_localctx).right = identifier();
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

	public static class IdLogicExprContext extends ParserRuleContext {
		public IdLogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idLogicExpr; }
	 
		public IdLogicExprContext() { }
		public void copyFrom(IdLogicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenIdLogicExprContext extends IdLogicExprContext {
		public IdLogicExprContext idLogicExpr() {
			return getRuleContext(IdLogicExprContext.class,0);
		}
		public ParenIdLogicExprContext(IdLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenIdLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenIdLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenIdLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpIdLogicExprContext extends IdLogicExprContext {
		public IdentifierContext left;
		public Token op;
		public IdentifierContext right;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public OpIdLogicExprContext(IdLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterOpIdLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitOpIdLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitOpIdLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NIdLogicExprContext extends IdLogicExprContext {
		public IdLogicExprContext idLogicExpr() {
			return getRuleContext(IdLogicExprContext.class,0);
		}
		public NIdLogicExprContext(IdLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterNIdLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitNIdLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitNIdLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdLogicExprContext idLogicExpr() throws RecognitionException {
		IdLogicExprContext _localctx = new IdLogicExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_idLogicExpr);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new NIdLogicExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__27);
				setState(245);
				idLogicExpr();
				}
				break;
			case T__11:
				_localctx = new ParenIdLogicExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__11);
				setState(247);
				idLogicExpr();
				setState(248);
				match(T__12);
				}
				break;
			case ID:
				_localctx = new OpIdLogicExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				((OpIdLogicExprContext)_localctx).left = identifier();
				setState(251);
				((OpIdLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((OpIdLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				((OpIdLogicExprContext)_localctx).right = identifier();
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

	public static class IntExprContext extends ParserRuleContext {
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		IntExprContext _localctx = new IntExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intExpr);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				intArthExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				intCompExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				intLogicExpr(0);
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
		enterRule(_localctx, 54, RULE_intAtom);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__11);
				setState(262);
				intAtom();
				setState(263);
				match(T__12);
				}
				break;
			case INTEGER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		enterRule(_localctx, 56, RULE_floatAtom);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__11);
				setState(269);
				floatAtom();
				setState(270);
				match(T__12);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
		enterRule(_localctx, 58, RULE_idAtom);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__11);
				setState(276);
				idAtom();
				setState(277);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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

	public static class IntArthExprContext extends ParserRuleContext {
		public IntArthExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArthExpr; }
	 
		public IntArthExprContext() { }
		public void copyFrom(IntArthExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenIntArthExprContext extends IntArthExprContext {
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public ParenIntArthExprContext(IntArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenIntArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenIntArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenIntArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddIntArthExprContext extends IntArthExprContext {
		public Token op;
		public List<IntAtomContext> intAtom() {
			return getRuleContexts(IntAtomContext.class);
		}
		public IntAtomContext intAtom(int i) {
			return getRuleContext(IntAtomContext.class,i);
		}
		public List<IntArthExprContext> intArthExpr() {
			return getRuleContexts(IntArthExprContext.class);
		}
		public IntArthExprContext intArthExpr(int i) {
			return getRuleContext(IntArthExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public AddIntArthExprContext(IntArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterAddIntArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitAddIntArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAddIntArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultIntArthExprContext extends IntArthExprContext {
		public Token op;
		public List<IntAtomContext> intAtom() {
			return getRuleContexts(IntAtomContext.class);
		}
		public IntAtomContext intAtom(int i) {
			return getRuleContext(IntAtomContext.class,i);
		}
		public List<IntArthExprContext> intArthExpr() {
			return getRuleContexts(IntArthExprContext.class);
		}
		public IntArthExprContext intArthExpr(int i) {
			return getRuleContext(IntArthExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public MultIntArthExprContext(IntArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterMultIntArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitMultIntArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitMultIntArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArthExprContext intArthExpr() throws RecognitionException {
		return intArthExpr(0);
	}

	private IntArthExprContext intArthExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntArthExprContext _localctx = new IntArthExprContext(_ctx, _parentState);
		IntArthExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_intArthExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ParenIntArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(283);
				match(T__11);
				setState(284);
				intArthExpr(0);
				setState(285);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new MultIntArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				intAtom();
				setState(288);
				((MultIntArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((MultIntArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(289);
					intArthExpr(0);
					}
					break;
				case 2:
					{
					setState(290);
					idAtom();
					}
					break;
				case 3:
					{
					setState(291);
					intAtom();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new MultIntArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				idAtom();
				setState(295);
				((MultIntArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((MultIntArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(296);
					intArthExpr(0);
					}
					break;
				case 2:
					{
					setState(297);
					intAtom();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new AddIntArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				intAtom();
				setState(301);
				((AddIntArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((AddIntArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(302);
					intArthExpr(0);
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
					intAtom();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new AddIntArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				idAtom();
				setState(308);
				((AddIntArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((AddIntArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(309);
					intArthExpr(0);
					}
					break;
				case 2:
					{
					setState(310);
					intAtom();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultIntArthExprContext(new IntArthExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intArthExpr);
						setState(315);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(316);
						((MultIntArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((MultIntArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(317);
							intArthExpr(0);
							}
							break;
						case 2:
							{
							setState(318);
							idAtom();
							}
							break;
						case 3:
							{
							setState(319);
							intAtom();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AddIntArthExprContext(new IntArthExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intArthExpr);
						setState(322);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(323);
						((AddIntArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((AddIntArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(324);
							intArthExpr(0);
							}
							break;
						case 2:
							{
							setState(325);
							idAtom();
							}
							break;
						case 3:
							{
							setState(326);
							intAtom();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class IntCompExprContext extends ParserRuleContext {
		public IntCompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intCompExpr; }
	 
		public IntCompExprContext() { }
		public void copyFrom(IntCompExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdIntCompExprContext extends IntCompExprContext {
		public Token op;
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IdIntCompExprContext(IntCompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdIntCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdIntCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdIntCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntCompExpr2Context extends IntCompExprContext {
		public Token op;
		public List<IntCompExprContext> intCompExpr() {
			return getRuleContexts(IntCompExprContext.class);
		}
		public IntCompExprContext intCompExpr(int i) {
			return getRuleContext(IntCompExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IntCompExpr2Context(IntCompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntCompExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntCompExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntCompExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArthExpr2Context extends IntCompExprContext {
		public Token op;
		public List<IntArthExprContext> intArthExpr() {
			return getRuleContexts(IntArthExprContext.class);
		}
		public IntArthExprContext intArthExpr(int i) {
			return getRuleContext(IntArthExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExpr2Context(IntCompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntArthExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntArthExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntArthExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenIntCompExprContext extends IntCompExprContext {
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public ParenIntCompExprContext(IntCompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenIntCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenIntCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenIntCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntIntCompExprContext extends IntCompExprContext {
		public Token op;
		public List<IntAtomContext> intAtom() {
			return getRuleContexts(IntAtomContext.class);
		}
		public IntAtomContext intAtom(int i) {
			return getRuleContext(IntAtomContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IntIntCompExprContext(IntCompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntIntCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntIntCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntIntCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntCompExprContext intCompExpr() throws RecognitionException {
		return intCompExpr(0);
	}

	private IntCompExprContext intCompExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntCompExprContext _localctx = new IntCompExprContext(_ctx, _parentState);
		IntCompExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_intCompExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new ParenIntCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(335);
				match(T__11);
				setState(336);
				intCompExpr(0);
				setState(337);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new IntIntCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				intAtom();
				setState(340);
				((IntIntCompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((IntIntCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(341);
					idAtom();
					}
					break;
				case 2:
					{
					setState(342);
					intAtom();
					}
					break;
				case 3:
					{
					setState(343);
					intCompExpr(0);
					}
					break;
				case 4:
					{
					setState(344);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new IdIntCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				idAtom();
				setState(348);
				((IdIntCompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((IdIntCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(349);
					intAtom();
					}
					break;
				case 2:
					{
					setState(350);
					intCompExpr(0);
					}
					break;
				case 3:
					{
					setState(351);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new IntArthExpr2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				intArthExpr(0);
				setState(355);
				((IntArthExpr2Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((IntArthExpr2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(356);
					idAtom();
					}
					break;
				case 2:
					{
					setState(357);
					intAtom();
					}
					break;
				case 3:
					{
					setState(358);
					intCompExpr(0);
					}
					break;
				case 4:
					{
					setState(359);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntCompExpr2Context(new IntCompExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_intCompExpr);
					setState(364);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(365);
					((IntCompExpr2Context)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						((IntCompExpr2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(366);
						idAtom();
						}
						break;
					case 2:
						{
						setState(367);
						intAtom();
						}
						break;
					case 3:
						{
						setState(368);
						intCompExpr(0);
						}
						break;
					case 4:
						{
						setState(369);
						intArthExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class IntLogicExprContext extends ParserRuleContext {
		public IntLogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLogicExpr; }
	 
		public IntLogicExprContext() { }
		public void copyFrom(IntLogicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NIntLogicExprContext extends IntLogicExprContext {
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public NIntLogicExprContext(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterNIntLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitNIntLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitNIntLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLogicExpr2Context extends IntLogicExprContext {
		public Token op;
		public List<IntLogicExprContext> intLogicExpr() {
			return getRuleContexts(IntLogicExprContext.class);
		}
		public IntLogicExprContext intLogicExpr(int i) {
			return getRuleContext(IntLogicExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IntLogicExpr2Context(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntLogicExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntLogicExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntLogicExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomintLogicExprContext extends IntLogicExprContext {
		public Token op;
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IdAtomintLogicExprContext(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIdAtomintLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIdAtomintLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIdAtomintLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomIntLogicExprContext extends IntLogicExprContext {
		public Token op;
		public List<IntAtomContext> intAtom() {
			return getRuleContexts(IntAtomContext.class);
		}
		public IntAtomContext intAtom(int i) {
			return getRuleContext(IntAtomContext.class,i);
		}
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IntAtomIntLogicExprContext(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntAtomIntLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntAtomIntLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntAtomIntLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntCompExprIntLogicExprContext extends IntLogicExprContext {
		public Token op;
		public List<IntCompExprContext> intCompExpr() {
			return getRuleContexts(IntCompExprContext.class);
		}
		public IntCompExprContext intCompExpr(int i) {
			return getRuleContext(IntCompExprContext.class,i);
		}
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntArthExprContext intArthExpr() {
			return getRuleContext(IntArthExprContext.class,0);
		}
		public IntCompExprIntLogicExprContext(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntCompExprIntLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntCompExprIntLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntCompExprIntLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArthExprIntLogicExprContext extends IntLogicExprContext {
		public Token op;
		public List<IntArthExprContext> intArthExpr() {
			return getRuleContexts(IntArthExprContext.class);
		}
		public IntArthExprContext intArthExpr(int i) {
			return getRuleContext(IntArthExprContext.class,i);
		}
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public IntAtomContext intAtom() {
			return getRuleContext(IntAtomContext.class,0);
		}
		public IntCompExprContext intCompExpr() {
			return getRuleContext(IntCompExprContext.class,0);
		}
		public IntArthExprIntLogicExprContext(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterIntArthExprIntLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitIntArthExprIntLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIntArthExprIntLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenIntLogicExprContext extends IntLogicExprContext {
		public IntLogicExprContext intLogicExpr() {
			return getRuleContext(IntLogicExprContext.class,0);
		}
		public ParenIntLogicExprContext(IntLogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenIntLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenIntLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenIntLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLogicExprContext intLogicExpr() throws RecognitionException {
		return intLogicExpr(0);
	}

	private IntLogicExprContext intLogicExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntLogicExprContext _localctx = new IntLogicExprContext(_ctx, _parentState);
		IntLogicExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_intLogicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new NIntLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(378);
				match(T__27);
				setState(379);
				intLogicExpr(7);
				}
				break;
			case 2:
				{
				_localctx = new ParenIntLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(T__11);
				setState(381);
				intLogicExpr(0);
				setState(382);
				match(T__12);
				}
				break;
			case 3:
				{
				_localctx = new IntAtomIntLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				intAtom();
				setState(385);
				((IntAtomIntLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((IntAtomIntLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(386);
					intLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(387);
					idAtom();
					}
					break;
				case 3:
					{
					setState(388);
					intAtom();
					}
					break;
				case 4:
					{
					setState(389);
					intCompExpr(0);
					}
					break;
				case 5:
					{
					setState(390);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new IdAtomintLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				idAtom();
				setState(394);
				((IdAtomintLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((IdAtomintLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(395);
					intLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(396);
					intAtom();
					}
					break;
				case 3:
					{
					setState(397);
					intCompExpr(0);
					}
					break;
				case 4:
					{
					setState(398);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new IntCompExprIntLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				intCompExpr(0);
				setState(402);
				((IntCompExprIntLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((IntCompExprIntLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(403);
					intLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(404);
					idAtom();
					}
					break;
				case 3:
					{
					setState(405);
					intAtom();
					}
					break;
				case 4:
					{
					setState(406);
					intCompExpr(0);
					}
					break;
				case 5:
					{
					setState(407);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new IntArthExprIntLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				intArthExpr(0);
				setState(411);
				((IntArthExprIntLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((IntArthExprIntLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(412);
					intLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(413);
					idAtom();
					}
					break;
				case 3:
					{
					setState(414);
					intAtom();
					}
					break;
				case 4:
					{
					setState(415);
					intCompExpr(0);
					}
					break;
				case 5:
					{
					setState(416);
					intArthExpr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntLogicExpr2Context(new IntLogicExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_intLogicExpr);
					setState(421);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(422);
					((IntLogicExpr2Context)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__28 || _la==T__29) ) {
						((IntLogicExpr2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(423);
						intLogicExpr(0);
						}
						break;
					case 2:
						{
						setState(424);
						idAtom();
						}
						break;
					case 3:
						{
						setState(425);
						intAtom();
						}
						break;
					case 4:
						{
						setState(426);
						intCompExpr(0);
						}
						break;
					case 5:
						{
						setState(427);
						intArthExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class FloatExprContext extends ParserRuleContext {
		public FloatArthExprContext floatArthExpr() {
			return getRuleContext(FloatArthExprContext.class,0);
		}
		public FloatCompExprContext floatCompExpr() {
			return getRuleContext(FloatCompExprContext.class,0);
		}
		public FloatLogicExprContext floatLogicExpr() {
			return getRuleContext(FloatLogicExprContext.class,0);
		}
		public FloatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatExprContext floatExpr() throws RecognitionException {
		FloatExprContext _localctx = new FloatExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_floatExpr);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				floatArthExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				floatCompExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				floatLogicExpr(0);
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

	public static class FloatArthExprContext extends ParserRuleContext {
		public FloatArthExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArthExpr; }
	 
		public FloatArthExprContext() { }
		public void copyFrom(FloatArthExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultFloatArthExprContext extends FloatArthExprContext {
		public Token op;
		public List<FloatAtomContext> floatAtom() {
			return getRuleContexts(FloatAtomContext.class);
		}
		public FloatAtomContext floatAtom(int i) {
			return getRuleContext(FloatAtomContext.class,i);
		}
		public List<FloatArthExprContext> floatArthExpr() {
			return getRuleContexts(FloatArthExprContext.class);
		}
		public FloatArthExprContext floatArthExpr(int i) {
			return getRuleContext(FloatArthExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public MultFloatArthExprContext(FloatArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterMultFloatArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitMultFloatArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitMultFloatArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddFloatArthExprContext extends FloatArthExprContext {
		public Token op;
		public List<FloatAtomContext> floatAtom() {
			return getRuleContexts(FloatAtomContext.class);
		}
		public FloatAtomContext floatAtom(int i) {
			return getRuleContext(FloatAtomContext.class,i);
		}
		public List<FloatArthExprContext> floatArthExpr() {
			return getRuleContexts(FloatArthExprContext.class);
		}
		public FloatArthExprContext floatArthExpr(int i) {
			return getRuleContext(FloatArthExprContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public AddFloatArthExprContext(FloatArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterAddFloatArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitAddFloatArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAddFloatArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenFloatArthExprContext extends FloatArthExprContext {
		public FloatArthExprContext floatArthExpr() {
			return getRuleContext(FloatArthExprContext.class,0);
		}
		public ParenFloatArthExprContext(FloatArthExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterParenFloatArthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitParenFloatArthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitParenFloatArthExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatArthExprContext floatArthExpr() throws RecognitionException {
		return floatArthExpr(0);
	}

	private FloatArthExprContext floatArthExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FloatArthExprContext _localctx = new FloatArthExprContext(_ctx, _parentState);
		FloatArthExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_floatArthExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new ParenFloatArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(441);
				match(T__11);
				setState(442);
				floatArthExpr(0);
				setState(443);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new MultFloatArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(445);
				floatAtom();
				setState(446);
				((MultFloatArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((MultFloatArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(447);
					floatArthExpr(0);
					}
					break;
				case 2:
					{
					setState(448);
					floatAtom();
					}
					break;
				case 3:
					{
					setState(449);
					idAtom();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new MultFloatArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(452);
				idAtom();
				setState(453);
				((MultFloatArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((MultFloatArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(454);
					floatArthExpr(0);
					}
					break;
				case 2:
					{
					setState(455);
					floatAtom();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new AddFloatArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458);
				floatAtom();
				setState(459);
				((AddFloatArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((AddFloatArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(460);
					floatArthExpr(0);
					}
					break;
				case 2:
					{
					setState(461);
					floatAtom();
					}
					break;
				case 3:
					{
					setState(462);
					idAtom();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new AddFloatArthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(465);
				idAtom();
				setState(466);
				((AddFloatArthExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((AddFloatArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(467);
					floatArthExpr(0);
					}
					break;
				case 2:
					{
					setState(468);
					floatAtom();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new MultFloatArthExprContext(new FloatArthExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_floatArthExpr);
						setState(473);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(474);
						((MultFloatArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((MultFloatArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(478);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(475);
							floatArthExpr(0);
							}
							break;
						case 2:
							{
							setState(476);
							floatAtom();
							}
							break;
						case 3:
							{
							setState(477);
							idAtom();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AddFloatArthExprContext(new FloatArthExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_floatArthExpr);
						setState(480);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(481);
						((AddFloatArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((AddFloatArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(485);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(482);
							floatArthExpr(0);
							}
							break;
						case 2:
							{
							setState(483);
							floatAtom();
							}
							break;
						case 3:
							{
							setState(484);
							idAtom();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class FloatCompExprContext extends ParserRuleContext {
		public Token op;
		public List<FloatCompExprContext> floatCompExpr() {
			return getRuleContexts(FloatCompExprContext.class);
		}
		public FloatCompExprContext floatCompExpr(int i) {
			return getRuleContext(FloatCompExprContext.class,i);
		}
		public List<FloatAtomContext> floatAtom() {
			return getRuleContexts(FloatAtomContext.class);
		}
		public FloatAtomContext floatAtom(int i) {
			return getRuleContext(FloatAtomContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public List<FloatArthExprContext> floatArthExpr() {
			return getRuleContexts(FloatArthExprContext.class);
		}
		public FloatArthExprContext floatArthExpr(int i) {
			return getRuleContext(FloatArthExprContext.class,i);
		}
		public FloatCompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatCompExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterFloatCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitFloatCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFloatCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatCompExprContext floatCompExpr() throws RecognitionException {
		return floatCompExpr(0);
	}

	private FloatCompExprContext floatCompExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FloatCompExprContext _localctx = new FloatCompExprContext(_ctx, _parentState);
		FloatCompExprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_floatCompExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(493);
				match(T__11);
				setState(494);
				floatCompExpr(0);
				setState(495);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(497);
				floatAtom();
				setState(498);
				((FloatCompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((FloatCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(499);
					floatAtom();
					}
					break;
				case 2:
					{
					setState(500);
					idAtom();
					}
					break;
				case 3:
					{
					setState(501);
					floatCompExpr(0);
					}
					break;
				case 4:
					{
					setState(502);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(505);
				idAtom();
				setState(506);
				((FloatCompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((FloatCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(507);
					floatAtom();
					}
					break;
				case 2:
					{
					setState(508);
					floatCompExpr(0);
					}
					break;
				case 3:
					{
					setState(509);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(512);
				floatArthExpr(0);
				setState(513);
				((FloatCompExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
					((FloatCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(514);
					floatAtom();
					}
					break;
				case 2:
					{
					setState(515);
					idAtom();
					}
					break;
				case 3:
					{
					setState(516);
					floatCompExpr(0);
					}
					break;
				case 4:
					{
					setState(517);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FloatCompExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_floatCompExpr);
					setState(522);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(523);
					((FloatCompExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						((FloatCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(528);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(524);
						floatAtom();
						}
						break;
					case 2:
						{
						setState(525);
						idAtom();
						}
						break;
					case 3:
						{
						setState(526);
						floatCompExpr(0);
						}
						break;
					case 4:
						{
						setState(527);
						floatArthExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class FloatLogicExprContext extends ParserRuleContext {
		public Token op;
		public List<FloatLogicExprContext> floatLogicExpr() {
			return getRuleContexts(FloatLogicExprContext.class);
		}
		public FloatLogicExprContext floatLogicExpr(int i) {
			return getRuleContext(FloatLogicExprContext.class,i);
		}
		public List<FloatAtomContext> floatAtom() {
			return getRuleContexts(FloatAtomContext.class);
		}
		public FloatAtomContext floatAtom(int i) {
			return getRuleContext(FloatAtomContext.class,i);
		}
		public IdAtomContext idAtom() {
			return getRuleContext(IdAtomContext.class,0);
		}
		public List<FloatCompExprContext> floatCompExpr() {
			return getRuleContexts(FloatCompExprContext.class);
		}
		public FloatCompExprContext floatCompExpr(int i) {
			return getRuleContext(FloatCompExprContext.class,i);
		}
		public List<FloatArthExprContext> floatArthExpr() {
			return getRuleContexts(FloatArthExprContext.class);
		}
		public FloatArthExprContext floatArthExpr(int i) {
			return getRuleContext(FloatArthExprContext.class,i);
		}
		public FloatLogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLogicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).enterFloatLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SjListener ) ((SjListener)listener).exitFloatLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitFloatLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLogicExprContext floatLogicExpr() throws RecognitionException {
		return floatLogicExpr(0);
	}

	private FloatLogicExprContext floatLogicExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FloatLogicExprContext _localctx = new FloatLogicExprContext(_ctx, _parentState);
		FloatLogicExprContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_floatLogicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(536);
				match(T__27);
				setState(537);
				floatLogicExpr(7);
				}
				break;
			case 2:
				{
				setState(538);
				match(T__11);
				setState(539);
				floatLogicExpr(0);
				setState(540);
				match(T__12);
				}
				break;
			case 3:
				{
				setState(542);
				floatAtom();
				setState(543);
				((FloatLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((FloatLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(544);
					floatLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(545);
					floatAtom();
					}
					break;
				case 3:
					{
					setState(546);
					idAtom();
					}
					break;
				case 4:
					{
					setState(547);
					floatCompExpr(0);
					}
					break;
				case 5:
					{
					setState(548);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(551);
				idAtom();
				setState(552);
				((FloatLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((FloatLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(553);
					floatLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(554);
					floatAtom();
					}
					break;
				case 3:
					{
					setState(555);
					floatCompExpr(0);
					}
					break;
				case 4:
					{
					setState(556);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(559);
				floatCompExpr(0);
				setState(560);
				((FloatLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((FloatLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(561);
					floatLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(562);
					floatAtom();
					}
					break;
				case 3:
					{
					setState(563);
					idAtom();
					}
					break;
				case 4:
					{
					setState(564);
					floatCompExpr(0);
					}
					break;
				case 5:
					{
					setState(565);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(568);
				floatArthExpr(0);
				setState(569);
				((FloatLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((FloatLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(570);
					floatLogicExpr(0);
					}
					break;
				case 2:
					{
					setState(571);
					floatAtom();
					}
					break;
				case 3:
					{
					setState(572);
					idAtom();
					}
					break;
				case 4:
					{
					setState(573);
					floatCompExpr(0);
					}
					break;
				case 5:
					{
					setState(574);
					floatArthExpr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FloatLogicExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_floatLogicExpr);
					setState(579);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(580);
					((FloatLogicExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__28 || _la==T__29) ) {
						((FloatLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(586);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(581);
						floatLogicExpr(0);
						}
						break;
					case 2:
						{
						setState(582);
						floatAtom();
						}
						break;
					case 3:
						{
						setState(583);
						idAtom();
						}
						break;
					case 4:
						{
						setState(584);
						floatCompExpr(0);
						}
						break;
					case 5:
						{
						setState(585);
						floatArthExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return intArthExpr_sempred((IntArthExprContext)_localctx, predIndex);
		case 31:
			return intCompExpr_sempred((IntCompExprContext)_localctx, predIndex);
		case 32:
			return intLogicExpr_sempred((IntLogicExprContext)_localctx, predIndex);
		case 34:
			return floatArthExpr_sempred((FloatArthExprContext)_localctx, predIndex);
		case 35:
			return floatCompExpr_sempred((FloatCompExprContext)_localctx, predIndex);
		case 36:
			return floatLogicExpr_sempred((FloatLogicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intArthExpr_sempred(IntArthExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean intCompExpr_sempred(IntCompExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean intLogicExpr_sempred(IntLogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean floatArthExpr_sempred(FloatArthExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean floatCompExpr_sempred(FloatCompExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean floatLogicExpr_sempred(FloatLogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0254\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\13\7\13~\n\13\f\13\16\13\u0081\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\7\r\u008e\n\r\f\r\16"+
		"\r\u0091\13\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b3\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c1\n\24\3\25\3\25\3\25"+
		"\5\25\u00c6\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u00cd\n\26\f\26\16\26\u00d0"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d8\n\27\3\30\3\30\3\30\5"+
		"\30\u00dd\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00eb\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f5"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0101\n\33"+
		"\3\34\3\34\3\34\5\34\u0106\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u010d\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\5\36\u0114\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u011b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0127\n \3 \3 \3 \3"+
		" \5 \u012d\n \3 \3 \3 \3 \3 \5 \u0134\n \3 \3 \3 \3 \5 \u013a\n \5 \u013c"+
		"\n \3 \3 \3 \3 \3 \5 \u0143\n \3 \3 \3 \3 \3 \5 \u014a\n \7 \u014c\n "+
		"\f \16 \u014f\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u015c\n!\3!\3!\3"+
		"!\3!\3!\5!\u0163\n!\3!\3!\3!\3!\3!\3!\5!\u016b\n!\5!\u016d\n!\3!\3!\3"+
		"!\3!\3!\3!\5!\u0175\n!\7!\u0177\n!\f!\16!\u017a\13!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018a\n\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u0192\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019b\n\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u01a4\n\"\5\"\u01a6\n\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u01af\n\"\7\"\u01b1\n\"\f\"\16\"\u01b4\13\"\3#\3#\3#\5#\u01b9"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c5\n$\3$\3$\3$\3$\5$\u01cb\n$"+
		"\3$\3$\3$\3$\3$\5$\u01d2\n$\3$\3$\3$\3$\5$\u01d8\n$\5$\u01da\n$\3$\3$"+
		"\3$\3$\3$\5$\u01e1\n$\3$\3$\3$\3$\3$\5$\u01e8\n$\7$\u01ea\n$\f$\16$\u01ed"+
		"\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01fa\n%\3%\3%\3%\3%\3%\5%\u0201"+
		"\n%\3%\3%\3%\3%\3%\3%\5%\u0209\n%\5%\u020b\n%\3%\3%\3%\3%\3%\3%\5%\u0213"+
		"\n%\7%\u0215\n%\f%\16%\u0218\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u0228\n&\3&\3&\3&\3&\3&\3&\5&\u0230\n&\3&\3&\3&\3&\3&\3&\3&\5"+
		"&\u0239\n&\3&\3&\3&\3&\3&\3&\3&\5&\u0242\n&\5&\u0244\n&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u024d\n&\7&\u024f\n&\f&\16&\u0252\13&\3&\2\b>@BFHJ\'\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\n\3"+
		"\2\n\13\3\2!#\3\2()\3\2%\'\3\2\24\25\3\2\26\27\3\2\30\35\3\2\37 \2\u02c1"+
		"\2L\3\2\2\2\4Z\3\2\2\2\6]\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fl\3\2\2\2\16"+
		"o\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24\177\3\2\2\2\26\u0089\3\2\2\2\30\u008b"+
		"\3\2\2\2\32\u0095\3\2\2\2\34\u009e\3\2\2\2\36\u00a7\3\2\2\2 \u00b2\3\2"+
		"\2\2\"\u00b4\3\2\2\2$\u00b6\3\2\2\2&\u00c0\3\2\2\2(\u00c2\3\2\2\2*\u00c9"+
		"\3\2\2\2,\u00d7\3\2\2\2.\u00dc\3\2\2\2\60\u00ea\3\2\2\2\62\u00f4\3\2\2"+
		"\2\64\u0100\3\2\2\2\66\u0105\3\2\2\28\u010c\3\2\2\2:\u0113\3\2\2\2<\u011a"+
		"\3\2\2\2>\u013b\3\2\2\2@\u016c\3\2\2\2B\u01a5\3\2\2\2D\u01b8\3\2\2\2F"+
		"\u01d9\3\2\2\2H\u020a\3\2\2\2J\u0243\3\2\2\2LM\5\4\3\2MN\5\b\5\2NO\7\3"+
		"\2\2OP\5\n\6\2PQ\7\4\2\2QR\5\f\7\2RS\7\5\2\2ST\7\4\2\2TU\5\24\13\2UV\7"+
		"\6\2\2V\3\3\2\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2["+
		"\5\3\2\2\2\\Z\3\2\2\2]^\7\7\2\2^_\5\n\6\2_`\7\b\2\2`a\5\n\6\2ab\7\t\2"+
		"\2b\7\3\2\2\2cd\t\2\2\2d\t\3\2\2\2ef\7$\2\2f\13\3\2\2\2gh\5\16\b\2hi\7"+
		"\t\2\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\r\3\2\2\2nl"+
		"\3\2\2\2op\5\20\t\2pq\5\22\n\2q\17\3\2\2\2rs\t\3\2\2s\21\3\2\2\2ty\5\n"+
		"\6\2uv\7\f\2\2vx\5\n\6\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\23\3"+
		"\2\2\2{y\3\2\2\2|~\5\26\f\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u008a\5\30\r\2"+
		"\u0083\u0084\5&\24\2\u0084\u0085\7\t\2\2\u0085\u008a\3\2\2\2\u0086\u0087"+
		"\5(\25\2\u0087\u0088\7\t\2\2\u0088\u008a\3\2\2\2\u0089\u0082\3\2\2\2\u0089"+
		"\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\27\3\2\2\2\u008b\u008f\5\32\16"+
		"\2\u008c\u008e\5\34\17\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0094\5\36\20\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\31\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u0097\7\16\2\2\u0097\u0098\5 \21"+
		"\2\u0098\u0099\7\17\2\2\u0099\u009a\7\20\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009c\5\24\13\2\u009c\u009d\7\6\2\2\u009d\33\3\2\2\2\u009e\u009f\7\21"+
		"\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7\17\2\2\u00a2"+
		"\u00a3\7\20\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6"+
		"\7\6\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\22\2\2\u00a8\u00a9\7\4\2\2\u00a9"+
		"\u00aa\5\24\13\2\u00aa\u00ab\7\6\2\2\u00ab\37\3\2\2\2\u00ac\u00b3\5\64"+
		"\33\2\u00ad\u00b3\5\62\32\2\u00ae\u00b3\5B\"\2\u00af\u00b3\5@!\2\u00b0"+
		"\u00b3\5J&\2\u00b1\u00b3\5H%\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5#\3\2\2\2\u00b6\u00b7"+
		"\t\5\2\2\u00b7%\3\2\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\7\23\2\2\u00ba"+
		"\u00bb\5,\27\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\23"+
		"\2\2\u00be\u00bf\5$\23\2\u00bf\u00c1\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0"+
		"\u00bc\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c5\7\16\2"+
		"\2\u00c4\u00c6\5*\26\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\7\17\2\2\u00c8)\3\2\2\2\u00c9\u00ce\5,\27\2\u00ca"+
		"\u00cb\7\f\2\2\u00cb\u00cd\5,\27\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf+\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d8\5(\25\2\u00d2\u00d8\5.\30\2\u00d3\u00d8\5\66\34\2"+
		"\u00d4\u00d8\5D#\2\u00d5\u00d8\5$\23\2\u00d6\u00d8\5\n\6\2\u00d7\u00d1"+
		"\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00dd\5\60\31"+
		"\2\u00da\u00dd\5\62\32\2\u00db\u00dd\5\64\33\2\u00dc\u00d9\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd/\3\2\2\2\u00de\u00df\7\16\2\2"+
		"\u00df\u00e0\5\60\31\2\u00e0\u00e1\7\17\2\2\u00e1\u00eb\3\2\2\2\u00e2"+
		"\u00e3\5\n\6\2\u00e3\u00e4\t\6\2\2\u00e4\u00e5\5\n\6\2\u00e5\u00eb\3\2"+
		"\2\2\u00e6\u00e7\5\n\6\2\u00e7\u00e8\t\7\2\2\u00e8\u00e9\5\n\6\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00eb\61\3\2\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5\62\32\2\u00ee"+
		"\u00ef\7\17\2\2\u00ef\u00f5\3\2\2\2\u00f0\u00f1\5\n\6\2\u00f1\u00f2\t"+
		"\b\2\2\u00f2\u00f3\5\n\6\2\u00f3\u00f5\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00f0\3\2\2\2\u00f5\63\3\2\2\2\u00f6\u00f7\7\36\2\2\u00f7\u0101\5\64"+
		"\33\2\u00f8\u00f9\7\16\2\2\u00f9\u00fa\5\64\33\2\u00fa\u00fb\7\17\2\2"+
		"\u00fb\u0101\3\2\2\2\u00fc\u00fd\5\n\6\2\u00fd\u00fe\t\t\2\2\u00fe\u00ff"+
		"\5\n\6\2\u00ff\u0101\3\2\2\2\u0100\u00f6\3\2\2\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u00fc\3\2\2\2\u0101\65\3\2\2\2\u0102\u0106\5> \2\u0103\u0106\5@!\2\u0104"+
		"\u0106\5B\"\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2"+
		"\2\2\u0106\67\3\2\2\2\u0107\u0108\7\16\2\2\u0108\u0109\58\35\2\u0109\u010a"+
		"\7\17\2\2\u010a\u010d\3\2\2\2\u010b\u010d\7%\2\2\u010c\u0107\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d9\3\2\2\2\u010e\u010f\7\16\2\2\u010f\u0110\5:\36\2"+
		"\u0110\u0111\7\17\2\2\u0111\u0114\3\2\2\2\u0112\u0114\7&\2\2\u0113\u010e"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114;\3\2\2\2\u0115\u0116\7\16\2\2\u0116"+
		"\u0117\5<\37\2\u0117\u0118\7\17\2\2\u0118\u011b\3\2\2\2\u0119\u011b\5"+
		"\n\6\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2\2\2\u011b=\3\2\2\2\u011c\u011d"+
		"\b \1\2\u011d\u011e\7\16\2\2\u011e\u011f\5> \2\u011f\u0120\7\17\2\2\u0120"+
		"\u013c\3\2\2\2\u0121\u0122\58\35\2\u0122\u0126\t\6\2\2\u0123\u0127\5>"+
		" \2\u0124\u0127\5<\37\2\u0125\u0127\58\35\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u013c\3\2\2\2\u0128\u0129\5<"+
		"\37\2\u0129\u012c\t\6\2\2\u012a\u012d\5> \2\u012b\u012d\58\35\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u013c\3\2\2\2\u012e\u012f\58"+
		"\35\2\u012f\u0133\t\7\2\2\u0130\u0134\5> \2\u0131\u0134\5<\37\2\u0132"+
		"\u0134\58\35\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2"+
		"\2\2\u0134\u013c\3\2\2\2\u0135\u0136\5<\37\2\u0136\u0139\t\7\2\2\u0137"+
		"\u013a\5> \2\u0138\u013a\58\35\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2"+
		"\2\u013a\u013c\3\2\2\2\u013b\u011c\3\2\2\2\u013b\u0121\3\2\2\2\u013b\u0128"+
		"\3\2\2\2\u013b\u012e\3\2\2\2\u013b\u0135\3\2\2\2\u013c\u014d\3\2\2\2\u013d"+
		"\u013e\f\6\2\2\u013e\u0142\t\6\2\2\u013f\u0143\5> \2\u0140\u0143\5<\37"+
		"\2\u0141\u0143\58\35\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\u014c\3\2\2\2\u0144\u0145\f\3\2\2\u0145\u0149\t\7\2\2\u0146"+
		"\u014a\5> \2\u0147\u014a\5<\37\2\u0148\u014a\58\35\2\u0149\u0146\3\2\2"+
		"\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u013d"+
		"\3\2\2\2\u014b\u0144\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e?\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\b!\1\2\u0151"+
		"\u0152\7\16\2\2\u0152\u0153\5@!\2\u0153\u0154\7\17\2\2\u0154\u016d\3\2"+
		"\2\2\u0155\u0156\58\35\2\u0156\u015b\t\b\2\2\u0157\u015c\5<\37\2\u0158"+
		"\u015c\58\35\2\u0159\u015c\5@!\2\u015a\u015c\5> \2\u015b\u0157\3\2\2\2"+
		"\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u016d"+
		"\3\2\2\2\u015d\u015e\5<\37\2\u015e\u0162\t\b\2\2\u015f\u0163\58\35\2\u0160"+
		"\u0163\5@!\2\u0161\u0163\5> \2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2"+
		"\u0162\u0161\3\2\2\2\u0163\u016d\3\2\2\2\u0164\u0165\5> \2\u0165\u016a"+
		"\t\b\2\2\u0166\u016b\5<\37\2\u0167\u016b\58\35\2\u0168\u016b\5@!\2\u0169"+
		"\u016b\5> \2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2"+
		"\2\u016a\u0169\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0150\3\2\2\2\u016c\u0155"+
		"\3\2\2\2\u016c\u015d\3\2\2\2\u016c\u0164\3\2\2\2\u016d\u0178\3\2\2\2\u016e"+
		"\u016f\f\4\2\2\u016f\u0174\t\b\2\2\u0170\u0175\5<\37\2\u0171\u0175\58"+
		"\35\2\u0172\u0175\5@!\2\u0173\u0175\5> \2\u0174\u0170\3\2\2\2\u0174\u0171"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u016e\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179A\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\b\"\1\2\u017c\u017d"+
		"\7\36\2\2\u017d\u01a6\5B\"\t\u017e\u017f\7\16\2\2\u017f\u0180\5B\"\2\u0180"+
		"\u0181\7\17\2\2\u0181\u01a6\3\2\2\2\u0182\u0183\58\35\2\u0183\u0189\t"+
		"\t\2\2\u0184\u018a\5B\"\2\u0185\u018a\5<\37\2\u0186\u018a\58\35\2\u0187"+
		"\u018a\5@!\2\u0188\u018a\5> \2\u0189\u0184\3\2\2\2\u0189\u0185\3\2\2\2"+
		"\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u01a6"+
		"\3\2\2\2\u018b\u018c\5<\37\2\u018c\u0191\t\t\2\2\u018d\u0192\5B\"\2\u018e"+
		"\u0192\58\35\2\u018f\u0192\5@!\2\u0190\u0192\5> \2\u0191\u018d\3\2\2\2"+
		"\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u01a6"+
		"\3\2\2\2\u0193\u0194\5@!\2\u0194\u019a\t\t\2\2\u0195\u019b\5B\"\2\u0196"+
		"\u019b\5<\37\2\u0197\u019b\58\35\2\u0198\u019b\5@!\2\u0199\u019b\5> \2"+
		"\u019a\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u01a6\3\2\2\2\u019c\u019d\5> \2\u019d"+
		"\u01a3\t\t\2\2\u019e\u01a4\5B\"\2\u019f\u01a4\5<\37\2\u01a0\u01a4\58\35"+
		"\2\u01a1\u01a4\5@!\2\u01a2\u01a4\5> \2\u01a3\u019e\3\2\2\2\u01a3\u019f"+
		"\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u017b\3\2\2\2\u01a5\u017e\3\2\2\2\u01a5\u0182\3\2"+
		"\2\2\u01a5\u018b\3\2\2\2\u01a5\u0193\3\2\2\2\u01a5\u019c\3\2\2\2\u01a6"+
		"\u01b2\3\2\2\2\u01a7\u01a8\f\5\2\2\u01a8\u01ae\t\t\2\2\u01a9\u01af\5B"+
		"\"\2\u01aa\u01af\5<\37\2\u01ab\u01af\58\35\2\u01ac\u01af\5@!\2\u01ad\u01af"+
		"\5> \2\u01ae\u01a9\3\2\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01a7\3\2"+
		"\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"C\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b9\5F$\2\u01b6\u01b9\5H%\2\u01b7"+
		"\u01b9\5J&\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2"+
		"\2\u01b9E\3\2\2\2\u01ba\u01bb\b$\1\2\u01bb\u01bc\7\16\2\2\u01bc\u01bd"+
		"\5F$\2\u01bd\u01be\7\17\2\2\u01be\u01da\3\2\2\2\u01bf\u01c0\5:\36\2\u01c0"+
		"\u01c4\t\6\2\2\u01c1\u01c5\5F$\2\u01c2\u01c5\5:\36\2\u01c3\u01c5\5<\37"+
		"\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01da"+
		"\3\2\2\2\u01c6\u01c7\5<\37\2\u01c7\u01ca\t\6\2\2\u01c8\u01cb\5F$\2\u01c9"+
		"\u01cb\5:\36\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01da\3\2"+
		"\2\2\u01cc\u01cd\5:\36\2\u01cd\u01d1\t\7\2\2\u01ce\u01d2\5F$\2\u01cf\u01d2"+
		"\5:\36\2\u01d0\u01d2\5<\37\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01da\3\2\2\2\u01d3\u01d4\5<\37\2\u01d4\u01d7\t\7"+
		"\2\2\u01d5\u01d8\5F$\2\u01d6\u01d8\5:\36\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6"+
		"\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01ba\3\2\2\2\u01d9\u01bf\3\2\2\2\u01d9"+
		"\u01c6\3\2\2\2\u01d9\u01cc\3\2\2\2\u01d9\u01d3\3\2\2\2\u01da\u01eb\3\2"+
		"\2\2\u01db\u01dc\f\6\2\2\u01dc\u01e0\t\6\2\2\u01dd\u01e1\5F$\2\u01de\u01e1"+
		"\5:\36\2\u01df\u01e1\5<\37\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1\u01ea\3\2\2\2\u01e2\u01e3\f\3\2\2\u01e3\u01e7\t\7"+
		"\2\2\u01e4\u01e8\5F$\2\u01e5\u01e8\5:\36\2\u01e6\u01e8\5<\37\2\u01e7\u01e4"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01db\3\2\2\2\u01e9\u01e2\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ecG\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef"+
		"\b%\1\2\u01ef\u01f0\7\16\2\2\u01f0\u01f1\5H%\2\u01f1\u01f2\7\17\2\2\u01f2"+
		"\u020b\3\2\2\2\u01f3\u01f4\5:\36\2\u01f4\u01f9\t\b\2\2\u01f5\u01fa\5:"+
		"\36\2\u01f6\u01fa\5<\37\2\u01f7\u01fa\5H%\2\u01f8\u01fa\5F$\2\u01f9\u01f5"+
		"\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u020b\3\2\2\2\u01fb\u01fc\5<\37\2\u01fc\u0200\t\b\2\2\u01fd\u0201\5:"+
		"\36\2\u01fe\u0201\5H%\2\u01ff\u0201\5F$\2\u0200\u01fd\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u020b\3\2\2\2\u0202\u0203\5F$\2\u0203"+
		"\u0208\t\b\2\2\u0204\u0209\5:\36\2\u0205\u0209\5<\37\2\u0206\u0209\5H"+
		"%\2\u0207\u0209\5F$\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0207\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u01ee\3\2\2\2\u020a"+
		"\u01f3\3\2\2\2\u020a\u01fb\3\2\2\2\u020a\u0202\3\2\2\2\u020b\u0216\3\2"+
		"\2\2\u020c\u020d\f\4\2\2\u020d\u0212\t\b\2\2\u020e\u0213\5:\36\2\u020f"+
		"\u0213\5<\37\2\u0210\u0213\5H%\2\u0211\u0213\5F$\2\u0212\u020e\3\2\2\2"+
		"\u0212\u020f\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0215"+
		"\3\2\2\2\u0214\u020c\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217I\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\b&\1\2\u021a"+
		"\u021b\7\36\2\2\u021b\u0244\5J&\t\u021c\u021d\7\16\2\2\u021d\u021e\5J"+
		"&\2\u021e\u021f\7\17\2\2\u021f\u0244\3\2\2\2\u0220\u0221\5:\36\2\u0221"+
		"\u0227\t\t\2\2\u0222\u0228\5J&\2\u0223\u0228\5:\36\2\u0224\u0228\5<\37"+
		"\2\u0225\u0228\5H%\2\u0226\u0228\5F$\2\u0227\u0222\3\2\2\2\u0227\u0223"+
		"\3\2\2\2\u0227\u0224\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228"+
		"\u0244\3\2\2\2\u0229\u022a\5<\37\2\u022a\u022f\t\t\2\2\u022b\u0230\5J"+
		"&\2\u022c\u0230\5:\36\2\u022d\u0230\5H%\2\u022e\u0230\5F$\2\u022f\u022b"+
		"\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230"+
		"\u0244\3\2\2\2\u0231\u0232\5H%\2\u0232\u0238\t\t\2\2\u0233\u0239\5J&\2"+
		"\u0234\u0239\5:\36\2\u0235\u0239\5<\37\2\u0236\u0239\5H%\2\u0237\u0239"+
		"\5F$\2\u0238\u0233\3\2\2\2\u0238\u0234\3\2\2\2\u0238\u0235\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u0244\3\2\2\2\u023a\u023b\5F"+
		"$\2\u023b\u0241\t\t\2\2\u023c\u0242\5J&\2\u023d\u0242\5:\36\2\u023e\u0242"+
		"\5<\37\2\u023f\u0242\5H%\2\u0240\u0242\5F$\2\u0241\u023c\3\2\2\2\u0241"+
		"\u023d\3\2\2\2\u0241\u023e\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2"+
		"\2\2\u0242\u0244\3\2\2\2\u0243\u0219\3\2\2\2\u0243\u021c\3\2\2\2\u0243"+
		"\u0220\3\2\2\2\u0243\u0229\3\2\2\2\u0243\u0231\3\2\2\2\u0243\u023a\3\2"+
		"\2\2\u0244\u0250\3\2\2\2\u0245\u0246\f\5\2\2\u0246\u024c\t\t\2\2\u0247"+
		"\u024d\5J&\2\u0248\u024d\5:\36\2\u0249\u024d\5<\37\2\u024a\u024d\5H%\2"+
		"\u024b\u024d\5F$\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2\2\2\u024c\u0249"+
		"\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u024f\3\2\2\2\u024e"+
		"\u0245\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251K\3\2\2\2\u0252\u0250\3\2\2\2CZly\177\u0089\u008f\u0093\u00b2"+
		"\u00c0\u00c5\u00ce\u00d7\u00dc\u00ea\u00f4\u0100\u0105\u010c\u0113\u011a"+
		"\u0126\u012c\u0133\u0139\u013b\u0142\u0149\u014b\u014d\u015b\u0162\u016a"+
		"\u016c\u0174\u0178\u0189\u0191\u019a\u01a3\u01a5\u01ae\u01b2\u01b8\u01c4"+
		"\u01ca\u01d1\u01d7\u01d9\u01e0\u01e7\u01e9\u01eb\u01f9\u0200\u0208\u020a"+
		"\u0212\u0216\u0227\u022f\u0238\u0241\u0243\u024c\u0250";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}