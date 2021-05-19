package graph;

import graph.node.WeightedNode;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    private List<WeightedNode> nodeList = new ArrayList<>();

    public List<WeightedNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public static void driver(List<WeightedNode> nodeList) {
        makeSet(nodeList);
        for (int i = 0; i < nodeList.size() - 1; i++) {
            WeightedNode first = nodeList.get(i);
            WeightedNode second = nodeList.get(i + 1);

            System.out.println("First node name" + first);
            System.out.println("Second node name " + second);

            if (!findSet(first).equals(findSet(second))) {
                System.out.println("\nMaking union " + first + " and " + second);
                DisjointSet unionedSet = union(first, second);
                unionedSet.printAllNodesOfThisSet();
            } else {
                System.out.println("Sets are equal. No operation is required.");
            }
        }
    }

    public static void makeSet(List<WeightedNode> nodeList) {
        for (WeightedNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.getNodeList().add(node);
            node.setSet(set);
        }
    }

    public static DisjointSet findSet(WeightedNode node) {
        return node.getSet();
    }

    public static DisjointSet union(WeightedNode node1, WeightedNode node2) {
        if (node1.getSet().equals(node2.getSet())) {
            System.out.println("Sets are equal. Union is not required");
            return null;
        }

        DisjointSet set1 = node1.getSet();
        DisjointSet set2 = node2.getSet();

        if (set1.getNodeList().size() > set2.getNodeList().size()) {
            List<WeightedNode> nodeList = set2.getNodeList();
            for (WeightedNode node : nodeList) {
                node.setSet(set1);
                set1.getNodeList().add(node);
            }
            return set1;
        } else {
            List<WeightedNode> nodeList = set1.getNodeList();
            for (WeightedNode node : nodeList) {
                node.setSet(set2);
                set2.getNodeList().add(node);
            }
            return set2;
        }
    }

    public void printAllNodesOfThisSet() {
        System.out.println("Printing all nodes of the set: ");
        for (WeightedNode node : nodeList) {
            System.out.print(node + "  ");
        }
        System.out.println();
    }


}
