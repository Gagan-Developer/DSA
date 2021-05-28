package dynamicprogramming;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s1 = "abcmadamyhn"; //madam
        int[][] dp = new int[s1.length()][s1.length()];

        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        int result = obj.longestPalindromicSubstring(s1, dp);

        System.out.println("Longest common substring length = " + result);

    }

    public int longestPalindromicSubstring(String s1, int[][] dp) {
        return findLongestPalindromicSubstring(s1, dp, 0, s1.length() - 1);
    }

    private int findLongestPalindromicSubstring(String s1, int[][] dp, int start, int end) {

        if (start > end)
            return 0;

        if (start == end)
            return 1;

        if (dp[start][end] != 0)
            return dp[start][end];

        if (dp[start][end] == 0) {
            int a = 0;
            if (s1.charAt(start) == s1.charAt(end)) {
                int remainingLen = findLongestPalindromicSubstring(s1, dp, start + 1, end - 1);
                if (remainingLen + 2 == end - start + 1)
                    a = 2 + remainingLen;
            }
            int b = findLongestPalindromicSubstring(s1, dp, start + 1, end);
            int c = findLongestPalindromicSubstring(s1, dp, start, end - 1);

            dp[start][end] = Math.max(a, Math.max(b, c));
        }
        return dp[start][end];
    }
}
