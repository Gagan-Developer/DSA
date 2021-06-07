package arrays;

/**
 *
 */
public class StringUniquenessUsingBitwiseOperators {

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
        int checker = 0;
        for (int idx = 0; idx < str.length(); idx++) {
            int x = str.charAt(idx) - 'A';
            if ((checker & (1 << x)) > 0)
                return false;
            checker |= 1 << x;
        }
        return true;
    }

}
