package dynamicprogramming;

public class ZeroOneKnapsack {

    public static void main(String[] args) {
        int capacity = 7;
        int[] value = {31, 26, 72, 17};
        int[] weight = {3, 1, 5, 2};

        ZeroOneKnapsack obj = new ZeroOneKnapsack();

        int result = obj.findKnapsack(value, weight, capacity);
        System.out.println("Max value possible = " + result);
    }

    public int findKnapsack(int[] value, int[] weight, int capacity) {
        int[][] dp = new int[value.length][capacity + 1];
        return maximizeKnapsack(value, weight, capacity, dp, 0);
    }

    private int maximizeKnapsack(int[] value, int[] weight, int capacity, int[][] dp, int index) {

        if (index >= value.length || capacity < 0)
            return 0;

        if (dp[index][capacity] != 0)
            return dp[index][capacity];

        if (dp[index][capacity] == 0) {
            if (capacity > 0 && capacity >= weight[index]) {
                int v1 = value[index] + maximizeKnapsack(value, weight, capacity - weight[index], dp, index + 1);
                int v2 = maximizeKnapsack(value, weight, capacity, dp, index + 1);

                dp[index][capacity] = Math.max(v1, v2);
            }
        }
        return dp[index][capacity];
    }

}
