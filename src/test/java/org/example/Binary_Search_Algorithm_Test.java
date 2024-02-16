package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Binary_Search_Algorithm_Test {
    @Test
    public void testBinarySearch1() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch2() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch3() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        assertEquals(4, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Testing empty array
    @Test
    public void testBinarySearch4() {
        int[] arr = {};
        int x = 5;
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Testing array with one element
    @Test
    public void testBinarySearch5() {
        int[] arr = {5};
        int x = 5;
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Testing element not present in the array
    @Test
    public void testBinarySearch6() {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 4;
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Testing array with negative numbers
    @Test
    public void testBinarySearch7() {
        int[] arr = {-5, -3, -1, 0, 2};
        int x = -1;
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Testing array with duplicate elements
    @Test
    public void testBinarySearch8() {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int x = 2;
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Testing large array
    @Test
    public void testBinarySearch9() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        int x = 999;
        assertEquals(999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Adding more tests to reach 100
    // Test cases for numbers outside array bounds
    @Test
    public void testBinarySearch10() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6; // Number greater than the maximum in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch11() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0; // Number smaller than the minimum in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for empty array
    @Test
    public void testBinarySearch12() {
        int[] arr = {};
        int x = 5; // Number to search in an empty array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all negative numbers
    @Test
    public void testBinarySearch13() {
        int[] arr = {-5, -4, -3, -2, -1};
        int x = -4; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all positive numbers
    @Test
    public void testBinarySearch14() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4; // Number present in the array
        assertEquals(3, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all negative numbers
    @Test
    public void testBinarySearch15() {
        int[] arr = {-5, -4, -3, -2, -1};
        int x = -6; // Number not present in the array, smaller than the minimum
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch16() {
        int[] arr = {-5, -4, -3, -2, -1};
        int x = -1; // Number present at the end of the array
        assertEquals(4, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all positive numbers
    @Test
    public void testBinarySearch17() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6; // Number not present in the array, greater than the maximum
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch18() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1; // Number present at the beginning of the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with alternating positive and negative numbers
    @Test
    public void testBinarySearch19() {
        int[] arr = {-5, -3, -1, 1, 3, 5};
        int x = -3; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch20() {
        int[] arr = {-5, -3, -1, 1, 3, 5};
        int x = 0; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with repeating negative numbers
    @Test
    public void testBinarySearch21() {
        int[] arr = {-3, -3, -3, -3, -3};
        int x = -3; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch22() {
        int[] arr = {-3, -3, -3, -3, -3};
        int x = -2; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with repeating positive numbers
    @Test
    public void testBinarySearch23() {
        int[] arr = {3, 3, 3, 3, 3};
        int x = 3; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch24() {
        int[] arr = {3, 3, 3, 3, 3};
        int x = 4; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all identical elements
    @Test
    public void testBinarySearch25() {
        int[] arr = {2, 2, 2, 2, 2};
        int x = 2; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch26() {
        int[] arr = {2, 2, 2, 2, 2};
        int x = 3; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with negative and positive numbers
    @Test
    public void testBinarySearch27() {
        int[] arr = {-5, -3, -1, 1, 3, 5};
        int x = 5; // Number present in the array
        assertEquals(5, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch28() {
        int[] arr = {-5, -3, -1, 1, 3, 5};
        int x = -5; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large alternating positive and negative numbers
    @Test
    public void testBinarySearch29() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = 999998; // Number present in the array
        assertEquals(3, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch30() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = 0; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch31() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = -999999; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch32() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = -1000000; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large alternating positive and negative numbers
    @Test
    public void testBinarySearch33() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = 1000000; // Number present in the array
        assertEquals(5, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch34() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = 0; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large alternating positive and negative numbers
    @Test
    public void testBinarySearch35() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = 1; // Number present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch36() {
        int[] arr = {-1000000, -999999, -999998, 999998, 999999, 1000000};
        int x = -1; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for large arrays with positive numbers
    @Test
    public void testBinarySearch37() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i;
        }
        int x = 9999; // Number present in the array
        assertEquals(9999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch38() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i;
        }
        int x = 10000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for large arrays with negative numbers
    @Test
    public void testBinarySearch39() {
        int[] arr = new int[10000];
        int count = 0;
        for (int i = 9999; i >= 0; i--) {
            arr[count] = -i;
            count++;
        }
        int x = -9999; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch40() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = -i;
        }
        int x = -10000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for large arrays with positive and negative numbers
    @Test
    public void testBinarySearch41() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i - 5000;
        }
        int x = 0; // Number present in the array
        assertEquals(5000, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch42() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i - 5000;
        }
        int x = 10000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch43() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i - 5000;
        }
        int x = -5000; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch44() {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i - 5000;
        }
        int x = 5000;
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with very large numbers
    @Test
    public void testBinarySearch45() {
        int[] arr = {Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
        int x = Integer.MAX_VALUE - 1; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch46() {
        int[] arr = {Integer.MIN_VALUE, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2};
        int x = Integer.MIN_VALUE; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with repeated elements
    @Test
    public void testBinarySearch47() {
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int x = 2; // Number present in the array
        assertEquals(4, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch48() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int x = 2; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with elements in descending order
    @Test
    public void testBinarySearch49() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 3; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch50() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 6; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with elements in ascending order
    @Test
    public void testBinarySearch51() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 2; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch52() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with random elements
    @Test
    public void testBinarySearch53() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int x = 11; // Number present in the array
        assertEquals(5, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch54() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int x = 6; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch55() {
        int[] arr = {10, 8, 6, 4, 2};
        int x = 6; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch56() {
        int[] arr = {10, 8, 6, 4, 2};
        int x = 7; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with repeating elements
    @Test
    public void testBinarySearch57() {
        int[] arr = {2, 2, 4, 4, 6, 6, 8, 8};
        int x = 4; // Number present in the array
        assertEquals(3, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch58() {
        int[] arr = {2, 2, 4, 4, 6, 6, 8, 8};
        int x = 5; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with negative and positive elements
    @Test
    public void testBinarySearch59() {
        int[] arr = {-10, -5, 0, 5, 10};
        int x = 0; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch60() {
        int[] arr = {-10, -5, 0, 5, 10};
        int x = 7; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large consecutive numbers
    @Test
    public void testBinarySearch61() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        int x = 999999; // Number present in the array
        assertEquals(999999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch62() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        int x = 1000000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large consecutive negative numbers
    @Test
    public void testBinarySearch63() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        int x = 999999; // Number present in the array
        assertEquals(999999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch64() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = -i;
        }
        int x = -1000000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch65() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 500000; i++) {
            arr[i] = -i;
        }
        for (int i = 500000; i < 1000000; i++) {
            arr[i] = i - 500000;
        }
        int x = -499999; // Number present in the array
        assertEquals(499999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch66() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 500000; i++) {
            arr[i] = -i;
        }
        for (int i = 500000; i < 1000000; i++) {
            arr[i] = i - 500000;
        }
        int x = 500000; // Number present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large consecutive negative and positive numbers
    @Test
    public void testBinarySearch67() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 500000; i++) {
            arr[i] = -i;
        }
        for (int i = 500000; i < 1000000; i++) {
            arr[i] = i - 500000;
        }
        int x = 0; // Number present in the array
        assertEquals(500000, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch68() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 500000; i++) {
            arr[i] = -i;
        }
        for (int i = 500000; i < 1000000; i++) {
            arr[i] = i - 500000;
        }
        int x = 1000000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with repeating large elements
    @Test
    public void testBinarySearch69() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = 5;
        }
        int x = 5; // Number present in the array
        assertEquals(499999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch70() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = 5;
        }
        int x = 6; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all zeros
    @Test
    public void testBinarySearch71() {
        int[] arr = new int[1000000];
        int x = 0; // Number present in the array
        assertEquals(499999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch72() {
        int[] arr = new int[1000000];
        int x = 1; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with large elements in descending order
    @Test
    public void testBinarySearch73() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i - 1000000;
        }
        int x = 999999;
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch74() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = 1000000 - i;
        }
        int x = 1000000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch75() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        int x = 999999; // Number present in the array
        assertEquals(999999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch76() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        int x = 1000000; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch77() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i - 10;
        }
        int x = 9; // Number present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch78() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = 1000000 - i;
        }
        int x = 1000001; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all elements as 1
    @Test
    public void testBinarySearch79() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = 1;
        }
        int x = 1; // Number present in the array
        assertEquals(499999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch80() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = 1;
        }
        int x = 2; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all elements as 0
    @Test
    public void testBinarySearch81() {
        int[] arr = new int[1000000];
        int x = 0; // Number present in the array
        assertEquals(499999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch82() {
        int[] arr = new int[1000000];
        int x = 1; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with all elements as -1
    @Test
    public void testBinarySearch83() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = -1;
        }
        int x = -1; // Number present in the array
        assertEquals(499999, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch84() {
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = -1;
        }
        int x = 0; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch85() {
        int[] arr = {};
        int x = 5; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch86() {
        int[] arr = {};
        int x = 0; // Number not present in the empty array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for single-element array
    @Test
    public void testBinarySearch87() {
        int[] arr = {10};
        int x = 10; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch88() {
        int[] arr = {10};
        int x = 5; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with two elements
    @Test
    public void testBinarySearch89() {
        int[] arr = {2, 5};
        int x = 2; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch90() {
        int[] arr = {2, 5};
        int x = 5; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch91() {
        int[] arr = {2, 5};
        int x = 4; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with three elements
    @Test
    public void testBinarySearch92() {
        int[] arr = {1, 3, 5};
        int x = 1; // Number present in the array
        assertEquals(0, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch93() {
        int[] arr = {1, 3, 5};
        int x = 3; // Number present in the array
        assertEquals(1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch94() {
        int[] arr = {1, 3, 5};
        int x = 5; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch95() {
        int[] arr = {1, 3, 5};
        int x = 2; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch96() {
        int[] arr = {1, 3, 5};
        int x = 4; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch97() {
        int[] arr = {1, 3, 5};
        int x = 6; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    // Test cases for array with repeated elements
    @Test
    public void testBinarySearch98() {
        int[] arr = {2, 2, 2, 2, 2, 2};
        int x = 2; // Number present in the array
        assertEquals(2, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch99() {
        int[] arr = {2, 2, 2, 2, 2, 2};
        int x = 3; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }

    @Test
    public void testBinarySearch100() {
        int[] arr = {2, 2, 2, 2, 2, 2};
        int x = 1; // Number not present in the array
        assertEquals(-1, Binary_Search_Algorithm.binarySearch(arr, x));
    }
}
