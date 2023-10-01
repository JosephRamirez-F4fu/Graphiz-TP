// Generated from C:/Users/Joseph/IdeaProjects/Compiladores/src/main/java/org/example/GraphvizExpr.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphvizExprParser}.
 */
public interface GraphvizExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code GraphObj}
	 * labeled alternative in {@link GraphvizExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterGraphObj(GraphvizExprParser.GraphObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphObj}
	 * labeled alternative in {@link GraphvizExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitGraphObj(GraphvizExprParser.GraphObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndFile}
	 * labeled alternative in {@link GraphvizExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterEndFile(GraphvizExprParser.EndFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndFile}
	 * labeled alternative in {@link GraphvizExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitEndFile(GraphvizExprParser.EndFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphDef}
	 * labeled alternative in {@link GraphvizExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraphDef(GraphvizExprParser.GraphDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphDef}
	 * labeled alternative in {@link GraphvizExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraphDef(GraphvizExprParser.GraphDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Stmnt}
	 * labeled alternative in {@link GraphvizExprParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmnt(GraphvizExprParser.StmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Stmnt}
	 * labeled alternative in {@link GraphvizExprParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmnt(GraphvizExprParser.StmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link GraphvizExprParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(GraphvizExprParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link GraphvizExprParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(GraphvizExprParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNodeObj(GraphvizExprParser.NodeObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNodeObj(GraphvizExprParser.NodeObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdgeObj(GraphvizExprParser.EdgeObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdgeObj(GraphvizExprParser.EdgeObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr(GraphvizExprParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr(GraphvizExprParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(GraphvizExprParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(GraphvizExprParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubGraphObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubGraphObj(GraphvizExprParser.SubGraphObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubGraphObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubGraphObj(GraphvizExprParser.SubGraphObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrDef}
	 * labeled alternative in {@link GraphvizExprParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttrDef(GraphvizExprParser.AttrDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrDef}
	 * labeled alternative in {@link GraphvizExprParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttrDef(GraphvizExprParser.AttrDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrList}
	 * labeled alternative in {@link GraphvizExprParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttrList(GraphvizExprParser.AttrListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrList}
	 * labeled alternative in {@link GraphvizExprParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttrList(GraphvizExprParser.AttrListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrListAssign}
	 * labeled alternative in {@link GraphvizExprParser#a_list}.
	 * @param ctx the parse tree
	 */
	void enterAttrListAssign(GraphvizExprParser.AttrListAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrListAssign}
	 * labeled alternative in {@link GraphvizExprParser#a_list}.
	 * @param ctx the parse tree
	 */
	void exitAttrListAssign(GraphvizExprParser.AttrListAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeDef}
	 * labeled alternative in {@link GraphvizExprParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdgeDef(GraphvizExprParser.EdgeDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeDef}
	 * labeled alternative in {@link GraphvizExprParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdgeDef(GraphvizExprParser.EdgeDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeOp}
	 * labeled alternative in {@link GraphvizExprParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void enterEdgeOp(GraphvizExprParser.EdgeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeOp}
	 * labeled alternative in {@link GraphvizExprParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void exitEdgeOp(GraphvizExprParser.EdgeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeDirOp}
	 * labeled alternative in {@link GraphvizExprParser#dgeop}.
	 * @param ctx the parse tree
	 */
	void enterEdgeDirOp(GraphvizExprParser.EdgeDirOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeDirOp}
	 * labeled alternative in {@link GraphvizExprParser#dgeop}.
	 * @param ctx the parse tree
	 */
	void exitEdgeDirOp(GraphvizExprParser.EdgeDirOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeUDirOp}
	 * labeled alternative in {@link GraphvizExprParser#dgeop}.
	 * @param ctx the parse tree
	 */
	void enterEdgeUDirOp(GraphvizExprParser.EdgeUDirOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeUDirOp}
	 * labeled alternative in {@link GraphvizExprParser#dgeop}.
	 * @param ctx the parse tree
	 */
	void exitEdgeUDirOp(GraphvizExprParser.EdgeUDirOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeAUNNOSE}
	 * labeled alternative in {@link GraphvizExprParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNodeAUNNOSE(GraphvizExprParser.NodeAUNNOSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeAUNNOSE}
	 * labeled alternative in {@link GraphvizExprParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNodeAUNNOSE(GraphvizExprParser.NodeAUNNOSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodePort}
	 * labeled alternative in {@link GraphvizExprParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNodePort(GraphvizExprParser.NodePortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodePort}
	 * labeled alternative in {@link GraphvizExprParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNodePort(GraphvizExprParser.NodePortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PortId}
	 * labeled alternative in {@link GraphvizExprParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPortId(GraphvizExprParser.PortIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PortId}
	 * labeled alternative in {@link GraphvizExprParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPortId(GraphvizExprParser.PortIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PortCompass}
	 * labeled alternative in {@link GraphvizExprParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPortCompass(GraphvizExprParser.PortCompassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PortCompass}
	 * labeled alternative in {@link GraphvizExprParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPortCompass(GraphvizExprParser.PortCompassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubgraphDef}
	 * labeled alternative in {@link GraphvizExprParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void enterSubgraphDef(GraphvizExprParser.SubgraphDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubgraphDef}
	 * labeled alternative in {@link GraphvizExprParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void exitSubgraphDef(GraphvizExprParser.SubgraphDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompassPoint}
	 * labeled alternative in {@link GraphvizExprParser#compass_pt}.
	 * @param ctx the parse tree
	 */
	void enterCompassPoint(GraphvizExprParser.CompassPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompassPoint}
	 * labeled alternative in {@link GraphvizExprParser#compass_pt}.
	 * @param ctx the parse tree
	 */
	void exitCompassPoint(GraphvizExprParser.CompassPointContext ctx);
}