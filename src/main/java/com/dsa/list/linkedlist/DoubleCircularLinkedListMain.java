package list.linkedlist;

public class DoubleCircularLinkedListMain {
    public static void main(String[] args) {

        System.out.println("Starting Double Circular LinkedList operations");

        DoubleCircularLinkedList list = new DoubleCircularLinkedList();

        System.out.println("Create a Double Circular LinkedList");
        list.createDoubleCircularLinkedList(10);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        System.out.println("Insert few more elements");
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        System.out.println("Insert element at particular position");
        list.insertAtPos(25, 2);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        System.out.println("Delete Element from list");
        list.deleteAtPos(4);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        System.out.println("Delete entire list");
        list.deleteList();

        System.out.println(list.getHead());
    }
}
