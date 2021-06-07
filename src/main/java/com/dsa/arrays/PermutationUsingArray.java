package arrays;

public class PermutationUsingArray {
    public static void main(String[] argos) {
        String s1 = "ascii";
        String s2 = "acisi";
        boolean isPerm = isPermutation(s1, s2);
        System.out.println(isPerm);
    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] countArr = new int[256]; // Assuming ASCII
        for (int i = 0; i < s1.length(); i++) {
            countArr[s1.charAt(i)]++;
        }

        for (int j = 0; j < s2.length(); j++) {
            int count = countArr[s2.charAt(j)];
            if (count <= 0)
                return false;
            countArr[s2.charAt(j)]--;
        }

        for (int k = 0; k < countArr.length; k++) {
            int count = countArr[k];
            if (count != 0)
                return false;
        }
        return true;
    }
}
