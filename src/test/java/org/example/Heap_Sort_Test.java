package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Heap_Sort_Test {
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testRandomArray() {
        int[] arr = {4, 2, 7, 1, 9, 5};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 7, 9}, arr);
    }

    @Test
    public void testArrayWithDuplicateElements() {
        int[] arr = {4, 2, 4, 1, 2, 5};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4, 5}, arr);
    }

    @Test
    public void testArrayWithNegativeElements() {
        int[] arr = {4, -2, 7, -1, 9, 5};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{-2, -1, 4, 5, 7, 9}, arr);
    }

    @Test
    public void testArrayWithAllNegativeElements() {
        int[] arr = {-10000, -9999, -9998, -9997, -9996, -9995};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{-10000, -9999, -9998, -9997, -9996, -9995}, arr);
    }

    @Test
    public void testArrayWithAllPositiveElements() {
        int[] arr = {10000, 9999, 9998, 9997, 9996, 9995};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{9995, 9996, 9997, 9998, 9999, 10000}, arr);
    }

    @Test
    public void testArrayWithZero() {
        int[] arr = {0};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    public void testArrayWithAllZeroes() {
        int[] arr = {0, 0, 0, 0, 0, 0};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, arr);
    }

    @Test
    public void testArrayWithPositiveAndNegativeZeroes() {
        int[] arr = {0, 0, 0, -1, -1, -1};
        Heap_Sort_Algorithm sorter = new Heap_Sort_Algorithm();
        sorter.sort(arr);
        assertArrayEquals(new int[]{-1, -1, -1, 0, 0, 0}, arr);
    }
}
