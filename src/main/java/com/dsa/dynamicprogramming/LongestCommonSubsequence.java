package dynamicprogramming;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String s1 = "houdini";
        String s2 = "hdupti";
        int[][] dp = new int[s1.length()][s2.length()];

        LongestCommonSubsequence obj = new LongestCommonSubsequence();
        int result = obj.longestCommonSubsequence(s1, s2, dp);

        System.out.println("Longest common subsequence length = " + result);

    }

    public int longestCommonSubsequence(String s1, String s2, int[][] dp) {
        return findLongestCommonSubsequence(s1, s2, dp, 0, 0);


    }

    private int findLongestCommonSubsequence(String s1, String s2, int[][] dp, int i, int j) {

        if (i >= s1.length() || j >= s2.length())
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        if (dp[i][j] == 0) {
            int a = 0;
            if (s1.charAt(i) == s2.charAt(j)) {
                a = 1 + findLongestCommonSubsequence(s1, s2, dp, i + 1, j + 1);
            }
            int b = findLongestCommonSubsequence(s1, s2, dp, i + 1, j);
            int c = findLongestCommonSubsequence(s1, s2, dp, i, j + 1);

            dp[i][j] = Math.max(a, Math.max(b, c));
        }
        return dp[i][j];
    }
}

