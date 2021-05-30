package arrays;

/**
 * Rotate the array of size n by d elements
 */
public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Input Array ");
        printArr(arr);

        ArrayRotation arrObj = new ArrayRotation();
        int[] output = arrObj.rotate(arr, 2);
        System.out.println("Output Array after rotation ");
        printArr(arr);
    }

    public int[] rotate(int[] arr, int d) {
        if (d > arr.length - 1)
            throw new IllegalArgumentException("Invalid number passed for rotation");

        int len = arr.length;
        int gcd = gcd(len, d);

        int j, k, tmp;
        for (int i = 0; i < gcd; i++) {
            j = i;
            tmp = arr[j];
            while (true) {
                k = j + d;
                if (k >= len)
                    k = k - len;
                if (k == 0)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = tmp;
        }
        return arr;
    }

    private static void printArr(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }


}
