package list.linkedlist;

import list.node.SingleNode;

public class SingleLinkedList {

    private SingleNode head;
    private SingleNode tail;
    private int size;

    public void createSingleLinkedList(int value) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(null);

        head = tail = node;
    }


    public void traverse() {
        if (this.head == null) {
            System.out.println("LinkedList is empty");
        } else {
            SingleNode tmp = head;
            while (tmp != null) {
                System.out.println(tmp.getValue());
                tmp = tmp.getNext();
            }
        }

    }

    public void search(int value) {
        if (this.head == null) {
            System.out.println("LinkedList is empty");
        } else {
            SingleNode tmp = head;
            int index = 0;
            while (tmp.getNext() != null) {
                if (tmp.getValue() == value) {
                    System.out.println("Data found at index = " + index);
                    break;
                }
                index++;
                tmp = tmp.getNext();
            }
        }
    }

    public void insert(int value) {
        SingleNode newNode = new SingleNode();
        newNode.setValue(value);
        newNode.setNext(null);

        if (this.head == null) {
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

        if (this.head == null && this.tail == null) {
            head = tail = newNode;
        } else if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            SingleNode prev = null;
            SingleNode curr = head;
            int idx = 0;
            while (curr != null) {
                if (idx == index) {
                    newNode.setNext(curr);
                    prev.setNext(newNode);
                    break;
                }
                idx++;
                prev = curr;
                curr = curr.getNext();
            }
        }
    }

    public void delete(int value) {
        if (this.head == null) {
            System.out.println("LinkedList is empty");
        } else {
            SingleNode prev = null;
            SingleNode curr = head;
            int index = 0;
            if (head.getValue() == value && head.getNext() == null) {
                head = tail = null;
            } else {
                while (curr != null) {
                    if (curr.getValue() == value) {
                        prev.setNext(curr.getNext());
                        System.out.println("Value deleted");
                        break;
                    } else {
                        prev = curr;
                        curr = curr.getNext();
                    }
                }
            }

        }
    }

    public void deleteList() {
        head = tail = null;
    }

}
