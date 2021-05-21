package greedyalgo.coinchange;

import java.util.Arrays;

public class CoinChangeProblem {

    public static void coinChangeProblem(int[] coins, int amount) {

        Arrays.sort(coins);

        int quantity = 0;
        for (int idx = 0; idx < coins.length; idx++) {
            if (amount != 0) {
                int coin = coins[coins.length - idx - 1];
                quantity = amount / coin;
                amount = amount - quantity * coin;
                System.out.println("Coin selected: Value " + coin + " Quantity: " + quantity);
            }
        }
    }

}
