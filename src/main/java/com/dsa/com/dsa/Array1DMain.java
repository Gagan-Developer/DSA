package com.dsa;

public class Array1DMain {

    public static void main(String[] args) {
        System.out.println("Starting Array 1D operations");
        System.out.println("Creating a Blank Array of length 10");
        Array1D array1D = new Array1D(10);

        System.out.println("Populate the array");
        array1D.populateArr();

        System.out.println("Traverse the array");
        array1D.traverseArr();

        System.out.println();
        System.out.println("Insert value in the array");
        System.out.println("Before Insertion");
        array1D.traverseArr();
        array1D.insert(20, 4);
        System.out.println("After Insertion");
        array1D.traverseArr();

        System.out.println();
        System.out.println("Search value in the array");
        array1D.searchInArr(6);

        System.out.println();
        System.out.println("Delete value in the array");
        System.out.println("Before Deletion");
        array1D.traverseArr();
        array1D.deleteItem(7);
        System.out.println("After Deletion");
        array1D.traverseArr();

        System.out.println("Delete array");
        array1D.deleteArr();

        System.out.println();
        System.out.println("Print array object = " + array1D.arr);


    }
}
