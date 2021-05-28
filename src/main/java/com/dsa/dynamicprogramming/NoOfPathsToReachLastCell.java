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
        //return findPathsToLastCell(array, dp, array.length - 1, array[0].length - 1, cost);
        return numberOfPathsAux(dp, array, array.length - 1, array[0].length - 1, cost);
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

    public int numberOfPathsAux(int dp[][], int array[][], int row, int col, int cost) {
        if (cost < 0) {// BASE CASE
            return 0;
        }
        if (row == 0 && col == 0) { // BASE CASE
            return (array[0][0] - cost == 0) ? 1 : 0;
        }
        if (dp[row][col] == 0) {// If we have not solved this problem previously, only then solve it
            if (row == 0) { // BASE CASE: If we're at first row, we can only go left
                dp[row][col] = numberOfPaths(array, 0, col - 1, cost - array[row][col]);
            }
            else if (col == 0) { // BASE CASE: if we're at first column, we can only go up
                dp[row][col] = numberOfPaths(array, row - 1, 0, cost - array[row][col]);
            } else {
                int noOfPathsFromPreviousRow = numberOfPaths(array, row - 1, col, cost - array[row][col]); // Find Paths till last Row
                int noOfPathsFromPreviousCol = numberOfPaths(array, row, col - 1, cost - array[row][col]); // Find Paths till last Col
                dp[row][col] = noOfPathsFromPreviousRow + noOfPathsFromPreviousCol;
            }
        } // end of if-else block
        return dp[row][col];
    }// End of method
}
