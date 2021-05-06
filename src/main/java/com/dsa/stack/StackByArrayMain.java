package stack;

public class StackByArrayMain {

    public static void main(String[] args) {
        System.out.println("Starting Stack operations");

        StackByArray stack = new StackByArray();
        System.out.println("Create a stack of size 10");
        stack.createStack(10);

        System.out.println("Insert few elements in stack");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Peek the top element");
        stack.peek();

        System.out.println("Pop the element from stack");
        stack.pop();

        System.out.println("Push the element in stack");
        stack.push(60);

        System.out.println("Peek the top element");
        stack.peek();

    }
}
