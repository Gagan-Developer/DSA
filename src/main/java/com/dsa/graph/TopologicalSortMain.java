package graph;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.List;

public class TopologicalSortMain {
    public static void main(String[] args) {
        System.out.println("Start Topological Sorting");

        List<GraphNode> nodeList = new ArrayList<>();

        // Create 10 nodes
        for (int idx = 1; idx <= 6; idx++) {
            GraphNode node = new GraphNode("V" + idx, idx - 1);
            nodeList.add(node);
        }

        TopologicalSort graph = new TopologicalSort(nodeList);

        // Add edges between nodes
        graph.addDirectedEdge(6, 1);
        graph.addDirectedEdge(6, 2);
        graph.addDirectedEdge(5, 1);
        graph.addDirectedEdge(5, 2);
        graph.addDirectedEdge(3, 4);
        graph.addDirectedEdge(4, 2);

        graph.topologicalSort();
    }
}
