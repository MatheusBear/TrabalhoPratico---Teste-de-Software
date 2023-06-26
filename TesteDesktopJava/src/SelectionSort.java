package TesteDesktopJava.src;

public class SelectionSort {
    /**
     * Selection Sort Algorithm
     * @param array Array with random numbers in random order
     * @return  Sorted Array
    */
    public int[] Sort(int[] array){

        //Will move through the array, 1-by-1
        for(int i = 0; i < array.length - 1; i++){
            int IndexMin = i; 

            for(int j = i + 1; j < array.length; j++){
                if(array[IndexMin] > array[j]){
                    IndexMin = j;
                }
            }

            int temp = array[IndexMin];
            array[IndexMin] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
