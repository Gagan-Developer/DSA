package stack;

public class StackByArray {

    int[] arr;
    int topOfStack;

    public void createStack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    public void insertIntoStack(int val){
        if(isStackFull()) {
            System.out.println("Stack is full. Cannot insert element");
        } else {
            this.arr[topOfStack+1] = val;
            this.topOfStack++;
        }
    }

    public boolean isStackFull() {
        return arr.length == this.topOfStack;
    }

    public boolean isStackEmpty() {
        return this.topOfStack == -1;
    }

    public void push(int val) {
        if(isStackFull()) {
            System.out.println("Stack overflow");
        } else {
            arr[this.topOfStack+1] = val;
            this.topOfStack++;
        }
    }

    public void pop() {
        int val = Integer.MIN_VALUE;
        if(isStackEmpty()) {
            System.out.println("Stack is empty. Returning Junk value");
        } else {
            System.out.println(arr[this.topOfStack]);
            this.topOfStack--;
        }
    }

    public void peek() {
        if(isStackEmpty()) {
            System.out.println("Stack is empty. Nothing to Peek");
        } else {
            System.out.println("Printing top element");
            System.out.println(this.arr[this.topOfStack]);
        }
    }

}
