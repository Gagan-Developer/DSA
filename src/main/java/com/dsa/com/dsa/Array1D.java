package com.dsa;

public class Array1D {

    int[] arr = null;
    public Array1D(int size) {
        arr = new int[10];
    }

    public void populateArr() {
        for(int idx = 0; idx < arr.length ; idx++) {
            arr[idx] = idx;
        }
    }

    public void traverseArr() {
        for(int val : arr)
            System.out.println(val);
    }

    public int searchInArr(int val) {
        if(arr.length < 1) {
            System.out.println("Array is empty");
            return Integer.MIN_VALUE;
        }
        for(int idx = 0 ; idx < arr.length; idx++) {
            if(arr[idx] == val) {
                System.out.println("Found at index = " + idx);
                return idx;
            }
        }
        System.out.println("Value not available in array");
        return Integer.MIN_VALUE;
    }

    public void insert(int val, int idx) {
        if(idx > arr.length)
            System.out.println("Invalid Index");
        else
            arr[idx-1] = val;
    }

    public void deleteItem(int idx) {
        if(idx > arr.length)
            System.out.println("Invalid Index");
        else
            arr[idx] = Integer.MIN_VALUE;
    }

    public void deleteArr() {
        arr = null;
    }
}
