package com.s500076108.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphClass {
    private class Node{
       private  String label;
        public Node(String label) {
            this.label = label;
        }
        @Override
        public String toString() {
            return label;
        }
    }
    private Map<String,Node> nodes=new HashMap<>();
    private Map<Node , List<Node>> adjancesyList=new HashMap<>();
    public void addNode(String label){

        var node= new Node(label);
        nodes.putIfAbsent(label,node);
        adjancesyList.putIfAbsent(node,new ArrayList<>());

    }
    public void addEdge(String from,String to){
        var fromNode =nodes.get(from);
        if(fromNode==null)
            throw new IllegalArgumentException();
        var toNode=nodes.get(to);
        if (toNode==null){
            throw  new IllegalArgumentException();
        }
        adjancesyList.get(fromNode).add(toNode);

    }
    public void  printGraph(){
        for(var source:adjancesyList.keySet()){
            var target=adjancesyList.get(source);
            if(!target.isEmpty()){
                System.out.println(source+" is connected to "+target);
            }
        }
    }
}
