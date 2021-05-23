package divideandconquer;

public class ConvertOneStringIntoAnother {
    public static void main(String[] args) {
        String firstStr = "table";
        String secondStr = "tbres";
        int result = convertString(firstStr, secondStr, 0, 0);
        System.out.println("No. Of operations required = " + result);
    }

    public static int convertString(String firstStr, String secondStr, int i, int j) {

        if (firstStr.length() == i)
            return secondStr.length() - j;

        if (secondStr.length() == j)
            return firstStr.length() - i;

        if (firstStr.charAt(i) == secondStr.charAt(j))
            return convertString(firstStr, secondStr, i + 1, j + 1);

        int x = 1 + convertString(firstStr, secondStr, i + 1, j); //insert
        int y = 1 + convertString(firstStr, secondStr, i, j + 1); //delete
        int z = 1 + convertString(firstStr, secondStr, i + 1, j + 1); //replace

        return Math.min(x, Math.min(y, z));
    }

}
