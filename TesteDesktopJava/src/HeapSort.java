package TesteDesktopJava.src;

public class HeapSort {
    /**
     * Heapsort Function
     * @param array Unsorted Array
    */
    public int[] Sort(int[] array){

        //Build Heap
        for(int i = (array.length / 2) - 1; i >= 0; i--){
            heapify(array, array.length, i);
        }

        //Extract, 1-by-1, the element from the heap
        for(int i = array.length - 1; i > 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        return array;
    }

    /**
     * Heapify Function
     * @param array Integer array
     * @param size Size of the array
     * @param i Parent node of a subtree
     */
    public void heapify(int[] array, int size, int i){
        //Largest as root
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //if left child is larger than root
        if(left < size && array[left] > array[largest]){
            largest = left;
        }

        //if right child is larger than root
        if(right < size && array[right] > array[largest]){
            largest = right;
        }

        //if largest is not root
        if(largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, size, largest);
        }
    }
}
