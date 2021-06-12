package stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {

    ArrayList<Stack<Integer>> setOfStacks = new ArrayList<>();
    int capacity;

    public StackOfPlates(int capacity) {
        this.capacity = capacity;
    }

    public void push(int data) {
        if (isFull()) {
            Stack<Integer> newStack = new Stack();
            newStack.push(data);
            setOfStacks.add(newStack);
        } else {
            Stack currStack = getCurrentStack();
            currStack.push(data);
        }
    }

    public int pop() {
        int item = Integer.MIN_VALUE;
        if (isEmpty()) {
            System.out.println("Nothing to Pop");
        } else {
            Stack<Integer> currStack = getCurrentStack();
            item = currStack.pop();

            if (currStack.size() == 0)
                setOfStacks.remove(currStack);
        }
        return item;

    }

    public boolean isFull() {
        int size = setOfStacks.size();
        if (size > 0) {
            Stack currStack = setOfStacks.get(size - 1);
            if (currStack.size() == capacity)
                return true;
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        if (setOfStacks.size() == 0)
            return true;
        return false;
    }

    private Stack<Integer> getCurrentStack() {
        int size = setOfStacks.size();
        return setOfStacks.get(size - 1);

    }

    private void printStack() {
        for (Stack<Integer> stack : setOfStacks) {
            for (int item : stack) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        StackOfPlates stacks = new StackOfPlates(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        stacks.push(8);
        stacks.push(9);
        stacks.push(10);
        stacks.push(11);

        System.out.println("ELEMENT POP " + stacks.pop());
        System.out.println("ELEMENT POP " + stacks.pop());
        System.out.println("ELEMENT POP " + stacks.pop());

        stacks.printStack();


    }
}

