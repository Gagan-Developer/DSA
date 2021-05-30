package dynamicprogramming;

public class NoOfPathsToReachLastCell {
    public static void main(String[] args) {
        int[][] array = {
                {4, 7, 1, 6},
                {5, 7, 3, 9},
                {3, 2, 1, 2},
                {7, 1, 6, 3}};
        int cost = 25;

        NoOfPathsToReachLastCell obj = new NoOfPathsToReachLastCell();
        int result = obj.pathsToLastCell(array, cost);
        System.out.println("no of paths " + result);
    }

    public int pathsToLastCell(int[][] array, int cost) {
        int[][] dp = new int[array.length][array[0].length];
        return findPathsToLastCell(array, dp, array.length - 1, array[0].length - 1, cost);
    }

    private int findPathsToLastCell(int[][] array, int[][] dp, int x, int y, int cost) {

        if (cost < 0)
            return 0;
        if (x == 0 && y == 0)
            return (array[0][0] - cost == 0) ? 1 : 0;

        if (dp[x][y] == 0) {
            if (x == 0) {
                dp[0][y] = findPathsToLastCell(array, dp, 0, y - 1, cost - array[0][y]);
            } else if (y == 0) {
                dp[x][0] = findPathsToLastCell(array, dp, x - 1, 0, cost - array[x][0]);
            } else {
                int p1 = findPathsToLastCell(array, dp, x - 1, y, cost - array[x][y]);
                int p2 = findPathsToLastCell(array, dp, x, y - 1, cost - array[x][y]);
                dp[x][y] = p1 + p2;
            }

        }
        return dp[x][y];
    }
}
