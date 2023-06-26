package TesteDesktopJava.src;

public class BubbleSort {
    /**
     * Bubble Sort Algorithm
    * @param array Array with random numbers in random order
    * @return  Sorted Array
    */
    public int[] Sort(int[] array){

        //Will move through the array, 1-by-1
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
