package arrays;

public class Array2DMain {

    public static void main(String[] args) {
        System.out.println("Starting 2D Array program");

        Array2D arr = new Array2D(3, 3);

        System.out.println("Populating Array");
        arr.populate();
        arr.traverse();

        System.out.println("Inserting Item in array");
        System.out.println("Before inserting");
        arr.traverse();
        arr.insert(93, 2,2);
        System.out.println("After inserting");
        arr.traverse();

        System.out.println("Searching a value");
        arr.search(2);

        System.out.println("Deleting value");
        System.out.println("Before Deleting");
        arr.traverse();
        arr.delete(1,1);
        System.out.println("After Deleting");
        arr.traverse();


        System.out.println("Deleting entire array");
        arr.deleteArr();
        System.out.println("Array = " + arr.arr);
    }
}
