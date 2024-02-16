package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Bubble_Sort_Algorithm_Test {
    @Test
    public void testBubbleSort1() {
        // test empty array
        int[] arr = {};
        Bubble_Sort_Algorithm.bubbleSort(arr, 0);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testBubbleSort2() {
        // test Single Element Array
        int[] arr = {5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 1);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testBubbleSort3() {
        // test Two Element Array
        int[] arr = {5, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 2);
        assertArrayEquals(new int[]{3, 5}, arr);
    }

    @Test
    public void testBubbleSort4() {
        // test Sorted Array
        int[] arr = {1, 2, 3, 4, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort5() {
        // test Reverse Sorted Array
        int[] arr = {5, 4, 3, 2, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort6() {
        // test Random Array
        int[] arr = {3, 7, 1, 9, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 3, 4, 7, 9}, arr);
    }

    @Test
    public void testBubbleSort7() {
        // test Array with duplicates
        int[] arr = {5, 2, 8, 2, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{2, 2, 5, 5, 8}, arr);
    }

    @Test
    public void testBubbleSort8() {
        // test Array with negative numbers
        int[] arr = {3, -2, 7, -5, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{-5, -2, 1, 3, 7}, arr);
    }

    @Test
    public void testBubbleSort9() {
        // test Array with zero
        int[] arr = {3, 0, 7, 0, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{0, 0, 1, 3, 7}, arr);
    }

    @Test
    public void testBubbleSort10() {
        // test Array with large numbers
        int[] arr = {1000, 5000, 2000, 7000, 3000};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1000, 2000, 3000, 5000, 7000}, arr);
    }

    @Test
    public void testBubbleSort11() {
        // test Array with same numbers
        int[] arr = {2, 2, 2, 2, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, arr);
    }

    @Test
    public void testBubbleSort12() {
        // test Array with negative and positive numbers
        int[] arr = {-3, 7, -1, 9, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{-3, -1, 4, 7, 9}, arr);
    }

    @Test
    public void testBubbleSort13() {
        // test Array with all zeroes
        int[] arr = {0, 0, 0, 0, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, arr);
    }

    @Test
    public void testBubbleSort14() {
        // test Array with one negative and all positive numbers
        int[] arr = {1, 2, 3, 4, -5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{-5, 1, 2, 3, 4}, arr);
    }

    @Test
    public void testBubbleSort15() {
        // test Array with one positive and all negative numbers
        int[] arr = {-1, -2, -3, -4, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{-4, -3, -2, -1, 5}, arr);
    }

    @Test
    public void testBubbleSort16() {
        // test Array with large negative numbers
        int[] arr = {-1000, -5000, -2000, -7000, -3000};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{-7000, -5000, -3000, -2000, -1000}, arr);
    }

    @Test
    public void testBubbleSort17() {
        // test empty array
        int[] arr = {};
        Bubble_Sort_Algorithm.bubbleSort(arr, 0);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testBubbleSort18() {
        // test Single Element Array
        int[] arr = {5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 1);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testBubbleSort19() {
        // test Two Element Array
        int[] arr = {5, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 2);
        assertArrayEquals(new int[]{3, 5}, arr);
    }

    @Test
    public void testBubbleSort20() {
        // test Random Array of Integer
        int[] arr = {5, 3, 9, 2, 7};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{2, 3, 5, 7, 9}, arr);
    }

    @Test
    public void testBubbleSort21() {
        // test performance with large random array
        int size = 10000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Bubble_Sort_Algorithm.bubbleSort(arr, size);
        for (int i = 0; i < size - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    public void testBubbleSort22() {
        int[] arr = {1000, 5000, 2000, 1000, 3000};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1000, 1000, 2000, 3000, 5000}, arr);
    }

    @Test
    public void testBubbleSort23() {
        int[] arr = {1, 5, 3, 1, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 1, 2, 3, 5}, arr);
    }

    @Test
    public void testBubbleSort24() {
        int[] arr = {2, 2, 2, 2, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, arr);
    }

    @Test
    public void testBubbleSort25() {
        int[] arr = {5, 4, 3, 2, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort26() {
        int[] arr = {2, 3, 1, 5, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort27() {
        int[] arr = {7, 7, 7, 7, 7};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, arr);
    }

    @Test
    public void testBubbleSort28() {
        int[] arr = {7, 7, 7, 7, 8};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{7, 7, 7, 7, 8}, arr);
    }

    @Test
    public void testBubbleSort29() {
        int[] arr = {-5, 0, 5, -3, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{-5, -3, 0, 3, 5}, arr);
    }

    @Test
    public void testBubbleSort30() {
        int size = 10000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        Bubble_Sort_Algorithm.bubbleSort(arr, size);
        for (int i = 0; i < size - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    public void testBubbleSort31() {
        int[] arr = {9, 8, 7, 6, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, arr);
    }

    @Test
    public void testBubbleSort32() {
        int[] arr = {1, 3, 5, 7, 9};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, arr);
    }

    @Test
    public void testBubbleSort33() {
        int[] arr = {1, 1, 1, 1, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, arr);
    }

    @Test
    public void testBubbleSort34() {
        int[] arr = {2, 2, 3, 3, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{2, 2, 3, 3, 4}, arr);
    }

    @Test
    public void testBubbleSort35() {
        int[] arr = {10, 8, 6, 4, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 5);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, arr);
    }

    @Test
    public void testBubbleSort36() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort37() {
        int[] arr = {6, 5, 4, 3, 2, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort38() {
        int[] arr = {0, 0, 0, 0, 0, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, arr);
    }

    @Test
    public void testBubbleSort39() {
        int[] arr = {1, 2, 3, 4, 5, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort40() {
        int[] arr = {5, 4, 3, 2, 1, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort41() {
        int[] arr = {5, 5, 5, 5, 5, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5, 5}, arr);
    }

    @Test
    public void testBubbleSort42() {
        int[] arr = {3, 4, 3, 4, 3, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{3, 3, 3, 4, 4, 4}, arr);
    }

    @Test
    public void testBubbleSort43() {
        int[] arr = {1, 5, 3, 2, 4, 6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort44() {
        int[] arr = {3, 5, 4, 6, 2, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort45() {
        int[] arr = {-3, -2, -1, 0, 1, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2}, arr);
    }

    @Test
    public void testBubbleSort46() {
        int[] arr = {2, -3, 1, -2, 0, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-3, -2, 0, 1, 2, 3}, arr);
    }

    @Test
    public void testBubbleSort47() {
        int[] arr = {5, -1, -3, -5, -2, -4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1, 5}, arr);
    }

    @Test
    public void testBubbleSort48() {
        int[] arr = {1, 2, 3, 4, 4, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 4}, arr);
    }

    @Test
    public void testBubbleSort49() {
        int[] arr = {3, 3, 3, 3, 2, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 3, 3, 3}, arr);
    }

    @Test
    public void testBubbleSort50() {
        int[] arr = {1, 3, 2, 4, 6, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort51() {
        int[] arr = {6, 4, 5, 3, 1, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort52() {
        int[] arr = {3, 1, 4, 1, 5, 9};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 1, 3, 4, 5, 9}, arr);
    }

    @Test
    public void testBubbleSort53() {
        int[] arr = {2, 2, 1, 1, 3, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, arr);
    }

    @Test
    public void testBubbleSort54() {
        int[] arr = {1, 2, 3, 3, 4, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 3, 4, 4}, arr);
    }

    @Test
    public void testBubbleSort55() {
        int[] arr = {3, 3, 2, 2, 1, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, arr);
    }

    @Test
    public void testBubbleSort56() {
        int[] arr = {5, 3, 1, 2, 4, 6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort57() {
        int[] arr = {6, 4, 5, 3, 2, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort58() {
        int[] arr = {2, 3, 1, 4, 9, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 9}, arr);
    }

    @Test
    public void testBubbleSort59() {
        int[] arr = {3, 4, 1, 9, 2, 6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 9}, arr);
    }

    @Test
    public void testBubbleSort60() {
        int[] arr = {5, 4, 3, 2, 1, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort61() {
        int[] arr = {0, 0, 0, 0, 0, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, arr);
    }

    @Test
    public void testBubbleSort62() {
        int[] arr = {-1, -2, -3, -4, -5, -6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1}, arr);
    }

    @Test
    public void testBubbleSort63() {
        int[] arr = {-6, -5, -4, -3, -2, -1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1}, arr);
    }

    @Test
    public void testBubbleSort64() {
        int[] arr = {-3, -1, -4, -1, -5, -9};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-9, -5, -4, -3, -1, -1}, arr);
    }

    @Test
    public void testBubbleSort65() {
        int[] arr = {-2, -2, -3, -3, -4, -4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-4, -4, -3, -3, -2, -2}, arr);
    }

    @Test
    public void testBubbleSort66() {
        int[] arr = {-10, -8, -6, -4, -2, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 6);
        assertArrayEquals(new int[]{-10, -8, -6, -4, -2, 0}, arr);
    }

    @Test
    public void testBubbleSort67() {
        int[] arr = {-6, -5, -4, -3, -2, -1, 0};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1, 0}, arr);
    }

    @Test
    public void testBubbleSort68() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBubbleSort69() {
        int[] arr = {-3, -2, -1, 0, 1, 2, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2, 3}, arr);
    }

    @Test
    public void testBubbleSort70() {
        int[] arr = {3, 2, 1, 0, -1, -2, -3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2, 3}, arr);
    }

    @Test
    public void testBubbleSort71() {
        int[] arr = {5, 4, 3, 2, 1, 0, -1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort72() {
        int[] arr = {1, 0, -1, -2, -3, -4, -5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1, 0, 1}, arr);
    }

    @Test
    public void testBubbleSort73() {
        int[] arr = {-3, -5, -1, -4, -2, 0, -6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1, 0}, arr);
    }

    @Test
    public void testBubbleSort74() {
        int[] arr = {0, -2, 1, -3, 2, -4, 3};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-4, -3, -2, 0, 1, 2, 3}, arr);
    }

    @Test
    public void testBubbleSort75() {
        int[] arr = {-1, -3, 0, -2, 1, -4, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-4, -3, -2, -1, 0, 1, 2}, arr);
    }

    @Test
    public void testBubbleSort76() {
        int[] arr = {-2, 3, -4, 5, -6, 7, -8};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-8, -6, -4, -2, 3, 5, 7}, arr);
    }

    @Test
    public void testBubbleSort77() {
        int[] arr = {7, -8, 5, -6, 3, -4, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-8, -6, -4, 1, 3, 5, 7}, arr);
    }

    @Test
    public void testBubbleSort78() {
        int[] arr = {3, -2, 5, -4, 7, -6, 9};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-6, -4, -2, 3, 5, 7, 9}, arr);
    }

    @Test
    public void testBubbleSort79() {
        int[] arr = {1, -4, 3, -6, 5, -8, 7};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-8, -6, -4, 1, 3, 5, 7}, arr);
    }

    @Test
    public void testBubbleSort80() {
        int[] arr = {-5, -3, -1, 1, 3, 5, 7};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-5, -3, -1, 1, 3, 5, 7}, arr);
    }

    @Test
    public void testBubbleSort81() {
        int[] arr = {7, 5, 3, 1, -1, -3, -5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-5, -3, -1, 1, 3, 5, 7}, arr);
    }

    @Test
    public void testBubbleSort82() {
        int[] arr = {-1, 0, 1, -2, 3, -4, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-4, -2, -1, 0, 1, 3, 5}, arr);
    }

    @Test
    public void testBubbleSort83() {
        int[] arr = {5, -3, 1, -4, 0, -2, -1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 7);
        assertArrayEquals(new int[]{-4, -3, -2, -1, 0, 1, 5}, arr);
    }

    @Test
    public void testBubbleSort84() {
        int[] arr = {5, 4, 3, 2, 1, 0, -1, -2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort85() {
        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort86() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -8};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-8, -7, -6, -5, -4, -3, -2, -1}, arr);
    }

    @Test
    public void testBubbleSort87() {
        int[] arr = {-8, -7, -6, -5, -4, -3, -2, -1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-8, -7, -6, -5, -4, -3, -2, -1}, arr);
    }

    @Test
    public void testBubbleSort88() {
        int[] arr = {-3, -1, -4, -1, -5, -9, -2, -6};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-9, -6, -5, -4, -3, -2, -1, -1}, arr);
    }

    @Test
    public void testBubbleSort89() {
        int[] arr = {-2, -2, -3, -3, -4, -4, -5, -5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-5, -5, -4, -4, -3, -3, -2, -2}, arr);
    }

    @Test
    public void testBubbleSort90() {
        int[] arr = {-10, -8, -6, -4, -2, 0, 2, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-10, -8, -6, -4, -2, 0, 2, 4}, arr);
    }

    @Test
    public void testBubbleSort91() {
        int[] arr = {0, -2, -4, -6, -8, -10, -12, -14};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-14, -12, -10, -8, -6, -4, -2, 0}, arr);
    }

    @Test
    public void testBubbleSort92() {
        int[] arr = {-6, -5, -4, -3, -2, -1, 0, 1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-6, -5, -4, -3, -2, -1, 0, 1}, arr);
    }

    @Test
    public void testBubbleSort93() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, arr);
    }

    @Test
    public void testBubbleSort94() {
        int[] arr = {-3, -2, -1, 0, 1, 2, 3, 4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2, 3, 4}, arr);
    }

    @Test
    public void testBubbleSort95() {
        int[] arr = {3, 2, 1, 0, -1, -2, -3, -4};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-4, -3, -2, -1, 0, 1, 2, 3}, arr);
    }

    @Test
    public void testBubbleSort96() {
        int[] arr = {-5, -4, -3, -2, -1, 0, 1, 2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1, 0, 1, 2}, arr);
    }

    @Test
    public void testBubbleSort97() {
        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort98() {
        int[] arr = {5, 4, 3, 2, 1, 0, -1, -2};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testBubbleSort99() {
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -8};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-8, -7, -6, -5, -4, -3, -2, -1}, arr);
    }

    @Test
    public void testBubbleSort100() {
        int[] arr = {-8, -7, -6, -5, -4, -3, -2, -1};
        Bubble_Sort_Algorithm.bubbleSort(arr, 8);
        assertArrayEquals(new int[]{-8, -7, -6, -5, -4, -3, -2, -1}, arr);
    }
}
