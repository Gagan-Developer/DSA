package list;

public class SumReversedList {

    public static void main(String[] s) {

        SumReversedList rev = new SumReversedList();
        Node list1 = null;
        Node list2 = null;

        //617
        list1 = rev.insert(list1, 6);
        list1 = rev.insert(list1, 1);
        list1 = rev.insert(list1, 7);

        //617
        list2 = rev.insert(list2, 2);
        list2 = rev.insert(list2, 9);
        list2 = rev.insert(list2, 5);

        Node result = rev.addLists(list1, list2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }


    }

    public Node addLists(Node first, Node second) {

        int idx = 0;
        int sum = 0;
        int carry = 0;
        int firstVal = 0;
        int secondVal = 0;

        Node head = null;
        Node currentNode = null;

        while (first != null || second != null) {
            idx++;
            firstVal = (first != null) ? first.val : 0;
            secondVal = (second != null) ? second.val : 0;


            sum = firstVal + secondVal + carry;
            int num = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(num);
            newNode.next = null;

            if (head == null) {
                head = newNode;
                currentNode = head;
            } else {
                currentNode.next = newNode;
                currentNode = newNode;
            }

            first = (first != null) ? first.next : first;
            second = (second != null) ? second.next : second;


        }
        return head;
    }


    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node insert(Node list, int val) {
        Node node = new Node(val);
        node.next = list;
        list = node;
        return list;
    }
}

