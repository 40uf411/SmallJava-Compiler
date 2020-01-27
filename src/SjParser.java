// Generated from C:/Users/a/Desktop/code source/final 2/grammar\Sj.g4 by ANTLR 4.7.2
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
		INT=32, FLOAT=33, STRING=34, ID=35, INTEGER_VAL=36, FLOAT_VAL=37, STRING_VAL=38, 
		BOOL_T=39, BOOL_F=40, COMMENT=41, WS=42;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_import_ = 2, RULE_modificator = 3, 
		RULE_declarations = 4, RULE_declaration = 5, RULE_type = 6, RULE_vars = 7, 
		RULE_instructions = 8, RULE_instruction = 9, RULE_ifStatement = 10, RULE_ifStat = 11, 
		RULE_elseStat = 12, RULE_ifCondition = 13, RULE_affectation = 14, RULE_out_sj = 15, 
		RULE_in_sj = 16, RULE_exprList = 17, RULE_expr = 18, RULE_compExpr = 19, 
		RULE_logicExpr = 20, RULE_atom = 21, RULE_intAtom = 22, RULE_floatAtom = 23, 
		RULE_stringAtom = 24, RULE_idAtom = 25, RULE_identifier = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "import_", "modificator", "declarations", "declaration", 
			"type", "vars", "instructions", "instruction", "ifStatement", "ifStat", 
			"elseStat", "ifCondition", "affectation", "out_sj", "in_sj", "exprList", 
			"expr", "compExpr", "logicExpr", "atom", "intAtom", "floatAtom", "stringAtom", 
			"idAtom", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class_SJ'", "'{'", "'main_SJ'", "'}'", "'import'", "'.'", "';'", 
			"'public'", "'protected'", "','", "'Si'", "'('", "')'", "'Alors'", "'Sinon'", 
			"'='", "'Out_SJ'", "'In_SJ'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", 
			"'=='", "'!='", "'<='", "'<'", "'!'", "'&'", "'|'", "'int'", "'float'", 
			"'string'", null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT", "FLOAT", "STRING", 
			"ID", "INTEGER_VAL", "FLOAT_VAL", "STRING_VAL", "BOOL_T", "BOOL_F", "COMMENT", 
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
			setState(54);
			imports();
			setState(55);
			modificator();
			setState(56);
			match(T__0);
			setState(57);
			match(ID);
			setState(58);
			match(T__1);
			setState(59);
			declarations();
			setState(60);
			match(T__2);
			setState(61);
			match(T__1);
			setState(62);
			instructions();
			setState(63);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(65);
				import_();
				}
				}
				setState(70);
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
			setState(71);
			match(T__4);
			setState(72);
			match(ID);
			setState(73);
			match(T__5);
			setState(74);
			match(ID);
			setState(75);
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
			setState(77);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(79);
				declaration();
				setState(80);
				match(T__6);
				}
				}
				setState(86);
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
			setState(87);
			type();
			setState(88);
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
			setState(90);
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
			setState(92);
			identifier();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(93);
				match(T__9);
				setState(94);
				identifier();
				}
				}
				setState(99);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(100);
				instruction();
				}
				}
				setState(105);
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
	public static class In_sj_idContext extends InstructionContext {
		public In_sjContext in_sj() {
			return getRuleContext(In_sjContext.class,0);
		}
		public In_sj_idContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIn_sj_id(this);
			else return visitor.visitChildren(this);
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
	public static class Out_sj_idContext extends InstructionContext {
		public Out_sjContext out_sj() {
			return getRuleContext(Out_sjContext.class,0);
		}
		public Out_sj_idContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitOut_sj_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new IfInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				ifStatement();
				}
				break;
			case ID:
				_localctx = new AfctInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				affectation();
				setState(108);
				match(T__6);
				}
				break;
			case T__16:
				_localctx = new Out_sj_idContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				out_sj();
				setState(111);
				match(T__6);
				}
				break;
			case T__17:
				_localctx = new In_sj_idContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				in_sj();
				setState(114);
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
			setState(118);
			ifStat();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(119);
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
			setState(122);
			match(T__10);
			setState(123);
			match(T__11);
			setState(124);
			ifCondition();
			setState(125);
			match(T__12);
			setState(126);
			match(T__13);
			setState(127);
			match(T__1);
			setState(128);
			instructions();
			setState(129);
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
		enterRule(_localctx, 24, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__14);
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
		enterRule(_localctx, 26, RULE_ifCondition);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				logicExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		enterRule(_localctx, 28, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			identifier();
			setState(141);
			match(T__15);
			setState(142);
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

	public static class Out_sjContext extends ParserRuleContext {
		public StringAtomContext stringAtom() {
			return getRuleContext(StringAtomContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public Out_sjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_sj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitOut_sj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Out_sjContext out_sj() throws RecognitionException {
		Out_sjContext _localctx = new Out_sjContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_out_sj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__16);
			setState(145);
			match(T__11);
			setState(146);
			stringAtom();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(147);
				match(T__9);
				setState(148);
				exprList();
				}
			}

			setState(151);
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

	public static class In_sjContext extends ParserRuleContext {
		public StringAtomContext stringAtom() {
			return getRuleContext(StringAtomContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public In_sjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_sj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitIn_sj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_sjContext in_sj() throws RecognitionException {
		In_sjContext _localctx = new In_sjContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_in_sj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__17);
			setState(154);
			match(T__11);
			setState(155);
			stringAtom();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(156);
				match(T__9);
				setState(157);
				exprList();
				}
			}

			setState(160);
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
			setState(162);
			expr(0);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(163);
				match(T__9);
				setState(164);
				expr(0);
				}
				}
				setState(169);
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
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SjVisitor ) return ((SjVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ParentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(T__11);
				setState(172);
				expr(0);
				setState(173);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArthExprContext(new ExprContext(_parentctx, _parentState));
						((ArthExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						((ArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						((ArthExprContext)_localctx).right = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ArthExprContext(new ExprContext(_parentctx, _parentState));
						((ArthExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						((ArthExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((ArthExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						((ArthExprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(188);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_compExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ParenCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				match(T__11);
				setState(191);
				compExpr(0);
				setState(192);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new AtomCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
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
					setState(197);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(198);
					((OpCompExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						((OpCompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(199);
					((OpCompExprContext)_localctx).right = compExpr(3);
					}
					} 
				}
				setState(204);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		public Token op;
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ParenLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				match(T__11);
				setState(207);
				logicExpr(0);
				setState(208);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new NotLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__28);
				setState(211);
				logicExpr(5);
				}
				break;
			case 3:
				{
				_localctx = new OpLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				compExpr(0);
				setState(213);
				((OpLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((OpLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(214);
					logicExpr(0);
					}
					break;
				case 2:
					{
					setState(215);
					compExpr(0);
					}
					break;
				case 3:
					{
					setState(216);
					expr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new OpLogicExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				expr(0);
				setState(220);
				((OpLogicExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((OpLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
					logicExpr(0);
					}
					break;
				case 2:
					{
					setState(222);
					compExpr(0);
					}
					break;
				case 3:
					{
					setState(223);
					expr(0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new AtomLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpLogicExprContext(new LogicExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
					setState(229);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(230);
					((OpLogicExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__30) ) {
						((OpLogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(231);
						logicExpr(0);
						}
						break;
					case 2:
						{
						setState(232);
						compExpr(0);
						}
						break;
					case 3:
						{
						setState(233);
						expr(0);
						}
						break;
					}
					}
					} 
				}
				setState(240);
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
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				idAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				intAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
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
		enterRule(_localctx, 44, RULE_intAtom);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__11);
				setState(247);
				intAtom();
				setState(248);
				match(T__12);
				}
				break;
			case INTEGER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
		enterRule(_localctx, 46, RULE_floatAtom);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__11);
				setState(254);
				floatAtom();
				setState(255);
				match(T__12);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
		enterRule(_localctx, 48, RULE_stringAtom);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__11);
				setState(261);
				stringAtom();
				setState(262);
				match(T__12);
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
		enterRule(_localctx, 50, RULE_idAtom);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__11);
				setState(268);
				idAtom();
				setState(269);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
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
		enterRule(_localctx, 52, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 19:
			return compExpr_sempred((CompExprContext)_localctx, predIndex);
		case 20:
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\7\3E\n\3\f\3\16\3H\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\tb\n"+
		"\t\f\t\16\te\13\t\3\n\7\nh\n\n\f\n\16\nk\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13w\n\13\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u008d\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0098\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00a1\n\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u00a8\n\23\f\23\16\23\u00ab\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00b3\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00bb\n\24\f\24\16\24\u00be"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c6\n\25\3\25\3\25\3\25\7"+
		"\25\u00cb\n\25\f\25\16\25\u00ce\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00dc\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00e3\n\26\3\26\5\26\u00e6\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ed"+
		"\n\26\7\26\u00ef\n\26\f\26\16\26\u00f2\13\26\3\27\3\27\3\27\5\27\u00f7"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00fe\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0105\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u010c\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0113\n\33\3\34\3\34\3\34\2\5&(*\35\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\3\2\n\13\3\2\"$\3\2"+
		"\25\26\3\2\27\30\3\2\31\36\3\2 !\2\u011d\28\3\2\2\2\4F\3\2\2\2\6I\3\2"+
		"\2\2\bO\3\2\2\2\nV\3\2\2\2\fY\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22i\3\2"+
		"\2\2\24v\3\2\2\2\26x\3\2\2\2\30|\3\2\2\2\32\u0085\3\2\2\2\34\u008c\3\2"+
		"\2\2\36\u008e\3\2\2\2 \u0092\3\2\2\2\"\u009b\3\2\2\2$\u00a4\3\2\2\2&\u00b2"+
		"\3\2\2\2(\u00c5\3\2\2\2*\u00e5\3\2\2\2,\u00f6\3\2\2\2.\u00fd\3\2\2\2\60"+
		"\u0104\3\2\2\2\62\u010b\3\2\2\2\64\u0112\3\2\2\2\66\u0114\3\2\2\289\5"+
		"\4\3\29:\5\b\5\2:;\7\3\2\2;<\7%\2\2<=\7\4\2\2=>\5\n\6\2>?\7\5\2\2?@\7"+
		"\4\2\2@A\5\22\n\2AB\7\6\2\2B\3\3\2\2\2CE\5\6\4\2DC\3\2\2\2EH\3\2\2\2F"+
		"D\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HF\3\2\2\2IJ\7\7\2\2JK\7%\2\2KL\7\b\2\2"+
		"LM\7%\2\2MN\7\t\2\2N\7\3\2\2\2OP\t\2\2\2P\t\3\2\2\2QR\5\f\7\2RS\7\t\2"+
		"\2SU\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2"+
		"\2\2YZ\5\16\b\2Z[\5\20\t\2[\r\3\2\2\2\\]\t\3\2\2]\17\3\2\2\2^c\5\66\34"+
		"\2_`\7\f\2\2`b\5\66\34\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\21\3"+
		"\2\2\2ec\3\2\2\2fh\5\24\13\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j"+
		"\23\3\2\2\2ki\3\2\2\2lw\5\26\f\2mn\5\36\20\2no\7\t\2\2ow\3\2\2\2pq\5 "+
		"\21\2qr\7\t\2\2rw\3\2\2\2st\5\"\22\2tu\7\t\2\2uw\3\2\2\2vl\3\2\2\2vm\3"+
		"\2\2\2vp\3\2\2\2vs\3\2\2\2w\25\3\2\2\2xz\5\30\r\2y{\5\32\16\2zy\3\2\2"+
		"\2z{\3\2\2\2{\27\3\2\2\2|}\7\r\2\2}~\7\16\2\2~\177\5\34\17\2\177\u0080"+
		"\7\17\2\2\u0080\u0081\7\20\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\22\n"+
		"\2\u0083\u0084\7\6\2\2\u0084\31\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u0087"+
		"\7\4\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\6\2\2\u0089\33\3\2\2\2\u008a"+
		"\u008d\5*\26\2\u008b\u008d\5(\25\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\35\3\2\2\2\u008e\u008f\5\66\34\2\u008f\u0090\7\22\2\2\u0090"+
		"\u0091\5&\24\2\u0091\37\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7\16"+
		"\2\2\u0094\u0097\5\62\32\2\u0095\u0096\7\f\2\2\u0096\u0098\5$\23\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\17"+
		"\2\2\u009a!\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7\16\2\2\u009d\u00a0"+
		"\5\62\32\2\u009e\u009f\7\f\2\2\u009f\u00a1\5$\23\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3#\3"+
		"\2\2\2\u00a4\u00a9\5&\24\2\u00a5\u00a6\7\f\2\2\u00a6\u00a8\5&\24\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa%\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\24\1\2\u00ad\u00ae"+
		"\7\16\2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7\17\2\2\u00b0\u00b3\3\2\2\2"+
		"\u00b1\u00b3\5,\27\2\u00b2\u00ac\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00bc"+
		"\3\2\2\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00bb\5&\24\6\u00b7"+
		"\u00b8\f\4\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00bb\5&\24\5\u00ba\u00b4\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\'\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\25\1"+
		"\2\u00c0\u00c1\7\16\2\2\u00c1\u00c2\5(\25\2\u00c2\u00c3\7\17\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c6\5&\24\2\u00c5\u00bf\3\2\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\u00cc\3\2\2\2\u00c7\u00c8\f\4\2\2\u00c8\u00c9\t\6\2\2\u00c9"+
		"\u00cb\5(\25\5\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd)\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\b\26\1\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\5*\26\2\u00d2\u00d3\7\17\2"+
		"\2\u00d3\u00e6\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00e6\5*\26\7\u00d6"+
		"\u00d7\5(\25\2\u00d7\u00db\t\7\2\2\u00d8\u00dc\5*\26\2\u00d9\u00dc\5("+
		"\25\2\u00da\u00dc\5&\24\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00e6\3\2\2\2\u00dd\u00de\5&\24\2\u00de\u00e2\t\7"+
		"\2\2\u00df\u00e3\5*\26\2\u00e0\u00e3\5(\25\2\u00e1\u00e3\5&\24\2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e6\5\66\34\2\u00e5\u00cf\3\2\2\2\u00e5\u00d4\3\2\2\2\u00e5"+
		"\u00d6\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00f0\3\2"+
		"\2\2\u00e7\u00e8\f\6\2\2\u00e8\u00ec\t\7\2\2\u00e9\u00ed\5*\26\2\u00ea"+
		"\u00ed\5(\25\2\u00eb\u00ed\5&\24\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1+\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f3\u00f7\5\64\33\2\u00f4\u00f7\5.\30\2\u00f5\u00f7"+
		"\5\60\31\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7-\3\2\2\2\u00f8\u00f9\7\16\2\2\u00f9\u00fa\5.\30\2\u00fa\u00fb\7"+
		"\17\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\7&\2\2\u00fd\u00f8\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\5\60\31"+
		"\2\u0101\u0102\7\17\2\2\u0102\u0105\3\2\2\2\u0103\u0105\7\'\2\2\u0104"+
		"\u00ff\3\2\2\2\u0104\u0103\3\2\2\2\u0105\61\3\2\2\2\u0106\u0107\7\16\2"+
		"\2\u0107\u0108\5\62\32\2\u0108\u0109\7\17\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u010c\7(\2\2\u010b\u0106\3\2\2\2\u010b\u010a\3\2\2\2\u010c\63\3\2\2\2"+
		"\u010d\u010e\7\16\2\2\u010e\u010f\5\64\33\2\u010f\u0110\7\17\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u0113\5\66\34\2\u0112\u010d\3\2\2\2\u0112\u0111\3"+
		"\2\2\2\u0113\65\3\2\2\2\u0114\u0115\7%\2\2\u0115\67\3\2\2\2\33FVcivz\u008c"+
		"\u0097\u00a0\u00a9\u00b2\u00ba\u00bc\u00c5\u00cc\u00db\u00e2\u00e5\u00ec"+
		"\u00f0\u00f6\u00fd\u0104\u010b\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}