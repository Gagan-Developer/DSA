package tree.binarytree;

import tree.binarytree.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {

    BinaryNode root;

    public void createBinaryTree() {
        root = null;
    }

    public void insert(int val) {
        BinaryNode node = new BinaryNode();
        node.setValue(val);

        if (root == null) {
            node.setLeft(null);
            node.setRight(null);
            root = node;
            System.out.println("Successfully inserted value as root node");
        } else {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);

            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.getLeft() == null) {
                    presentNode.setLeft(node);
                    System.out.println("Successfully inserted value as left child of " + presentNode.getValue());
                    break;
                } else if (presentNode.getRight() == null) {
                    presentNode.setRight(node);
                    System.out.println("Successfully inserted value as right child of " + presentNode.getValue());
                    break;
                } else {
                    queue.add(presentNode.getLeft());
                    queue.add(presentNode.getRight());
                }
            }
        }
    }

    public void search(int val) {
        if (root == null) {
            System.out.println("Tree is empty. Nothing to search");
        } else {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.getValue() == val) {
                    System.out.println("Value " + val + " found in the tree");
                    return;
                } else {
                    if (presentNode.getLeft() != null) {
                        queue.add(presentNode.getLeft());
                    }
                    if (presentNode.getRight() != null) {
                        queue.add(presentNode.getRight());
                    }
                }
            }
            System.out.println("Value " + val + " not found in the tree");
        }
    }

    private BinaryNode getDeepestNode() {
        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        } else {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            BinaryNode presentNode = null;
            while (!queue.isEmpty()) {
                presentNode = queue.remove();
                if (presentNode.getLeft() != null)
                    queue.add(presentNode.getLeft());
                if (presentNode.getRight() != null)
                    queue.add(presentNode.getRight());
            }
            return presentNode;
        }
    }

    private void deleteDeepestNode() {
        if (root == null) {
            System.out.println("Tree is empty. Nothing to delete");
            return;
        } else {
            BinaryNode previousNode = null;
            BinaryNode presentNode = null;
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);

            while (!queue.isEmpty()) {

                previousNode = presentNode;
                presentNode = queue.remove();

                if (presentNode.getLeft() == null) {
                    previousNode.setRight(null);
                    return;
                } else if (presentNode.getRight() == null) {
                    presentNode.setLeft(null);
                    return;
                }

                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }

    public void delete(int val) {
        if (root == null) {
            System.out.println("Tree is empty. Nothing to delete");
            return;
        } else {
            BinaryNode presentNode = null;
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);

            while (!queue.isEmpty()) {
                presentNode = queue.remove();
                if (presentNode.getValue() == val) {
                    presentNode.setValue(getDeepestNode().getValue());
                    deleteDeepestNode();
                    return;
                } else {
                    if (presentNode.getLeft() != null)
                        queue.add(presentNode.getLeft());
                    if (presentNode.getRight() != null)
                        queue.add(presentNode.getRight());
                }
            }

        }

    }

    public void inorderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.getLeft());
        System.out.print(node.getValue() + " ");
        inorderTraversal(node.getRight());
    }

    public void preorderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        preorderTraversal(node.getLeft());
        preorderTraversal(node.getRight());
    }

    public void postorderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.getLeft());
        postorderTraversal(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    public void levelorderTraversal() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            BinaryNode presentNode = null;

            while (!queue.isEmpty()) {
                presentNode = queue.remove();

                System.out.println("Value = " + presentNode.getValue());
                if (presentNode.getLeft() != null)
                    queue.add(presentNode.getLeft());
                if (presentNode.getRight() != null)
                    queue.add(presentNode.getRight());
            }
        }
    }


}
