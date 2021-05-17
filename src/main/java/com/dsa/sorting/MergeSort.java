package sorting;

public class MergeSort {

    public void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int mid = (right + left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {

        int[] leftArr = new int[mid - left + 2];
        int[] rightArr = new int[right - mid+1];

        for (int idx = 0; idx <= mid-left; idx++) {
            leftArr[idx] = arr[left + idx];
        }

        for (int idx = 0; idx < right-mid; idx++) {
            rightArr[idx] = arr[mid+idx+1];
        }

        leftArr[mid - left + 1] = Integer.MAX_VALUE;
        rightArr[right - mid] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
        }
    }

    public void printArray(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }
}
