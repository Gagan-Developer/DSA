package heap;

public class HeapByArrayMain {
    public static void main(String[] args) {
        System.out.println("Starting Heap operations");

        System.out.println("Creating heap of size 10");
        HeapByArray heap = new HeapByArray(10);

        System.out.println("-----------------");

        System.out.println("Inserting element in heap");
        heap.insert(50);
        heap.insert(20);
        heap.insert(300);
        heap.insert(45);
        heap.insert(200);
        heap.insert(10);
        heap.insert(40);
        heap.insert(350);
        heap.insert(5);
        heap.insert(75);


        System.out.println("-----------------");

        System.out.println("Traverse heap");
        heap.levelOrderTraversal();


        System.out.println("-----------------");
        System.out.println("Delete head of heap");
        heap.extractHeadOfHeap();

        System.out.println("-----------------");
        System.out.println("Traverse heap");
        heap.levelOrderTraversal();


        System.out.println("-----------------");
        System.out.println("print top of heap");
        heap.peek();

        System.out.println("-----------------");
        System.out.println("delete heap");
        heap.deleteHeap();

    }

}
