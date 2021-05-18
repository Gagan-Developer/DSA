package graph;

import graph.node.WeightedNode;

import java.util.List;

public class PathFindingByBellmanFord {

    List<WeightedNode> nodeList;

    public PathFindingByBellmanFord(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
        for (WeightedNode node : nodeList) {
            node.setDistance(Integer.MAX_VALUE / 10);
        }
    }

    public void bellmanFord(WeightedNode node) {
        node.setDistance(0);
        for (int idx = 1; idx < nodeList.size(); idx++) {
            for (WeightedNode presentNode : nodeList) {
                List<WeightedNode> neighbours = presentNode.getNeighbour();
                for (WeightedNode neighbour : neighbours) {
                    if (neighbour.getDistance() > presentNode.getDistance() + presentNode.getWeightMap().get(neighbour)) {
                        neighbour.setDistance(presentNode.getDistance() + presentNode.getWeightMap().get(neighbour));
                        neighbour.setParent(presentNode);
                    }
                }
            }
        }

        for (WeightedNode presentNode : nodeList) {
            List<WeightedNode> neighbours = presentNode.getNeighbour();
            for (WeightedNode neighbour : neighbours) {
                if (neighbour.getDistance() > presentNode.getDistance() + presentNode.getWeightMap().get(neighbour)) {
                    System.out.println("Negative Cycle found");
                    return;
                }
            }
        }

        System.out.println("Negative cycle is not found!");

        System.out.println("Printing paths from source");
        for (WeightedNode nodeToCheck : nodeList) {
            if (nodeToCheck.getDistance() != Integer.MAX_VALUE) {
                System.out.print("Node: " + nodeToCheck + " Distance: " + nodeToCheck.getDistance() + " Path: ");
                printPath(nodeToCheck);
                System.out.println();
            } else {
                System.out.println("No Path available to node " + nodeToCheck);
            }
        }


    }

    public void printPath(WeightedNode node) {
        if (node.getParent() != null) {
            printPath(node.getParent());
            System.out.print("->" + node);
        } else {
            System.out.print(node);
        }
    }

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);
        first.getNeighbour().add(second);
        first.getWeightMap().put(second, d);
    }
}
