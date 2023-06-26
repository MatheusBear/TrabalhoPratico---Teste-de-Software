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

    //Teste para ver se o método GenArray retorna um array do tamanho desejado
    @Test(expected = IllegalArgumentException.class)
    public void testGenArrayShouldReturnArrayOfIntsWith0Size(){
        IntArrayGenerator gen = new IntArrayGenerator();

        gen.GenArray(0);
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

    //Teste para ver se a Cifra de Caesar retorna com a String criptografada
    @Test
    public void testCaesarsCipherFraseVazia(){
        CaesarsCipher cipher = new CaesarsCipher();

        String str = "";

        str = cipher.Cipher(str, 3);

        assertEquals("", str);
    }

    //Teste para ver se a Cifra de Caesar retorna com a String criptografada
    @Test
    public void testCaesarsCipherNumeroNegativo(){
        CaesarsCipher cipher = new CaesarsCipher();

        String str = "abc";

        assertEquals(str, cipher.Cipher(str, -1));
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

    @Test(expected = IllegalArgumentException.class)
    public void TestFindMedianSortedArrayNums1Length0(){
        findMedianSortedArrays find = new findMedianSortedArrays();

        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};

        find.findMedian(nums1, nums2);
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
    public void TestHeapSortLength0(){
        int[] array = {};

        HeapSort heap = new HeapSort();

        heap.Sort(array);

        assertEquals(array, array);
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
    public void TestInsertionSortLength0(){
        InsertionSort insertion = new InsertionSort();

        int[] array = {};

        insertion.Sort(array);

        assertEquals(array, array);
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
    public void TestMergeSortLength0(){
        MergeSort merge = new MergeSort();

        int[] array = {};

        array = merge.Sort(array);

        assertEquals(array, array);
    }

    @Test
    public void TestPalindromo(){
        Palindromo palindromo = new Palindromo();

        String str = "arara";

        boolean result = palindromo.IsPalindromo(str);

        assertEquals(true, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestPalindromoVazio(){
        Palindromo palindromo = new Palindromo();

        String str = "";

        palindromo.IsPalindromo(str);
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
    public void TestQuicksortLength0(){
        QuickSort quick = new QuickSort();

        int[] array = {};

        array = quick.Sort(array);

        assertEquals(array, array);
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
    public void TestSelectionSortLength0(){
        SelectionSort selection = new SelectionSort();

        int[] array = {};

        array = selection.Sort(array);

        assertEquals(array, array);
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

    @Test
    public void TestShellsortLength0(){
        Shellsort shell = new Shellsort();

        int[] array = {};

        array = shell.Sort(array);

        assertEquals(array, array);
    }
}
