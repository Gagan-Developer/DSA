package sorting;

public class InsertionSortMain {

    public static void main(String[] args) {

        int[] arr = {10,40,20,65,24,94,04,33,68,2};

        InsertionSort sort = new InsertionSort();
        sort.printArray(arr);
        System.out.println();
        sort.insertionSort(arr);
        System.out.println();
        sort.printArray(arr);

    }
}
