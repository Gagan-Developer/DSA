package graph;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.List;

public class DFSRecursiveMain {
    public static void main(String[] args) {
        System.out.println("String DFS Traversal");

        List<GraphNode> nodeList = new ArrayList<>();

        // Create 10 nodes
        for (int idx = 1; idx <= 10; idx++) {
            GraphNode node = new GraphNode("V" + idx, idx - 1);
            nodeList.add(node);
        }

        DFSRecursive graph = new DFSRecursive(nodeList);

        // Add edges between nodes
        graph.addUndirectedEdge(1, 2);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 5);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 6);
        graph.addUndirectedEdge(4, 7);
        graph.addUndirectedEdge(5, 8);
        graph.addUndirectedEdge(6, 9);
        graph.addUndirectedEdge(7, 8);
        graph.addUndirectedEdge(8, 9);
        graph.addUndirectedEdge(9, 10);
        graph.addUndirectedEdge(3, 10);

        graph.dfs();
    }
}