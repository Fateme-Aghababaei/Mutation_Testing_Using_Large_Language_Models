package org.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class Selection_Sort_Algorithm_Test {
    // Test selection sort with an empty array
    @Test
    public void testSelectionSort1() {
        double[] arr = {};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{}, arr);
    }

    // Test selection sort with an array of size 1
    @Test
    public void testSelectionSort2() {
        double[] arr = {5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{5}, arr);
    }

    // Test selection sort with an already sorted array
    @Test
    public void testSelectionSort3() {
        double[] arr = {1, 2, 3, 4, 5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 2, 3, 4, 5}, arr);
    }

    // Test selection sort with an array sorted in reverse order
    @Test
    public void testSelectionSort4() {
        double[] arr = {5, 4, 3, 2, 1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 2, 3, 4, 5}, arr);
    }

    // Test selection sort with an array containing duplicate elements
    @Test
    public void testSelectionSort5() {
        double[] arr = {5, 4, 3, 3, 2, 1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 2, 3, 3, 4, 5}, arr);
    }

    // Test selection sort with negative numbers
    @Test
    public void testSelectionSort6() {
        double[] arr = {-5, -4, -3, -2, -1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-5, -4, -3, -2, -1}, arr);
    }

    // Test selection sort with large array
    @Test
    public void testSelectionSort7() {
        double[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    // Test selection sort with array containing only one unique element
    @Test
    public void testSelectionSort8() {
        double[] arr = {3, 3, 3, 3, 3};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{3, 3, 3, 3, 3}, arr);
    }

    // Test selection sort with array containing mix of positive and negative numbers
    @Test
    public void testSelectionSort9() {
        double[] arr = {-5, 2, -3, 7, 0, 1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-5, -3, 0, 1, 2, 7}, arr);
    }

    // Test selection sort with array where all elements are the same
    @Test
    public void testSelectionSort10() {
        double[] arr = {4, 4, 4, 4, 4, 4};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{4, 4, 4, 4, 4, 4}, arr);
    }

    // Test selection sort with array containing large positive numbers
    @Test
    public void testSelectionSort11() {
        double[] arr = {1000000, 999999, 888888, 777777, 123456};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{123456, 777777, 888888, 999999, 1000000}, arr);
    }

    // Test selection sort with array containing large negative numbers
    @Test
    public void testSelectionSort12() {
        double[] arr = {-1000000, -999999, -888888, -777777, -123456};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000, -999999, -888888, -777777, -123456}, arr);
    }

    // Test selection sort with array where elements are in random order
    @Test
    public void testSelectionSort13() {
        double[] arr = {9, 1, 5, 3, 7, 2, 8, 6, 4};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    // Test selection sort with array containing all even numbers
    @Test
    public void testSelectionSort14() {
        double[] arr = {6, 8, 2, 4, 10};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{2, 4, 6, 8, 10}, arr);
    }

    // Test selection sort with array containing all odd numbers
    @Test
    public void testSelectionSort15() {
        double[] arr = {7, 3, 9, 5, 1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 3, 5, 7, 9}, arr);
    }

    // Test selection sort with array containing floating point numbers
    @Test
    public void testSelectionSort16() {
        double[] arr = {3.5, 2.1, 5.6, 1.2, 4.7};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1.2, 2.1, 3.5, 4.7, 5.6}, arr, 0);
    }

    // Test selection sort with array containing large floating point numbers
    @Test
    public void testSelectionSort17() {
        double[] arr = {99999.9, 88888.8, 77777.7, 66666.6, 55555.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{55555.5, 66666.6, 77777.7, 88888.8, 99999.9}, arr, 0);
    }

    // Test selection sort with array containing small floating point numbers
    @Test
    public void testSelectionSort18() {
        double[] arr = {0.0001, 0.0002, 0.0003, 0.0004, 0.0005};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{0.0001, 0.0002, 0.0003, 0.0004, 0.0005}, arr, 0);
    }

    // Test selection sort with array containing mix of integers and floating point numbers
    @Test
    public void testSelectionSort19() {
        double[] arr = {5, 3.5, 2, 1.2, 4};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1.2, 2, 3.5, 4, 5}, arr, 0);
    }

    // Test selection sort with array containing mix of negative and floating point numbers
    @Test
    public void testSelectionSort20() {
        double[] arr = {-5.5, -4.4, -3.3, -2.2, -1.1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-5.5, -4.4, -3.3, -2.2, -1.1}, arr, 0);
    }

    // Test selection sort with array containing mix of positive and floating point numbers
    @Test
    public void testSelectionSort21() {
        double[] arr = {5.5, 4.4, 3.3, 2.2, 1.1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, arr, 0);
    }

    // Test selection sort with array containing NaN
    @Test
    public void testSelectionSort22() {
        double[] arr = {Double.NaN, 1.1, 2.2, 3.3, 4.4};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertTrue(Double.isNaN(arr[0]));
        assertArrayEquals(new double[]{Double.NaN, 1.1, 2.2, 3.3, 4.4}, arr, 0);
    }

    // Test selection sort with array containing positive and negative infinity
    @Test
    public void testSelectionSort23() {
        double[] arr = {Double.POSITIVE_INFINITY, 4.4, 3.3, Double.NEGATIVE_INFINITY, 1.1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertEquals(Double.NEGATIVE_INFINITY, arr[0], 0);
        assertEquals(1.1, arr[1], 0);
        assertEquals(3.3, arr[2], 0);
        assertEquals(4.4, arr[3], 0);
        assertEquals(Double.POSITIVE_INFINITY, arr[4], 0);
    }

    // Test selection sort with array containing a mixture of positive and negative infinity and NaN
    @Test
    public void testSelectionSort24() {
        double[] arr = {Double.POSITIVE_INFINITY, Double.NaN, 3.3, Double.NEGATIVE_INFINITY, 1.1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertEquals(Double.NEGATIVE_INFINITY, arr[0], 0);
        assertEquals(1.1, arr[2], 0);
        assertEquals(3.3, arr[3], 0);
        assertEquals(Double.POSITIVE_INFINITY, arr[4], 0);
        assertTrue(Double.isNaN(arr[1]));
    }

    // Test selection sort with array containing a single positive infinity
    @Test
    public void testSelectionSort25() {
        double[] arr = {Double.POSITIVE_INFINITY};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertEquals(Double.POSITIVE_INFINITY, arr[0], 0);
    }

    // Test selection sort with array containing a single negative infinity
    @Test
    public void testSelectionSort26() {
        double[] arr = {Double.NEGATIVE_INFINITY};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertEquals(Double.NEGATIVE_INFINITY, arr[0], 0);
    }

    // Test selection sort with array containing a single NaN
    @Test
    public void testSelectionSort27() {
        double[] arr = {Double.NaN};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertTrue(Double.isNaN(arr[0]));
    }

    // Test selection sort with array containing a mixture of positive infinity and NaN
    @Test
    public void testSelectionSort28() {
        double[] arr = {Double.POSITIVE_INFINITY, Double.NaN};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertTrue(Double.isNaN(arr[1]));
        assertEquals(Double.POSITIVE_INFINITY, arr[0], 0);
    }

    // Test selection sort with array containing a mixture of negative infinity and NaN
    @Test
    public void testSelectionSort29() {
        double[] arr = {Double.NEGATIVE_INFINITY, Double.NaN};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertTrue(Double.isNaN(arr[1]));
        assertEquals(Double.NEGATIVE_INFINITY, arr[0], 0);
    }

    // Test selection sort with array containing large positive and negative numbers
    @Test
    public void testSelectionSort30() {
        double[] arr = {1000000000, -1000000000, 500000000, -500000000, 0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000000, -500000000, 0, 500000000, 1000000000}, arr);
    }

    // Test selection sort with array containing large positive and negative floating point numbers
    @Test
    public void testSelectionSort31() {
        double[] arr = {1000000000.5, -1000000000.5, 500000000.5, -500000000.5, 0.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000000.5, -500000000.5, 0.5, 500000000.5, 1000000000.5}, arr, 0);
    }

    // Test selection sort with array containing large positive and negative numbers with random order
    @Test
    public void testSelectionSort32() {
        double[] arr = {-500000000, 1000000000, 0, -1000000000, 500000000};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000000, -500000000, 0, 500000000, 1000000000}, arr);
    }

    // Test selection sort with array containing large positive and negative floating point numbers with random order
    @Test
    public void testSelectionSort33() {
        double[] arr = {-500000000.5, 1000000000.5, 0.5, -1000000000.5, 500000000.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000000.5, -500000000.5, 0.5, 500000000.5, 1000000000.5}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers
    @Test
    public void testSelectionSort34() {
        double[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE - 1, Integer.MIN_VALUE + 1, 0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 0, Integer.MAX_VALUE - 1, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers
    @Test
    public void testSelectionSort35() {
        double[] arr = {Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE - 1.5, -Double.MAX_VALUE + 1.5, 0.0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE + 1.5, 0.0, Double.MAX_VALUE - 1.5, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers with random order
    @Test
    public void testSelectionSort36() {
        double[] arr = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MIN_VALUE + 1, Integer.MAX_VALUE - 1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 0, Integer.MAX_VALUE - 1, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers with random order
    @Test
    public void testSelectionSort37() {
        double[] arr = {-Double.MAX_VALUE, Double.MAX_VALUE, 0.0, -Double.MAX_VALUE + 1.5, Double.MAX_VALUE - 1.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE + 1.5, 0.0, Double.MAX_VALUE - 1.5, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers with duplicates
    @Test
    public void testSelectionSort38() {
        double[] arr = {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers with duplicates
    @Test
    public void testSelectionSort39() {
        double[] arr = {Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE, -Double.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers and zero
    @Test
    public void testSelectionSort40() {
        double[] arr = {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers and zero
    @Test
    public void testSelectionSort41() {
        double[] arr = {Double.MAX_VALUE, -Double.MAX_VALUE, 0.0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, 0.0, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers and zero with duplicates
    @Test
    public void testSelectionSort42() {
        double[] arr = {Integer.MIN_VALUE, Integer.MAX_VALUE, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers and zero with duplicates
    @Test
    public void testSelectionSort43() {
        double[] arr = {Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, Double.MAX_VALUE, -Double.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, Double.MAX_VALUE, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers and zero with random order
    @Test
    public void testSelectionSort44() {
        double[] arr = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers and zero with random order
    @Test
    public void testSelectionSort45() {
        double[] arr = {-Double.MAX_VALUE, 0.0, Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, Double.MAX_VALUE, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers and zero with duplicates and random order
    @Test
    public void testSelectionSort46() {
        double[] arr = {0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers and zero with duplicates and random order
    @Test
    public void testSelectionSort47() {
        double[] arr = {Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, -Double.MAX_VALUE, 0.0, Double.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, 0.0, Double.MAX_VALUE, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers and zero with duplicates and sorted order
    @Test
    public void testSelectionSort48() {
        double[] arr = {Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers and zero with duplicates and sorted order
    @Test
    public void testSelectionSort49() {
        double[] arr = {-Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, 0.0, Double.MAX_VALUE, Double.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, 0.0, Double.MAX_VALUE, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing very large positive and negative numbers and zero with duplicates and reverse order
    @Test
    public void testSelectionSort50() {
        double[] arr = {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE}, arr);
    }

    // Test selection sort with array containing very large positive and negative floating point numbers and zero with duplicates and reverse order
    @Test
    public void testSelectionSort51() {
        double[] arr = {Double.MAX_VALUE, Double.MAX_VALUE, 0.0, 0.0, -Double.MAX_VALUE, -Double.MAX_VALUE};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-Double.MAX_VALUE, -Double.MAX_VALUE, 0.0, 0.0, Double.MAX_VALUE, Double.MAX_VALUE}, arr, 0);
    }

    // Test selection sort with array containing repeated elements
    @Test
    public void testSelectionSort52() {
        double[] arr = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{5, 5, 5, 5, 5, 5, 5, 5, 5}, arr);
    }

    // Test selection sort with array containing repeated elements in descending order
    @Test
    public void testSelectionSort53() {
        double[] arr = {9, 8, 8, 7, 6, 5, 5, 4, 3, 2, 1, 1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9}, arr);
    }

    // Test selection sort with array containing repeated elements in ascending order
    @Test
    public void testSelectionSort54() {
        double[] arr = {1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9}, arr);
    }

    // Test selection sort with array containing a single element repeated multiple times
    @Test
    public void testSelectionSort55() {
        double[] arr = {8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, arr);
    }

    // Test selection sort with array containing negative elements only
    @Test
    public void testSelectionSort56() {
        double[] arr = {-9, -8, -7, -6, -5, -4, -3, -2, -1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-9, -8, -7, -6, -5, -4, -3, -2, -1}, arr);
    }

    // Test selection sort with array containing positive elements only
    @Test
    public void testSelectionSort57() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    // Test selection sort with array containing zero only
    @Test
    public void testSelectionSort58() {
        double[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, arr);
    }

    // Test selection sort with array containing large and small positive and negative numbers
    @Test
    public void testSelectionSort59() {
        double[] arr = {-1000000, -1, 0, 1, 1000000};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000, -1, 0, 1, 1000000}, arr);
    }

    // Test selection sort with array containing large and small positive and negative floating point numbers
    @Test
    public void testSelectionSort60() {
        double[] arr = {-1000000.5, -0.1, 0.0, 0.1, 1000000.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000.5, -0.1, 0.0, 0.1, 1000000.5}, arr, 0);
    }

    // Test selection sort with array containing large and small positive and negative numbers in descending order
    @Test
    public void testSelectionSort61() {
        double[] arr = {1000000, 100000, 10000, 1000, 100, 10, 1, -1, -10, -100, -1000, -10000, -100000, -1000000};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000, -100000, -10000, -1000, -100, -10, -1, 1, 10, 100, 1000, 10000, 100000, 1000000}, arr);
    }

    // Test selection sort with array containing large and small positive and negative floating point numbers in descending order
    @Test
    public void testSelectionSort62() {
        double[] arr = {1000000.5, 100000.4, 10000.3, 1000.2, 100.1, 10.05, 1.0, -1.0, -10.05, -100.1, -1000.2, -10000.3, -100000.4, -1000000.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000.5, -100000.4, -10000.3, -1000.2, -100.1, -10.05, -1.0, 1.0, 10.05, 100.1, 1000.2, 10000.3, 100000.4, 1000000.5}, arr, 0);
    }

    // Test selection sort with array containing large and small positive and negative numbers in ascending order
    @Test
    public void testSelectionSort63() {
        double[] arr = {-1000000, -100000, -10000, -1000, -100, -10, -1, 1, 10, 100, 1000, 10000, 100000, 1000000};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000, -100000, -10000, -1000, -100, -10, -1, 1, 10, 100, 1000, 10000, 100000, 1000000}, arr);
    }

    // Test selection sort with array containing large and small positive and negative floating point numbers in ascending order
    @Test
    public void testSelectionSort64() {
        double[] arr = {-1000000.5, -100000.4, -10000.3, -1000.2, -100.1, -10.05, -1.0, 1.0, 10.05, 100.1, 1000.2, 10000.3, 100000.4, 1000000.5};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000.5, -100000.4, -10000.3, -1000.2, -100.1, -10.05, -1.0, 1.0, 10.05, 100.1, 1000.2, 10000.3, 100000.4, 1000000.5}, arr, 0);
    }

    // Test selection sort with array containing large and small positive and negative numbers in random order
    @Test
    public void testSelectionSort65() {
        double[] arr = {-1000, -1, 100, -10000, 10, -100000, 1000000, -10000000, 100000000, -1000000000, 0, -100, 1, 10000};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000000, -10000000, -100000, -10000, -1000, -100, -1, 0, 1, 10, 100, 10000, 1000000, 100000000}, arr);
    }

    // Test selection sort with array containing large and small positive and negative floating point numbers in random order
    @Test
    public void testSelectionSort66() {
        double[] arr = {-1000.5, -1.0, 100.1, -10000.2, 10.05, -100000.3, 1000000.4, -10000000.5, 100000000.6, -1000000000.7, 0.0, -100.8, 1.9, 10000.10};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000000.7, -10000000.5, -100000.3, -10000.2, -1000.5, -100.8, -1.0, 0.0, 1.9, 10.05, 100.1, 10000.10, 1000000.4, 100000000.6}, arr, 0);
    }

    // Test selection sort with array containing large and small positive and negative numbers in ascending order with duplicates
    @Test
    public void testSelectionSort67() {
        double[] arr = {-1000000, -1000000, -10000, -10000, -1000, -1000, -100, -100, -10, -10, -1, -1, 1, 1, 10, 10, 100, 100, 1000, 1000, 10000, 10000, 1000000, 1000000};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000, -1000000, -10000, -10000, -1000, -1000, -100, -100, -10, -10, -1, -1, 1, 1, 10, 10, 100, 100, 1000, 1000, 10000, 10000, 1000000, 1000000}, arr);
    }

    // Test selection sort with array containing large and small positive and negative floating point numbers in ascending order with duplicates
    @Test
    public void testSelectionSort68() {
        double[] arr = {-1000000.5, -1000000.5, -10000.1, -10000.1, -1000.2, -1000.2, -100.3, -100.3, -10.4, -10.4, -1.5, -1.5, 1.6, 1.6, 10.7, 10.7, 100.8, 100.8, 1000.9, 1000.9, 10000.10, 10000.10, 1000000.11, 1000000.11};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000.5, -1000000.5, -10000.1, -10000.1, -1000.2, -1000.2, -100.3, -100.3, -10.4, -10.4, -1.5, -1.5, 1.6, 1.6, 10.7, 10.7, 100.8, 100.8, 1000.9, 1000.9, 10000.10, 10000.10, 1000000.11, 1000000.11}, arr, 0);
    }

    // Test selection sort with array containing large and small positive and negative numbers in random order with duplicates
    @Test
    public void testSelectionSort69() {
        double[] arr = {10000, -10000, -1000000, 1000, -1000, 1000000, -100, 100, -10, 0, 10, 1, -1, -10000, 10000, 0, -1000, 1000, -1000000, 100, -100, 10, -10, 1, -1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000, -1000000, -10000, -10000, -1000, -1000, -100, -100, -10, -10, -1, -1, 0, 0, 1, 1, 10, 10, 100, 100, 1000, 1000, 10000, 10000, 1000000}, arr);
    }

    // Test selection sort with array containing large and small positive and negative floating point numbers in random order with duplicates
    @Test
    public void testSelectionSort70() {
        double[] arr = {10000.1, -10000.1, -1000000.2, 1000.3, -1000.3, 1000000.4, -100.5, 100.5, -10.6, 0.7, 10.8, 1.9, -1.9, -10000.1, 10000.1, 0.0, -1000.3, 1000.3, -1000000.4, 100.5, -100.5, 10.6, -10.6, 1.9, -1.9};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{-1000000.4, -1000000.2, -10000.1, -10000.1, -1000.3, -1000.3, -100.5, -100.5, -10.6, -10.6, -1.9, -1.9, 0.0, 0.7, 1.9, 1.9, 10.6, 10.8, 100.5, 100.5, 1000.3, 1000.3, 10000.1, 10000.1, 1000000.4}, arr, 0);
    }

    // Test selection sort with large array of random positive and negative numbers
    @Test
    public void testSelectionSort71() {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() % 1000;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of random positive and negative floating point numbers
    @Test
    public void testSelectionSort72() {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 1000 - 500;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of consecutive numbers in ascending order
    @Test
    public void testSelectionSort73() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of consecutive numbers in descending order
    @Test
    public void testSelectionSort74() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 999 - i;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of all zeros
    @Test
    public void testSelectionSort75() {
        double[] arr = new double[1000];
        Arrays.fill(arr, 0);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of all zeros as floating point numbers
    @Test
    public void testSelectionSort76() {
        double[] arr = new double[1000];
        Arrays.fill(arr, 0);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of all the same number
    @Test
    public void testSelectionSort77() {
        double[] arr = new double[1000];
        Arrays.fill(arr, 5);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of all the same floating point number
    @Test
    public void testSelectionSort78() {
        double[] arr = new double[1000];
        Arrays.fill(arr, 3.5);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of small even and odd numbers
    @Test
    public void testSelectionSort79() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1 : i;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of small even and odd floating point numbers
    @Test
    public void testSelectionSort80() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1.0 : i * 1.0;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large even and odd numbers
    @Test
    public void testSelectionSort81() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1000 : i * 1000;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large even and odd floating point numbers
    @Test
    public void testSelectionSort82() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1000.0 : i * 1000.0;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers
    @Test
    public void testSelectionSort83() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1 : i;
        }
        Arrays.sort(arr);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers
    @Test
    public void testSelectionSort84() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1.0 : i * 1.0;
        }
        Arrays.sort(arr);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers in descending order
    @Test
    public void testSelectionSort85() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i : i * -1;
        }
        Arrays.sort(arr);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers in descending order
    @Test
    public void testSelectionSort86() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * 1.0 : i * -1.0;
        }
        Arrays.sort(arr);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers with duplicates
    @Test
    public void testSelectionSort87() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i : i * -1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i;
            }
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers with duplicates
    @Test
    public void testSelectionSort88() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * 1.0 : i * -1.0;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i * 1.0;
            }
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers in random order
    @Test
    public void testSelectionSort89() {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() % 10000;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers in random order
    @Test
    public void testSelectionSort90() {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 10000 - 5000;
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        Arrays.sort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers in random order with duplicates
    @Test
    public void testSelectionSort91() {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() % 10000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i * -1;
            }
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers in random order with duplicates
    @Test
    public void testSelectionSort92() {
        double[] arr = new double[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 10000 - 5000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i * -1.0;
            }
        }
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large positive and negative numbers with duplicates
    @Test
    public void testSelectionSort93() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1 : i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            }
        }
        Arrays.sort(arr);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large positive and negative floating point numbers with duplicates
    @Test
    public void testSelectionSort94() {
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i * -1.0 : i * 1.0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0.0;
            }
        }
        Arrays.sort(arr);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers in random order with all duplicates
    @Test
    public void testSelectionSort95() {
        double[] arr = new double[1000];
        Arrays.fill(arr, 5);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers in random order with all duplicates
    @Test
    public void testSelectionSort96() {
        double[] arr = new double[1000];
        Arrays.fill(arr, 3.5);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with large array of large and small positive and negative numbers with all duplicates
    @Test
    public void testSelectionSort97() {
        double[] arr = new double[1000];
        Arrays.fill(arr, -5);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr);
    }

    // Test selection sort with large array of large and small positive and negative floating point numbers with all duplicates
    @Test
    public void testSelectionSort98() {
        double[] arr = new double[1000];
        Arrays.fill(arr, -3.5);
        Selection_Sort_Algorithm.selectionSort(arr);
        double[] sortedArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        assertArrayEquals(sortedArr, arr, 0);
    }

    // Test selection sort with array containing only one element
    @Test
    public void testSelectionSort99() {
        double[] arr = {1};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1}, arr);
    }

    // Test selection sort with array containing only one element as floating point number
    @Test
    public void testSelectionSort100() {
        double[] arr = {1.0};
        Selection_Sort_Algorithm.selectionSort(arr);
        assertArrayEquals(new double[]{1.0}, arr, 0);
    }
}
