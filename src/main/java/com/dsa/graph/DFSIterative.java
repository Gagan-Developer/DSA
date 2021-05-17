package graph;

import graph.node.GraphNode;

import java.util.List;
import java.util.Stack;

public class DFSIterative {
    List<GraphNode> nodeList;

    public DFSIterative(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited())
                dfsVisit(node);
        }
    }

    private void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode presentNode = stack.pop();
            System.out.print(presentNode.getName() + " ");
            presentNode.setVisited(true);

            List<GraphNode> neighbourList = presentNode.getNeighbours();
            for (GraphNode neighbour : neighbourList) {
                if (!neighbour.isVisited()) {
                    stack.push(neighbour);
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
