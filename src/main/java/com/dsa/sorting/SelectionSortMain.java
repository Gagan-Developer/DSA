package sorting;

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] arr = {10,40,20,65,24,94,04,33,68,2};

        SelectionSort sort = new SelectionSort();
        sort.printArray(arr);
        System.out.println();
        sort.selectionSort(arr);
        System.out.println();
        sort.printArray(arr);
    }
}
