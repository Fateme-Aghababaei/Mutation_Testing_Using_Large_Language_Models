package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Linear_Search_Algorithm_Test {
    // Test 1: Searching for an element present at the beginning of the array
    @Test
    public void testLinearSearch1() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 2: Searching for an element present at the end of the array
    @Test
    public void testLinearSearch2() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 3: Searching for an element present in the middle of the array
    @Test
    public void testLinearSearch3() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 4: Searching for an element not present in the array
    @Test
    public void testLinearSearch4() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 5: Searching for an element in an empty array
    @Test
    public void testLinearSearch5() {
        int[] arr = {};
        int x = 1;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 6: Searching for an element in an array with a single element
    @Test
    public void testLinearSearch6() {
        int[] arr = {1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 7: Searching for an element in an array with multiple occurrences
    @Test
    public void testLinearSearch7() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        int x = 2;
        int expected = 1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 8: Searching for an element in a large array
    @Test
    public void testLinearSearch8() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        int x = 999;
        int expected = 999;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 9: Searching for an element in a large array, not present
    @Test
    public void testLinearSearch9() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        int x = 1000;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 10: Searching for an element in a large array, present at the beginning
    @Test
    public void testLinearSearch10() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        int x = 0;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 11: Searching for an element in a large array, present in the middle
    @Test
    public void testLinearSearch11() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        int x = 500;
        int expected = 500;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 12: Searching for an element in a large array, present multiple times
    @Test
    public void testLinearSearch12() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i % 10; // Filling array with numbers 0 to 9 repeatedly
        }
        int x = 5;
        int expected = 5;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 13
    @Test
    public void testLinearSearch13() {
        int[] arr = {3, 6, 9, 12, 15};
        int x = 12;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 14
    @Test
    public void testLinearSearch14() {
        int[] arr = {5, 10, 15, 20, 25};
        int x = 20;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 15
    @Test
    public void testLinearSearch15() {
        int[] arr = {4, 8, 12, 16, 20};
        int x = 4;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 16
    @Test
    public void testLinearSearch16() {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 7;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 17
    @Test
    public void testLinearSearch17() {
        int[] arr = {2, 4, 6, 8, 10};
        int x = 10;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 18
    @Test
    public void testLinearSearch18() {
        int[] arr = {5, 10, 15, 20, 25};
        int x = 25;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 19
    @Test
    public void testLinearSearch19() {
        int[] arr = {2, 4, 6, 8, 10};
        int x = 3;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 20
    @Test
    public void testLinearSearch20() {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 21
    @Test
    public void testLinearSearch21() {
        int[] arr = {4, 8, 12, 16, 20};
        int x = 15;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 22
    @Test
    public void testLinearSearch22() {
        int[] arr = {};
        int x = 5;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 23
    @Test
    public void testLinearSearch23() {
        int[] arr = {5};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 24
    @Test
    public void testLinearSearch24() {
        int[] arr = {1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 25
    @Test
    public void testLinearSearch25() {
        int[] arr = {2, 4, 6, 8, 10};
        int x = 8;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 26
    @Test
    public void testLinearSearch26() {
        int[] arr = {3, 6, 9, 12, 15};
        int x = 20;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 27
    @Test
    public void testLinearSearch27() {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 2;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 28
    @Test
    public void testLinearSearch28() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 29
    @Test
    public void testLinearSearch29() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 30
    @Test
    public void testLinearSearch30() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 1;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 31
    @Test
    public void testLinearSearch31() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 32
    @Test
    public void testLinearSearch32() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 33
    @Test
    public void testLinearSearch33() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 34
    @Test
    public void testLinearSearch34() {
        int[] arr = {5};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 35
    @Test
    public void testLinearSearch35() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 36
    @Test
    public void testLinearSearch36() {
        int[] arr = {2, 3, 4, 5};
        int x = 1;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 37
    @Test
    public void testLinearSearch37() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 38
    @Test
    public void testLinearSearch38() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 39
    @Test
    public void testLinearSearch39() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 40
    @Test
    public void testLinearSearch40() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 2;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 41
    @Test
    public void testLinearSearch41() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 2;
        int expected = 1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 42
    @Test
    public void testLinearSearch42() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 43
    @Test
    public void testLinearSearch43() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 44
    @Test
    public void testLinearSearch44() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 1;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 45
    @Test
    public void testLinearSearch45() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 46
    @Test
    public void testLinearSearch46() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 47
    @Test
    public void testLinearSearch47() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 48
    @Test
    public void testLinearSearch48() {
        int[] arr = {5};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 49
    @Test
    public void testLinearSearch49() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 50
    @Test
    public void testLinearSearch50() {
        int[] arr = {2, 3, 4, 5};
        int x = 1;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 51
    @Test
    public void testLinearSearch51() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 52
    @Test
    public void testLinearSearch52() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 53
    @Test
    public void testLinearSearch53() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 54
    @Test
    public void testLinearSearch54() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 2;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 55
    @Test
    public void testLinearSearch55() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 2;
        int expected = 1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 56
    @Test
    public void testLinearSearch56() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 57
    @Test
    public void testLinearSearch57() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 58
    @Test
    public void testLinearSearch58() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 1;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 59
    @Test
    public void testLinearSearch59() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 60
    @Test
    public void testLinearSearch60() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 61
    @Test
    public void testLinearSearch61() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 62
    @Test
    public void testLinearSearch62() {
        int[] arr = {5};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 63
    @Test
    public void testLinearSearch63() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 64
    @Test
    public void testLinearSearch64() {
        int[] arr = {2, 3, 4, 5};
        int x = 1;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 65
    @Test
    public void testLinearSearch65() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 66
    @Test
    public void testLinearSearch66() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 67
    @Test
    public void testLinearSearch67() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 68
    @Test
    public void testLinearSearch68() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 2;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 69
    @Test
    public void testLinearSearch69() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 2;
        int expected = 1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 70
    @Test
    public void testLinearSearch70() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 71
    @Test
    public void testLinearSearch71() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 72
    @Test
    public void testLinearSearch72() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 1;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 73
    @Test
    public void testLinearSearch73() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 74
    @Test
    public void testLinearSearch74() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 75
    @Test
    public void testLinearSearch75() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 76
    @Test
    public void testLinearSearch76() {
        int[] arr = {5};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 77
    @Test
    public void testLinearSearch77() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 78
    @Test
    public void testLinearSearch78() {
        int[] arr = {2, 3, 4, 5};
        int x = 1;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 79
    @Test
    public void testLinearSearch79() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 3;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 80
    @Test
    public void testLinearSearch80() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 81
    @Test
    public void testLinearSearch81() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 82
    @Test
    public void testLinearSearch82() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 2;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 83
    @Test
    public void testLinearSearch83() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 2;
        int expected = 1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 84
    @Test
    public void testLinearSearch84() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 85
    @Test
    public void testLinearSearch85() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 5;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 86
    @Test
    public void testLinearSearch86() {
        int[] arr = {5, 4, 3, 2, 1};
        int x = 1;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 87
    @Test
    public void testLinearSearch87() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 88
    @Test
    public void testLinearSearch88() {
        int[] arr = {1, 1, 1, 1, 1};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 89
    @Test
    public void testLinearSearch89() {
        int[] arr = {5, 10, 15, 20, 25};
        int x = 20;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 90
    @Test
    public void testLinearSearch90() {
        int[] arr = {4, 8, 12, 16, 20};
        int x = 16;
        int expected = 3;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 91
    @Test
    public void testLinearSearch91() {
        int[] arr = {3, 6, 9, 12, 15};
        int x = 9;
        int expected = 2;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 92
    @Test
    public void testLinearSearch92() {
        int[] arr = {2, 4, 6, 8, 10};
        int x = 5;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 93
    @Test
    public void testLinearSearch93() {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 1;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 94
    @Test
    public void testLinearSearch94() {
        int[] arr = {4, 8, 12, 16, 20};
        int x = 20;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 95
    @Test
    public void testLinearSearch95() {
        int[] arr = {3, 6, 9, 12, 15};
        int x = 3;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 96
    @Test
    public void testLinearSearch96() {
        int[] arr = {2, 4, 6, 8, 10};
        int x = 11;
        int expected = -1;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 97
    @Test
    public void testLinearSearch97() {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 9;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 98
    @Test
    public void testLinearSearch98() {
        int[] arr = {4, 8, 12, 16, 20};
        int x = 4;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 99
    @Test
    public void testLinearSearch99() {
        int[] arr = {3, 6, 9, 12, 15};
        int x = 15;
        int expected = 4;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }

    // Test 100
    @Test
    public void testLinearSearch100() {
        int[] arr = {2, 4, 6, 8, 10};
        int x = 2;
        int expected = 0;
        int actual = Linear_Search_Algorithm.linearSearch(arr, x);
        assertEquals(expected, actual);
    }
}
