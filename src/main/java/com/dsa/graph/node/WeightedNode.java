package graph.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedNode implements Comparable<WeightedNode> {
    private String name;
    private List<WeightedNode> neighbour = new ArrayList<>();
    private Map<WeightedNode, Integer> weightMap = new HashMap<>();
    private int distance;
    private WeightedNode parent;
    private boolean isVisited = false;

    public WeightedNode(String name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeightedNode> getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(List<WeightedNode> neighbour) {
        this.neighbour = neighbour;
    }

    public Map<WeightedNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(Map<WeightedNode, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
