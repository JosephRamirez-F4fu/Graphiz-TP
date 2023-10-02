package org.example;

import java.util.*;

public class TableSymbols extends GraphvizExprBaseVisitor<Integer> {

    public  Map<Integer,String> memory = new HashMap<>();
   public Map<String,List<String>> LA = new HashMap<>();
   public  Stack<String> backNode = new Stack<>();
    /*(node_id|subgraph) edgeRHS attr_list? # EdgeDef*/
    /*(SUBGRAPH ID?)? '{' stmt_list '}' */
    @Override
    public Integer visitSubgraphDef(GraphvizExprParser.SubgraphDefContext ctx) {
        if(ctx.ID()!=null){
            memory.put(counter,ctx.ID().getText() + " | subgraph |");
        }else{
            memory.put(counter," Empty ID " + " | subgraph |");
        }
        this.counter++;
        return super.visitSubgraphDef(ctx);
    }

    @Override
    public Integer visitGraphDef(GraphvizExprParser.GraphDefContext ctx) {
        if (ctx.ID()!=null){
            memory.put(counter,ctx.ID().getText() + " | graph |");
        }else {
            memory.put(counter," Empty ID" + " | graph |");
        }
        this.counter++;
        return super.visitGraphDef(ctx);
    }

    @Override
    public Integer visitAttrList(GraphvizExprParser.AttrListContext ctx) {
        if(ctx.a_list()!=null){
            memory.put(counter,ctx.a_list().getText() + " | attribute |");
        }else {
            memory.put(counter,"Empty ID" + " | attributes |");
        }
        this.counter++;
        return super.visitAttrList(ctx);
    }

    @Override
    public Integer visitEdgeDef(GraphvizExprParser.EdgeDefContext ctx) {
        boolean isNode = ctx.node_id() != null;
        if (isNode) {
            backNode.push(ctx.node_id().getChild(0).getText());
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
                    memory.put(counter,"--"+ " | edge |");
                }else {
                    memory.put(counter,"->"+ " | edge |");
                }
                this.counter++;


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
    public Integer counter  = 0;
    @Override
    public Integer visitNodePort(GraphvizExprParser.NodePortContext ctx) {
        if (ctx.ID()!=null)
            memory.put(counter,ctx.ID().getText() + " | Node |");
        else
            memory.put(counter," Empty ID " + " | Node |");
        this.counter++;
        return super.visitNodePort(ctx);
    }

    public void printTS() {
        for (Map.Entry<Integer, String> entry : this.memory.entrySet()) {
            Integer clave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Key: " + clave + " | " + valor);
        }
    }
}
