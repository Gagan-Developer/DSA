package list.linkedlist;

import list.node.DoubleNode;

public class DoubleCircularLinkedList {

    private DoubleNode head;
    private DoubleNode tail;
    private int size = 0;

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createDoubleCircularLinkedList(int value) {
        DoubleNode node = new DoubleNode();
        node.setValue(value);
        node.setNext(node);
        node.setPrev(node);

        head = tail = node;
        size++;
    }

    public void insert(int val) {
        if(head == null)
            createDoubleCircularLinkedList(val);
        else {
            DoubleNode node = new DoubleNode();
            node.setValue(val);

            DoubleNode tmp = head;
            for(int idx = 0; idx < size-1; idx++) {
                tmp = tmp.getNext();
            }

            node.setNext(this.getHead());
            node.setPrev(tmp);
            tmp.setNext(node);
            this.setTail(node);

            size++;

        }
    }

    public void insertAtPos(int val, int pos) {

        if(pos > size)
            throw new IllegalArgumentException();
        DoubleNode node = new DoubleNode();
        node.setValue(val);

        DoubleNode tmp = head;

        for(int idx = 0 ; idx < pos; idx++) {
            tmp = tmp.getNext();
        }

        node.setNext(tmp);
        node.setPrev(tmp.getPrev());
        tmp.getPrev().setNext(node);
        tmp.setPrev(node);

        size++;
    }

    public void traverse() {
        System.out.println("Traversing the list");
        DoubleNode tmp = head;
        for(int idx = 0 ; idx < size; idx++) {
            System.out.println("Element at index = " + idx + " is = " + tmp.getValue());
            tmp = tmp.getNext();
        }
    }

    public void traverseInReverse() {
        System.out.println("Traversing the list in reverse");
        DoubleNode tmp = tail;
        for(int idx = 0 ; idx < size; idx++) {
            System.out.println("Element at index = " + idx + " is = " + tmp.getValue());
            tmp = tmp.getPrev();
        }
    }

    public void deleteAtPos(int pos) {
        DoubleNode tmp = head;
        for(int idx = 0; idx < pos; idx++) {
            tmp = tmp.getNext();
        }

        tmp.getPrev().setNext(tmp.getNext());
        tmp.getNext().setPrev(tmp.getPrev());

        size--;
    }

    public void deleteList() {
        this.getHead().setPrev(null);
        this.getTail().setNext(null);
        this.setHead(null);
        this.setTail(null);

    }
}
