package queue;

public class CircularQueueByArray {

    int[] arr;
    int topOfQueue;
    int startOfQueue;

    public void createQueue(int size) {
        arr = new int[size];
        this.topOfQueue = -1;
        this.startOfQueue = -1;
    }

    public boolean isQueueFull() {
        return (this.startOfQueue == 0 && this.topOfQueue == this.arr.length-1) ||
                (this.startOfQueue - 1 == this.topOfQueue);
    }

    public boolean isQueueEmpty() {
        return this.startOfQueue == this.topOfQueue && this.startOfQueue == -1;
    }

    public void enqueue(int val) {
        if(isQueueFull()) {
            System.out.println("Queue is full. No further element can be inserted");
        } else {
            if(isQueueEmpty()) {
                this.startOfQueue++;
                this.topOfQueue++;
                this.arr[this.topOfQueue] = val;
            } else if(this.topOfQueue == this.arr.length-1) {
                this.topOfQueue = 0;
                this.arr[this.topOfQueue] = val;
            } else {
                this.topOfQueue++;
                this.arr[this.topOfQueue] = val;
            }
            System.out.println("Value inserted at index = " + this.topOfQueue + " is = " + val);
        }
    }

    public void deQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else {
            System.out.println("Removed element " + this.arr[this.startOfQueue]);
            if(this.startOfQueue == this.topOfQueue) {
                this.startOfQueue = -1;
                this.topOfQueue = -1;
            } else if (this.startOfQueue == this.arr.length-1){
                this.startOfQueue = 0;
            } else {
                this.startOfQueue++;
            }
        }
    }

    public void peek() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to peek");
        } else {
            System.out.println("Element in the beginning of queue =  " + this.arr[startOfQueue] + " at index = " + startOfQueue);
        }
    }

    public void printQueue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty. Nothing to print");
        } else {
            if(this.startOfQueue <= this.topOfQueue) {
                for(int idx = startOfQueue; idx <= topOfQueue; idx++) {
                    System.out.println("Element at index = " + idx + " is = " + this.arr[idx]);
                }
            } else {
                for(int idx = startOfQueue; idx < this.arr.length; idx++) {
                    System.out.println("Element at index = " + idx + " is = " + this.arr[idx]);
                }
                for(int idx = 0; idx < startOfQueue; idx++) {
                    System.out.println("Element at index = " + idx + " is = " + this.arr[idx]);
                }
            }
        }
    }

    public void deleteQueue(){
        System.out.println("Deleting queue");
        this.arr = null;
    }
}
