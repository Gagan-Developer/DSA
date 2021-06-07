package sorting;

import java.util.Arrays;

public class PermutationUsingSorting {

    public static void main(String[] argos) {
        String s1 = "ascii";
        String s2 = "acisi";
        boolean isPerm = isPermutation(s1, s2);
        System.out.println(isPerm);
    }

    private static boolean isPermutation(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        if(sort(s1).equals(sort(s2)))
            return true;
        return false;

    }

    private static String sort(String str) {
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

}
