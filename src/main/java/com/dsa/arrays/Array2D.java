package arrays;

public class Array2D {
    int[][] arr = null;

    public Array2D(int row, int col) {
        this.arr = new int[row][col];
    }

    public void populate() {
        int cntr = 0;
        for(int row =0; row< arr.length;row++) {
            for(int col = 0;col <arr[row].length; col++) {
                arr[row][col] = cntr++;
            }
        }
    }

    public void traverse() {
        for(int row =0; row< arr.length;row++) {
            for(int col = 0;col <arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

    public void search(int val) {
        for(int row =0; row< arr.length;row++) {
            for(int col = 0;col <arr[row].length; col++) {
                if(arr[row][col] == val)
                    System.out.println("Value found in row = " + row + " col = " + col);
            }
        }
    }

    public void insert(int val, int row, int col) throws ArrayIndexOutOfBoundsException {
        if(row > arr.length -1 || col > arr[0].length-1) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        arr[row][col] = val;
    }

    public void delete(int row, int col) {
        if(row > arr.length -1 || col > arr[0].length-1) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        arr[row][col] = Integer.MIN_VALUE;
    }

    public void deleteArr() {
        arr = null;
    }
}
