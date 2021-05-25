package dynamicprogramming;

public class NumberFactors {

    public static void main(String[] args) {
        int num = 7;
        int[] dp = new int[num+1];
        int result = findNoOfWays(num, dp);
        System.out.println("Number of ways to get the numbers from factor 1,3 and 4 are = " + result);
    }

    public static int findNoOfWays(int num, int[] dp) {

        if(num < 0)
            return 0;
        if(num ==0 || num == 1 || num == 2)
            return 1;
        if(num == 3)
            return 2;

        if(dp[num] == 0) {
            int a = findNoOfWays(num-1, dp);
            int b = findNoOfWays(num-3, dp);
            int c = findNoOfWays(num-4, dp);

            dp[num] = a + b + c;
        }

        return dp[num];
    }
}
