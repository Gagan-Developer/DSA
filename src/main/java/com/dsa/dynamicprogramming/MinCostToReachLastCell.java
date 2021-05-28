package dynamicprogramming;

public class MinCostToReachLastCell {
    public static void main(String[] args) {

        int[][] paths =
                {
                        {4, 7, 8, 6, 4},
                        {6, 7, 3, 9, 2},
                        {3, 8, 1, 2, 4},
                        {7, 1, 7, 3, 7},
                        {2, 9, 8, 9, 3}
                };


        int[][] dp = new int[paths.length][paths[0].length];
        MinCostToReachLastCell obj = new MinCostToReachLastCell();
        int result = obj.minCostToReachLastCell(paths, dp, paths.length-1, paths[0].length-1);
        System.out.println("Min cost to reach last cell = " + result);
    }

    public int minCostToReachLastCell(int[][] paths, int[][] dp, int x, int y) {
        return findMinCost(paths, dp, x, y);
    }

    private int findMinCost(int[][] paths, int[][] dp, int x, int y) {

        if (x < 0 || y < 0)
            return Integer.MAX_VALUE/10;
        if (x == 0 && y == 0)
            return paths[0][0];

        if (dp[x][y] == 0) {
            int a = paths[x][y] + findMinCost(paths, dp, x - 1, y);
            int b = paths[x][y] + findMinCost(paths, dp, x, y - 1);

            dp[x][y] = Math.min(a, b);
        }
        return dp[x][y];
    }
}
