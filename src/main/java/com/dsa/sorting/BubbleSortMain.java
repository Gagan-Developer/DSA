package sorting;

public class BubbleSortMain {
    public static void main(String[] args) {

        int[] arr = {10,40,20,65,24,94,04,33,68,2};

        BubbleSort sort = new BubbleSort();
        sort.printArray(arr);
        System.out.println();
        sort.bubbleSort(arr);
        System.out.println();
        sort.printArray(arr);

    }
}
