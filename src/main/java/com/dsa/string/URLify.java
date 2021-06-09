package string;

public class URLify {
    public static void main(String[] args) {
        String str = "Mr John Smith     ";
        String url = convertToURL(str, 13);
        System.out.println(url);
    }

    private static String convertToURL(String inputStr, int len) {

        int spaceCounter = 0;
        for (int idx = 0; idx < len; idx++) {
            if (inputStr.charAt(idx) == ' ')
                spaceCounter++;
        }

        if (spaceCounter == 0)
            return inputStr.trim();

        int newStrLen = len + 2 * spaceCounter;
        char[] inputArr = new char[newStrLen];
        for (int idx = len - 1; idx >= 0; idx--) {
            if (inputStr.charAt(idx) == ' ') {
                inputArr[--newStrLen] = '0';
                inputArr[--newStrLen] = '2';
                inputArr[--newStrLen] = '%';
            } else {
                inputArr[--newStrLen] = inputStr.charAt(idx);
            }
        }

        return new String(inputArr);
    }
}

