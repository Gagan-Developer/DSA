package graph;

import graph.node.GraphNode;

import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    List<GraphNode> nodeList;

    public TopologicalSort(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                topologicalVisit(node, stack);
            }
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop().getName() + " ");
    }

    private void topologicalVisit(GraphNode node, Stack stack) {
        List<GraphNode> neighbourList = node.getNeighbours();

        for (GraphNode neighbour : neighbourList) {
            if (!neighbour.isVisited()) {
                topologicalVisit(neighbour, stack);
            }
        }
        node.setVisited(true);
        stack.push(node);

    }

    public void addDirectedEdge(int node1, int node2) {
        GraphNode first = nodeList.get(node1 - 1);
        GraphNode second = nodeList.get(node2 - 1);

        first.getNeighbours().add(second);
    }
}
