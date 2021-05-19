package graph;

import graph.node.WeightedNode;

import java.util.List;

public class FloydWarshall {

    List<WeightedNode> nodeList;

    public FloydWarshall(List<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void floydWarshall() {
        int size = nodeList.size();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    matrix[i][j] = 0;
                } else if (first.getWeightMap().containsKey(second)) {
                    matrix[i][j] = first.getWeightMap().get(second);
                } else {
                    matrix[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }

        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (matrix[i][j] > matrix[i][k] + matrix[k][j]) {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < nodeList.size(); i++) {
            System.out.println("Printing Distance list from node " + nodeList.get(i));
            for (int j = 0; j < nodeList.size(); j++) {
                System.out.print(nodeList.get(j) +":" + matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);
        first.getNeighbour().add(second);
        first.getWeightMap().put(second, d);
    }


}
