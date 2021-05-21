package greedyalgo.coinchange;

public class CoinChangeProblemMain {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 50, 100, 500, 2000};
        int amount = 2343;

        System.out.println("Available coins " + coins);
        System.out.println("Amount " + amount);

        CoinChangeProblem.coinChangeProblem(coins, amount);
    }
}
