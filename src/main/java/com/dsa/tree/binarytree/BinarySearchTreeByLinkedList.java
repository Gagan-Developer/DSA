package tree.binarytree;

import tree.binarytree.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {

    BinaryNode root;

    public void createBST() {
        this.root = null;
    }

    public BinaryNode getRoot() {
        return this.root;
    }

    public boolean isTreeEmpty() {
        return this.getRoot() == null;
    }

    public void insert(int value) {
        insert(getRoot(), value);
    }

    public void insert(BinaryNode currNode, int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        node.setLeft(null);
        node.setRight(null);

        if (isTreeEmpty()) {
            System.out.println("Tree is empty. Inserting node as root node");
            node.setLeft(null);
            node.setRight(null);
            this.root = node;
            return;
        }


        while (currNode != null) {
            if (currNode.getValue() >= value) {
                BinaryNode leftNode = currNode.getLeft();
                if (leftNode == null) {
                    currNode.setLeft(node);
                    return;
                }
                insert(leftNode, value);
                return;
            } else {
                BinaryNode rightNode = currNode.getRight();
                if (rightNode == null) {
                    currNode.setRight(node);
                    return;
                }
                insert(rightNode, value);
                return;
            }
        }
    }

    public void search(int value) {
        if (isTreeEmpty()) {
            System.out.println("Tree is empty. Nothing to search");
            return;
        }

        BinaryNode node = getRoot();
        while (node != null) {
            int currNodeVal = node.getValue();
            if (currNodeVal == value) {
                System.out.println("Element found in tree");
                return;
            }

            if (currNodeVal > value) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
        }
        System.out.println("Value not present in tree.");
    }

    private BinaryNode minimumNodeOfRightSubTree(BinaryNode node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public void deleteNode(int value) {
        deleteBSTNode(getRoot(), value);
    }

    public void deleteBSTNode(BinaryNode currNode, int value) {
        if (isTreeEmpty()) {
            System.out.println("Tree is empty.Nothing to delete");
            return;
        }

        if(currNode.getLeft() == null && currNode.getRight() == null && currNode.getValue() == value) {
            currNode = null;
            return;
        }

        int currNodeVal = currNode.getValue();

        if (currNodeVal == value) {
            BinaryNode minNode = minimumNodeOfRightSubTree(currNode);
            System.out.println(minNode.getValue());
            currNode.setValue(minNode.getValue());
            deleteBSTNode(currNode.getRight(), minNode.getValue());
            return;
        }

        if (currNodeVal > value) {
            deleteBSTNode(currNode.getLeft(), value);
        } else {
            deleteBSTNode(currNode.getRight(), value);
        }
    }

    public void deleteBST() {
        this.root = null;
        System.out.println("Tree Deleted ");
    }

    public void levelOrderTraversal() {
        if (isTreeEmpty()) {
            System.out.println("Tree is empty. Nothing to print");
            return;
        }

        BinaryNode node = getRoot();
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(node);

        while (!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if (currNode == null)
                continue;
            System.out.print(currNode.getValue() + " ");
            queue.add(currNode.getLeft());
            queue.add(currNode.getRight());
        }
    }
}
