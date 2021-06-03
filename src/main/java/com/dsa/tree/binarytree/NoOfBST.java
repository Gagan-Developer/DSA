package tree.binarytree;

public class NoOfBST {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 9;

        NoOfBST obj = new NoOfBST();
        int result = obj.findNoOfBST(n);
        System.out.println("No. of BST trees possible with " + n + " nodes = " + result);
    }

    /**
     * \
     *
     * @param n
     * @return
     */
    private int findNoOfBST(int n) {
        return findCombinations(n);
    }

    /**
     * recursive solution to find the
     * no of BST tree possible for n nodes
     *
     * @param n
     * @return
     */
    private int findCombinations(int n) {

        if (n == 0 || n == 1)
            return 1;

        if (n == 2)
            return 2;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n1 = findCombinations(i - 1);
            int n2 = findCombinations(n - i);

            sum += n1 * n2;
        }
        return sum;
    }
}
