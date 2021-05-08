package queue;

import queue.node.SingleNode;

public class QueueByLinkedList {

    SingleNode head;
    SingleNode tail;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }


    public void createQueue() {
        this.setHead(null);
        this.setTail(null);
    }

    public void enQueue(int val) {
        SingleNode node = new SingleNode();
        node.setVal(val);
        node.setNext(null);

        if (this.getHead() == null) {
            this.setHead(node);
            this.setTail(node);
        } else {
            this.getTail().setNext(node);
            tail = node;
        }
    }

    public void deQueue() {
        if (this.isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else {
            System.out.println("Dequeue element = " + head.getVal());
            head = head.getNext();
        }
    }

    public void printQueue() {
        if (this.isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else {
            SingleNode tmp = head;
            int index = 0;
            while (tmp != null) {
                System.out.println("Element at index = " + index + " is " + tmp.getVal());
                tmp = tmp.getNext();
                index++;
            }
        }
    }

    public void peek() {
        if (this.isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to peek");
        } else {
            System.out.println("Element at start = " + head.getVal());
        }
    }

    public boolean isQueueEmpty() {
        return this.getHead() == null;
    }

    public void deleteQueue() {
        this.setHead(null);
        this.setTail(null);
    }
}
