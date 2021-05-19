package graph;

import graph.node.WeightedNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prims {

    private List<WeightedNode> nodeList = new ArrayList<>();

    public Prims(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void prims(WeightedNode node) {

        for (int idx = 0; idx < nodeList.size(); idx++) {
            nodeList.get(idx).setDistance(Integer.MAX_VALUE);
        }

        node.setDistance(0);

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            WeightedNode presentNode = queue.remove();

            for (WeightedNode neighbour : presentNode.getNeighbour()) {
                if (queue.contains(neighbour)) {
                    if (neighbour.getDistance() > presentNode.getDistance() + presentNode.getWeightMap().get(neighbour)) {
                        neighbour.setDistance(presentNode.getDistance() + presentNode.getWeightMap().get(neighbour));
                        neighbour.setParent(presentNode);
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }

        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + " Distance " + nodeToCheck.getDistance() + " Parent " + nodeToCheck.getParent());
            cost += nodeToCheck.getDistance();
        }
    }

    public void addWeightedUndirectedEdge(int i, int j, int weight) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);

        first.getNeighbour().add(second);
        first.getWeightMap().put(second, weight);
        second.getNeighbour().add(first);
        second.getWeightMap().put(first, weight);
    }
}
