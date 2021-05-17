package graph;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.List;

public class BFSByLinkedListMain {
    public static void main(String[] args) {
        System.out.println("String BFS Traversal");

        List<GraphNode> nodeList = new ArrayList<>();

        // Create 10 nodes
        for (int idx = 1; idx <= 10; idx++) {
            GraphNode node = new GraphNode("V" + idx, idx-1);
            nodeList.add(node);
        }

        BFSByLinkedList graph = new BFSByLinkedList(nodeList);

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

        graph.bfs();
    }
}
