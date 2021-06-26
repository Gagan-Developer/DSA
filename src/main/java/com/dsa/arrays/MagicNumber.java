package arrays;

public class MagicNumber {

    public static int findIndex(int[] inputArr) {
        return findIndexHelper(inputArr, 0, inputArr.length - 1);
    }

    private static int findIndexHelper(int[] inputArr, int start, int end) {

        if (end < start) return -1;

        int mid = (start + end) / 2;


        int midVal = inputArr[mid];
        if (midVal == mid) return mid;

        int leftIdx = Math.min(mid - 1, midVal);
        int left = findIndexHelper(inputArr, start, leftIdx);
        if (left >= 0) return left;

        int rightIdx = Math.max(mid + 1, midVal);
        int val1 = findIndexHelper(inputArr, rightIdx, end);

        return val1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 10, 11, 12, 12, 13, 13, 14, 14, 14, 15, 15, 23};
        int result = findIndex(arr);
        System.out.println(result);
    }
}

