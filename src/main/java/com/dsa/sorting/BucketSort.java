package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    int[] arr;

    public BucketSort(int[] arr) {
        this.arr = arr;
    }

    public void bucketSort() {

        int noOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer>[] buckets = new ArrayList[noOfBuckets];

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] < min) {
                min = arr[idx];
            } else if (arr[idx] > max) {
                max = arr[idx];
            }
        }

        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i : arr) {
            int bucketNo = (int) Math.ceil((i * (noOfBuckets-1)) / max);
            buckets[bucketNo].add(i);
        }

        System.out.println("Printing bucket before sorting");
        printBuckets(buckets);

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        System.out.println("Printing bucket after sorting");
        printBuckets(buckets);

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int item : bucket) {
                arr[index] = item;
                index++;
            }
        }

    }

    public void printBuckets(ArrayList<Integer>[] buckets) {
        for (ArrayList<Integer> list : buckets) {
            for (int item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
