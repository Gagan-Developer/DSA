package sorting;

public class QuickSort {

    public int partition(int[] arr, int p, int q) {

        int pivot = q;
        int i = p - 1;
        for (int idx = p; idx <= q; idx++) {
            if (arr[idx] <= arr[pivot]) {
                i++;
                int tmp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmp;
            }
        }
        return i;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    public void printArray(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }
}
