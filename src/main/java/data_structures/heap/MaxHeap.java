package data_structures.heap;


import java.util.Arrays;

/*
Building a Max-Heap
1. Create a new node at the END of the heap
2. Assign a new value to the node
3. Compare the value of this child node with its parent
4. If the value of the parent is less than that of the child, then swap them
5. Repeat steps 3 & 4 until the Heap property holds
 */
public class MaxHeap {

    /*
    Takes the array and starts from the last parent node (in this case at the 2nd level for us)
    and passes it to MaxHeapify for comparison
     */
    public void buildMaxHeap(int[] heapArray, int heapSize) {
        // this heapSize - 1 / 2 gives us the last parent node in the heapArray
        for (int i = (heapSize - 1) / 2; i >= 0; i--) {
            maxHeapify(heapArray, i, heapSize);
        }
    }

    /*
    Takes the node index and compares it with the key at the child node and
    swaps them if the condition ChildNode >= ParentNode holds true
     */
    private void maxHeapify(int[] heapArray, int index, int heapSize) {
        int largest = index;
        while (largest < heapSize / 2) {
            int left = (2 * index) + 1; // left child
            int right = (2 * index) + 2; // right child

            if (left < heapSize && heapArray[left] > heapArray[index]) {
                largest = left;
            }

            if (right < heapSize && heapArray[right] > heapArray[largest]) {
                largest = right;
            }

            if (largest != index) {
                int temp = heapArray[index];
                heapArray[index] = heapArray[largest];
                heapArray[largest] = temp;
                index = largest;
            } else {
                // Happens if the heap property is satisfied
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] heapArray = new int[]{ 1, 4, 7, 12, 15, 14, 9, 2, 3, 16 };

        System.out.println("Before heapify: " + Arrays.toString(heapArray));
        new MaxHeap().buildMaxHeap(heapArray, heapArray.length);
        System.out.println("After heapify: " + Arrays.toString(heapArray));
    }

}
