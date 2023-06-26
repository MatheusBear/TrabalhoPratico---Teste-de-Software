package TesteDesktopJava.src;

public class MergeSort {
    /**
     * Method that will get the left and right point of the array
     * @param array Unsorted Array
     */
    public  int[] Sort(int[] array){

        if(array.length == 0 || array.length < 0){
            System.out.println("Array is empty");
            return array;
        }
        int left = 0;
        int right = array.length - 1;

        Sort(array, left, right);

        return array;
    }

    /**
     * Main function that sorts the array using Merge()
     * @param array Unsorted array
     * @param left left index in the array
     * @param right right index in the array
     */
    public int[] Sort(int[] array, int left, int right){
        if(left < right){
            int middle = (left + (right - 1)) / 2;

            Sort(array, left, middle);
            Sort(array, middle + 1, right);

            Merge(array, left, middle, right);
        }      

        return array;
    }

    /**
     * The Merge Method
     * @param array Array with unsorted elements
     * @param left Left index
     * @param middle Middle index
     * @param right Right index
     */
    public int[] Merge(int[] array, int left, int middle, int right){

        //Finds the size of the two subarrays
        int size1 = middle - left + 1;
        int size2 = right - middle;

        //Creates 2 temporary arrays
        int[] Left = new int[size1];
        int[] Right = new int[size2];

        //Copies the numbers in the arrays to the temporary arrays
        for(int i = 0; i < size1; i++){
            Left[i] = array[left + i];
        }

        for(int i = 0; i < size2; i++){
            Right[i] = array[middle + 1 + i];
        }

        //Merging the temporary arrays

        int i = 0; int j = 0;

        int k = left;

        while(i < size1 && j < size2){
            if(Left[i] <= Right[j]){
                array[k] = Left[i];
                i++;
            }else{
                array[k] = Right[j];
                j++;
            }
            k++;
        }

        //Adds the remaining elements if there are any
        while(i < size1){
            array[k] = Left[i];
            i++;
            k++;
        }

        while(j < size2){
            array[k] = Right[j];
            j++;
            k++;
        }

        return array;
    }
}
