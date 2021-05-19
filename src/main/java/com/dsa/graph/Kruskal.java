package graph;

import graph.node.UndirectedEdge;
import graph.node.WeightedNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kruskal {

    private List<WeightedNode> nodeList = new ArrayList<>();
    private List<UndirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void kruskal() {

        DisjointSet.makeSet(nodeList);

        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        Collections.sort(edgeList, comparator);

        int cost = 0;
        for (UndirectedEdge edge : edgeList) {
            WeightedNode first = edge.getFirst();
            WeightedNode second = edge.getSecond();

            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.getWeight();
                System.out.println("Edge used " + edge);

            }
        }
        System.out.println("MST cost " + cost);
    }

    public void addWeightedUndirectedEdge(int i, int j, int weight) {

        UndirectedEdge edge = new UndirectedEdge(nodeList.get(i - 1), nodeList.get(j - 1), weight);
        WeightedNode first = edge.getFirst();
        WeightedNode second = edge.getSecond();

        first.getNeighbour().add(second);
        first.getWeightMap().put(second, weight);
        second.getNeighbour().add(first);
        second.getWeightMap().put(first, weight);

        edgeList.add(edge);

    }
}
