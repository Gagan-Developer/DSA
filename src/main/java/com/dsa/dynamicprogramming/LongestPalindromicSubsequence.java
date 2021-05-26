package dynamicprogramming;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s1 = "qazmadamifd";
        int[][] dp = new int[s1.length()][s1.length()];

        LongestPalindromicSubsequence obj = new LongestPalindromicSubsequence();
        int result = obj.longestPalindromicSubsequence(s1, dp);

        System.out.println("Longest common subsequence length = " + result);

    }

    public int longestPalindromicSubsequence(String s1, int[][] dp) {
        return findLongestPalindromicSubsequence(s1, dp, 0, s1.length() - 1);
    }

    private int findLongestPalindromicSubsequence(String s1, int[][] dp, int start, int end) {

        if (start > end)
            return 0;

        if (start == end)
            return 1;

        if (dp[start][end] != 0)
            return dp[start][end];

        if (dp[start][end] == 0) {
            int a = 0;
            if (s1.charAt(start) == s1.charAt(end)) {
                a = 2 + findLongestPalindromicSubsequence(s1, dp, start + 1, end - 1);
            }
            int b = findLongestPalindromicSubsequence(s1, dp, start + 1, end);
            int c = findLongestPalindromicSubsequence(s1, dp, start, end - 1);

            dp[start][end] = Math.max(a, Math.max(b, c));
        }
        return dp[start][end];
    }
}
