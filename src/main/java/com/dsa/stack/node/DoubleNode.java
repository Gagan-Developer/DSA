package stack.node;

public class DoubleNode {

    private DoubleNode prev;
    private DoubleNode next;
    private int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getPrev() {
        return this.prev;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getNext() {
        return this.next;
    }

}
