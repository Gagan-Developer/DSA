package heap;

public class HeapByArray {

    private int[] arr;
    private int sizeOfHeap;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSizeOfHeap() {
        return sizeOfHeap;
    }

    public void setSizeOfHeap(int sizeOfHeap) {
        this.sizeOfHeap = sizeOfHeap;
    }

    public HeapByArray(int size) {
        this.arr = new int[size + 1];
        this.sizeOfHeap = 0;
        System.out.println("Created Empty heap");
    }

    public boolean isHeapEmpty() {
        return this.sizeOfHeap == 0;
    }

    public void levelOrderTraversal() {
        if (isHeapEmpty()) {
            System.out.println("Heap is empty. Nothing to print");
        } else {
            for (int idx = 1; idx <= this.sizeOfHeap; idx++) {
                System.out.print(this.arr[idx] + " ");
            }
        }
    }

    public void insert(int val) {
        if(sizeOfHeap == arr.length-1) {
            System.out.println("Heap is full. No further element can be inserted");
            return;
        } else {
            arr[sizeOfHeap+1] = val;
            sizeOfHeap++;
        }
        heapifyBottomToTop(sizeOfHeap);
    }

    public void heapifyBottomToTop(int index) {
        int parent = index/2;

        if(parent <= 0 ) {
            return;
        }
        if(arr[parent] > arr[index]) {
            int tmp = arr[parent];
            arr[parent] = arr[index];
            arr[index] = tmp;
        }
        heapifyBottomToTop(parent);
    }

    public void heapifyTopToBottom(int index) {
        int left = index*2;
        int right = index*2+1;
        int smallestChild = 0;

        if(sizeOfHeap < left) {
            return;
        } else if (sizeOfHeap == left){
            if(arr[index] > arr[left]) {
                int tmp = arr[index];
                arr[index] = arr[left];
                arr[left] = tmp;
            }
            return;
        } else {
            if(arr[left] <= arr[right]) {
                smallestChild = left;
            } else {
                smallestChild = right;
            }

            if(arr[index] > arr[smallestChild]) {
                int tmp = arr[index];
                arr[index] = arr[smallestChild];
                arr[smallestChild] = tmp;
            }
        }
        heapifyTopToBottom(smallestChild);
    }

    public int extractHeadOfHeap() {
        if(this.sizeOfHeap == 0) {
            System.out.println("Heap is empty. Cannot extract Head of heap.");
            return -1;
        }

        int headOfHeap = arr[1];
        arr[1] = arr[sizeOfHeap];
        sizeOfHeap--;
        heapifyTopToBottom(1);
        System.out.println("Head of Heap = " + headOfHeap);
        return headOfHeap;

    }

    public void peek() {
        if(sizeOfHeap == 0) {
            System.out.println("Heap is empty.");
            return;
        }

        System.out.println("Top of heap is = " + arr[1]);
    }

    public void deleteHeap() {
        arr = null;
        System.out.println("Heap is deleted");
    }

}
