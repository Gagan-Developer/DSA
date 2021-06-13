package stack;

import java.util.Stack;

public class CreateSortedStack<T> {

    Stack<T> s1 = new Stack<>();
    Stack<T> s2 = new Stack<>();

    public void push(T val) {
        if (s1.isEmpty() || (Integer) s1.peek() > (Integer) val) {
            s1.push(val); // Stack is empty. First element inserted.
        } else { // Stack already has elements. Needed shuffling
            while (!s1.isEmpty()) {
                if ((Integer) s1.peek() < (Integer) val) {
                    T oldVal = s1.pop();
                    s2.push(oldVal);
                } else {
                    break;
                }

            }
            s2.push(val);

            while (!s2.isEmpty()) {
                T newVal = s2.pop();
                s1.push(newVal);
            }
        }

    }

    public T pop() {
        return s1.pop();
    }

    public T peek() {
        if (s1.isEmpty())
            throw new IllegalStateException();
        return s1.peek();
    }

    public boolean isEmpty() {
        if (s1.size() == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        CreateSortedStack<Integer> stack = new CreateSortedStack<>();
        int[] inputArr = {9, 2, 5, 11, 8, 1, 20};

        System.out.print("Before ");
        for (int item : inputArr) {
            System.out.print(item + " ");
            stack.push(item);
        }

        System.out.println();
        System.out.print("After ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

