package list;

public class PartitionList {

    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;

    public static void main(String[] args) {
        PartitionList par = new PartitionList();
        par.insert(7);
        par.insert(6);
        par.insert(2);
        par.insert(5);
        par.insert(3);
        par.insert(8);
        par.insert(1);

        par.printList();

        System.out.println("==========PRINT LIST============");

        par.partition(5);

        par.printList();
    }


    public void insert(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void partition(int val) {

        Node nodeI = head;
        Node nodeJ = head.next;

        while (nodeJ != null) {
            if (nodeI.data >= val) {
                if (nodeI.data >= val && nodeJ.data < val) {
                    int tmp = nodeJ.data;
                    nodeJ.data = nodeI.data;
                    nodeI.data = tmp;

                    nodeI = nodeI.next;
                    nodeJ = nodeI.next;
                } else {
                    nodeJ = nodeJ.next;
                }
            } else {
                nodeI = nodeI.next;
                nodeJ = nodeI.next;
            }
        }
    }

    private void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
