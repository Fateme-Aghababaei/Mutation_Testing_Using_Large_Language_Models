package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Quick_Sort_Algorithm_Test {
    @Test
    public void testQuickSort1() {
        int[] arr = {3, 2, 1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testQuickSort2() {
        int[] arr = {1, 2, 3};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    // Continue with various permutations of input arrays and edge cases...

    @Test
    public void testQuickSort3() {
        int[] arr = {5, 5, 5, 5, 5};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    public void testQuickSort4() {
        int[] arr = {1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1}, arr);
    }

    // Test for empty array
    @Test
    public void testQuickSort5() {
        int[] arr = {};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{}, arr);
    }

    // Test for negative numbers
    @Test
    public void testQuickSort6() {
        int[] arr = {-2, 3, 0, -5, 7};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{-5, -2, 0, 3, 7}, arr);
    }

    // Test for already sorted array
    @Test
    public void testQuickSort7() {
        int[] arr = {1, 2, 3, 4, 5};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    // Test for reverse sorted array
    @Test
    public void testQuickSort8() {
        int[] arr = {5, 4, 3, 2, 1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    // Test for large array
    @Test
    public void testQuickSort9() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    // Test for repeated elements
    @Test
    public void testQuickSort10() {
        int[] arr = {4, 2, 2, 1, 4, 3};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 4}, arr);
    }

    // Test for an array with all elements the same
    @Test
    public void testQuickSort11() {
        int[] arr = {7, 7, 7, 7, 7};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, arr);
    }

    // Test for an array with two elements
    @Test
    public void testQuickSort12() {
        int[] arr = {2, 1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    // Test for an array with three elements
    @Test
    public void testQuickSort13() {
        int[] arr = {3, 1, 2};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    // Test for an array with duplicate elements
    @Test
    public void testQuickSort14() {
        int[] arr = {2, 1, 3, 1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 1, 2, 3}, arr);
    }

    // Test for an array with all elements the same except one
    @Test
    public void testQuickSort15() {
        int[] arr = {1, 1, 1, 1, 2};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 1, 1, 1, 2}, arr);
    }

    // Test for a large array with random elements
    @Test
    public void testQuickSort16() {
        int[] arr = {5, 8, 1, 6, 3, 7, 2, 9, 4};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    // Test for an array with all elements the same in descending order
    @Test
    public void testQuickSort17() {
        int[] arr = {5, 5, 5, 5, 4};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{4, 5, 5, 5, 5}, arr);
    }

    // Test for an array with one element repeated many times
    @Test
    public void testQuickSort18() {
        int[] arr = {3, 3, 3, 3, 3, 3, 3, 3};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{3, 3, 3, 3, 3, 3, 3, 3}, arr);
    }

    // Test for an array with alternating elements
    @Test
    public void testQuickSort19() {
        int[] arr = {1, 2, 1, 2, 1, 2};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2}, arr);
    }

    // Test for an array with negative and positive elements
    @Test
    public void testQuickSort20() {
        int[] arr = {-3, 2, -1, 0, 4, -2, 1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2, 4}, arr);
    }

    // Test for an array with all negative elements
    @Test
    public void testQuickSort21() {
        int[] arr = {-5, -3, -7, -1, -4};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{-7, -5, -4, -3, -1}, arr);
    }

    // Test for an array with one element
    @Test
    public void testQuickSort22() {
        int[] arr = {0};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{0}, arr);
    }

    // Test for an array with two duplicate elements
    @Test
    public void testQuickSort23() {
        int[] arr = {1, 1};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 1}, arr);
    }

    // Test for an array with two identical elements
    @Test
    public void testQuickSort24() {
        int[] arr = {3, 3};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{3, 3}, arr);
    }

    // Test for an array with elements in descending order
    @Test
    public void testQuickSort25() {
        int[] arr = {4, 3, 2, 1, 0};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, arr);
    }

    // Test for an array with elements in ascending order
    @Test
    public void testQuickSort26() {
        int[] arr = {0, 1, 2, 3, 4};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, arr);
    }

    // Test for an array with all elements equal to zero
    @Test
    public void testQuickSort27() {
        int[] arr = {0, 0, 0, 0, 0};
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, arr);
    }

    // Test for a large array with all elements the same
    @Test
    public void testQuickSort28() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = 5;
        }
        assertArrayEquals(expected, arr);
    }

    // Test for a large array with alternating elements
    @Test
    public void testQuickSort29() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? 1 : 2;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2)
                expected[i] = 1;
            else
                expected[i] = 2;
        }
        assertArrayEquals(expected, arr);
    }

    // Test for a large array with random elements
    @Test
    public void testQuickSort30() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements in descending order
    @Test
    public void testQuickSort31() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements in ascending order
    @Test
    public void testQuickSort32() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements equal to the pivot
    @Test
    public void testQuickSort33() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = 5;
        }
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort34() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1000 - i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements in ascending order
    @Test
    public void testQuickSort35() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and some duplicates
    @Test
    public void testQuickSort36() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 10;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and negative values
    @Test
    public void testQuickSort37() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i - 500;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and large range of values
    @Test
    public void testQuickSort38() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and large negative range of values
    @Test
    public void testQuickSort39() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * -10000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and negative values
    @Test
    public void testQuickSort40() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2000) - 1000;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and all values zero
    @Test
    public void testQuickSort41() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and all values one
    @Test
    public void testQuickSort42() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and all values negative one
    @Test
    public void testQuickSort43() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and all values negative
    @Test
    public void testQuickSort44() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1000;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and all values positive
    @Test
    public void testQuickSort45() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1000;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and values at upper bound
    @Test
    public void testQuickSort46() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and values at lower bound
    @Test
    public void testQuickSort47() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    @Test
    public void testQuickSort48() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i == 500 ? Integer.MAX_VALUE : (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and some elements at lower bound
    @Test
    public void testQuickSort49() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i == 500 ? Integer.MIN_VALUE : (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements and some elements at upper and lower bounds
    @Test
    public void testQuickSort50() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            if (i == 250 || i == 750) {
                arr[i] = Integer.MAX_VALUE;
            } else if (i == 500) {
                arr[i] = Integer.MIN_VALUE;
            } else {
                arr[i] = (int) (Math.random() * 1000);
            }
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for an array with all elements the same, larger size
    @Test
    public void testQuickSort51() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = 5;
        }
        assertArrayEquals(expected, arr);
    }

    // Test for an array with all elements in descending order, larger size
    @Test
    public void testQuickSort52() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for an array with all elements in ascending order, larger size
    @Test
    public void testQuickSort53() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for an array with all elements in random order, larger size
    @Test
    public void testQuickSort54() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for an array with all elements negative, larger size
    @Test
    public void testQuickSort55() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for an array with alternating elements, larger size
    @Test
    public void testQuickSort56() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? 1 : 2;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for an array with all elements the same, larger size
    @Test
    public void testQuickSort57() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = 5;
        }
        assertArrayEquals(expected, arr);
    }

    // Test for an array with all elements equal to the pivot, larger size
    @Test
    public void testQuickSort58() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = 5;
        }
        assertArrayEquals(expected, arr);
    }

    // Test for a large array with all elements the same in descending order
    @Test
    public void testQuickSort59() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1000 - i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements the same in ascending order
    @Test
    public void testQuickSort60() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements negative, larger size
    @Test
    public void testQuickSort61() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements positive, larger size
    @Test
    public void testQuickSort62() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with all elements equal, larger size
    @Test
    public void testQuickSort63() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        int[] expected = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = 5;
        }
        assertArrayEquals(expected, arr);
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort64() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort65() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    @Test
    public void testQuickSort66() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort67() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort68() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort69() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort70() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort71() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort72() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort73() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort74() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort75() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort76() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort77() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort78() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort79() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort80() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort81() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort82() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort83() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort84() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort85() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort86() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort87() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort88() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort89() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort90() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort91() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort92() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort93() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort94() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort95() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort96() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort97() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort98() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort99() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    // Test for a large array with random elements, larger size
    @Test
    public void testQuickSort100() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Quick_Sort_Algorithm.quickSort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }
}
