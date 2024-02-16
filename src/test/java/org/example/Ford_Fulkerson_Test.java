package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Ford_Fulkerson_Test {
    @Test
    public void testFordFulkerson1() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(23, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson2() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson3() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 16, 13, -3, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(23, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson4() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 16, 13, 0, 10, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 9, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 3, 0}
        };
        assertEquals(23, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson5() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, Integer.MAX_VALUE, 0, 0, 0, 0},
                {0, 0, Integer.MAX_VALUE, 0, 0, 0},
                {0, 0, 0, Integer.MAX_VALUE, 0, 0},
                {0, 0, 0, 0, Integer.MAX_VALUE, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson6() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, Integer.MIN_VALUE, 0, 0, 0, 0},
                {0, 0, Integer.MIN_VALUE, 0, 0, 0},
                {0, 0, 0, Integer.MIN_VALUE, 0, 0},
                {0, 0,0, 0, Integer.MIN_VALUE, 0, 0, Integer.MIN_VALUE},
                {0, 0, 0, 0, Integer.MIN_VALUE, 0},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson7() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(5, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson8() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 16, 13, 5, 2, 0},
                {0, 0, 10, 12, 4, 0},
                {0, 4, 0, 0, 0, 0},
                {0, 9, 9, 0, 0, 0},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, fordFulkerson.fordFulkerson(graph, 0, 0));
    }

    @Test
    public void testFordFulkerson9() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 16, 13, 5, 2, 0},
                {0, 0, 10, 12, 4, 0},
                {0, 4, 0, 0, 0, 0},
                {0, 9, 9, 0, 0, 0},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(4, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson10() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = new int[6][6]; // Empty graph
        assertEquals(0, fordFulkerson.fordFulkerson(graph, 0, 5));
    }

    @Test
    public void testFordFulkerson11() {
        Ford_Fulkerson_Algorithm fordFulkerson = new Ford_Fulkerson_Algorithm();
        int[][] graph = {
                {0, 10, 14, 5, 2, 0},
                {0, 0, 10, 11, 4, 0},
                {0, 4, 0, 0, 0, 0},
                {0, 9, 9, 3, 6, 0},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        assertEquals(4, fordFulkerson.fordFulkerson(graph, 0, 5));
    }
}
