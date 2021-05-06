package stack;

import stack.node.SingleNode;

public class StackByLinkedList {

    SingleNode head;
    SingleNode tail;

    public void createStack() {
        System.out.println("Creating an empty Linkedlist");
        head = tail = null;
    }

    public void push(int val){
        SingleNode node = new SingleNode();
        node.setValue(val);
        node.setNext(head);

        if(head == null) {
            head = tail = node;
        } else {
            head = node;

        }
        System.out.println(val + " pushed successfully");
    }

    public void pop() {
        if(head == null) {
            System.out.println("Stack is empty. Nothing to Pop");
        } else {
            System.out.println("Popping " + head.getValue());
            head = head.getNext();
        }
    }

    public void peek(){
        if(head == null) {
            System.out.println("Stack is empty. Nothing to peek");
        } else {
            System.out.println("Topmost element is " + head.getValue());
        }
    }

}
