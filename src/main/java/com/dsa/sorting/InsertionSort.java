package sorting;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int tmp = arr[i];
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
    }

    public void printArray(int[] arr) {
        if (arr.length <= 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }

    }
}
