package divideandconquer;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println("Finding Longest common subsequence between 2 words");
        String s1 = "rxadmcuvb";
        String s2 = "lrmafcolb";
        int result = findSubsequence(s1, s2, 0, 0);
        System.out.println("Longest Subsequeunce length " + result);

    }

    public static int findSubsequence(String s1, String s2, int i , int j) {

        if(i >= s1.length() || j >= s2.length())
            return 0;

        int z = 0;
        if(s1.charAt(i) == s2.charAt(j))
            z = 1 + findSubsequence(s1, s2, i+1, j+1);

        int x = findSubsequence(s1, s2, i+1, j);
        int y = findSubsequence(s1, s2, i, j+1);


        return Math.max(z, Math.max(x,y));
    }
}
