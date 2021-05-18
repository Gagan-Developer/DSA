package graph;

import graph.node.WeightedNode;

import java.util.List;
import java.util.PriorityQueue;

public class PathFindingByDijkstra {

    List<WeightedNode> nodeList;

    public PathFindingByDijkstra(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.setDistance(0);
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            WeightedNode presentNode = queue.remove();
            List<WeightedNode> neighbours = presentNode.getNeighbour();

            for (WeightedNode neighbour : neighbours) {
                if (queue.contains(neighbour)) {
                    if (neighbour.getDistance() > (presentNode.getDistance() + presentNode.getWeightMap().get(neighbour))) {
                        neighbour.setDistance(presentNode.getDistance() + presentNode.getWeightMap().get(neighbour));
                        neighbour.setParent(presentNode);
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }

        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node to check " + nodeToCheck + " Distance: " + nodeToCheck.getDistance() + " path :");
            printPath(nodeToCheck);
            System.out.println();
        }
    }

    public void printPath(WeightedNode node) {
        if (node.getParent() != null) {
            printPath(node.getParent());
            System.out.print("->" + node);
        } else {
            System.out.println(node);
        }
    }

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode source = nodeList.get(i - 1);
        WeightedNode dest = nodeList.get(j - 1);

        source.getNeighbour().add(dest);
        source.getWeightMap().put(dest, d);
    }
}
