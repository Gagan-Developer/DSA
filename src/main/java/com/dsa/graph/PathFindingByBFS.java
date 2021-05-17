package graph;

import graph.node.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathFindingByBFS {

    List<GraphNode> nodeList;

    public PathFindingByBFS(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void bfsForSSSP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode presentNode = queue.remove();
            presentNode.setVisited(true);
            System.out.println("Printing path for " + presentNode.getName());
            printPath(presentNode);
            System.out.println();

            List<GraphNode> neighbourList = presentNode.getNeighbours();
            for (GraphNode neighbour : neighbourList) {
                if(!neighbour.isVisited()) {
                    queue.add(neighbour);
                    neighbour.setVisited(true);
                    neighbour.setParent(presentNode);
                }
            }
        }
    }

    private void printPath(GraphNode node) {
        if (node.getParent() != null)
            printPath(node.getParent());
        System.out.print(node.getName() + " ");
    }

    public void addUndirectedEdge(int node1, int node2) {
        GraphNode first = nodeList.get(node1 - 1);
        GraphNode second = nodeList.get(node2 - 1);

        first.getNeighbours().add(second);
        second.getNeighbours().add(first);

    }
}
