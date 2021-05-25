package dynamicprogramming;

public class HouseThiefProblem {
    public static void main(String[] args) {
        int[] value = {6, 7, 1, 30, 8, 2, 4};
        int[] dp = new int[value.length + 1];
        int result = findTheftValue(value, dp, 0);
        System.out.println("Max Theft Value = " + result);
    }

    public static int findTheftValue(int[] value, int[] dp, int index) {

        if(index >=  value.length) {
            return 0;
        }

        if(dp[index] == 0) {
            int v1 = value[index] + findTheftValue(value, dp, index+2);
            int v2 = findTheftValue(value, dp, index+1);

            dp[index] = Math.max(v1, v2);
        }
        return dp[index];
    }
}
