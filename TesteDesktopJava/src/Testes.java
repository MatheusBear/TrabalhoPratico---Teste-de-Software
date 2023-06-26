package TesteDesktopJava.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testes{

    //Teste para ver se o método GenArray retorna um array do tamanho desejado
    @Test
    public void testGenArrayShouldReturnArrayOfIntsWithXSize(){
        IntArrayGenerator gen = new IntArrayGenerator();

        int[] array = gen.GenArray(10);

        assertEquals(10, array.length);
    }

    //Teste para ver se o BubbleSort retorna com o array ordenado
    @Test
    public void testBubbleSortSortsArray(){
        BubbleSort bubble = new BubbleSort();

        int[] array = {5, 4, 3, 2, 1};
        int[] correctArray = {1, 2, 3, 4, 5};

        array = bubble.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(correctArray[i], array[i]);
        }
    }

    //Teste para ver se a Cifra de Caesar retorna com a String criptografada
    @Test
    public void testCaesarsCipher(){
        CaesarsCipher cipher = new CaesarsCipher();

        String str = "abc";

        str = cipher.Cipher(str, 3);

        assertEquals("def", str);
    }

    @Test 
    public void TestCalculatorAdd(){
        Calculator calc = new Calculator();

        int result = calc.add(1, 1);

        assertEquals(2, result);
    }

    @Test 
    public void TestCalculatorSubtract(){
        Calculator calc = new Calculator();

        int result = calc.subtract(1, 1);

        assertEquals(0, result);
    }

    @Test 
    public void TestCalculatorDivide(){
        Calculator calc = new Calculator();

        double result = calc.divide(2, 1);

        assertEquals(2, result, 0.0001);
    }

    @Test 
    public void TestCalculatorMultiply(){
        Calculator calc = new Calculator();

        double result = calc.multiply(2, 1);

        assertEquals(2, result, 0.0001);
    }

    @Test
    public void TestFindMedianSortedArrayNums1LesserThanNums2(){
        findMedianSortedArrays find = new findMedianSortedArrays();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8, 9, 10};

        double result = find.findMedian(nums1, nums2);

        assertEquals(5.5, result, 0.0001);
    }

    @Test
    public void TestFindMedianSortedArrayNums1GreaterThanNums2(){
        findMedianSortedArrays find = new findMedianSortedArrays();

        int[] nums1 = {6, 7, 8, 9, 10};
        int[] nums2 = {1, 2, 3, 4, 5};

        double result = find.findMedian(nums1, nums2);

        assertEquals(5.5, result, 0.0001);
    }

    @Test
    public void TestFindMedianSortedArrayNums1SameAsNums2(){
        findMedianSortedArrays find = new findMedianSortedArrays();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};

        double result = find.findMedian(nums1, nums2);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void TestFindMedianSortedArraySizeOfResultingArrayIsEven(){
        findMedianSortedArrays find = new findMedianSortedArrays();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4};

        double result = find.findMedian(nums1, nums2);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void TestHeapSort(){
        int[] array = {5, 4, 3, 2, 1};

        HeapSort heap = new HeapSort();

        array = heap.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(i + 1, array[i]);
        }
    }
    
    @Test
    public void TestInsertionSort(){
        InsertionSort insertion = new InsertionSort();

        int[] array = {5, 4, 3, 2, 1};

        array = insertion.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(i + 1, array[i]);
        }
    }

    @Test
    public void TestMergeSort(){
        MergeSort merge = new MergeSort();

        int[] array = {5, 4, 3, 2, 1};

        array = merge.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(i + 1, array[i]);
        }
    }

    @Test
    public void TestPalindromo(){
        Palindromo palindromo = new Palindromo();

        String str = "arara";

        boolean result = palindromo.IsPalindromo(str);

        assertEquals(true, result);
    }

    @Test
    public void TestQuicksort(){
        QuickSort quick = new QuickSort();

        int[] array = {5, 4, 3, 2, 1};

        array = quick.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(i + 1, array[i]);
        }
    }

    @Test
    public void TestSelectionSort(){
        SelectionSort selection = new SelectionSort();

        int[] array = {5, 4, 3, 2, 1};

        array = selection.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(i + 1, array[i]);
        }
    }

    @Test
    public void TestShellsort(){
        Shellsort shell = new Shellsort();

        int[] array = {5, 4, 3, 2, 1};

        array = shell.Sort(array);

        for(int i = 0; i < array.length; i++){
            assertEquals(i + 1, array[i]);
        }
    }
}
