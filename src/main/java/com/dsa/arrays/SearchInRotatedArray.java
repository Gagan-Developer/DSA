package arrays;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int item = 2;

        SearchInRotatedArray obj = new SearchInRotatedArray();
        int index = obj.search(arr, item);
        System.out.println("Item found at index " + index);
    }

    private int search(int[] arr, int item) {
        return searchIndex(arr, arr.length - 1, item);
    }

    private int searchIndex(int[] arr, int n, int item) {

        int pivot = findPivot(arr, 0, n - 1);

        if (pivot == -1) {
            return binarySearch(arr, 0, n - 1, item);
        }

        if (arr[pivot] == item) {
            return pivot;
        }

        if (arr[0] <= item) {
            return binarySearch(arr, 0, pivot - 1, item);
        }
        return binarySearch(arr, pivot + 1, n - 1, item);
    }

    private int binarySearch(int[] arr, int start, int end, int item) {
        int mid = (start + end) / 2;

        if (arr[mid] == item)
            return mid;
        else if (arr[mid] > item)
            return binarySearch(arr, start, mid - 1, item);
        else
            return binarySearch(arr, mid + 1, end, item);
    }

    private int findPivot(int[] arr, int l, int r) {
        if (l > r)
            return -1;
        if (l == r)
            return l;

        int mid = (l + r) / 2;

        if (mid < r && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > l && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[l] > arr[mid]) {
            return findPivot(arr, l, mid - 1);
        }
        return findPivot(arr, mid + 1, r);
    }
}
