package graph;

import graph.node.GraphNode;

import java.util.List;

public class DFSRecursive {
    List<GraphNode> nodeList;

    public DFSRecursive(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited())
                dfsVisit(node);
        }
    }

    private void dfsVisit(GraphNode node) {
        node.setVisited(true);
        System.out.print(node.getName() + " ");

        List<GraphNode> neighbourList = node.getNeighbours();
        for (GraphNode neighbour : neighbourList) {
            if (!neighbour.isVisited()) {
                dfsVisit(neighbour);
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
