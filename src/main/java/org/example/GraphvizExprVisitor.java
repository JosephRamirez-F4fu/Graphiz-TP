// Generated from C:/Users/Joseph/IdeaProjects/Compiladores/src/main/java/org/example/GraphvizExpr.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphvizExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphvizExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code GraphObj}
	 * labeled alternative in {@link GraphvizExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphObj(GraphvizExprParser.GraphObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndFile}
	 * labeled alternative in {@link GraphvizExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndFile(GraphvizExprParser.EndFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GraphDef}
	 * labeled alternative in {@link GraphvizExprParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphDef(GraphvizExprParser.GraphDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stmnt}
	 * labeled alternative in {@link GraphvizExprParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmnt(GraphvizExprParser.StmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link GraphvizExprParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(GraphvizExprParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeObj(GraphvizExprParser.NodeObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeObj(GraphvizExprParser.EdgeObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(GraphvizExprParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(GraphvizExprParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubGraphObj}
	 * labeled alternative in {@link GraphvizExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubGraphObj(GraphvizExprParser.SubGraphObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrDef}
	 * labeled alternative in {@link GraphvizExprParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrDef(GraphvizExprParser.AttrDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrList}
	 * labeled alternative in {@link GraphvizExprParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrList(GraphvizExprParser.AttrListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrListAssign}
	 * labeled alternative in {@link GraphvizExprParser#a_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrListAssign(GraphvizExprParser.AttrListAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeDef}
	 * labeled alternative in {@link GraphvizExprParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeDef(GraphvizExprParser.EdgeDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeOp}
	 * labeled alternative in {@link GraphvizExprParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeOp(GraphvizExprParser.EdgeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeDirOp}
	 * labeled alternative in {@link GraphvizExprParser#dgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeDirOp(GraphvizExprParser.EdgeDirOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeUDirOp}
	 * labeled alternative in {@link GraphvizExprParser#dgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeUDirOp(GraphvizExprParser.EdgeUDirOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeAUNNOSE}
	 * labeled alternative in {@link GraphvizExprParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAUNNOSE(GraphvizExprParser.NodeAUNNOSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodePort}
	 * labeled alternative in {@link GraphvizExprParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodePort(GraphvizExprParser.NodePortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PortId}
	 * labeled alternative in {@link GraphvizExprParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortId(GraphvizExprParser.PortIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PortCompass}
	 * labeled alternative in {@link GraphvizExprParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortCompass(GraphvizExprParser.PortCompassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubgraphDef}
	 * labeled alternative in {@link GraphvizExprParser#subgraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubgraphDef(GraphvizExprParser.SubgraphDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompassPoint}
	 * labeled alternative in {@link GraphvizExprParser#compass_pt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompassPoint(GraphvizExprParser.CompassPointContext ctx);
}