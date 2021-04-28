package list.linkedlist;

import list.node.SingleNode;

public class SingleLinkedList {

    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleLinkedList(SingleNode head, SingleNode tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }


    public void traverse() {
        if(this.head == null) {
            System.out.println("LinkedList is empty");
        }
        else {
            SingleNode tmp = head;
            while(tmp.getNext() != null) {
                System.out.println(tmp.getValue());
                tmp = tmp.getNext();
            }
        }

    }

    public void search(int value) {
        if(this.head == null) {
            System.out.println("LinkedList is empty");
        }
        else {
            SingleNode tmp = head;
            int index = 0;
            while(tmp.getNext() != null) {
                if(tmp.getValue() == value) {
                    System.out.println("Data found at index = " + index++);
                    break;
                }
                tmp = tmp.getNext();
            }
        }
    }

    public void insert(int value) {
        SingleNode newNode = new SingleNode();
        newNode.setValue(value);
        newNode.setNext(null);

        if(this.head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insertAtLoc(int value, int index) {
        SingleNode newNode = new SingleNode();
        newNode.setValue(value);
        newNode.setNext(null);

        if(this.head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }



}
