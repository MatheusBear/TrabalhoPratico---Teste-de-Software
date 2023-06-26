package TesteDesktopJava.src;

public class QuickSort {
    /**
     * Method that will get the left and right point of the array
    * @param array Unsorted Array
    */
    public int[] Sort(int[] array){
        int left = 0;
        int right = array.length - 1;

        return Sort(array, left, right);
    }

    /**
     * Quicksort Function
     * @param array Unsorted Array
     * @param low Starting index
     * @param high Ending index
     */
    public int[] Sort(int[] array, int low, int high){
        if(low < high){
            // PI = Partition Index
            int PI = partition(array, low, high);

            Sort(array, low, PI - 1);
            Sort(array, PI + 1, high);
        }

        return array;
    }

    /**
     * Partition function
     * @param array
     * @param low Starting index
     * @param high Ending index
     * @return Pivot in the correct index
     */
    public int partition(int[] array, int low, int high){
        int pivot = array[high];

        int index = (low - 1);

        for(int i = low; i <= high - 1; i++){
            if(array[i] < pivot){
                index++;
                Swap(array, index, i);
            }
        }

        Swap(array, index + 1, high);
        return (index + 1);
    }

    /**
     * Swaps to elements in the array
     * @param array Array with elements
     * @param i Index of the first array
     * @param j Index of the second array
     */
    public void Swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
