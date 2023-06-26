package TesteDesktopJava.src;

import java.util.concurrent.ThreadLocalRandom;

public class IntArrayGenerator {
    public int[] GenArray(int size){
        int[] array = new int[size];  

        GenArrayWithNumbers(array);

        return array;
    }

    /**
     * Method to generate the random numbers in the arrays
    * @param array the empty arrays
    * @return  Arrays with random numbers added into them
    */
    public int[] GenArrayWithNumbers(int[] array){

        for(int i = 0; i < array.length; i++){
            int Random = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE - 1);

            array[i] = Random;
        }

        return array;
    }
}
