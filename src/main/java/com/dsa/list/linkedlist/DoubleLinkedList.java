package list.linkedlist;

import list.node.DoubleNode;

public class DoubleLinkedList {

    private DoubleNode head;
    private DoubleNode tail;
    private int size = 0;

    public DoubleNode getHead() {
        return this.head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return this.tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return this.size;
    }

    public void createDoubleLinkedList(int value) {
        DoubleNode node = new DoubleNode();
        node.setValue(value);
        node.setNext(null);
        node.setPrev(null);

        this.setHead(node);
        this.setTail(node);

        size++;
    }

    public void traverse() {
        System.out.println("Traversing List");
        DoubleNode tmp = head;
        for (int idx = 0; idx < size; idx++) {
            System.out.println("Element at index = " + idx + " is " + tmp.getValue());
            tmp = tmp.getNext();
        }
    }

    public void traverseInReverse() {
        System.out.println("Traversing list in reverse");
        DoubleNode tmp = tail;
        for (int idx = size - 1; idx >= 0; idx--) {
            System.out.println("Element at index = " + idx + " is " + tmp.getValue());
            tmp = tmp.getPrev();

        }
    }

    public void insert(int value) {
        DoubleNode node = new DoubleNode();
        node.setValue(value);

        node.setNext(null);
        node.setPrev(this.getTail());
        tail.setNext(node);
        this.setTail(node);

        size++;
    }

    public void insertAtPos(int value, int pos) {
        DoubleNode node = new DoubleNode();
        node.setValue(value);

        if (size < pos)
            throw new IllegalArgumentException();

        DoubleNode tmp = head;
        for (int idx = 1; idx < pos - 1; idx++) {
            tmp = tmp.getNext();
        }

        node.setPrev(tmp);
        node.setNext(tmp.getNext());
        tmp.getNext().setPrev(node);
        tmp.setNext(node);

        size++;
    }

    public void deleteAtPos(int pos) {
        if (size < pos)
            throw new IllegalArgumentException();

        DoubleNode tmp = head;
        for (int idx = 0; idx < pos - 1; idx++) {
            tmp = tmp.getNext();
        }

        tmp.getPrev().setNext(tmp.getNext());
        tmp.getNext().setPrev(tmp.getPrev());

        size--;

    }

    public void deleteList() {
        head = tail = null;
        System.out.println("List Deleted successfully");
    }


}
