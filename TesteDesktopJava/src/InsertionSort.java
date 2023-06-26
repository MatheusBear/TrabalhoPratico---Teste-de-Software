package TesteDesktopJava.src;

public class InsertionSort {
    /**
     * Insertion Sort Algorithm
    * @param array Array with random numbers in random order
    * @return  Sorted Array
    */
    public int[] Sort(int[] array){

        for(int i = 1; i < array.length; i++){
            int key = array[i];

            int j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j -= 1;
            }

            array[j + 1] = key;
        }

        return array;
    }
}
