package string;

public class StringCompressor {
    public static void main(String[] argos) {
        String compressedStr = compress("aaabbbeedraaa");
        System.out.println(compressedStr);
    }

    private static String compress(String s) {
        if (s.length() == 0)
            return "";

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i <= s.length() && j <= s.length()) {

            if (j == s.length()) {
                return sb.append(s.charAt(i)).append(j - i).toString();
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                sb.append(s.charAt(i)).append(j - i);
                i = j;
            }
        }
        return sb.toString();
    }
}