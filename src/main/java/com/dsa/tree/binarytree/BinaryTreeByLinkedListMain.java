package tree.binarytree;

public class BinaryTreeByLinkedListMain {
    public static void main(String[] args) {

        System.out.println("Starting Binary Tree LinkedList operations");

        System.out.println("Creating a BinaryTree");
        BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();

        System.out.println("Insert elements in tree");
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);

        System.out.println();

        System.out.println("Traverse");
        tree.levelorderTraversal();

        System.out.println();

        System.out.println("Deleting element from tree");
        tree.delete(30);

        System.out.println();

        System.out.println("Level Order");
        tree.levelorderTraversal();

        System.out.println();

        System.out.println("Preorder");
        tree.preorderTraversal(tree.root);

        System.out.println();

        System.out.println("Inorder");
        tree.inorderTraversal(tree.root);

        System.out.println();

        System.out.println("Postorder");
        tree.postorderTraversal(tree.root);


    }
}
