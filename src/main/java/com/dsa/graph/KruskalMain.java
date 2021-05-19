package graph;

import graph.node.WeightedNode;

import java.util.ArrayList;

public class KruskalMain {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();

        for(int i=0;i<5; i++) {
            nodeList.add(new WeightedNode(""+(char)(65+i)));
        }
        Kruskal graph = new Kruskal(nodeList);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,20);
        graph.addWeightedUndirectedEdge(2,3,30);
        graph.addWeightedUndirectedEdge(2,4,5);
        graph.addWeightedUndirectedEdge(3,4,15);
        graph.addWeightedUndirectedEdge(3,5,6);
        graph.addWeightedUndirectedEdge(4,5,8);



        System.out.println("Running Kruskal's Algo on the graph: ");
        graph.kruskal();
    }
}
