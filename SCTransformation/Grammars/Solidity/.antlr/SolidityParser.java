// Generated from /Users/artuvan/Github/SmartContractDescriptorsGenerator/SCTransformation/Grammars/Solidity/Solidity.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, Int=93, Uint=94, Byte=95, 
		Fixed=96, Ufixed=97, BooleanLiteral=98, DecimalNumber=99, HexNumber=100, 
		NumberUnit=101, HexLiteralFragment=102, ReservedKeyword=103, AnonymousKeyword=104, 
		BreakKeyword=105, ConstantKeyword=106, ImmutableKeyword=107, ContinueKeyword=108, 
		LeaveKeyword=109, ExternalKeyword=110, IndexedKeyword=111, InternalKeyword=112, 
		PayableKeyword=113, PrivateKeyword=114, PublicKeyword=115, VirtualKeyword=116, 
		PureKeyword=117, TypeKeyword=118, ViewKeyword=119, ConstructorKeyword=120, 
		FallbackKeyword=121, ReceiveKeyword=122, Identifier=123, StringLiteralFragment=124, 
		VersionLiteral=125, WS=126, COMMENT=127, LINE_COMMENT=128;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionConstraint = 5, RULE_versionOperator = 6, 
		RULE_importDirective = 7, RULE_importDeclaration = 8, RULE_contractDefinition = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractPart = 11, RULE_stateVariableDeclaration = 12, 
		RULE_overrideSpecifier = 13, RULE_usingForDeclaration = 14, RULE_structDefinition = 15, 
		RULE_modifierDefinition = 16, RULE_functionDefinition = 17, RULE_scopeDefinition = 18, 
		RULE_functionDescriptor = 19, RULE_returnParameters = 20, RULE_modifierList = 21, 
		RULE_modifierInvocation = 22, RULE_eventDefinition = 23, RULE_enumDefinition = 24, 
		RULE_enumValue = 25, RULE_parameterList = 26, RULE_parameter = 27, RULE_eventParameterList = 28, 
		RULE_eventParameter = 29, RULE_variableDeclaration = 30, RULE_typeName = 31, 
		RULE_userDefinedTypeName = 32, RULE_mapping = 33, RULE_functionTypeName = 34, 
		RULE_storageLocation = 35, RULE_stateMutability = 36, RULE_block = 37, 
		RULE_statement = 38, RULE_expressionStatement = 39, RULE_ifStatement = 40, 
		RULE_tryStatement = 41, RULE_catchClause = 42, RULE_whileStatement = 43, 
		RULE_forStatement = 44, RULE_simpleStatement = 45, RULE_inlineAssemblyStatement = 46, 
		RULE_doWhileStatement = 47, RULE_continueStatement = 48, RULE_breakStatement = 49, 
		RULE_returnStatement = 50, RULE_throwStatement = 51, RULE_emitStatement = 52, 
		RULE_variableDeclarationStatement = 53, RULE_variableDeclarationList = 54, 
		RULE_identifierList = 55, RULE_elementaryTypeName = 56, RULE_expression = 57, 
		RULE_primaryExpression = 58, RULE_expressionList = 59, RULE_nameValueList = 60, 
		RULE_nameValue = 61, RULE_functionCallArguments = 62, RULE_functionCall = 63, 
		RULE_tupleExpression = 64, RULE_typeNameExpression = 65, RULE_assemblyItem = 66, 
		RULE_assemblyBlock = 67, RULE_assemblyExpression = 68, RULE_assemblyCall = 69, 
		RULE_assemblyLocalDefinition = 70, RULE_assemblyAssignment = 71, RULE_assemblyIdentifierList = 72, 
		RULE_assemblyStackAssignment = 73, RULE_labelDefinition = 74, RULE_assemblySwitch = 75, 
		RULE_assemblyCase = 76, RULE_assemblyFunctionDefinition = 77, RULE_assemblyFunctionReturns = 78, 
		RULE_assemblyFor = 79, RULE_assemblyIf = 80, RULE_assemblyLiteral = 81, 
		RULE_assemblyTypedVariableList = 82, RULE_assemblyType = 83, RULE_subAssembly = 84, 
		RULE_numberLiteral = 85, RULE_identifier = 86, RULE_hexLiteral = 87, RULE_stringLiteral = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionConstraint", "versionOperator", "importDirective", "importDeclaration", 
			"contractDefinition", "inheritanceSpecifier", "contractPart", "stateVariableDeclaration", 
			"overrideSpecifier", "usingForDeclaration", "structDefinition", "modifierDefinition", 
			"functionDefinition", "scopeDefinition", "functionDescriptor", "returnParameters", 
			"modifierList", "modifierInvocation", "eventDefinition", "enumDefinition", 
			"enumValue", "parameterList", "parameter", "eventParameterList", "eventParameter", 
			"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", 
			"functionTypeName", "storageLocation", "stateMutability", "block", "statement", 
			"expressionStatement", "ifStatement", "tryStatement", "catchClause", 
			"whileStatement", "forStatement", "simpleStatement", "inlineAssemblyStatement", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "nameValueList", "nameValue", "functionCallArguments", 
			"functionCall", "tupleExpression", "typeNameExpression", "assemblyItem", 
			"assemblyBlock", "assemblyExpression", "assemblyCall", "assemblyLocalDefinition", 
			"assemblyAssignment", "assemblyIdentifierList", "assemblyStackAssignment", 
			"labelDefinition", "assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", 
			"assemblyFunctionReturns", "assemblyFor", "assemblyIf", "assemblyLiteral", 
			"assemblyTypedVariableList", "assemblyType", "subAssembly", "numberLiteral", 
			"identifier", "hexLiteral", "stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", 
			"'='", "'import'", "'as'", "'*'", "'from'", "'{'", "','", "'}'", "'abstract'", 
			"'contract'", "'interface'", "'library'", "'is'", "'('", "')'", "'override'", 
			"'using'", "'for'", "'struct'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'.'", "'mapping'", "'=>'", "'memory'", 
			"'storage'", "'calldata'", "'if'", "'else'", "'try'", "'catch'", "'while'", 
			"'assembly'", "'do'", "'return'", "'throw'", "'emit'", "'var'", "'address'", 
			"'bool'", "'string'", "'byte'", "'++'", "'--'", "'new'", "':'", "'+'", 
			"'-'", "'after'", "'delete'", "'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", 
			"'&'", "'|'", "'=='", "'!='", "'&&'", "'||'", "'?'", "'|='", "'^='", 
			"'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'let'", 
			"':='", "'=:'", "'switch'", "'case'", "'default'", null, null, null, 
			null, null, null, null, null, null, null, null, "'anonymous'", "'break'", 
			"'constant'", "'immutable'", "'continue'", "'leave'", "'external'", "'indexed'", 
			"'internal'", "'payable'", "'private'", "'public'", "'virtual'", "'pure'", 
			"'type'", "'view'", "'constructor'", "'fallback'", "'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Int", "Uint", 
			"Byte", "Fixed", "Ufixed", "BooleanLiteral", "DecimalNumber", "HexNumber", 
			"NumberUnit", "HexLiteralFragment", "ReservedKeyword", "AnonymousKeyword", 
			"BreakKeyword", "ConstantKeyword", "ImmutableKeyword", "ContinueKeyword", 
			"LeaveKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
			"PayableKeyword", "PrivateKeyword", "PublicKeyword", "VirtualKeyword", 
			"PureKeyword", "TypeKeyword", "ViewKeyword", "ConstructorKeyword", "FallbackKeyword", 
			"ReceiveKeyword", "Identifier", "StringLiteralFragment", "VersionLiteral", 
			"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__26) | (1L << T__31))) != 0)) {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(178);
					pragmaDirective();
					}
					break;
				case T__9:
					{
					setState(179);
					importDirective();
					}
					break;
				case T__26:
					{
					setState(180);
					structDefinition();
					}
					break;
				case T__31:
					{
					setState(181);
					enumDefinition();
					}
					break;
				case T__16:
				case T__17:
				case T__18:
				case T__19:
					{
					setState(182);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(EOF);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__0);
			setState(191);
			pragmaName();
			setState(192);
			pragmaValue();
			setState(193);
			match(T__1);
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

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			identifier();
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

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				expression(0);
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

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			versionConstraint();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(202);
				versionConstraint();
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

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(205);
				versionOperator();
				}
			}

			setState(208);
			match(VersionLiteral);
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

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDirective);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__9);
				setState(213);
				match(StringLiteralFragment);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(214);
					match(T__10);
					setState(215);
					identifier();
					}
				}

				setState(218);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__9);
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(220);
					match(T__11);
					}
					break;
				case T__12:
				case T__39:
				case T__51:
				case Identifier:
					{
					setState(221);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(224);
					match(T__10);
					setState(225);
					identifier();
					}
				}

				setState(228);
				match(T__12);
				setState(229);
				match(StringLiteralFragment);
				setState(230);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__9);
				setState(232);
				match(T__13);
				setState(233);
				importDeclaration();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(234);
					match(T__14);
					setState(235);
					importDeclaration();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__15);
				setState(242);
				match(T__12);
				setState(243);
				match(StringLiteralFragment);
				setState(244);
				match(T__1);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			identifier();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(249);
				match(T__10);
				setState(250);
				identifier();
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(253);
				match(T__16);
				}
			}

			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			identifier();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(258);
				match(T__20);
				setState(259);
				inheritanceSpecifier();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(260);
					match(T__14);
					setState(261);
					inheritanceSpecifier();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269);
			match(T__13);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (ConstructorKeyword - 93)) | (1L << (FallbackKeyword - 93)) | (1L << (ReceiveKeyword - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(270);
				contractPart();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(T__15);
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

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			userDefinedTypeName();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(279);
				match(T__21);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
					{
					setState(280);
					expressionList();
					}
				}

				setState(283);
				match(T__22);
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

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractPart);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				modifierDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				functionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				eventDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				enumDefinition();
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> ImmutableKeyword() { return getTokens(SolidityParser.ImmutableKeyword); }
		public TerminalNode ImmutableKeyword(int i) {
			return getToken(SolidityParser.ImmutableKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			typeName(0);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ConstantKeyword - 106)) | (1L << (ImmutableKeyword - 106)) | (1L << (InternalKeyword - 106)) | (1L << (PrivateKeyword - 106)) | (1L << (PublicKeyword - 106)))) != 0)) {
				{
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(296);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(297);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(298);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(299);
					match(ConstantKeyword);
					}
					break;
				case ImmutableKeyword:
					{
					setState(300);
					match(ImmutableKeyword);
					}
					break;
				case T__23:
					{
					setState(301);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			identifier();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(308);
				match(T__8);
				setState(309);
				expression(0);
				}
			}

			setState(312);
			match(T__1);
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

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public List<UserDefinedTypeNameContext> userDefinedTypeName() {
			return getRuleContexts(UserDefinedTypeNameContext.class);
		}
		public UserDefinedTypeNameContext userDefinedTypeName(int i) {
			return getRuleContext(UserDefinedTypeNameContext.class,i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__23);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(315);
				match(T__21);
				setState(316);
				userDefinedTypeName();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(317);
					match(T__14);
					setState(318);
					userDefinedTypeName();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(T__22);
				}
				break;
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

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__24);
			setState(329);
			identifier();
			setState(330);
			match(T__25);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(331);
				match(T__11);
				}
				break;
			case T__12:
			case T__28:
			case T__35:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(332);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(335);
			match(T__1);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__26);
			setState(338);
			identifier();
			setState(339);
			match(T__13);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__28) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				setState(340);
				variableDeclaration();
				setState(341);
				match(T__1);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__28) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
					{
					{
					setState(342);
					variableDeclaration();
					setState(343);
					match(T__1);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
			match(T__15);
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

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__27);
			setState(355);
			identifier();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(356);
				parameterList();
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==VirtualKeyword) {
				{
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VirtualKeyword:
					{
					setState(359);
					match(VirtualKeyword);
					}
					break;
				case T__23:
					{
					setState(360);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(366);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(367);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDescriptorContext functionDescriptor() {
			return getRuleContext(FunctionDescriptorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ScopeDefinitionContext scopeDefinition() {
			return getRuleContext(ScopeDefinitionContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			functionDescriptor();
			setState(371);
			parameterList();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ExternalKeyword - 110)) | (1L << (InternalKeyword - 110)) | (1L << (PrivateKeyword - 110)) | (1L << (PublicKeyword - 110)))) != 0)) {
				{
				setState(372);
				scopeDefinition();
				}
			}

			setState(375);
			modifierList();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(376);
				returnParameters();
				}
			}

			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(379);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(380);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ScopeDefinitionContext extends ParserRuleContext {
		public TerminalNode ExternalKeyword() { return getToken(SolidityParser.ExternalKeyword, 0); }
		public TerminalNode PublicKeyword() { return getToken(SolidityParser.PublicKeyword, 0); }
		public TerminalNode InternalKeyword() { return getToken(SolidityParser.InternalKeyword, 0); }
		public TerminalNode PrivateKeyword() { return getToken(SolidityParser.PrivateKeyword, 0); }
		public ScopeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeDefinition; }
	}

	public final ScopeDefinitionContext scopeDefinition() throws RecognitionException {
		ScopeDefinitionContext _localctx = new ScopeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scopeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ExternalKeyword - 110)) | (1L << (InternalKeyword - 110)) | (1L << (PrivateKeyword - 110)) | (1L << (PublicKeyword - 110)))) != 0)) ) {
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

	public static class FunctionDescriptorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public TerminalNode FallbackKeyword() { return getToken(SolidityParser.FallbackKeyword, 0); }
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public FunctionDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDescriptor; }
	}

	public final FunctionDescriptorContext functionDescriptor() throws RecognitionException {
		FunctionDescriptorContext _localctx = new FunctionDescriptorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDescriptor);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T__28);
				setState(389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__39:
				case T__51:
				case Identifier:
					{
					setState(386);
					identifier();
					}
					break;
				case ReceiveKeyword:
					{
					setState(387);
					match(ReceiveKeyword);
					}
					break;
				case FallbackKeyword:
					{
					setState(388);
					match(FallbackKeyword);
					}
					break;
				case T__21:
					break;
				default:
					break;
				}
				}
				break;
			case ConstructorKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(ConstructorKeyword);
				}
				break;
			case FallbackKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(FallbackKeyword);
				}
				break;
			case ReceiveKeyword:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				match(ReceiveKeyword);
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

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__29);
			setState(397);
			parameterList();
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(403);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__12:
					case T__39:
					case T__51:
					case Identifier:
						{
						setState(399);
						modifierInvocation();
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(400);
						stateMutability();
						}
						break;
					case VirtualKeyword:
						{
						setState(401);
						match(VirtualKeyword);
						}
						break;
					case T__23:
						{
						setState(402);
						overrideSpecifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			identifier();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(409);
				match(T__21);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
					{
					setState(410);
					expressionList();
					}
				}

				setState(413);
				match(T__22);
				}
				break;
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

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__30);
			setState(417);
			identifier();
			setState(418);
			eventParameterList();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(419);
				match(AnonymousKeyword);
				}
			}

			setState(422);
			match(T__1);
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__31);
			setState(425);
			identifier();
			setState(426);
			match(T__13);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
				{
				setState(427);
				enumValue();
				}
			}

			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(430);
				match(T__14);
				setState(431);
				enumValue();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(T__15);
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

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			identifier();
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__21);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__28) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				setState(442);
				parameter();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(443);
					match(T__14);
					setState(444);
					parameter();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(452);
			match(T__22);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			typeName(0);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(455);
				storageLocation();
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
				{
				setState(458);
				identifier();
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

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__21);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__28) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				setState(462);
				eventParameter();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(463);
					match(T__14);
					setState(464);
					eventParameter();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(472);
			match(T__22);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			typeName(0);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(475);
				match(IndexedKeyword);
				}
			}

			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
				{
				setState(478);
				identifier();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			typeName(0);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(482);
				storageLocation();
				}
				break;
			}
			setState(485);
			identifier();
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

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(488);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(489);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(490);
				mapping();
				}
				break;
			case 4:
				{
				setState(491);
				functionTypeName();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(494);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(495);
					match(T__32);
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
						{
						setState(496);
						expression(0);
						}
					}

					setState(499);
					match(T__33);
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			identifier();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(T__34);
					setState(507);
					identifier();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class MappingContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__35);
			setState(514);
			match(T__21);
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(515);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(516);
				userDefinedTypeName();
				}
				break;
			}
			setState(519);
			match(T__36);
			setState(520);
			typeName(0);
			setState(521);
			match(T__22);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ScopeDefinitionContext scopeDefinition() {
			return getRuleContext(ScopeDefinitionContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__28);
			setState(524);
			parameterList();
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(525);
				scopeDefinition();
				}
				break;
			}
			setState(528);
			modifierList();
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(529);
				returnParameters();
				}
				break;
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

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ConstantKeyword - 106)) | (1L << (PayableKeyword - 106)) | (1L << (PureKeyword - 106)) | (1L << (ViewKeyword - 106)))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__13);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__21) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
				{
				{
				setState(537);
				statement();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			match(T__15);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				tryStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				whileStatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				block();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				inlineAssemblyStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 7);
				{
				setState(551);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(552);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 9);
				{
				setState(553);
				breakStatement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 10);
				{
				setState(554);
				returnStatement();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 11);
				{
				setState(555);
				throwStatement();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 12);
				{
				setState(556);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__21:
			case T__28:
			case T__32:
			case T__35:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 13);
				{
				setState(557);
				simpleStatement();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			expression(0);
			setState(561);
			match(T__1);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__40);
			setState(564);
			match(T__21);
			setState(565);
			expression(0);
			setState(566);
			match(T__22);
			setState(567);
			statement();
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(568);
				match(T__41);
				setState(569);
				statement();
				}
				break;
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

	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__42);
			setState(573);
			expression(0);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(574);
				returnParameters();
				}
			}

			setState(577);
			block();
			setState(579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(578);
				catchClause();
				}
				}
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__43 );
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

	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__43);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__21) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
				{
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
					{
					setState(584);
					identifier();
					}
				}

				setState(587);
				parameterList();
				}
			}

			setState(590);
			block();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__44);
			setState(593);
			match(T__21);
			setState(594);
			expression(0);
			setState(595);
			match(T__22);
			setState(596);
			statement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__25);
			setState(599);
			match(T__21);
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__21:
			case T__28:
			case T__32:
			case T__35:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(600);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(601);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__21:
			case T__32:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(604);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(605);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
				{
				setState(608);
				expression(0);
				}
			}

			setState(611);
			match(T__22);
			setState(612);
			statement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(614);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(615);
				expressionStatement();
				}
				break;
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

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(T__45);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteralFragment) {
				{
				setState(619);
				match(StringLiteralFragment);
				}
			}

			setState(622);
			assemblyBlock();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__46);
			setState(625);
			statement();
			setState(626);
			match(T__44);
			setState(627);
			match(T__21);
			setState(628);
			expression(0);
			setState(629);
			match(T__22);
			setState(630);
			match(T__1);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(ContinueKeyword);
			setState(633);
			match(T__1);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(BreakKeyword);
			setState(636);
			match(T__1);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__47);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
				{
				setState(639);
				expression(0);
				}
			}

			setState(642);
			match(T__1);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T__48);
			setState(645);
			match(T__1);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__49);
			setState(648);
			functionCall();
			setState(649);
			match(T__1);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(651);
				match(T__50);
				setState(652);
				identifierList();
				}
				break;
			case 2:
				{
				setState(653);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(654);
				match(T__21);
				setState(655);
				variableDeclarationList();
				setState(656);
				match(T__22);
				}
				break;
			}
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(660);
				match(T__8);
				setState(661);
				expression(0);
				}
			}

			setState(664);
			match(T__1);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__28) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				setState(666);
				variableDeclaration();
				}
			}

			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(669);
				match(T__14);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__28) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
					{
					setState(670);
					variableDeclaration();
					}
				}

				}
				}
				setState(677);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(T__21);
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
						{
						setState(679);
						identifier();
						}
					}

					setState(682);
					match(T__14);
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
				{
				setState(688);
				identifier();
				}
			}

			setState(691);
			match(T__22);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementaryTypeName);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(T__51);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(694);
					match(PayableKeyword);
					}
					break;
				}
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				match(T__53);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				match(T__50);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 5);
				{
				setState(700);
				match(Int);
				}
				break;
			case Uint:
				enterOuterAlt(_localctx, 6);
				{
				setState(701);
				match(Uint);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 7);
				{
				setState(702);
				match(T__54);
				}
				break;
			case Byte:
				enterOuterAlt(_localctx, 8);
				{
				setState(703);
				match(Byte);
				}
				break;
			case Fixed:
				enterOuterAlt(_localctx, 9);
				{
				setState(704);
				match(Fixed);
				}
				break;
			case Ufixed:
				enterOuterAlt(_localctx, 10);
				{
				setState(705);
				match(Ufixed);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(709);
				match(T__57);
				setState(710);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(711);
				match(PayableKeyword);
				setState(712);
				match(T__21);
				setState(713);
				expression(0);
				setState(714);
				match(T__22);
				}
				break;
			case 3:
				{
				setState(716);
				match(T__21);
				setState(717);
				expression(0);
				setState(718);
				match(T__22);
				}
				break;
			case 4:
				{
				setState(720);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(721);
				expression(19);
				}
				break;
			case 5:
				{
				setState(722);
				_la = _input.LA(1);
				if ( !(_la==T__59 || _la==T__60) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(723);
				expression(18);
				}
				break;
			case 6:
				{
				setState(724);
				_la = _input.LA(1);
				if ( !(_la==T__61 || _la==T__62) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(725);
				expression(17);
				}
				break;
			case 7:
				{
				setState(726);
				match(T__63);
				setState(727);
				expression(16);
				}
				break;
			case 8:
				{
				setState(728);
				match(T__3);
				setState(729);
				expression(15);
				}
				break;
			case 9:
				{
				setState(730);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(806);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(733);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(734);
						match(T__64);
						setState(735);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(736);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(737);
						_la = _input.LA(1);
						if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__65 - 12)) | (1L << (T__66 - 12)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(738);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(740);
						_la = _input.LA(1);
						if ( !(_la==T__59 || _la==T__60) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(741);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(743);
						_la = _input.LA(1);
						if ( !(_la==T__67 || _la==T__68) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(744);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(746);
						match(T__69);
						setState(747);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(749);
						match(T__2);
						setState(750);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(752);
						match(T__70);
						setState(753);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(755);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(756);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(758);
						_la = _input.LA(1);
						if ( !(_la==T__71 || _la==T__72) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(759);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(761);
						match(T__73);
						setState(762);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(764);
						match(T__74);
						setState(765);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(767);
						match(T__75);
						setState(768);
						expression(0);
						setState(769);
						match(T__58);
						setState(770);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(773);
						_la = _input.LA(1);
						if ( !(_la==T__8 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__78 - 77)) | (1L << (T__79 - 77)) | (1L << (T__80 - 77)) | (1L << (T__81 - 77)) | (1L << (T__82 - 77)) | (1L << (T__83 - 77)) | (1L << (T__84 - 77)) | (1L << (T__85 - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(774);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(776);
						_la = _input.LA(1);
						if ( !(_la==T__55 || _la==T__56) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(777);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(778);
						match(T__32);
						setState(780);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
							{
							setState(779);
							expression(0);
							}
						}

						setState(782);
						match(T__33);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(783);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(784);
						match(T__32);
						setState(786);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
							{
							setState(785);
							expression(0);
							}
						}

						setState(788);
						match(T__58);
						setState(790);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
							{
							setState(789);
							expression(0);
							}
						}

						setState(792);
						match(T__33);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(794);
						match(T__34);
						setState(795);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(797);
						match(T__13);
						setState(798);
						nameValueList();
						setState(799);
						match(T__15);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(801);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(802);
						match(T__21);
						setState(803);
						functionCallArguments();
						setState(804);
						match(T__22);
						}
						break;
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primaryExpression);
		try {
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				hexLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(815);
				identifier();
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(816);
					match(T__32);
					setState(817);
					match(T__33);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(820);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(821);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(822);
				typeNameExpression();
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(823);
					match(T__32);
					setState(824);
					match(T__33);
					}
					break;
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			expression(0);
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(830);
				match(T__14);
				setState(831);
				expression(0);
				}
				}
				setState(836);
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

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			nameValue();
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(838);
					match(T__14);
					setState(839);
					nameValue();
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(845);
				match(T__14);
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

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			identifier();
			setState(849);
			match(T__58);
			setState(850);
			expression(0);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionCallArguments);
		int _la;
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(T__13);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
					{
					setState(853);
					nameValueList();
					}
				}

				setState(856);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__21:
			case T__22:
			case T__32:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case PayableKeyword:
			case TypeKeyword:
			case Identifier:
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
					{
					setState(857);
					expressionList();
					}
				}

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

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			expression(0);
			setState(863);
			match(T__21);
			setState(864);
			functionCallArguments();
			setState(865);
			match(T__22);
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tupleExpression);
		int _la;
		try {
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				match(T__21);
				{
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
					{
					setState(868);
					expression(0);
					}
				}

				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(871);
					match(T__14);
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
						{
						setState(872);
						expression(0);
						}
					}

					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(880);
				match(T__22);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(T__32);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__21) | (1L << T__32) | (1L << T__39) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteralFragment - 64)) | (1L << (PayableKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteralFragment - 64)))) != 0)) {
					{
					setState(882);
					expression(0);
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(883);
						match(T__14);
						setState(884);
						expression(0);
						}
						}
						setState(889);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(892);
				match(T__33);
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

	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeNameExpression);
		try {
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				elementaryTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				userDefinedTypeName();
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

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyItem);
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(901);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(902);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(903);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(904);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(905);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(906);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(907);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(908);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(909);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(910);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(911);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(912);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(913);
				subAssembly();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(914);
				numberLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(915);
				stringLiteral();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(916);
				hexLiteral();
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

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(T__13);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__25) | (1L << T__28) | (1L << T__39) | (1L << T__40) | (1L << T__45) | (1L << T__47) | (1L << T__51) | (1L << T__54))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteralFragment - 87)) | (1L << (BreakKeyword - 87)) | (1L << (ContinueKeyword - 87)) | (1L << (LeaveKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteralFragment - 87)))) != 0)) {
				{
				{
				setState(920);
				assemblyItem();
				}
				}
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(926);
			match(T__15);
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

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyExpression);
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__39:
			case T__47:
			case T__51:
			case T__54:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				assemblyCall();
				}
				break;
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				assemblyLiteral();
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

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(932);
				match(T__47);
				}
				break;
			case 2:
				{
				setState(933);
				match(T__51);
				}
				break;
			case 3:
				{
				setState(934);
				match(T__54);
				}
				break;
			case 4:
				{
				setState(935);
				identifier();
				}
				break;
			}
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(938);
				match(T__21);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__47) | (1L << T__51) | (1L << T__54))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (BooleanLiteral - 98)) | (1L << (DecimalNumber - 98)) | (1L << (HexNumber - 98)) | (1L << (HexLiteralFragment - 98)) | (1L << (Identifier - 98)) | (1L << (StringLiteralFragment - 98)))) != 0)) {
					{
					setState(939);
					assemblyExpression();
					}
				}

				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(942);
					match(T__14);
					setState(943);
					assemblyExpression();
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(949);
				match(T__22);
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

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(T__86);
			setState(953);
			assemblyIdentifierList();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__87) {
				{
				setState(954);
				match(T__87);
				setState(955);
				assemblyExpression();
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

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			assemblyIdentifierList();
			setState(959);
			match(T__87);
			setState(960);
			assemblyExpression();
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

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			identifier();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(963);
				match(T__14);
				setState(964);
				identifier();
				}
				}
				setState(969);
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

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(T__88);
			setState(971);
			identifier();
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			identifier();
			setState(974);
			match(T__58);
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

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(T__89);
			setState(977);
			assemblyExpression();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__90 || _la==T__91) {
				{
				{
				setState(978);
				assemblyCase();
				}
				}
				setState(983);
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

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyTypeContext assemblyType() {
			return getRuleContext(AssemblyTypeContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyCase);
		int _la;
		try {
			setState(993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				match(T__90);
				setState(985);
				assemblyLiteral();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(986);
					assemblyType();
					}
				}

				setState(989);
				assemblyBlock();
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(T__91);
				setState(992);
				assemblyBlock();
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

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyTypedVariableListContext assemblyTypedVariableList() {
			return getRuleContext(AssemblyTypedVariableListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(T__28);
			setState(996);
			identifier();
			setState(997);
			match(T__21);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) {
				{
				setState(998);
				assemblyTypedVariableList();
				}
			}

			setState(1001);
			match(T__22);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__60) {
				{
				setState(1002);
				assemblyFunctionReturns();
				}
			}

			setState(1005);
			assemblyBlock();
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

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyTypedVariableListContext assemblyTypedVariableList() {
			return getRuleContext(AssemblyTypedVariableListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1007);
			match(T__60);
			setState(1008);
			match(T__5);
			setState(1009);
			assemblyTypedVariableList();
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

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(T__25);
			setState(1012);
			assemblyBlock();
			setState(1013);
			assemblyExpression();
			setState(1014);
			assemblyBlock();
			setState(1015);
			assemblyBlock();
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

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(T__40);
			setState(1018);
			assemblyExpression();
			setState(1019);
			assemblyBlock();
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

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public AssemblyTypeContext assemblyType() {
			return getRuleContext(AssemblyTypeContext.class,0);
		}
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralFragment:
				{
				setState(1021);
				stringLiteral();
				}
				break;
			case DecimalNumber:
				{
				setState(1022);
				match(DecimalNumber);
				}
				break;
			case HexNumber:
				{
				setState(1023);
				match(HexNumber);
				}
				break;
			case HexLiteralFragment:
				{
				setState(1024);
				hexLiteral();
				}
				break;
			case BooleanLiteral:
				{
				setState(1025);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1028);
				assemblyType();
				}
				break;
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

	public static class AssemblyTypedVariableListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyTypeContext assemblyType() {
			return getRuleContext(AssemblyTypeContext.class,0);
		}
		public AssemblyTypedVariableListContext assemblyTypedVariableList() {
			return getRuleContext(AssemblyTypedVariableListContext.class,0);
		}
		public AssemblyTypedVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyTypedVariableList; }
	}

	public final AssemblyTypedVariableListContext assemblyTypedVariableList() throws RecognitionException {
		AssemblyTypedVariableListContext _localctx = new AssemblyTypedVariableListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblyTypedVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			identifier();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__58) {
				{
				setState(1032);
				assemblyType();
				}
			}

			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(1035);
				match(T__14);
				setState(1036);
				assemblyTypedVariableList();
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

	public static class AssemblyTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyType; }
	}

	public final AssemblyTypeContext assemblyType() throws RecognitionException {
		AssemblyTypeContext _localctx = new AssemblyTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(T__58);
			setState(1040);
			identifier();
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

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(T__45);
			setState(1043);
			identifier();
			setState(1044);
			assemblyBlock();
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1047);
				match(NumberUnit);
				}
				break;
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
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__39) | (1L << T__51))) != 0) || _la==Identifier) ) {
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

	public static class HexLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexLiteralFragment() { return getTokens(SolidityParser.HexLiteralFragment); }
		public TerminalNode HexLiteralFragment(int i) {
			return getToken(SolidityParser.HexLiteralFragment, i);
		}
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_hexLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1052);
					match(HexLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1055); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteralFragment() { return getTokens(SolidityParser.StringLiteralFragment); }
		public TerminalNode StringLiteralFragment(int i) {
			return getToken(SolidityParser.StringLiteralFragment, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_stringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1057);
					match(StringLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1060); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 31:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 57:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 28);
		case 15:
			return precpred(_ctx, 26);
		case 16:
			return precpred(_ctx, 25);
		case 17:
			return precpred(_ctx, 24);
		case 18:
			return precpred(_ctx, 23);
		case 19:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u0429\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2\3\2\3\2\7\2\u00ba\n\2"+
		"\f\2\16\2\u00bd\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00ca"+
		"\n\5\3\6\3\6\5\6\u00ce\n\6\3\7\5\7\u00d1\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\5\t\u00db\n\t\3\t\3\t\3\t\3\t\5\t\u00e1\n\t\3\t\3\t\5\t\u00e5\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ef\n\t\f\t\16\t\u00f2\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00f9\n\t\3\n\3\n\3\n\5\n\u00fe\n\n\3\13\5\13\u0101"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0109\n\13\f\13\16\13\u010c\13"+
		"\13\5\13\u010e\n\13\3\13\3\13\7\13\u0112\n\13\f\13\16\13\u0115\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\5\f\u011c\n\f\3\f\5\f\u011f\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0128\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0131"+
		"\n\16\f\16\16\16\u0134\13\16\3\16\3\16\3\16\5\16\u0139\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0142\n\17\f\17\16\17\u0145\13\17\3\17"+
		"\3\17\5\17\u0149\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0150\n\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u015c\n\21\f\21\16\21"+
		"\u015f\13\21\5\21\u0161\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u0168\n\22"+
		"\3\22\3\22\7\22\u016c\n\22\f\22\16\22\u016f\13\22\3\22\3\22\5\22\u0173"+
		"\n\22\3\23\3\23\3\23\5\23\u0178\n\23\3\23\3\23\5\23\u017c\n\23\3\23\3"+
		"\23\5\23\u0180\n\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0188\n\25\3\25"+
		"\3\25\3\25\5\25\u018d\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0196"+
		"\n\27\f\27\16\27\u0199\13\27\3\30\3\30\3\30\5\30\u019e\n\30\3\30\5\30"+
		"\u01a1\n\30\3\31\3\31\3\31\3\31\5\31\u01a7\n\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\5\32\u01af\n\32\3\32\3\32\7\32\u01b3\n\32\f\32\16\32\u01b6\13"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u01c0\n\34\f\34\16\34"+
		"\u01c3\13\34\5\34\u01c5\n\34\3\34\3\34\3\35\3\35\5\35\u01cb\n\35\3\35"+
		"\5\35\u01ce\n\35\3\36\3\36\3\36\3\36\7\36\u01d4\n\36\f\36\16\36\u01d7"+
		"\13\36\5\36\u01d9\n\36\3\36\3\36\3\37\3\37\5\37\u01df\n\37\3\37\5\37\u01e2"+
		"\n\37\3 \3 \5 \u01e6\n \3 \3 \3!\3!\3!\3!\3!\5!\u01ef\n!\3!\3!\3!\5!\u01f4"+
		"\n!\3!\7!\u01f7\n!\f!\16!\u01fa\13!\3\"\3\"\3\"\7\"\u01ff\n\"\f\"\16\""+
		"\u0202\13\"\3#\3#\3#\3#\5#\u0208\n#\3#\3#\3#\3#\3$\3$\3$\5$\u0211\n$\3"+
		"$\3$\5$\u0215\n$\3%\3%\3&\3&\3\'\3\'\7\'\u021d\n\'\f\'\16\'\u0220\13\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0231\n(\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u023d\n*\3+\3+\3+\5+\u0242\n+\3+\3+\6+\u0246\n"+
		"+\r+\16+\u0247\3,\3,\5,\u024c\n,\3,\5,\u024f\n,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\5.\u025d\n.\3.\3.\5.\u0261\n.\3.\5.\u0264\n.\3.\3.\3.\3"+
		"/\3/\5/\u026b\n/\3\60\3\60\5\60\u026f\n\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\5\64\u0283"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u0295\n\67\3\67\3\67\5\67\u0299\n\67\3\67\3\67\3"+
		"8\58\u029e\n8\38\38\58\u02a2\n8\78\u02a4\n8\f8\168\u02a7\138\39\39\59"+
		"\u02ab\n9\39\79\u02ae\n9\f9\169\u02b1\139\39\59\u02b4\n9\39\39\3:\3:\5"+
		":\u02ba\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02c5\n:\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02de\n;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u030f"+
		"\n;\3;\3;\3;\3;\5;\u0315\n;\3;\3;\5;\u0319\n;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\7;\u0329\n;\f;\16;\u032c\13;\3<\3<\3<\3<\3<\3<\3<\5"+
		"<\u0335\n<\3<\3<\3<\3<\3<\5<\u033c\n<\5<\u033e\n<\3=\3=\3=\7=\u0343\n"+
		"=\f=\16=\u0346\13=\3>\3>\3>\7>\u034b\n>\f>\16>\u034e\13>\3>\5>\u0351\n"+
		">\3?\3?\3?\3?\3@\3@\5@\u0359\n@\3@\3@\5@\u035d\n@\5@\u035f\n@\3A\3A\3"+
		"A\3A\3A\3B\3B\5B\u0368\nB\3B\3B\5B\u036c\nB\7B\u036e\nB\fB\16B\u0371\13"+
		"B\3B\3B\3B\3B\3B\7B\u0378\nB\fB\16B\u037b\13B\5B\u037d\nB\3B\5B\u0380"+
		"\nB\3C\3C\5C\u0384\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\5D\u0398\nD\3E\3E\7E\u039c\nE\fE\16E\u039f\13E\3E\3E\3F\3F\5F\u03a5"+
		"\nF\3G\3G\3G\3G\5G\u03ab\nG\3G\3G\5G\u03af\nG\3G\3G\7G\u03b3\nG\fG\16"+
		"G\u03b6\13G\3G\5G\u03b9\nG\3H\3H\3H\3H\5H\u03bf\nH\3I\3I\3I\3I\3J\3J\3"+
		"J\7J\u03c8\nJ\fJ\16J\u03cb\13J\3K\3K\3K\3L\3L\3L\3M\3M\3M\7M\u03d6\nM"+
		"\fM\16M\u03d9\13M\3N\3N\3N\5N\u03de\nN\3N\3N\3N\3N\5N\u03e4\nN\3O\3O\3"+
		"O\3O\5O\u03ea\nO\3O\3O\5O\u03ee\nO\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\5S\u0405\nS\3S\5S\u0408\nS\3T\3T\5T\u040c"+
		"\nT\3T\3T\5T\u0410\nT\3U\3U\3U\3V\3V\3V\3V\3W\3W\5W\u041b\nW\3X\3X\3Y"+
		"\6Y\u0420\nY\rY\16Y\u0421\3Z\6Z\u0425\nZ\rZ\16Z\u0426\3Z\2\4@t[\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\21\3\2\5\13\3\2\24\26\5\2pprrt"+
		"u\3\2(*\6\2llsswwyy\3\2:;\3\2>?\3\2@A\4\2\16\16DE\3\2FG\3\2\7\n\3\2JK"+
		"\4\2\13\13OX\3\2ef\6\2\17\17**\66\66}}\2\u04a7\2\u00bb\3\2\2\2\4\u00c0"+
		"\3\2\2\2\6\u00c5\3\2\2\2\b\u00c9\3\2\2\2\n\u00cb\3\2\2\2\f\u00d0\3\2\2"+
		"\2\16\u00d4\3\2\2\2\20\u00f8\3\2\2\2\22\u00fa\3\2\2\2\24\u0100\3\2\2\2"+
		"\26\u0118\3\2\2\2\30\u0127\3\2\2\2\32\u0129\3\2\2\2\34\u013c\3\2\2\2\36"+
		"\u014a\3\2\2\2 \u0153\3\2\2\2\"\u0164\3\2\2\2$\u0174\3\2\2\2&\u0181\3"+
		"\2\2\2(\u018c\3\2\2\2*\u018e\3\2\2\2,\u0197\3\2\2\2.\u019a\3\2\2\2\60"+
		"\u01a2\3\2\2\2\62\u01aa\3\2\2\2\64\u01b9\3\2\2\2\66\u01bb\3\2\2\28\u01c8"+
		"\3\2\2\2:\u01cf\3\2\2\2<\u01dc\3\2\2\2>\u01e3\3\2\2\2@\u01ee\3\2\2\2B"+
		"\u01fb\3\2\2\2D\u0203\3\2\2\2F\u020d\3\2\2\2H\u0216\3\2\2\2J\u0218\3\2"+
		"\2\2L\u021a\3\2\2\2N\u0230\3\2\2\2P\u0232\3\2\2\2R\u0235\3\2\2\2T\u023e"+
		"\3\2\2\2V\u0249\3\2\2\2X\u0252\3\2\2\2Z\u0258\3\2\2\2\\\u026a\3\2\2\2"+
		"^\u026c\3\2\2\2`\u0272\3\2\2\2b\u027a\3\2\2\2d\u027d\3\2\2\2f\u0280\3"+
		"\2\2\2h\u0286\3\2\2\2j\u0289\3\2\2\2l\u0294\3\2\2\2n\u029d\3\2\2\2p\u02a8"+
		"\3\2\2\2r\u02c4\3\2\2\2t\u02dd\3\2\2\2v\u033d\3\2\2\2x\u033f\3\2\2\2z"+
		"\u0347\3\2\2\2|\u0352\3\2\2\2~\u035e\3\2\2\2\u0080\u0360\3\2\2\2\u0082"+
		"\u037f\3\2\2\2\u0084\u0383\3\2\2\2\u0086\u0397\3\2\2\2\u0088\u0399\3\2"+
		"\2\2\u008a\u03a4\3\2\2\2\u008c\u03aa\3\2\2\2\u008e\u03ba\3\2\2\2\u0090"+
		"\u03c0\3\2\2\2\u0092\u03c4\3\2\2\2\u0094\u03cc\3\2\2\2\u0096\u03cf\3\2"+
		"\2\2\u0098\u03d2\3\2\2\2\u009a\u03e3\3\2\2\2\u009c\u03e5\3\2\2\2\u009e"+
		"\u03f1\3\2\2\2\u00a0\u03f5\3\2\2\2\u00a2\u03fb\3\2\2\2\u00a4\u0404\3\2"+
		"\2\2\u00a6\u0409\3\2\2\2\u00a8\u0411\3\2\2\2\u00aa\u0414\3\2\2\2\u00ac"+
		"\u0418\3\2\2\2\u00ae\u041c\3\2\2\2\u00b0\u041f\3\2\2\2\u00b2\u0424\3\2"+
		"\2\2\u00b4\u00ba\5\4\3\2\u00b5\u00ba\5\20\t\2\u00b6\u00ba\5 \21\2\u00b7"+
		"\u00ba\5\62\32\2\u00b8\u00ba\5\24\13\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\2\2\3\u00bf\3\3\2\2\2\u00c0\u00c1"+
		"\7\3\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\7\4\2\2\u00c4"+
		"\5\3\2\2\2\u00c5\u00c6\5\u00aeX\2\u00c6\7\3\2\2\2\u00c7\u00ca\5\n\6\2"+
		"\u00c8\u00ca\5t;\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\t\3\2"+
		"\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00ce\5\f\7\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\13\3\2\2\2\u00cf\u00d1\5\16\b\2\u00d0\u00cf\3\2\2"+
		"\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\177\2\2\u00d3"+
		"\r\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5\17\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7"+
		"\u00da\7~\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00db\5\u00aeX\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00f9\7\4\2\2\u00dd"+
		"\u00e0\7\f\2\2\u00de\u00e1\7\16\2\2\u00df\u00e1\5\u00aeX\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\7\r\2\2\u00e3"+
		"\u00e5\5\u00aeX\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\7~\2\2\u00e8\u00f9\7\4\2\2\u00e9"+
		"\u00ea\7\f\2\2\u00ea\u00eb\7\20\2\2\u00eb\u00f0\5\22\n\2\u00ec\u00ed\7"+
		"\21\2\2\u00ed\u00ef\5\22\n\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f6\7~\2\2\u00f6"+
		"\u00f7\7\4\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00d6\3\2\2\2\u00f8\u00dd\3\2"+
		"\2\2\u00f8\u00e9\3\2\2\2\u00f9\21\3\2\2\2\u00fa\u00fd\5\u00aeX\2\u00fb"+
		"\u00fc\7\r\2\2\u00fc\u00fe\5\u00aeX\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\23\3\2\2\2\u00ff\u0101\7\23\2\2\u0100\u00ff\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\t\3\2\2\u0103\u010d\5\u00ae"+
		"X\2\u0104\u0105\7\27\2\2\u0105\u010a\5\26\f\2\u0106\u0107\7\21\2\2\u0107"+
		"\u0109\5\26\f\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0104\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\7\20"+
		"\2\2\u0110\u0112\5\30\r\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7\22\2\2\u0117\25\3\2\2\2\u0118\u011e\5B\"\2\u0119\u011b"+
		"\7\30\2\2\u011a\u011c\5x=\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\7\31\2\2\u011e\u0119\3\2\2\2\u011e\u011f\3"+
		"\2\2\2\u011f\27\3\2\2\2\u0120\u0128\5\32\16\2\u0121\u0128\5\36\20\2\u0122"+
		"\u0128\5 \21\2\u0123\u0128\5\"\22\2\u0124\u0128\5$\23\2\u0125\u0128\5"+
		"\60\31\2\u0126\u0128\5\62\32\2\u0127\u0120\3\2\2\2\u0127\u0121\3\2\2\2"+
		"\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128\31\3\2\2\2\u0129\u0132\5@!\2\u012a"+
		"\u0131\7u\2\2\u012b\u0131\7r\2\2\u012c\u0131\7t\2\2\u012d\u0131\7l\2\2"+
		"\u012e\u0131\7m\2\2\u012f\u0131\5\34\17\2\u0130\u012a\3\2\2\2\u0130\u012b"+
		"\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0138\5\u00aeX\2\u0136"+
		"\u0137\7\13\2\2\u0137\u0139\5t;\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\4\2\2\u013b\33\3\2\2\2\u013c\u0148"+
		"\7\32\2\2\u013d\u013e\7\30\2\2\u013e\u0143\5B\"\2\u013f\u0140\7\21\2\2"+
		"\u0140\u0142\5B\"\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\7\31\2\2\u0147\u0149\3\2\2\2\u0148\u013d\3\2\2\2\u0148\u0149\3"+
		"\2\2\2\u0149\35\3\2\2\2\u014a\u014b\7\33\2\2\u014b\u014c\5\u00aeX\2\u014c"+
		"\u014f\7\34\2\2\u014d\u0150\7\16\2\2\u014e\u0150\5@!\2\u014f\u014d\3\2"+
		"\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\4\2\2\u0152"+
		"\37\3\2\2\2\u0153\u0154\7\35\2\2\u0154\u0155\5\u00aeX\2\u0155\u0160\7"+
		"\20\2\2\u0156\u0157\5> \2\u0157\u015d\7\4\2\2\u0158\u0159\5> \2\u0159"+
		"\u015a\7\4\2\2\u015a\u015c\3\2\2\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0156\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\7\22\2\2\u0163!\3\2\2\2\u0164\u0165\7\36\2\2\u0165\u0167"+
		"\5\u00aeX\2\u0166\u0168\5\66\34\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016d\3\2\2\2\u0169\u016c\7v\2\2\u016a\u016c\5\34\17\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0172\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0173\7\4\2\2\u0171\u0173\5L\'\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173#\3\2\2\2\u0174\u0175\5(\25\2\u0175\u0177\5\66\34\2\u0176\u0178"+
		"\5&\24\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\5,\27\2\u017a\u017c\5*\26\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017f\3\2\2\2\u017d\u0180\7\4\2\2\u017e\u0180\5L\'\2\u017f"+
		"\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180%\3\2\2\2\u0181\u0182\t\4\2\2"+
		"\u0182\'\3\2\2\2\u0183\u0187\7\37\2\2\u0184\u0188\5\u00aeX\2\u0185\u0188"+
		"\7|\2\2\u0186\u0188\7{\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018d\3\2\2\2\u0189\u018d\7z"+
		"\2\2\u018a\u018d\7{\2\2\u018b\u018d\7|\2\2\u018c\u0183\3\2\2\2\u018c\u0189"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d)\3\2\2\2\u018e"+
		"\u018f\7 \2\2\u018f\u0190\5\66\34\2\u0190+\3\2\2\2\u0191\u0196\5.\30\2"+
		"\u0192\u0196\5J&\2\u0193\u0196\7v\2\2\u0194\u0196\5\34\17\2\u0195\u0191"+
		"\3\2\2\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198-\3\2\2\2"+
		"\u0199\u0197\3\2\2\2\u019a\u01a0\5\u00aeX\2\u019b\u019d\7\30\2\2\u019c"+
		"\u019e\5x=\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2"+
		"\2\u019f\u01a1\7\31\2\2\u01a0\u019b\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"/\3\2\2\2\u01a2\u01a3\7!\2\2\u01a3\u01a4\5\u00aeX\2\u01a4\u01a6\5:\36"+
		"\2\u01a5\u01a7\7j\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\7\4\2\2\u01a9\61\3\2\2\2\u01aa\u01ab\7\"\2\2\u01ab"+
		"\u01ac\5\u00aeX\2\u01ac\u01ae\7\20\2\2\u01ad\u01af\5\64\33\2\u01ae\u01ad"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b4\3\2\2\2\u01b0\u01b1\7\21\2\2"+
		"\u01b1\u01b3\5\64\33\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7\22\2\2\u01b8\63\3\2\2\2\u01b9\u01ba\5\u00aeX\2\u01ba\65\3\2\2"+
		"\2\u01bb\u01c4\7\30\2\2\u01bc\u01c1\58\35\2\u01bd\u01be\7\21\2\2\u01be"+
		"\u01c0\58\35\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01bc\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\31"+
		"\2\2\u01c7\67\3\2\2\2\u01c8\u01ca\5@!\2\u01c9\u01cb\5H%\2\u01ca\u01c9"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5\u00aeX"+
		"\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce9\3\2\2\2\u01cf\u01d8"+
		"\7\30\2\2\u01d0\u01d5\5<\37\2\u01d1\u01d2\7\21\2\2\u01d2\u01d4\5<\37\2"+
		"\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\31\2\2\u01db;\3\2\2\2"+
		"\u01dc\u01de\5@!\2\u01dd\u01df\7q\2\2\u01de\u01dd\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\5\u00aeX\2\u01e1\u01e0\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2=\3\2\2\2\u01e3\u01e5\5@!\2\u01e4\u01e6\5"+
		"H%\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\5\u00aeX\2\u01e8?\3\2\2\2\u01e9\u01ea\b!\1\2\u01ea\u01ef\5r:\2"+
		"\u01eb\u01ef\5B\"\2\u01ec\u01ef\5D#\2\u01ed\u01ef\5F$\2\u01ee\u01e9\3"+
		"\2\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f8\3\2\2\2\u01f0\u01f1\f\4\2\2\u01f1\u01f3\7#\2\2\u01f2\u01f4\5t;"+
		"\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7"+
		"\7$\2\2\u01f6\u01f0\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9A\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u0200\5\u00ae"+
		"X\2\u01fc\u01fd\7%\2\2\u01fd\u01ff\5\u00aeX\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201C\3\2\2\2"+
		"\u0202\u0200\3\2\2\2\u0203\u0204\7&\2\2\u0204\u0207\7\30\2\2\u0205\u0208"+
		"\5r:\2\u0206\u0208\5B\"\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\7\'\2\2\u020a\u020b\5@!\2\u020b\u020c\7\31"+
		"\2\2\u020cE\3\2\2\2\u020d\u020e\7\37\2\2\u020e\u0210\5\66\34\2\u020f\u0211"+
		"\5&\24\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0214\5,\27\2\u0213\u0215\5*\26\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215G\3\2\2\2\u0216\u0217\t\5\2\2\u0217I\3\2\2\2\u0218\u0219\t\6"+
		"\2\2\u0219K\3\2\2\2\u021a\u021e\7\20\2\2\u021b\u021d\5N(\2\u021c\u021b"+
		"\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7\22\2\2\u0222M\3\2\2\2"+
		"\u0223\u0231\5R*\2\u0224\u0231\5T+\2\u0225\u0231\5X-\2\u0226\u0231\5Z"+
		".\2\u0227\u0231\5L\'\2\u0228\u0231\5^\60\2\u0229\u0231\5`\61\2\u022a\u0231"+
		"\5b\62\2\u022b\u0231\5d\63\2\u022c\u0231\5f\64\2\u022d\u0231\5h\65\2\u022e"+
		"\u0231\5j\66\2\u022f\u0231\5\\/\2\u0230\u0223\3\2\2\2\u0230\u0224\3\2"+
		"\2\2\u0230\u0225\3\2\2\2\u0230\u0226\3\2\2\2\u0230\u0227\3\2\2\2\u0230"+
		"\u0228\3\2\2\2\u0230\u0229\3\2\2\2\u0230\u022a\3\2\2\2\u0230\u022b\3\2"+
		"\2\2\u0230\u022c\3\2\2\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u022f\3\2\2\2\u0231O\3\2\2\2\u0232\u0233\5t;\2\u0233\u0234\7\4\2\2\u0234"+
		"Q\3\2\2\2\u0235\u0236\7+\2\2\u0236\u0237\7\30\2\2\u0237\u0238\5t;\2\u0238"+
		"\u0239\7\31\2\2\u0239\u023c\5N(\2\u023a\u023b\7,\2\2\u023b\u023d\5N(\2"+
		"\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023dS\3\2\2\2\u023e\u023f\7"+
		"-\2\2\u023f\u0241\5t;\2\u0240\u0242\5*\26\2\u0241\u0240\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\5L\'\2\u0244\u0246\5V,"+
		"\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248U\3\2\2\2\u0249\u024e\7.\2\2\u024a\u024c\5\u00aeX\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\5\66"+
		"\34\2\u024e\u024b\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\5L\'\2\u0251W\3\2\2\2\u0252\u0253\7/\2\2\u0253\u0254\7\30\2\2\u0254"+
		"\u0255\5t;\2\u0255\u0256\7\31\2\2\u0256\u0257\5N(\2\u0257Y\3\2\2\2\u0258"+
		"\u0259\7\34\2\2\u0259\u025c\7\30\2\2\u025a\u025d\5\\/\2\u025b\u025d\7"+
		"\4\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u0261\5P)\2\u025f\u0261\7\4\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2"+
		"\2\u0261\u0263\3\2\2\2\u0262\u0264\5t;\2\u0263\u0262\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7\31\2\2\u0266\u0267\5N(\2\u0267"+
		"[\3\2\2\2\u0268\u026b\5l\67\2\u0269\u026b\5P)\2\u026a\u0268\3\2\2\2\u026a"+
		"\u0269\3\2\2\2\u026b]\3\2\2\2\u026c\u026e\7\60\2\2\u026d\u026f\7~\2\2"+
		"\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271"+
		"\5\u0088E\2\u0271_\3\2\2\2\u0272\u0273\7\61\2\2\u0273\u0274\5N(\2\u0274"+
		"\u0275\7/\2\2\u0275\u0276\7\30\2\2\u0276\u0277\5t;\2\u0277\u0278\7\31"+
		"\2\2\u0278\u0279\7\4\2\2\u0279a\3\2\2\2\u027a\u027b\7n\2\2\u027b\u027c"+
		"\7\4\2\2\u027cc\3\2\2\2\u027d\u027e\7k\2\2\u027e\u027f\7\4\2\2\u027fe"+
		"\3\2\2\2\u0280\u0282\7\62\2\2\u0281\u0283\5t;\2\u0282\u0281\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\7\4\2\2\u0285g\3\2\2\2"+
		"\u0286\u0287\7\63\2\2\u0287\u0288\7\4\2\2\u0288i\3\2\2\2\u0289\u028a\7"+
		"\64\2\2\u028a\u028b\5\u0080A\2\u028b\u028c\7\4\2\2\u028ck\3\2\2\2\u028d"+
		"\u028e\7\65\2\2\u028e\u0295\5p9\2\u028f\u0295\5> \2\u0290\u0291\7\30\2"+
		"\2\u0291\u0292\5n8\2\u0292\u0293\7\31\2\2\u0293\u0295\3\2\2\2\u0294\u028d"+
		"\3\2\2\2\u0294\u028f\3\2\2\2\u0294\u0290\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0297\7\13\2\2\u0297\u0299\5t;\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u029a\3\2\2\2\u029a\u029b\7\4\2\2\u029bm\3\2\2\2\u029c\u029e"+
		"\5> \2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a5\3\2\2\2\u029f"+
		"\u02a1\7\21\2\2\u02a0\u02a2\5> \2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a4\3\2\2\2\u02a3\u029f\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6o\3\2\2\2\u02a7\u02a5\3\2\2\2"+
		"\u02a8\u02af\7\30\2\2\u02a9\u02ab\5\u00aeX\2\u02aa\u02a9\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\7\21\2\2\u02ad\u02aa\3"+
		"\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4\5\u00aeX\2\u02b3\u02b2"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7\31\2\2"+
		"\u02b6q\3\2\2\2\u02b7\u02b9\7\66\2\2\u02b8\u02ba\7s\2\2\u02b9\u02b8\3"+
		"\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c5\3\2\2\2\u02bb\u02c5\7\67\2\2\u02bc"+
		"\u02c5\78\2\2\u02bd\u02c5\7\65\2\2\u02be\u02c5\7_\2\2\u02bf\u02c5\7`\2"+
		"\2\u02c0\u02c5\79\2\2\u02c1\u02c5\7a\2\2\u02c2\u02c5\7b\2\2\u02c3\u02c5"+
		"\7c\2\2\u02c4\u02b7\3\2\2\2\u02c4\u02bb\3\2\2\2\u02c4\u02bc\3\2\2\2\u02c4"+
		"\u02bd\3\2\2\2\u02c4\u02be\3\2\2\2\u02c4\u02bf\3\2\2\2\u02c4\u02c0\3\2"+
		"\2\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5"+
		"s\3\2\2\2\u02c6\u02c7\b;\1\2\u02c7\u02c8\7<\2\2\u02c8\u02de\5@!\2\u02c9"+
		"\u02ca\7s\2\2\u02ca\u02cb\7\30\2\2\u02cb\u02cc\5t;\2\u02cc\u02cd\7\31"+
		"\2\2\u02cd\u02de\3\2\2\2\u02ce\u02cf\7\30\2\2\u02cf\u02d0\5t;\2\u02d0"+
		"\u02d1\7\31\2\2\u02d1\u02de\3\2\2\2\u02d2\u02d3\t\7\2\2\u02d3\u02de\5"+
		"t;\25\u02d4\u02d5\t\b\2\2\u02d5\u02de\5t;\24\u02d6\u02d7\t\t\2\2\u02d7"+
		"\u02de\5t;\23\u02d8\u02d9\7B\2\2\u02d9\u02de\5t;\22\u02da\u02db\7\6\2"+
		"\2\u02db\u02de\5t;\21\u02dc\u02de\5v<\2\u02dd\u02c6\3\2\2\2\u02dd\u02c9"+
		"\3\2\2\2\u02dd\u02ce\3\2\2\2\u02dd\u02d2\3\2\2\2\u02dd\u02d4\3\2\2\2\u02dd"+
		"\u02d6\3\2\2\2\u02dd\u02d8\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd\u02dc\3\2"+
		"\2\2\u02de\u032a\3\2\2\2\u02df\u02e0\f\20\2\2\u02e0\u02e1\7C\2\2\u02e1"+
		"\u0329\5t;\21\u02e2\u02e3\f\17\2\2\u02e3\u02e4\t\n\2\2\u02e4\u0329\5t"+
		";\20\u02e5\u02e6\f\16\2\2\u02e6\u02e7\t\b\2\2\u02e7\u0329\5t;\17\u02e8"+
		"\u02e9\f\r\2\2\u02e9\u02ea\t\13\2\2\u02ea\u0329\5t;\16\u02eb\u02ec\f\f"+
		"\2\2\u02ec\u02ed\7H\2\2\u02ed\u0329\5t;\r\u02ee\u02ef\f\13\2\2\u02ef\u02f0"+
		"\7\5\2\2\u02f0\u0329\5t;\f\u02f1\u02f2\f\n\2\2\u02f2\u02f3\7I\2\2\u02f3"+
		"\u0329\5t;\13\u02f4\u02f5\f\t\2\2\u02f5\u02f6\t\f\2\2\u02f6\u0329\5t;"+
		"\n\u02f7\u02f8\f\b\2\2\u02f8\u02f9\t\r\2\2\u02f9\u0329\5t;\t\u02fa\u02fb"+
		"\f\7\2\2\u02fb\u02fc\7L\2\2\u02fc\u0329\5t;\b\u02fd\u02fe\f\6\2\2\u02fe"+
		"\u02ff\7M\2\2\u02ff\u0329\5t;\7\u0300\u0301\f\5\2\2\u0301\u0302\7N\2\2"+
		"\u0302\u0303\5t;\2\u0303\u0304\7=\2\2\u0304\u0305\5t;\6\u0305\u0329\3"+
		"\2\2\2\u0306\u0307\f\4\2\2\u0307\u0308\t\16\2\2\u0308\u0329\5t;\5\u0309"+
		"\u030a\f\36\2\2\u030a\u0329\t\7\2\2\u030b\u030c\f\34\2\2\u030c\u030e\7"+
		"#\2\2\u030d\u030f\5t;\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0329\7$\2\2\u0311\u0312\f\33\2\2\u0312\u0314\7#"+
		"\2\2\u0313\u0315\5t;\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0318\7=\2\2\u0317\u0319\5t;\2\u0318\u0317\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0329\7$\2\2\u031b\u031c\f\32"+
		"\2\2\u031c\u031d\7%\2\2\u031d\u0329\5\u00aeX\2\u031e\u031f\f\31\2\2\u031f"+
		"\u0320\7\20\2\2\u0320\u0321\5z>\2\u0321\u0322\7\22\2\2\u0322\u0329\3\2"+
		"\2\2\u0323\u0324\f\30\2\2\u0324\u0325\7\30\2\2\u0325\u0326\5~@\2\u0326"+
		"\u0327\7\31\2\2\u0327\u0329\3\2\2\2\u0328\u02df\3\2\2\2\u0328\u02e2\3"+
		"\2\2\2\u0328\u02e5\3\2\2\2\u0328\u02e8\3\2\2\2\u0328\u02eb\3\2\2\2\u0328"+
		"\u02ee\3\2\2\2\u0328\u02f1\3\2\2\2\u0328\u02f4\3\2\2\2\u0328\u02f7\3\2"+
		"\2\2\u0328\u02fa\3\2\2\2\u0328\u02fd\3\2\2\2\u0328\u0300\3\2\2\2\u0328"+
		"\u0306\3\2\2\2\u0328\u0309\3\2\2\2\u0328\u030b\3\2\2\2\u0328\u0311\3\2"+
		"\2\2\u0328\u031b\3\2\2\2\u0328\u031e\3\2\2\2\u0328\u0323\3\2\2\2\u0329"+
		"\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032bu\3\2\2\2"+
		"\u032c\u032a\3\2\2\2\u032d\u033e\7d\2\2\u032e\u033e\5\u00acW\2\u032f\u033e"+
		"\5\u00b0Y\2\u0330\u033e\5\u00b2Z\2\u0331\u0334\5\u00aeX\2\u0332\u0333"+
		"\7#\2\2\u0333\u0335\7$\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u033e\3\2\2\2\u0336\u033e\7x\2\2\u0337\u033e\5\u0082B\2\u0338\u033b\5"+
		"\u0084C\2\u0339\u033a\7#\2\2\u033a\u033c\7$\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u032d\3\2\2\2\u033d\u032e\3\2"+
		"\2\2\u033d\u032f\3\2\2\2\u033d\u0330\3\2\2\2\u033d\u0331\3\2\2\2\u033d"+
		"\u0336\3\2\2\2\u033d\u0337\3\2\2\2\u033d\u0338\3\2\2\2\u033ew\3\2\2\2"+
		"\u033f\u0344\5t;\2\u0340\u0341\7\21\2\2\u0341\u0343\5t;\2\u0342\u0340"+
		"\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"y\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u034c\5|?\2\u0348\u0349\7\21\2\2\u0349"+
		"\u034b\5|?\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2"+
		"\2\u034c\u034d\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0351"+
		"\7\21\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351{\3\2\2\2\u0352"+
		"\u0353\5\u00aeX\2\u0353\u0354\7=\2\2\u0354\u0355\5t;\2\u0355}\3\2\2\2"+
		"\u0356\u0358\7\20\2\2\u0357\u0359\5z>\2\u0358\u0357\3\2\2\2\u0358\u0359"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035f\7\22\2\2\u035b\u035d\5x=\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0356\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035f\177\3\2\2\2\u0360\u0361\5t;\2\u0361\u0362"+
		"\7\30\2\2\u0362\u0363\5~@\2\u0363\u0364\7\31\2\2\u0364\u0081\3\2\2\2\u0365"+
		"\u0367\7\30\2\2\u0366\u0368\5t;\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u036f\3\2\2\2\u0369\u036b\7\21\2\2\u036a\u036c\5t;\2\u036b"+
		"\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u0369\3\2"+
		"\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0380\7\31\2\2\u0373\u037c\7"+
		"#\2\2\u0374\u0379\5t;\2\u0375\u0376\7\21\2\2\u0376\u0378\5t;\2\u0377\u0375"+
		"\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u0374\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037e\3\2\2\2\u037e\u0380\7$\2\2\u037f\u0365\3\2\2\2\u037f"+
		"\u0373\3\2\2\2\u0380\u0083\3\2\2\2\u0381\u0384\5r:\2\u0382\u0384\5B\""+
		"\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384\u0085\3\2\2\2\u0385\u0398"+
		"\5\u00aeX\2\u0386\u0398\5\u0088E\2\u0387\u0398\5\u008aF\2\u0388\u0398"+
		"\5\u008eH\2\u0389\u0398\5\u0090I\2\u038a\u0398\5\u0094K\2\u038b\u0398"+
		"\5\u0096L\2\u038c\u0398\5\u0098M\2\u038d\u0398\5\u009cO\2\u038e\u0398"+
		"\5\u00a0Q\2\u038f\u0398\5\u00a2R\2\u0390\u0398\7k\2\2\u0391\u0398\7n\2"+
		"\2\u0392\u0398\7o\2\2\u0393\u0398\5\u00aaV\2\u0394\u0398\5\u00acW\2\u0395"+
		"\u0398\5\u00b2Z\2\u0396\u0398\5\u00b0Y\2\u0397\u0385\3\2\2\2\u0397\u0386"+
		"\3\2\2\2\u0397\u0387\3\2\2\2\u0397\u0388\3\2\2\2\u0397\u0389\3\2\2\2\u0397"+
		"\u038a\3\2\2\2\u0397\u038b\3\2\2\2\u0397\u038c\3\2\2\2\u0397\u038d\3\2"+
		"\2\2\u0397\u038e\3\2\2\2\u0397\u038f\3\2\2\2\u0397\u0390\3\2\2\2\u0397"+
		"\u0391\3\2\2\2\u0397\u0392\3\2\2\2\u0397\u0393\3\2\2\2\u0397\u0394\3\2"+
		"\2\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2\2\2\u0398\u0087\3\2\2\2\u0399"+
		"\u039d\7\20\2\2\u039a\u039c\5\u0086D\2\u039b\u039a\3\2\2\2\u039c\u039f"+
		"\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u03a0\u03a1\7\22\2\2\u03a1\u0089\3\2\2\2\u03a2\u03a5\5"+
		"\u008cG\2\u03a3\u03a5\5\u00a4S\2\u03a4\u03a2\3\2\2\2\u03a4\u03a3\3\2\2"+
		"\2\u03a5\u008b\3\2\2\2\u03a6\u03ab\7\62\2\2\u03a7\u03ab\7\66\2\2\u03a8"+
		"\u03ab\79\2\2\u03a9\u03ab\5\u00aeX\2\u03aa\u03a6\3\2\2\2\u03aa\u03a7\3"+
		"\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03b8\3\2\2\2\u03ac"+
		"\u03ae\7\30\2\2\u03ad\u03af\5\u008aF\2\u03ae\u03ad\3\2\2\2\u03ae\u03af"+
		"\3\2\2\2\u03af\u03b4\3\2\2\2\u03b0\u03b1\7\21\2\2\u03b1\u03b3\5\u008a"+
		"F\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03b9\7\31"+
		"\2\2\u03b8\u03ac\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u008d\3\2\2\2\u03ba"+
		"\u03bb\7Y\2\2\u03bb\u03be\5\u0092J\2\u03bc\u03bd\7Z\2\2\u03bd\u03bf\5"+
		"\u008aF\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u008f\3\2\2\2"+
		"\u03c0\u03c1\5\u0092J\2\u03c1\u03c2\7Z\2\2\u03c2\u03c3\5\u008aF\2\u03c3"+
		"\u0091\3\2\2\2\u03c4\u03c9\5\u00aeX\2\u03c5\u03c6\7\21\2\2\u03c6\u03c8"+
		"\5\u00aeX\2\u03c7\u03c5\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2"+
		"\2\u03c9\u03ca\3\2\2\2\u03ca\u0093\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03cd"+
		"\7[\2\2\u03cd\u03ce\5\u00aeX\2\u03ce\u0095\3\2\2\2\u03cf\u03d0\5\u00ae"+
		"X\2\u03d0\u03d1\7=\2\2\u03d1\u0097\3\2\2\2\u03d2\u03d3\7\\\2\2\u03d3\u03d7"+
		"\5\u008aF\2\u03d4\u03d6\5\u009aN\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0099\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03db\7]\2\2\u03db\u03dd\5\u00a4S\2\u03dc\u03de\5"+
		"\u00a8U\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2"+
		"\u03df\u03e0\5\u0088E\2\u03e0\u03e4\3\2\2\2\u03e1\u03e2\7^\2\2\u03e2\u03e4"+
		"\5\u0088E\2\u03e3\u03da\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u009b\3\2\2"+
		"\2\u03e5\u03e6\7\37\2\2\u03e6\u03e7\5\u00aeX\2\u03e7\u03e9\7\30\2\2\u03e8"+
		"\u03ea\5\u00a6T\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03ed\7\31\2\2\u03ec\u03ee\5\u009eP\2\u03ed\u03ec\3\2\2"+
		"\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\5\u0088E\2\u03f0"+
		"\u009d\3\2\2\2\u03f1\u03f2\7?\2\2\u03f2\u03f3\7\b\2\2\u03f3\u03f4\5\u00a6"+
		"T\2\u03f4\u009f\3\2\2\2\u03f5\u03f6\7\34\2\2\u03f6\u03f7\5\u0088E\2\u03f7"+
		"\u03f8\5\u008aF\2\u03f8\u03f9\5\u0088E\2\u03f9\u03fa\5\u0088E\2\u03fa"+
		"\u00a1\3\2\2\2\u03fb\u03fc\7+\2\2\u03fc\u03fd\5\u008aF\2\u03fd\u03fe\5"+
		"\u0088E\2\u03fe\u00a3\3\2\2\2\u03ff\u0405\5\u00b2Z\2\u0400\u0405\7e\2"+
		"\2\u0401\u0405\7f\2\2\u0402\u0405\5\u00b0Y\2\u0403\u0405\7d\2\2\u0404"+
		"\u03ff\3\2\2\2\u0404\u0400\3\2\2\2\u0404\u0401\3\2\2\2\u0404\u0402\3\2"+
		"\2\2\u0404\u0403\3\2\2\2\u0405\u0407\3\2\2\2\u0406\u0408\5\u00a8U\2\u0407"+
		"\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u00a5\3\2\2\2\u0409\u040b\5\u00ae"+
		"X\2\u040a\u040c\5\u00a8U\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u040f\3\2\2\2\u040d\u040e\7\21\2\2\u040e\u0410\5\u00a6T\2\u040f\u040d"+
		"\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u00a7\3\2\2\2\u0411\u0412\7=\2\2\u0412"+
		"\u0413\5\u00aeX\2\u0413\u00a9\3\2\2\2\u0414\u0415\7\60\2\2\u0415\u0416"+
		"\5\u00aeX\2\u0416\u0417\5\u0088E\2\u0417\u00ab\3\2\2\2\u0418\u041a\t\17"+
		"\2\2\u0419\u041b\7g\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b"+
		"\u00ad\3\2\2\2\u041c\u041d\t\20\2\2\u041d\u00af\3\2\2\2\u041e\u0420\7"+
		"h\2\2\u041f\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u00b1\3\2\2\2\u0423\u0425\7~\2\2\u0424\u0423\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u00b3\3\2\2\2~\u00b9\u00bb\u00c9\u00cd\u00d0\u00da\u00e0\u00e4\u00f0"+
		"\u00f8\u00fd\u0100\u010a\u010d\u0113\u011b\u011e\u0127\u0130\u0132\u0138"+
		"\u0143\u0148\u014f\u015d\u0160\u0167\u016b\u016d\u0172\u0177\u017b\u017f"+
		"\u0187\u018c\u0195\u0197\u019d\u01a0\u01a6\u01ae\u01b4\u01c1\u01c4\u01ca"+
		"\u01cd\u01d5\u01d8\u01de\u01e1\u01e5\u01ee\u01f3\u01f8\u0200\u0207\u0210"+
		"\u0214\u021e\u0230\u023c\u0241\u0247\u024b\u024e\u025c\u0260\u0263\u026a"+
		"\u026e\u0282\u0294\u0298\u029d\u02a1\u02a5\u02aa\u02af\u02b3\u02b9\u02c4"+
		"\u02dd\u030e\u0314\u0318\u0328\u032a\u0334\u033b\u033d\u0344\u034c\u0350"+
		"\u0358\u035c\u035e\u0367\u036b\u036f\u0379\u037c\u037f\u0383\u0397\u039d"+
		"\u03a4\u03aa\u03ae\u03b4\u03b8\u03be\u03c9\u03d7\u03dd\u03e3\u03e9\u03ed"+
		"\u0404\u0407\u040b\u040f\u041a\u0421\u0426";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}