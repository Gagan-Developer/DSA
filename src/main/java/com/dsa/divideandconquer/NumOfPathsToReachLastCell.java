package divideandconquer;

public class NumOfPathsToReachLastCell {

    public static void main(String[] args) {
        int[][] array = {
                {4, 7, 1, 6},
                {5, 7, 3, 9},
                {3, 2, 1, 2},
                {7, 1, 6, 3}};
        int cost = 25;
        System.out.println("Total paths with cost " + cost + " are " + numberOfPaths(array, array.length - 1, array[0].length-1, cost));
    }

    public static int numberOfPaths(int[][] array, int x, int y, int cost) {
        if (x < 0 || y < 0)
            return 0;

        if (x == 0 && y == 0)
            return (cost - array[x][y] == 0) ? 1 : 0;

        if (x == 0)
            return numberOfPaths(array, x, y - 1, cost - array[x][y]);
        if (y == 0)
            return numberOfPaths(array, x - 1, y, cost - array[x][y]);

        int p1 = numberOfPaths(array, x - 1, y, cost - array[x][y]);
        int p2 = numberOfPaths(array, x, y - 1, cost - array[x][y]);

        return p1 + p2;
    }
}
