package arrays;

public class ArrayReversalRotation {
    public static void main(String[] args) {

        ArrayReversalRotation obj = new ArrayReversalRotation();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("Array before rotation");
        obj.printArr(arr);

        System.out.println("Rotate array by 2nd element");

        obj.reverse(arr, 0, d - 1);
        obj.reverse(arr, d, arr.length - 1);
        obj.reverse(arr, 0, arr.length - 1);

        System.out.println("Array after rotation :");
        obj.printArr(arr);

    }

    public void reverse(int[] arr, int start, int end) {
        if (start >= end)
            return;

        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    private void printArr(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
