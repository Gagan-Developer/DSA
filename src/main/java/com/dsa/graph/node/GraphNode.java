package graph.node;

import java.util.List;

public class GraphNode {
    private String name;
    private int index;
    private List<GraphNode> neighbours;
    private boolean isVisited;
    private GraphNode parent;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<GraphNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<GraphNode> neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }
}
