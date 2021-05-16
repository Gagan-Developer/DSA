package sorting;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        int indexToUpdate = arr.length-1;
        for(int i = 0 ; i < arr.length; i++) {
            int maxIndex = 0;
            for(int j = 1 ; j < arr.length - i; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = arr[maxIndex];
            arr[maxIndex] = arr[indexToUpdate];
            arr[indexToUpdate] = tmp;
            indexToUpdate--;
        }
    }

    public void printArray(int[] arr) {
        if(arr != null && arr.length > 0) {
            for(int idx = 0; idx < arr.length; idx++) {
                System.out.print(arr[idx] + " ");
            }
        }
    }
}
