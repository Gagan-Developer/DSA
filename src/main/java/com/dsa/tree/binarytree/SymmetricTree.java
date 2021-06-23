package tree.binarytree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return traverseTree(root.left, root.right);
    }

    private static boolean traverseTree(TreeNode left, TreeNode right) {

        if (left == null || right == null) return left == right;

        if (left.val != right.val) return false;

        return traverseTree(left.left, right.right) && traverseTree(left.right, right.left);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,3};

        SymmetricTree sym = new SymmetricTree();
        sym.isSymmetric(null);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
