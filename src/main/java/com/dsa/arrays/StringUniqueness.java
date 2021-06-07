package arrays;

/**
 *
 */
public class StringUniqueness {
    public static void main(String[] args) {
        String inputStr = "GOOGLE";
        boolean isUnique = checkUniqueness(inputStr);
        System.out.println(isUnique);
    }

    /**
     * Checks if string contains all unique characters
     *
     * @param str
     * @return
     */
    private static boolean checkUniqueness(String str) {
        int strLen = str.length();
        int[] arr = new int[26];

        for (int idx = 0; idx < strLen; idx++) {
            int x = str.charAt(idx) - 'A';
            if (arr[x] == 1)
                return false;
            arr[x] = 1;
        }
        return true;
    }
}
