package queue;

public class CircularQueueByArrayMain {
    public static void main(String[] args) {
        System.out.println("Starting Queue operations");
        CircularQueueByArray queue = new CircularQueueByArray();

        System.out.println("Creating a queue of size 5");
        queue.createQueue(5);

        System.out.println();

        System.out.println("Enqueue element in queue");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println();

        System.out.println("Printing element in queue");
        queue.printQueue();

        System.out.println();

        System.out.println("Peek in the queue");
        queue.peek();

        System.out.println();

        System.out.println("Dequeue element from the queue");
        queue.deQueue();
        queue.deQueue();

        System.out.println();

        System.out.println("Peek in the queue");
        queue.peek();

        System.out.println();

        System.out.println("Enqueue element in queue");
        queue.enqueue(70);
        queue.enqueue(80);

        System.out.println();

        System.out.println("Printing element in queue");
        queue.printQueue();

        System.out.println();

        System.out.println("Peek in the queue");
        queue.peek();

        System.out.println();

        System.out.println("Empty the queue");
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        System.out.println();

        System.out.println("Delete entire queue");
        queue.deleteQueue();
    }
}
