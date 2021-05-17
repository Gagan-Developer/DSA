package graph;

import graph.node.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSByLinkedList {

    private List<GraphNode> nodeList;

    public BFSByLinkedList(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited())
                bfsVisit(node);
        }
    }

    private void bfsVisit(GraphNode node) {

        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode presentNode = queue.remove();
            System.out.print(presentNode.getName() + " ");
            presentNode.setVisited(true);

            List<GraphNode> neighboursList = presentNode.getNeighbours();

            for (GraphNode neighbour : neighboursList) {
                if (!neighbour.isVisited()) {
                    queue.add(neighbour);
                    neighbour.setVisited(true);
                }
            }
        }
    }

    public void addUndirectedEdge(int node1, int node2) {
        GraphNode first = nodeList.get(node1 - 1);
        GraphNode second = nodeList.get(node2 - 1);

        first.getNeighbours().add(second);
        second.getNeighbours().add(first);
    }
}
