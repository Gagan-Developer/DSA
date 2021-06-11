package string;

public class UniqueString {
    public static void main(String[] args) {
        String inputStr = "ABCA";
        boolean output = isUnique(inputStr);
        System.out.println(output);
    }

    private static boolean isUnique(String inputStr) {
        int x = 0;
        int index = 0;
        for (int idx = 0; idx < inputStr.length(); idx++) {
            index = inputStr.charAt(idx) - 'A';
            if ((x & (1 << index)) == 0)
                x = x | 1 << index;
            else
                return false;
        }
        return true;
    }
}
