package divideandconquer;

public class MinCostToReachLastCell {

    public static void main(String[] args) {
        int[][] array =
                {
                        { 4, 7, 8, 6, 4 },
                        { 6, 7, 3, 9, 2 },
                        { 3, 8, 1, 2, 4 },
                        { 7, 1, 7, 3, 7 },
                        { 2, 9, 8, 9, 3 }
                };

        System.out.print("The minimum cost is " + findMinCost(array, array.length-1, array[0].length-1));
    }

    public static int findMinCost(int[][] array, int x, int y) {

        if(x == 0 && y == 0)
            return array[0][0];

        if(x < 0 || y < 0)
            return Integer.MAX_VALUE/10;

        int c1 = array[x][y] + findMinCost(array, x-1, y);
        int c2 = array[x][y] + findMinCost(array, x, y-1);

        return Math.min(c1, c2);
    }
}
