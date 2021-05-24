package divideandconquer;

public class ZeroOneKnapSack {

    public static void main(String[] args) {
        System.out.println("Finding max profit in Zero One Knapsack problem");

        int[] profit = { 31, 26, 72, 17 };
        int[] weight = { 3, 1, 5, 2 };
        int capacity = 7;

        int result = knapSack(profit, weight, capacity, 0);
        System.out.println("Max Profit = " + result);
    }


    public static int knapSack(int[] profit, int[] weight, int capacity, int index) {

        if (capacity == 0 || index >= profit.length)
            return 0;

        int p1 = 0;
        if (weight[index] <= capacity)
            p1 = profit[index] + knapSack(profit, weight, capacity - weight[index], index + 1);

        int p2 = knapSack(profit, weight, capacity, index + 1);

        return Math.max(p1, p2);
    }
}
