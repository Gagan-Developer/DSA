package tree.binarytree;

public class BinaryTreeByArrayMain {
    public static void main(String[] args) {

        System.out.println("Starting Binary Tree operations");

        System.out.println("Creating a Binary Tree");
        BinaryTreeByArray tree = new BinaryTreeByArray(5);

        System.out.println("Insert element in tree");
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println();

        System.out.println("Search element in tree");
        tree.search(30);
        tree.search(80);

        System.out.println();

        System.out.println("Preorder Traversal");
        tree.preorderTraversal(1);

        System.out.println();

        System.out.println("Inorder Traversal");
        tree.inorderTraversal(1);

        System.out.println();

        System.out.println("Postorder Traversal");
        tree.postorderTraversal(1);

        System.out.println();

        System.out.println("Levelorder Traversal");
        tree.levelOrderTraversal();

        System.out.println();

        System.out.println("Delete element from tree");
        tree.delete(20);

        System.out.println();

        System.out.println("Levelorder traversal");
        tree.levelOrderTraversal();

        System.out.println();

        System.out.println("Delete entire tree");
        tree.deleteTree();
    }
}
