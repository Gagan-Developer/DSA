package dynamicprogramming;

public class ConvertOneStringToAnother {
    public static void main(String[] args) {
        String s1 = "table";
        String s2 = "tbres";

        ConvertOneStringToAnother obj = new ConvertOneStringToAnother();
        int result = obj.findMinOperations(s1, s2);
        System.out.println("Min operations required to convert string = " + result);

    }

    public int findMinOperations(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        return findMinOperationsRecursive(s1, s2, 0, 0, dp);
    }

    private int findMinOperationsRecursive(String s1, String s2, int i, int j, int[][] dp) {

        if (dp[i][j] == 0) {
            if (i >= s1.length() || j >= s2.length())
                return 0;

            if (i == s1.length())
                dp[i][j] = s2.length() - j;

            if (j == s2.length())
                dp[i][j] = s2.length() - j;

            if (s1.charAt(i) == s2.charAt(j)) {
                dp[i][j] = findMinOperationsRecursive(s1, s2, i + 1, j + 1, dp);
            }

            if (dp[i][j] == 0) {
                int a = 1 + findMinOperationsRecursive(s1, s2, i + 1, j, dp);
                int b = 1 + findMinOperationsRecursive(s1, s2, i, j + 1, dp);
                int c = 1 + findMinOperationsRecursive(s1, s2, i + 1, j + 1, dp);

                dp[i][j] = Math.min(a, Math.min(b, c));
            }
        }
        return dp[i][j];
    }
}
