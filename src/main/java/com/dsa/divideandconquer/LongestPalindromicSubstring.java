package divideandconquer;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Finding longest palindromic substring");
        String s1 = "sesewmadamrfdwed";
        int result = findPalindromicSubstring(s1,0, s1.length()-1);
        System.out.println("Longest palindromic substring length = " + result);

    }

    public static int findPalindromicSubstring(String s1, int start, int end) {

        if(start > end)
            return 0;
        if(start == end)
            return 1;

        int x = 0;
        if(s1.charAt(start) == s1.charAt(end)) {
            int remainingLen = end -start -1;
            if(remainingLen == findPalindromicSubstring(s1, start+1, end-1))
                x = remainingLen + 2;

        }

        int y = findPalindromicSubstring(s1, start+1, end);
        int z = findPalindromicSubstring(s1, start, end-1);

        return Math.max(x, Math.max(y,z));

    }
}
