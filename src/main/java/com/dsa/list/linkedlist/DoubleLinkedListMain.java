package list.linkedlist;

public class DoubleLinkedListMain {

    public static void main(String[] args) {
        System.out.println("Starting Double LinkedList Operations");

        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Creating a Double LinkedList");
        list.createDoubleLinkedList(10);
        list.traverse();

        System.out.println();

        System.out.println("Insert few more elements in the list");
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        System.out.println("Insert element at a particular location");
        list.insertAtPos(25, 3);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        System.out.println("Delete a element from a position in the list");
        list.deleteAtPos(4);
        list.traverse();
        list.traverseInReverse();

        System.out.println();

        list.deleteList();

    }
}
