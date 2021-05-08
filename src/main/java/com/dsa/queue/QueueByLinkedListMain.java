package queue;

public class QueueByLinkedListMain {

    public static void main(String[] args) {
        System.out.println("Starting Queue operations");

        QueueByLinkedList queue = new QueueByLinkedList();
        System.out.println("Creating Queue from LinkedList");
        queue.createQueue();

        System.out.println();

        System.out.println("Enqueue few elements in Queue");
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println("Print Queue");
        queue.printQueue();

        System.out.println();

        System.out.println("Peek element");
        queue.peek();

        System.out.println();

        System.out.println("Dequeue elements");
        queue.deQueue();
        queue.deQueue();

        System.out.println("Print Queue");
        queue.printQueue();

        System.out.println();

        System.out.println("Peek element");
        queue.peek();


        System.out.println("Delete queue");
        queue.deleteQueue();

        System.out.println();

        System.out.println("Print Queue");
        queue.printQueue();


    }
}
