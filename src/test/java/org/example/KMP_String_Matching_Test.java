package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class KMP_String_Matching_Test {
    @Test
    public void testKMP1() {
        String text = "abcdeabcd";
        String pattern = "abcd";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        expectedIndexes.add(5);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP2() {
        String text = "abcdeabcd";
        String pattern = "bcd";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(1);
        expectedIndexes.add(6);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP3() {
        String text = "abcdeabcdabcdab";
        String pattern = "abcd";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        expectedIndexes.add(5);
        expectedIndexes.add(9);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP4() {
        String text = "abcdeabcd";
        String pattern = "xyz";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP5() {
        String text = "abcdeabcd";
        String pattern = "x";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP6() {
        String text = "";
        String pattern = "abcd";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP7() {
        String text = "";
        String pattern = "s";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP8() {
        String text = "abababab";
        String pattern = "abab";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        expectedIndexes.add(2);
        expectedIndexes.add(4);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP9() {
        String text = "abcde@#$%abcd";
        String pattern = "@#$%";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(5);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP10() {
        String text = "vnnvlkdjfvfvfnvf";
        String pattern = "fn";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(12);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP11() {
        String text = "ababcababcab";
        String pattern = "abc";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(2);
        expectedIndexes.add(7);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP12() {
        String text = "abcd";
        String pattern = "abcdefgh";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP13() {
        String text = "abc";
        String pattern = "abc";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP14() {
        String text = "abcdabcd";
        String pattern = "abcdabcd";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP15() {
        String text = "abcdeabcd";
        String pattern = "a";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        expectedIndexes.add(5);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP16() {
        String text = "abbbbaabb";
        String pattern = "bb";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(1);
        expectedIndexes.add(2);
        expectedIndexes.add(3);
        expectedIndexes.add(7);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP17() {
        String text = "abcdeabcd";
        String pattern = "v";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP18() {
        String text = "";
        String pattern = "abcd";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP19() {
        String text = "hello world";
        String pattern = " w";
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(5);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }

    @Test
    public void testKMP20() {
        // Testing with a large text and pattern to check performance
        StringBuilder textBuilder = new StringBuilder();
        StringBuilder patternBuilder = new StringBuilder();
        int size = 1000000;
        for (int i = 0; i < size; i++) {
            textBuilder.append("a");
            patternBuilder.append("a");
        }
        String text = textBuilder.toString();
        String pattern = patternBuilder.toString();
        ArrayList<Integer> expectedIndexes = new ArrayList<>();
        expectedIndexes.add(0);
        assertEquals(expectedIndexes, KMP_String_Matching_Algorithm.KMPSearch(pattern, text));
    }
}
