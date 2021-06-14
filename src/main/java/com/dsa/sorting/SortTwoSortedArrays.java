package sorting;

public class SortTwoSortedArrays {
    static int[] a = new int[]{1, 4, 7, 8, 10};
    static int[] b = new int[]{2, 3, 9};

    public static void main(String[] args) {


        SortTwoSortedArrays obj = new SortTwoSortedArrays();
        obj.sort(a, b);

        obj.printArr(a);
        obj.printArr(b);

    }

    // Sorts the array
    public void sort(int[] a, int[] b) {
        for (int i = b.length - 1; i >= 0; i--) {
            if (a[a.length - 1] > b[i]) {
                int last = a[a.length - 1];
                swap(a, b[i]);
                b[i] = last;
            } else {
                break;
            }
        }
    }

    public void swap(int[] arr, int limit) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i - 1] > limit) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = limit;
                break;
            }
        }
    }

    private void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}