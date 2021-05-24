package divideandconquer;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        System.out.println("Finding longest palindromic subsequence");
        String s1 = "semrdarduaimwfd";
        int result = findPalindromicSubsequence(s1,0, s1.length()-1);
        System.out.println("Longest palindromic subsequence length = " + result);

    }

    public static int findPalindromicSubsequence(String s1, int start, int end) {

        if(start > end || end < 0 || start > s1.length()-1)
            return 0;
        if(start == end)
            return 1;

        int x = 0;
        if(s1.charAt(start) == s1.charAt(end))
            x = 2 + findPalindromicSubsequence(s1, start+1, end-1);

        int y = findPalindromicSubsequence(s1, start+1, end);
        int z = findPalindromicSubsequence(s1, start, end-1);

        return Math.max(x, Math.max(y,z));

    }
}
