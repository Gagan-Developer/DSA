package list.linkedlist;

import list.node.SingleNode;

public class SingleCircularLinkedList {

    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleNode getHead() {
        return this.head;
    }

    public SingleNode getTail() {
        return this.tail;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public void createSingleCircularLinkedList() {
        setHead(null);
        setTail(null);
    }

    public boolean doesLinkedListExists() {
        return getHead() != null;
    }

    public void insertIntoLinkedList(int val) {

        SingleNode node = new SingleNode();
        node.setValue(val);

        if (!doesLinkedListExists()) {
            node.setNext(node);
            setHead(node);
            setTail(node);
        } else {
            tail.setNext(node);
            node.setNext(getHead());
            setTail(node);
        }
        size++;
    }

    public void insertAtLocIntoLinkedList(int val, int loc) {
        if (!doesLinkedListExists()) {
            if (loc > 0)
                System.out.println("LinkedList does not exist. Can't insert at loc = " + loc);
            else
                insertIntoLinkedList(val);
        } else {
            SingleNode node = new SingleNode();
            node.setValue(val);
            SingleNode tmpNode = head;


            for (int idx = 0; idx < size; idx++) {
                if (idx == loc - 1) {
                    node.setNext(tmpNode.getNext());
                    if (loc == 0)
                        head = node;
                    else
                        tmpNode.setNext(node);
                    break;
                }
                idx++;
                tmpNode = tmpNode.getNext();
            }
            size++;
        }
    }

    public void searchValInLinkedList(int val) {

        if (!doesLinkedListExists()) {
            System.out.println("LinkedList is empty");
        } else {
            SingleNode tmp = head;
            for (int idx = 0; idx < size; idx++) {
                if (tmp.getValue() == val) {
                    System.out.println("Value found at index = " + idx);
                    break;
                }
                tmp = tmp.getNext();
            }
        }
    }

    public void traverse() {
        SingleNode node = head;
        for (int idx = 0; idx < size; idx++) {
            System.out.println("Value at index = " + idx + " is " + node.getValue());
            node = node.getNext();
        }
    }

    public void deleteNode(int val) {
        if (!doesLinkedListExists()) {
            System.out.println("LinkedList is empty. Cannot delete node");
        } else {
            SingleNode prev = null;
            SingleNode curr = head;
            for (int idx = 0; idx < size; idx++) {
                if (curr.getValue() == val) {
                    if (curr == head && curr == tail) {
                        head = tail = curr.getNext();
                    } else if (curr == head) {
                        head = curr.getNext();
                    } else if (curr == tail) {
                        tail = prev;
                    } else {
                        prev.setNext(curr.getNext());
                    }
                    break;
                }
                prev = curr;
                curr = curr.getNext();
            }
            size--;
        }
    }


}
