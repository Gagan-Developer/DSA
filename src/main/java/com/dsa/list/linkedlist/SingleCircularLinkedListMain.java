package list.linkedlist;

public class SingleCircularLinkedListMain {

    public static void main(String[] args) {

        System.out.println("Starting Single Circular LinkedList Operations");

        System.out.println("Creating a Single Circular LinkedList");
        SingleCircularLinkedList circList = new SingleCircularLinkedList();
        circList.createSingleCircularLinkedList();
        circList.traverse();

        System.out.println();


        System.out.println("Inserting element in the list");
        circList.insertIntoLinkedList(10);
        circList.insertIntoLinkedList(20);
        circList.insertIntoLinkedList(30);
        circList.insertIntoLinkedList(40);
        circList.insertIntoLinkedList(50);

        System.out.println("Traversing after insertion");
        circList.traverse();

        System.out.println();


        System.out.println("Searching data in LinkedList");
        circList.searchValInLinkedList(20);

        System.out.println();

        System.out.println("Searching first index");
        circList.searchValInLinkedList(10);

        System.out.println();

        System.out.println("Searching last index");
        circList.searchValInLinkedList(50);

        System.out.println();

        System.out.println("Inserting value at a particular index");
        circList.insertAtLocIntoLinkedList(60, 3);
        circList.traverse();

        System.out.println();

        System.out.println("Deleting value");
        circList.deleteNode(40);
        circList.traverse();

        System.out.println();

        System.out.println("Delete entire linkedlist");
        circList.doesLinkedListExists();

    }
}
