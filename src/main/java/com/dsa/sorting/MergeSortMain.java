package sorting;

public class MergeSortMain {
    public static void main(String[] args) {
        int[] arr = {10,40,20,65,24,94,04,33,68,2};

        MergeSort sort = new MergeSort();
        sort.printArray(arr);
        System.out.println();
        sort.mergeSort(arr, 0, arr.length-1);
        System.out.println();
        sort.printArray(arr);

    }
}
