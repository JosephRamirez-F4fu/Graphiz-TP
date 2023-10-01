// Generated from C:/Users/Joseph/IdeaProjects/Compiladores/src/main/java/org/example/GraphvizExpr.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GraphvizExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DQUOTE=1, DIREDGE=2, UDIREDGE=3, STRICT=4, GRAPH=5, DIGRAPH=6, SUBGRAPH=7, 
		LBRACE=8, RBRACE=9, LBRACKET=10, RBRACKET=11, SEMICOLON=12, DOUBCOLON=13, 
		COMMA=14, ASSIGN=15, NODE=16, EDGE=17, COMPASS=18, ID=19, VAR=20, NUM=21, 
		STR=22, XML=23, WS=24;
	public static final int
		RULE_program = 0, RULE_graph = 1, RULE_stmt_list = 2, RULE_stmt = 3, RULE_attr_stmt = 4, 
		RULE_attr_list = 5, RULE_a_list = 6, RULE_edge_stmt = 7, RULE_edgeRHS = 8, 
		RULE_dgeop = 9, RULE_node_stmt = 10, RULE_node_id = 11, RULE_port = 12, 
		RULE_subgraph = 13, RULE_compass_pt = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "graph", "stmt_list", "stmt", "attr_stmt", "attr_list", "a_list", 
			"edge_stmt", "edgeRHS", "dgeop", "node_stmt", "node_id", "port", "subgraph", 
			"compass_pt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'->'", "'--'", "'strict'", "'graph'", "'digraph'", "'subgraph'", 
			"'{'", "'}'", "'['", "']'", "';'", "':'", "','", "'='", "'node'", "'edge'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DQUOTE", "DIREDGE", "UDIREDGE", "STRICT", "GRAPH", "DIGRAPH", 
			"SUBGRAPH", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMICOLON", 
			"DOUBCOLON", "COMMA", "ASSIGN", "NODE", "EDGE", "COMPASS", "ID", "VAR", 
			"NUM", "STR", "XML", "WS"
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
	public String getGrammarFileName() { return "GraphvizExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphvizExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndFileContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(GraphvizExprParser.EOF, 0); }
		public EndFileContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEndFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEndFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEndFile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphObjContext extends ProgramContext {
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GraphvizExprParser.EOF, 0); }
		public GraphObjContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterGraphObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitGraphObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitGraphObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRICT:
			case GRAPH:
			case DIGRAPH:
				_localctx = new GraphObjContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				graph();
				setState(31);
				match(EOF);
				}
				break;
			case EOF:
				_localctx = new EndFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GraphContext extends ParserRuleContext {
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	 
		public GraphContext() { }
		public void copyFrom(GraphContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraphDefContext extends GraphContext {
		public TerminalNode LBRACE() { return getToken(GraphvizExprParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GraphvizExprParser.RBRACE, 0); }
		public TerminalNode GRAPH() { return getToken(GraphvizExprParser.GRAPH, 0); }
		public TerminalNode DIGRAPH() { return getToken(GraphvizExprParser.DIGRAPH, 0); }
		public TerminalNode STRICT() { return getToken(GraphvizExprParser.STRICT, 0); }
		public TerminalNode ID() { return getToken(GraphvizExprParser.ID, 0); }
		public GraphDefContext(GraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterGraphDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitGraphDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitGraphDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_graph);
		int _la;
		try {
			_localctx = new GraphDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(36);
				match(STRICT);
				}
			}

			setState(39);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40);
				match(ID);
				}
			}

			setState(43);
			match(LBRACE);
			setState(44);
			stmt_list();
			setState(45);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_listContext extends ParserRuleContext {
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	 
		public Stmt_listContext() { }
		public void copyFrom(Stmt_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends Stmt_listContext {
		public EmptyContext(Stmt_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmntContext extends Stmt_listContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GraphvizExprParser.SEMICOLON, 0); }
		public StmntContext(Stmt_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_list);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
			case SUBGRAPH:
			case LBRACE:
			case NODE:
			case EDGE:
			case ID:
				_localctx = new StmntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				stmt();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(48);
					match(SEMICOLON);
					}
				}

				setState(51);
				stmt_list();
				}
				break;
			case RBRACE:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeObjContext extends StmtContext {
		public Node_stmtContext node_stmt() {
			return getRuleContext(Node_stmtContext.class,0);
		}
		public NodeObjContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterNodeObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitNodeObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitNodeObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeObjContext extends StmtContext {
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public EdgeObjContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEdgeObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEdgeObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEdgeObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubGraphObjContext extends StmtContext {
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public SubGraphObjContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterSubGraphObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitSubGraphObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitSubGraphObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAssignContext extends StmtContext {
		public List<TerminalNode> ID() { return getTokens(GraphvizExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphvizExprParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GraphvizExprParser.ASSIGN, 0); }
		public StmtAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrContext extends StmtContext {
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public AttrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NodeObjContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				node_stmt();
				}
				break;
			case 2:
				_localctx = new EdgeObjContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				edge_stmt();
				}
				break;
			case 3:
				_localctx = new AttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				attr_stmt();
				}
				break;
			case 4:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(ID);
				setState(60);
				match(ASSIGN);
				setState(61);
				match(ID);
				}
				break;
			case 5:
				_localctx = new SubGraphObjContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				subgraph();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attr_stmtContext extends ParserRuleContext {
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
	 
		public Attr_stmtContext() { }
		public void copyFrom(Attr_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrDefContext extends Attr_stmtContext {
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(GraphvizExprParser.GRAPH, 0); }
		public TerminalNode NODE() { return getToken(GraphvizExprParser.NODE, 0); }
		public TerminalNode EDGE() { return getToken(GraphvizExprParser.EDGE, 0); }
		public AttrDefContext(Attr_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterAttrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitAttrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitAttrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_stmt);
		int _la;
		try {
			_localctx = new AttrDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 196640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			attr_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attr_listContext extends ParserRuleContext {
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
	 
		public Attr_listContext() { }
		public void copyFrom(Attr_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrListContext extends Attr_listContext {
		public TerminalNode LBRACKET() { return getToken(GraphvizExprParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GraphvizExprParser.RBRACKET, 0); }
		public A_listContext a_list() {
			return getRuleContext(A_listContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public AttrListContext(Attr_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitAttrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitAttrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_list);
		int _la;
		try {
			_localctx = new AttrListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(LBRACKET);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(69);
				a_list();
				}
			}

			setState(72);
			match(RBRACKET);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(73);
				attr_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class A_listContext extends ParserRuleContext {
		public A_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_list; }
	 
		public A_listContext() { }
		public void copyFrom(A_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrListAssignContext extends A_listContext {
		public List<TerminalNode> ID() { return getTokens(GraphvizExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphvizExprParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GraphvizExprParser.ASSIGN, 0); }
		public A_listContext a_list() {
			return getRuleContext(A_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GraphvizExprParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(GraphvizExprParser.COMMA, 0); }
		public AttrListAssignContext(A_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterAttrListAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitAttrListAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitAttrListAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_a_list);
		int _la;
		try {
			_localctx = new AttrListAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(ASSIGN);
			setState(78);
			match(ID);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON || _la==COMMA) {
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(82);
				a_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_stmtContext extends ParserRuleContext {
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
	 
		public Edge_stmtContext() { }
		public void copyFrom(Edge_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeDefContext extends Edge_stmtContext {
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public EdgeDefContext(Edge_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEdgeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEdgeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEdgeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edge_stmt);
		int _la;
		try {
			_localctx = new EdgeDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(85);
				node_id();
				}
				break;
			case SUBGRAPH:
			case LBRACE:
				{
				setState(86);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			edgeRHS();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(90);
				attr_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeRHSContext extends ParserRuleContext {
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
	 
		public EdgeRHSContext() { }
		public void copyFrom(EdgeRHSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeOpContext extends EdgeRHSContext {
		public DgeopContext dgeop() {
			return getRuleContext(DgeopContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public EdgeOpContext(EdgeRHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEdgeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEdgeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEdgeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edgeRHS);
		int _la;
		try {
			_localctx = new EdgeOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			dgeop();
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(94);
				node_id();
				}
				break;
			case SUBGRAPH:
			case LBRACE:
				{
				setState(95);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIREDGE || _la==UDIREDGE) {
				{
				setState(98);
				edgeRHS();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DgeopContext extends ParserRuleContext {
		public DgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dgeop; }
	 
		public DgeopContext() { }
		public void copyFrom(DgeopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeDirOpContext extends DgeopContext {
		public TerminalNode DIREDGE() { return getToken(GraphvizExprParser.DIREDGE, 0); }
		public EdgeDirOpContext(DgeopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEdgeDirOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEdgeDirOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEdgeDirOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeUDirOpContext extends DgeopContext {
		public TerminalNode UDIREDGE() { return getToken(GraphvizExprParser.UDIREDGE, 0); }
		public EdgeUDirOpContext(DgeopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterEdgeUDirOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitEdgeUDirOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitEdgeUDirOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DgeopContext dgeop() throws RecognitionException {
		DgeopContext _localctx = new DgeopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dgeop);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIREDGE:
				_localctx = new EdgeDirOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(DIREDGE);
				}
				break;
			case UDIREDGE:
				_localctx = new EdgeUDirOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(UDIREDGE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Node_stmtContext extends ParserRuleContext {
		public Node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_stmt; }
	 
		public Node_stmtContext() { }
		public void copyFrom(Node_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeAUNNOSEContext extends Node_stmtContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public NodeAUNNOSEContext(Node_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterNodeAUNNOSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitNodeAUNNOSE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitNodeAUNNOSE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_node_stmt);
		int _la;
		try {
			_localctx = new NodeAUNNOSEContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			node_id();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(106);
				attr_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Node_idContext extends ParserRuleContext {
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
	 
		public Node_idContext() { }
		public void copyFrom(Node_idContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodePortContext extends Node_idContext {
		public TerminalNode ID() { return getToken(GraphvizExprParser.ID, 0); }
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public NodePortContext(Node_idContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterNodePort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitNodePort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitNodePort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_node_id);
		int _la;
		try {
			_localctx = new NodePortContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBCOLON) {
				{
				setState(110);
				port();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PortContext extends ParserRuleContext {
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
	 
		public PortContext() { }
		public void copyFrom(PortContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PortCompassContext extends PortContext {
		public TerminalNode DOUBCOLON() { return getToken(GraphvizExprParser.DOUBCOLON, 0); }
		public Compass_ptContext compass_pt() {
			return getRuleContext(Compass_ptContext.class,0);
		}
		public PortCompassContext(PortContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterPortCompass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitPortCompass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitPortCompass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PortIdContext extends PortContext {
		public List<TerminalNode> DOUBCOLON() { return getTokens(GraphvizExprParser.DOUBCOLON); }
		public TerminalNode DOUBCOLON(int i) {
			return getToken(GraphvizExprParser.DOUBCOLON, i);
		}
		public TerminalNode ID() { return getToken(GraphvizExprParser.ID, 0); }
		public Compass_ptContext compass_pt() {
			return getRuleContext(Compass_ptContext.class,0);
		}
		public PortIdContext(PortContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterPortId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitPortId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitPortId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_port);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PortIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(DOUBCOLON);
				setState(114);
				match(ID);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBCOLON) {
					{
					setState(115);
					match(DOUBCOLON);
					setState(116);
					compass_pt();
					}
				}

				}
				break;
			case 2:
				_localctx = new PortCompassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DOUBCOLON);
				setState(120);
				compass_pt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubgraphContext extends ParserRuleContext {
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
	 
		public SubgraphContext() { }
		public void copyFrom(SubgraphContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubgraphDefContext extends SubgraphContext {
		public TerminalNode LBRACE() { return getToken(GraphvizExprParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GraphvizExprParser.RBRACE, 0); }
		public TerminalNode SUBGRAPH() { return getToken(GraphvizExprParser.SUBGRAPH, 0); }
		public TerminalNode ID() { return getToken(GraphvizExprParser.ID, 0); }
		public SubgraphDefContext(SubgraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterSubgraphDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitSubgraphDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitSubgraphDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subgraph);
		int _la;
		try {
			_localctx = new SubgraphDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(123);
				match(SUBGRAPH);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(124);
					match(ID);
					}
				}

				}
			}

			setState(129);
			match(LBRACE);
			setState(130);
			stmt_list();
			setState(131);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compass_ptContext extends ParserRuleContext {
		public Compass_ptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compass_pt; }
	 
		public Compass_ptContext() { }
		public void copyFrom(Compass_ptContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompassPointContext extends Compass_ptContext {
		public TerminalNode COMPASS() { return getToken(GraphvizExprParser.COMPASS, 0); }
		public CompassPointContext(Compass_ptContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).enterCompassPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphvizExprListener ) ((GraphvizExprListener)listener).exitCompassPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphvizExprVisitor ) return ((GraphvizExprVisitor<? extends T>)visitor).visitCompassPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compass_ptContext compass_pt() throws RecognitionException {
		Compass_ptContext _localctx = new Compass_ptContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compass_pt);
		try {
			_localctx = new CompassPointContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			match(COMPASS);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"2\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005G\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006Q\b\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007X\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\ba\b\b\u0001\b\u0003\bd\b\b\u0001\t\u0001\t\u0003"+
		"\th\b\t\u0001\n\u0001\n\u0003\nl\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"p\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fv\b\f\u0001\f\u0001\f"+
		"\u0003\fz\b\f\u0001\r\u0001\r\u0003\r~\b\r\u0003\r\u0080\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0003\u0001\u0000\u0005\u0006\u0002\u0000\u0005\u0005\u0010"+
		"\u0011\u0002\u0000\f\f\u000e\u000e\u0090\u0000\"\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006?"+
		"\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000"+
		"\u0000\fL\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010"+
		"]\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014i\u0001"+
		"\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018y\u0001\u0000\u0000"+
		"\u0000\u001a\u007f\u0001\u0000\u0000\u0000\u001c\u0085\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0000\u0000\u0001"+
		" #\u0001\u0000\u0000\u0000!#\u0005\u0000\u0000\u0001\"\u001e\u0001\u0000"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0001\u0001\u0000\u0000\u0000"+
		"$&\u0005\u0004\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0007\u0000\u0000\u0000(*\u0005\u0013"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0005\b\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005"+
		"\t\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/1\u0003\u0006\u0003\u0000"+
		"02\u0005\f\u0000\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0003\u0004\u0002\u000047\u0001\u0000\u0000"+
		"\u000057\u0001\u0000\u0000\u00006/\u0001\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u00007\u0005\u0001\u0000\u0000\u00008@\u0003\u0014\n\u00009@\u0003"+
		"\u000e\u0007\u0000:@\u0003\b\u0004\u0000;<\u0005\u0013\u0000\u0000<=\u0005"+
		"\u000f\u0000\u0000=@\u0005\u0013\u0000\u0000>@\u0003\u001a\r\u0000?8\u0001"+
		"\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000"+
		"?;\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000AB\u0007\u0001\u0000\u0000BC\u0003\n\u0005\u0000C\t\u0001"+
		"\u0000\u0000\u0000DF\u0005\n\u0000\u0000EG\u0003\f\u0006\u0000FE\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0005\u000b\u0000\u0000IK\u0003\n\u0005\u0000JI\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0005\u0013"+
		"\u0000\u0000MN\u0005\u000f\u0000\u0000NP\u0005\u0013\u0000\u0000OQ\u0007"+
		"\u0002\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RT\u0003\f\u0006\u0000SR\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000UX\u0003\u0016\u000b"+
		"\u0000VX\u0003\u001a\r\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0003\u0010\b\u0000Z\\\u0003\n\u0005"+
		"\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000f\u0001"+
		"\u0000\u0000\u0000]`\u0003\u0012\t\u0000^a\u0003\u0016\u000b\u0000_a\u0003"+
		"\u001a\r\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ac\u0001"+
		"\u0000\u0000\u0000bd\u0003\u0010\b\u0000cb\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\u0011\u0001\u0000\u0000\u0000eh\u0005\u0002\u0000"+
		"\u0000fh\u0005\u0003\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ik\u0003\u0016\u000b\u0000"+
		"jl\u0003\n\u0005\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u0015\u0001\u0000\u0000\u0000mo\u0005\u0013\u0000\u0000np\u0003\u0018"+
		"\f\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0017\u0001"+
		"\u0000\u0000\u0000qr\u0005\r\u0000\u0000ru\u0005\u0013\u0000\u0000st\u0005"+
		"\r\u0000\u0000tv\u0003\u001c\u000e\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vz\u0001\u0000\u0000\u0000wx\u0005\r\u0000\u0000xz\u0003"+
		"\u001c\u000e\u0000yq\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z\u0019\u0001\u0000\u0000\u0000{}\u0005\u0007\u0000\u0000|~\u0005\u0013"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\b\u0000\u0000\u0082\u0083\u0003\u0004\u0002\u0000\u0083\u0084\u0005\t"+
		"\u0000\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0012"+
		"\u0000\u0000\u0086\u001d\u0001\u0000\u0000\u0000\u0015\"%)16?FJPSW[`c"+
		"gkouy}\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}