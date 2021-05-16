package sorting;

public class BucketSortMain {

    public static void main(String[] args) {

        int[] arr = {10,40,20,65,24,94,04,33,68,2};

        BucketSort sort = new BucketSort(arr);
        sort.printArray();
        System.out.println();
        sort.bucketSort();
        System.out.println();
        sort.printArray();

    }
}
