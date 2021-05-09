package tree.binarytree;

public class BinaryTreeByArray {

    int[] arr;
    int lastUsedIndex;

    public BinaryTreeByArray(int size) {
        arr = new int[size+1];
        this.lastUsedIndex = 0;

        System.out.println("Binary Tree created of size = " + size);
    }

    public boolean isTreeFull() {
        return this.lastUsedIndex == arr.length-1;
    }

    public boolean isTreeEmpty() {
        return this.lastUsedIndex == 0;
    }

    public void insert(int val) {
        if(isTreeFull()) {
            System.out.println("Tree is full. Cannot insert further elements");
        } else {
            arr[this.lastUsedIndex+1] = val;
            this.lastUsedIndex++;
            System.out.println("Element inserted at index = " + this.lastUsedIndex + " is = " + val);
        }
    }

    public void delete(int val) {
        if(isTreeEmpty()) {
            System.out.println("Tree is empty. Nothing to delete");
        } else {
            int location = search(val);
            arr[location] = arr[this.lastUsedIndex];
            this.lastUsedIndex--;
        }
    }

    public int search(int val) {
        int location = -1;
        if(isTreeEmpty()) {
            System.out.println("Tree is empty. Item not present in the tree");
        } else {
            for(int idx = 1; idx <= this.lastUsedIndex; idx++) {
                if(arr[idx] == val) {
                    System.out.println("Value found at index = " + idx);
                    location = idx;
                    return location;
                }
            }
        }
        System.out.println("Value not available in tree.");
        return location;
    }


    public void levelOrderTraversal() {
        if(isTreeEmpty()) {
            System.out.println("Tree is empty");
        } else {
            for(int idx = 1;idx <= this.lastUsedIndex;idx++) {
                System.out.print(arr[idx] + " ");
            }
        }
    }

    public void inorderTraversal(int index) {
        if(index > this.lastUsedIndex) {
            return;
        }
        inorderTraversal(index*2);
        System.out.print(arr[index] + " ");
        inorderTraversal(index*2+1);
    }

    public void preorderTraversal(int index) {
        if(index > this.lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preorderTraversal(index*2);
        preorderTraversal(index*2+1);
    }

    public void postorderTraversal(int index) {
        if(index > this.lastUsedIndex) {
            return;
        }
        postorderTraversal(index*2);
        postorderTraversal(index*2+1);
        System.out.print(arr[index] + " ");
    }

    public void deleteTree() {
        arr = null;
        System.out.println("Tree deleted");
    }

}
