package graph;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSByAdjacencyMatrix {

    List<GraphNode> nodeList;
    int[][] adjacencyMatrix;

    public BFSByAdjacencyMatrix(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!isVisited(node))
                bfsVisit(node);
        }
    }

    public boolean isVisited(GraphNode node) {
        return node.isVisited();
    }

    private void bfsVisit(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.setVisited(true);
            System.out.print(currentNode.getName() + " ");

            List<GraphNode> neighboursList = getNeighbours(currentNode);
            for (GraphNode neighbour : neighboursList) {
                if (!neighbour.isVisited()) {
                    queue.add(neighbour);
                    neighbour.setVisited(true);
                }
            }
        }
    }

    public void addUndirectedEdge(int node1, int node2) {
        node1--;
        node2--;
        adjacencyMatrix[node1][node2] = 1;
        adjacencyMatrix[node2][node1] = 1;
    }

    private List<GraphNode> getNeighbours(GraphNode node) {

        List<GraphNode> neighbours = new ArrayList<>();

        int index = node.getIndex();
        for (int i = 0; i < nodeList.size(); i++) {
            if (adjacencyMatrix[index][i] == 1) {
                GraphNode neighbourNode = nodeList.get(i);
                neighbours.add(neighbourNode);
            }
        }
        return neighbours;
    }
}
