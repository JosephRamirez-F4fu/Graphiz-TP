package org.example;

import java.util.*;

public class TableSymbols extends GraphvizExprBaseVisitor<Integer> {
   public Map<String,List<String>> LA = new HashMap<>();
   public  Stack<String> backNode = new Stack<>();
    /*(node_id|subgraph) edgeRHS attr_list? # EdgeDef*/
    @Override
    public Integer visitEdgeDef(GraphvizExprParser.EdgeDefContext ctx) {
        boolean isNode = ctx.node_id() != null;
        if (isNode) {
            backNode.push(ctx.node_id().getChild(0).getText());
            System.out.println("Pushed to backNode: " + ctx.node_id().getChild(0).getText());
        }
        return super.visitEdgeDef(ctx);
    }
    /*dgeop (node_id|subgraph) edgeRHS?  */
    @Override
    public Integer visitEdgeOp(GraphvizExprParser.EdgeOpContext ctx) {
        boolean isNode = ctx.node_id() != null;
        if (isNode) {
            String node = ctx.node_id().getChild(0).getText();
            if (!backNode.isEmpty()) {
                String head = backNode.pop();
                if (!LA.containsKey(node)) {
                    LA.put(node, new ArrayList<>());
                }
                if (!LA.containsKey(head)) {
                    LA.put(head, new ArrayList<>());
                }

                LA.get(head).add(node);
                boolean isUndirected = ctx.dgeop().getText().equals("--");
                if (isUndirected) {
                    LA.get(node).add(head);
                }
            }
        }
        return super.visitEdgeOp(ctx);
    }

    public void PrintLA(){
        for (Map.Entry<String, List<String>> entry : this.LA.entrySet()) {
            String clave = entry.getKey();
            List<String> valor = entry.getValue();
            System.out.print(clave + " [ ");
            for(String atributes : valor){
                System.out.print(atributes + ", ");
            }
            System.out.println("]");
        }
    }
}
