package divideandconquer;

public class NumberFactor {

    public static void main(String[] args) {
        System.out.println("Finding number of ways a number can be constructed from subsets");
        int result = numberOfWays(4);
        System.out.println("No of ways possible " + result);
    }

    public static int numberOfWays(int num) {
        if (num < 0)
            return 0;
        else if(num == 1 || num ==0)
            return 1;
        else if(num == 3)
            return 2;

        int x = numberOfWays(num - 1);
        int y = numberOfWays(num - 3);
        int z = numberOfWays(num - 4);

        int result = x + y + z;
        return result;

    }
}
