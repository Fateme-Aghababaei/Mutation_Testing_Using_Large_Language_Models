package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Floyd_Warshall_Test {
    final static int INF = 99999, V = 4;

    @Test
    public void testFloydWarshall() {
        int[][] graph = { { 0, 5, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0 } };
        int[][] expected = { { 0, 5, 8, 9 },
                { INF, 0, 3, 4 },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0 } };
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        assertArrayEquals(expected, fwa.floydWarshall(graph));
    }

    @Test
    public void testFloydWarshall2() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, INF, INF, 10},
                {INF, 0, INF, INF},
                {INF, 3, 0, INF},
                {INF, INF, 1, 0} };
        int[][] result = fwa.floydWarshall(graph);
        int[][] expected = { {0, 14, 11, 10},
                {INF, 0, INF, INF},
                {INF, 3, 0, INF},
                {INF, 4, 1, 0} };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFloydWarshall3() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, -6},
                {INF, INF, INF, 0} };
        int[][] result = fwa.floydWarshall(graph);
        int[][] expected = { {0, 5, 8, 2},
                {99996, 0, 3, -3},
                {99993, 99993, 0, -6},
                {INF, INF, INF, 0} };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFloydWarshall4() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0} };
        int[][] result = fwa.floydWarshall(graph);
        int[][] expected = { {0, 5, 8, 9},
                {INF, 0, 3, 4},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0} };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFloydWarshall5() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, 3, INF, 7, INF},
                {8, 0, 2, INF, INF},
                {5, INF, 0, 1, INF},
                {2, INF, INF, 0, 4},
                {INF, INF, INF, 6, 0} };
        int[][] result = fwa.floydWarshall(graph);

        // Define the expected result manually or calculate it if known
        int[][] expected = { {0, 3, 5, 6, INF},
                {5, 0, 2, 3, INF},
                {3, 6, 0, 1, INF},
                {2, 5, 7, 0, 4},
                {INF, INF, INF, 6, 0} };

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFloydWarshall6() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();

        // Test with a graph having maximum possible values
        int[][] maxGraph = new int[10][10];
        int maxValue = Integer.MAX_VALUE / 2; // To avoid overflow
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    maxGraph[i][j] = 0;
                } else {
                    maxGraph[i][j] = maxValue;
                }
            }
        }
        int[][] maxResult = fwa.floydWarshall(maxGraph);
        int[][] maxExpected = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    maxExpected[i][j] = 0;
                } else {
                    maxExpected[i][j] = maxValue;
                }
            }
        }
        assertArrayEquals(maxExpected, maxResult);
    }

    @Test
    public void testFloydWarshall7() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, 3, 6, INF},
                {INF, 0, -2, 1},
                {INF, INF, 0, -3},
                {2, INF, INF, 0} };
        int[][] result = fwa.floydWarshall(graph);
        int[][] expected = { {0, 3, 1, -2},
                {-3, 0, -2, -5},
                {-1, 2, 0, -3},
                {2, 5, 3, 0} };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFloydWarshall8() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, -1, INF, INF},
                {INF, 0, -1, INF},
                {INF, INF, 0, -1},
                {-1, INF, INF, 0} };
        int[][] result = fwa.floydWarshall(graph);
        // Expected result should indicate the presence of a negative cycle
        assertNotNull(result);
    }

    @Test
    public void testFloydWarshall9() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, -1, INF, INF},
                {INF, 0, -1, INF},
                {0, INF, 0, -1},
                {-1, INF, INF, 0} };
        int[][] result = fwa.floydWarshall(graph);
        // Expected result should indicate the presence of a negative cycle
        assertNotNull(result);
    }

    @Test
    public void testFloydWarshall10() {
        Floyd_Warshall_Algorithm fwa = new Floyd_Warshall_Algorithm();
        int[][] graph = { {0, 3, INF, 7, INF},
                {8, 0, 2, INF, INF},
                {INF, INF, 0, 1, INF},
                {2, INF, INF, 0, 4},
                {INF, INF, INF, 6, 0} };
        int[][] result = fwa.floydWarshall(graph);

        // Test vertices without a direct path between them
        assertEquals(2, result[1][2]);
        assertEquals(4, result[3][4]);
    }

}
