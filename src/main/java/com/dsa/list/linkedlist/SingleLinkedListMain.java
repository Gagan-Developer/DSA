package list.linkedlist;

public class SingleLinkedListMain {


    public static void main(String[] args) {
        SingleLinkedList singleList = new SingleLinkedList();

        System.out.println("Creating a Single LinkedList");
        singleList.createSingleLinkedList(10);
        singleList.traverse();

        System.out.println();

        System.out.println("Inserting few values");
        singleList.insert(20);
        singleList.insert(30);
        singleList.insert(40);
        singleList.insert(50);
        singleList.traverse();

        System.out.println();

        System.out.println("Search for a value");
        singleList.search(30);

        System.out.println();

        System.out.println("Insert value at a particular location");
        singleList.insertAtLoc(25, 2);
        singleList.traverse();

        System.out.println();

        System.out.println("Delete a value from LinkedList");
        singleList.delete(40);
        singleList.traverse();

        System.out.println();

        System.out.println("Deleting entire list");
        singleList.deleteList();
        singleList.traverse();

    }
}
