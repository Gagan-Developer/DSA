package divideandconquer;

public class HouseThief {
    public static void main(String[] args) {
        System.out.println("Finding the houses that the thief will steal from for max profit");
        int[] houseProfit = {6, 7, 1, 30, 8, 2, 4};
        int result = findProfit(0, houseProfit);

        System.out.println("Total profit from stealing " + result);
    }

    public static int findProfit(int index, int[] houseProfit) {
        if(index >= houseProfit.length)
            return 0;

        int x = findProfit(index+1, houseProfit);
        int y = houseProfit[index] + findProfit(index+2, houseProfit);

        int result = Math.max(x,y);
        return result;
    }
}
