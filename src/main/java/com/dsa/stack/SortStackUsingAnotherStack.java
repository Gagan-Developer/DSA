package stack;

import java.util.Stack;

public class SortStackUsingAnotherStack {
    public static void main(String[] args) {

        SortStackUsingAnotherStack obj = new SortStackUsingAnotherStack();

        int stackSize = 10;

        System.out.println("Populating Stack");
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < stackSize; i++) {
            s1.push((int) (Math.random() * 10));
            System.out.print(s1.peek() + " ");
        }

        System.out.println();

        obj.sortStack(s1);

        while (!s1.isEmpty())
            System.out.print(s1.pop() + " ");
    }

    private void sortStack(Stack<Integer> oldStack) {
        Stack<Integer> newStack = new Stack<Integer>();
        int count = 0;
        while (!oldStack.isEmpty()) {
            int tmp = oldStack.pop();
            while (!newStack.isEmpty() && newStack.peek() > tmp) {
                oldStack.push(newStack.pop());
                count++;
            }
            newStack.push(tmp);
            while (count != 0) {
                newStack.push(oldStack.pop());
                count--;
            }
        }

        while (!newStack.isEmpty()) {
            oldStack.push(newStack.pop());
        }
    }
}

