package queue;

public class QueueByArray {

    int[] arr;
    int topOfQueue;
    int startOfQueue;

    public void createQueue(int size) {
        System.out.println("Creating queue of size = " + size);
        arr = new int[size];
        topOfQueue = -1;
        startOfQueue = -1;
    }

    public boolean isQueueFull() {
        return this.arr.length-1 == topOfQueue;
    }

    public boolean isQueueEmpty() {
        return this.topOfQueue < this.startOfQueue || (this.startOfQueue == -1 && this.topOfQueue == -1);
    }

    public void enqueue(int val) {
        if(isQueueFull()) {
            System.out.println("Queue is full. No further element can be inserted");
        } else {
            if(isQueueEmpty()) {
                this.startOfQueue++;
            }
            this.arr[topOfQueue+1] = val;
            this.topOfQueue++;
        }
    }

    public void deQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else {
            System.out.println("Removed element " + this.arr[startOfQueue]);
            this.startOfQueue++;
        }
    }

    public void peek() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to peek");
        } else {
            System.out.println("Element in the beginning of queue =  " + this.arr[startOfQueue]);
        }
    }

    public void printQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to print");
        } else {
            for(int idx = startOfQueue; idx <= topOfQueue; idx++) {
                System.out.println("Element at index = " + idx + " is = " + this.arr[idx]);
            }
        }
    }

    public void deleteQueue(){
        System.out.println("Deleting queue");
        this.arr = null;
    }




}
