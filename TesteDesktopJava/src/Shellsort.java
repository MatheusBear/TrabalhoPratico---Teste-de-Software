package TesteDesktopJava.src;

public class Shellsort{
    /**
     * Shellsort class
     * @param array Unsorted array of int
     */
    public int[] Sort(int[] array){
        int size = array.length;

        //Start with big gap, then reduce the gap
        for(int gap = size/2; gap > 0; gap /= 2){
            for(int i = gap; i < size; i++){
                int temp = array[i];

                int j;

                for(j = i; j >= gap && array[j - gap] > temp; j -= gap){
                    array[j] = array[j - gap];
                }

                array[j] = temp;
            }
        }

        return array;
    }
}