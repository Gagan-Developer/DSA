package stack;

public class StackByLinkedListMain {
    public static void main(String[] args) {

        StackByLinkedList stack = new StackByLinkedList();

        System.out.println("Creating a stack");
        stack.createStack();

        System.out.println("Push few items in stack");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Peek the stack");
        stack.peek();

        System.out.println("Pop from stack");
        stack.pop();

        System.out.println("Peek from stack");
        stack.peek();


    }
}
