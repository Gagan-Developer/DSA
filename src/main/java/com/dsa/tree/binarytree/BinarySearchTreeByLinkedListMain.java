package tree.binarytree;

public class BinarySearchTreeByLinkedListMain {

    public static void main(String[] args) {

        System.out.println("Starting BST operations");

        BinarySearchTreeByLinkedList tree = new BinarySearchTreeByLinkedList();
        System.out.println("Creating BST");
        tree.createBST();

        System.out.println();

        System.out.println("Insert elements in tree");
        tree.insert(100);
        tree.insert(200);
        tree.insert(70);
        tree.insert(90);
        tree.insert(50);
        tree.insert(150);
        tree.insert(130);

        System.out.println();

        System.out.println("Print Tree");
        tree.levelOrderTraversal();

        System.out.println();

        System.out.println("Search Element in tree");
        tree.search(50);
        tree.search(400);

        System.out.println();

        System.out.println("Delete element from tree");
        tree.deleteNode(90);

        System.out.println();

        System.out.println("Print Tree");
        tree.levelOrderTraversal();

        System.out.println();

        System.out.println("Delete entire tree");
        tree.deleteBST();



    }
}
