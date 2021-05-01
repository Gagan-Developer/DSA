package list.linkedlist;

import list.node.SingleNode;

public class SingleCircularLinkedList {

    private SingleNode head;
    private SingleNode tail;

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

        if(!doesLinkedListExists()) {

            node.setNext(node);
            setHead(node);
            setTail(node);
        } else {
            node.setNext(getTail());
            setTail(node);
        }
    }

    public void insertAtLocIntoLinkedList(int val, int loc) {
        if(!doesLinkedListExists()) {
            if(loc > 0)
                System.out.println("LinkedList does not exist. Can't insert at loc = " + loc);
            else
                insertIntoLinkedList(int val);
        } else {
            SingleNode node = new SingleNode();
            node.setValue(val);
            SingleNode tmpNode = head;
            int idx = 0;
            while(tmpNode != getTail()) {
                if(idx == loc) {
                    node.setNext(tmpNode.getNext());
                    tmpNode.setNext(node);
                } else {
                    idx++;
                    tmpNode = tmpNode.getNext();
                }


            }
        }
    }

    public int searchValInLinkedList(int va) {

    }


}
