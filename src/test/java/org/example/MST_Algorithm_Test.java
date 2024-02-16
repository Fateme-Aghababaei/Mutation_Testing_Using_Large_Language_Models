package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class MST_Algorithm_Test {
    @Test
    public void testMST1() {
        // Test case with V = 1, E = 0
        int[][] edges = new int[][]{{0, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(1, 0, edges));
    }

    @Test
    public void testMST2() {
        // Test case with V = 2, E = 1
        int[][] edges = new int[][]{{0, 1, 5}};
        assertEquals(5, MST_Algorithm.spanningTree(2, 1, edges));
    }

    @Test
    public void testMST3() {
        // Test case with all vertices connected in a line
        int[][] edges = new int[][]{{0, 1, 3}, {1, 2, 4}, {2, 3, 5}, {3, 4, 6}};
        assertEquals(18, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST4() {
        // Test case with all vertices connected in a cycle
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 0, 4}};
        assertEquals(5, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST5() {
        // Test case with disconnected vertices
        int[][] edges = new int[][]{{0, 1, 2}, {2, 3, 3}, {4, 5, 4}};
        assertEquals(2, MST_Algorithm.spanningTree(6, 3, edges));
    }

    @Test
    public void testMST6() {
        // Test case with negative weights
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, 3}, {2, 0, 4}};
        assertEquals(1, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST7() {
        // Test case with all vertices connected in a star pattern
        int[][] edges = new int[][]{{0, 1, 1}, {0, 2, 2}, {0, 3, 3}, {0, 4, 4}};
        assertEquals(10, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST8() {
        // Test case with all edges having the same weight
        int[][] edges = new int[][]{{0, 1, 5}, {0, 2, 5}, {1, 2, 5}, {2, 3, 5}};
        assertEquals(15, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST9() {
        // Test case with one vertex and a negative weight
        int[][] edges = new int[][]{{0, 0, -3}};
        assertEquals(0, MST_Algorithm.spanningTree(1, 1, edges));
    }

    @Test
    public void testMST10() {
        // Test case with all edges having large weights
        int[][] edges = new int[][]{{0, 1, 1000000}, {1, 2, 1000000}, {2, 3, 1000000}};
        assertEquals(3000000, MST_Algorithm.spanningTree(4, 3, edges));
    }

    @Test
    public void testMST11() {
        // Test case with duplicate edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 0, 4}, {0, 1, 5}};
        assertEquals(5, MST_Algorithm.spanningTree(3, 4, edges));
    }

    @Test
    public void testMST12() {
        // Test case with large number of vertices and edges
        int[][] edges = new int[100][3];
        for (int i = 0; i < 100; i++) {
            edges[i] = new int[]{i, (i + 1) % 100, i + 1};
        }
        assertEquals(99 * 100 / 2, MST_Algorithm.spanningTree(100, 100, edges));
    }

    @Test
    public void testMST13() {
        // Test case with a single vertex and no edges
        int[][] edges = new int[][]{};
        assertEquals(0, MST_Algorithm.spanningTree(1, 0, edges));
    }

    @Test
    public void testMST14() {
        // Test case with vertices connected in a triangle
        int[][] edges = new int[][]{{0, 1, 3}, {1, 2, 4}, {2, 0, 5}};
        assertEquals(7, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST15() {
        // Test case with disconnected vertices and negative weights
        int[][] edges = new int[][]{{0, 1, -2}, {2, 3, -3}, {4, 5, -4}};
        assertEquals(-2, MST_Algorithm.spanningTree(6, 3, edges));
    }

    @Test
    public void testMST16() {
        // Test case with a single edge and zero-weight
        int[][] edges = new int[][]{{0, 1, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(2, 1, edges));
    }

    @Test
    public void testMST17() {
        // Test case with a single edge and negative weight
        int[][] edges = new int[][]{{0, 1, -5}};
        assertEquals(-5, MST_Algorithm.spanningTree(2, 1, edges));
    }

    @Test
    public void testMST18() {
        // Test case with vertices connected in a square
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 0, 5}};
        assertEquals(9, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST19() {
        // Test case with all vertices connected in a line with zero weights
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST20() {
        // Test case with all vertices connected in a cycle with zero weights
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST21() {
        // Test case with all vertices connected in a star pattern with zero weights
        int[][] edges = new int[][]{{0, 1, 0}, {0, 2, 0}, {0, 3, 0}, {0, 4, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST22() {
        // Test case with all edges having large weights
        int[][] edges = new int[50][3];
        for (int i = 0; i < 50; i++) {
            edges[i] = new int[]{i, (i + 1) % 50, 1000000};
        }
        assertEquals(49000000, MST_Algorithm.spanningTree(50, 50, edges));
    }

    @Test
    public void testMST23() {
        // Test case with all edges having large negative weights
        int[][] edges = new int[50][3];
        for (int i = 0; i < 50; i++) {
            edges[i] = new int[]{i, (i + 1) % 50, -1000000};
        }
        assertEquals(-49000000, MST_Algorithm.spanningTree(50, 50, edges));
    }

    @Test
    public void testMST24() {
        // Test case with all vertices connected in a line with large weights
        int[][] edges = new int[50][3];
        for (int i = 0; i < 49; i++) {
            edges[i] = new int[]{i, i + 1, 1000000};
        }
        assertEquals(49 * 1000000, MST_Algorithm.spanningTree(50, 49, edges));
    }

    @Test
    public void testMST25() {
        // Test case with all vertices connected in a cycle with negative weights
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 0, -4}};
        assertEquals(-7, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST26() {
        // Test case with vertices connected in a triangle with negative weights
        int[][] edges = new int[][]{{0, 1, -3}, {1, 2, -4}, {2, 0, -5}};
        assertEquals(-9, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST27() {
        // Test case with all vertices connected in a star pattern with negative weights
        int[][] edges = new int[][]{{0, 1, -1}, {0, 2, -2}, {0, 3, -3}, {0, 4, -4}};
        assertEquals(-10, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST28() {
        // Test case with all vertices connected in a line with positive weights
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(4, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST29() {
        // Test case with all vertices connected in a cycle with positive weights
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 0, 4}};
        assertEquals(5, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST30() {
        // Test case with all vertices connected in a star pattern with positive weights
        int[][] edges = new int[][]{{0, 1, 1}, {0, 2, 2}, {0, 3, 3}, {0, 4, 4}};
        assertEquals(10, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST31() {
        // Test case with all edges having negative weights
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 3, -4}, {3, 0, -5}};
        assertEquals(-12, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST32() {
        // Test case with all edges having positive weights
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 0, 5}};
        assertEquals(9, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST33() {
        // Test case with vertices connected in a square with positive and negative weights
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 0, -5}};
        assertEquals(-6, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST34() {
        // Test case with vertices connected in a triangle with positive and negative weights
        int[][] edges = new int[][]{{0, 1, 3}, {1, 2, -4}, {2, 0, 5}};
        assertEquals(-1, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST35() {
        // Test case with vertices connected in a star pattern with positive and negative weights
        int[][] edges = new int[][]{{0, 1, -1}, {0, 2, 2}, {0, 3, -3}, {0, 4, 4}};
        assertEquals(2, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST36() {
        // Test case with all vertices connected in a line with alternating positive and negative weights
        int[][] edges = new int[][]{{0, 1, -1}, {1, 2, 2}, {2, 3, -3}, {3, 4, 4}};
        assertEquals(2, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST37() {
        // Test case with all vertices connected in a cycle with alternating positive and negative weights
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 0, 4}};
        assertEquals(-1, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST38() {
        // Test case with all vertices connected in a star pattern with alternating positive and negative weights
        int[][] edges = new int[][]{{0, 1, -1}, {0, 2, 2}, {0, 3, -3}, {0, 4, 4}};
        assertEquals(2, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST39() {
        // Test case with all edges having random weights
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 0, 5}, {0, 4, 6}, {1, 3, 7}, {2, 4, 8}};
        assertEquals(15, MST_Algorithm.spanningTree(5, 7, edges));
    }

    @Test
    public void testMST40() {
        // Test case with all vertices connected in a complete graph with positive weights
        int[][] edges = new int[][]{
                {0, 1, 1}, {0, 2, 2}, {0, 3, 3}, {0, 4, 4},
                {1, 2, 5}, {1, 3, 6}, {1, 4, 7},
                {2, 3, 8}, {2, 4, 9},
                {3, 4, 10}
        };
        assertEquals(10, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST41() {
        // Test case with all vertices connected in a complete graph with negative weights
        int[][] edges = new int[][]{
                {0, 1, -1}, {0, 2, -2}, {0, 3, -3}, {0, 4, -4},
                {1, 2, -5}, {1, 3, -6}, {1, 4, -7},
                {2, 3, -8}, {2, 4, -9},
                {3, 4, -10}
        };
        assertEquals(-30, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST42() {
        // Test case with all vertices connected in a complete graph with random weights
        int[][] edges = new int[][]{
                {0, 1, 1}, {0, 2, -2}, {0, 3, 3}, {0, 4, -4},
                {1, 2, 5}, {1, 3, -6}, {1, 4, 7},
                {2, 3, 8}, {2, 4, -9},
                {3, 4, 10}
        };
        assertEquals(-18, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST43() {
        // Test case with all vertices connected in a complete graph with equal weights
        int[][] edges = new int[][]{
                {0, 1, 2}, {0, 2, 2}, {0, 3, 2}, {0, 4, 2},
                {1, 2, 2}, {1, 3, 2}, {1, 4, 2},
                {2, 3, 2}, {2, 4, 2},
                {3, 4, 2}
        };
        assertEquals(8, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST44() {
        // Test case with all vertices connected in a complete graph with alternating positive and negative weights
        int[][] edges = new int[][]{
                {0, 1, 2}, {0, 2, -2}, {0, 3, 2}, {0, 4, -2},
                {1, 2, 2}, {1, 3, -2}, {1, 4, 2},
                {2, 3, 2}, {2, 4, -2},
                {3, 4, 2}
        };
        assertEquals(-4, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST45() {
        // Test case with all vertices connected in a complete graph with all weights being zero
        int[][] edges = new int[][]{
                {0, 1, 0}, {0, 2, 0}, {0, 3, 0}, {0, 4, 0},
                {1, 2, 0}, {1, 3, 0}, {1, 4, 0},
                {2, 3, 0}, {2, 4, 0},
                {3, 4, 0}
        };
        assertEquals(0, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST46() {
        // Test case with all vertices connected in a complete graph with large positive weights
        int[][] edges = new int[5 * 4 / 2][3];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                edges[index++] = new int[]{i, j, 1000000};
            }
        }
        assertEquals(4000000, MST_Algorithm.spanningTree(5, 10, edges));
    }

    @Test
    public void testMST47() {
        // Test case with a simple graph containing only two vertices with a positive weight edge
        int[][] edges = new int[][]{{0, 1, 5}};
        assertEquals(5, MST_Algorithm.spanningTree(2, 1, edges));
    }

    @Test
    public void testMST48() {
        // Test case with a simple graph containing only two vertices with a negative weight edge
        int[][] edges = new int[][]{{0, 1, -5}};
        assertEquals(-5, MST_Algorithm.spanningTree(2, 1, edges));
    }

    @Test
    public void testMST49() {
        // Test case with a disconnected graph containing three vertices and no edges
        int[][] edges = new int[][]{};
        assertEquals(0, MST_Algorithm.spanningTree(3, 0, edges));
    }

    @Test
    public void testMST50() {
        // Test case with a graph containing three vertices and a single positive weight edge forming a triangle
        int[][] edges = new int[][]{{0, 1, 3}, {1, 2, 4}, {2, 0, 5}};
        assertEquals(7, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST51() {
        // Test case with a graph containing three vertices and a single negative weight edge forming a triangle
        int[][] edges = new int[][]{{0, 1, -3}, {1, 2, -4}, {2, 0, -5}};
        assertEquals(-9, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST52() {
        // Test case with a graph containing three vertices and all edges having positive weights
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 0, 4}};
        assertEquals(5, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST53() {
        // Test case with a graph containing three vertices and all edges having negative weights
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 0, -4}};
        assertEquals(-7, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST54() {
        // Test case with a graph containing four vertices forming a cycle with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 0, 5}};
        assertEquals(9, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST55() {
        // Test case with a graph containing four vertices forming a cycle with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 3, -4}, {3, 0, -5}};
        assertEquals(-12, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST56() {
        // Test case with a graph containing four vertices forming a cycle with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 0, -5}};
        assertEquals(-6, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST57() {
        // Test case with a graph containing five vertices forming a star with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {0, 2, 3}, {0, 3, 4}, {0, 4, 5}};
        assertEquals(14, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST58() {
        // Test case with a graph containing five vertices forming a star with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {0, 2, -3}, {0, 3, -4}, {0, 4, -5}};
        assertEquals(-14, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST59() {
        // Test case with a graph containing five vertices forming a star with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {0, 2, -3}, {0, 3, 4}, {0, 4, -5}};
        assertEquals(-2, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST60() {
        // Test case with a graph containing six vertices forming a two-component disconnected graph
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {3, 4, 4}, {4, 5, 5}};
        assertEquals(5, MST_Algorithm.spanningTree(6, 4, edges));
    }

    @Test
    public void testMST61() {
        // Test case with a graph containing six vertices forming a two-component disconnected graph with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {3, 4, -4}, {4, 5, -5}};
        assertEquals(-5, MST_Algorithm.spanningTree(6, 4, edges));
    }

    @Test
    public void testMST62() {
        // Test case with a graph containing six vertices forming a two-component disconnected graph with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {3, 4, 4}, {4, 5, -5}};
        assertEquals(-1, MST_Algorithm.spanningTree(6, 4, edges));
    }

    @Test
    public void testMST63() {
        // Test case with a graph containing three vertices forming a triangle with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 0, 4}};
        assertEquals(5, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST64() {
        // Test case with a graph containing three vertices forming a triangle with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 0, -4}};
        assertEquals(-7, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST65() {
        // Test case with a graph containing four vertices forming a cycle with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 0, 5}};
        assertEquals(9, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST66() {
        // Test case with a graph containing four vertices forming a cycle with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 3, -4}, {3, 0, -5}};
        assertEquals(-12, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST67() {
        // Test case with a graph containing four vertices forming a cycle with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 0, -5}};
        assertEquals(-6, MST_Algorithm.spanningTree(4, 4, edges));
    }

    @Test
    public void testMST68() {
        // Test case with a graph containing five vertices forming a star with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {0, 2, 3}, {0, 3, 4}, {0, 4, 5}};
        assertEquals(14, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST69() {
        // Test case with a graph containing five vertices forming a star with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {0, 2, -3}, {0, 3, -4}, {0, 4, -5}};
        assertEquals(-14, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST70() {
        // Test case with a graph containing five vertices forming a star with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {0, 2, -3}, {0, 3, 4}, {0, 4, -5}};
        assertEquals(-2, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST71() {
        // Test case with a graph containing six vertices forming a two-component disconnected graph
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {3, 4, 4}, {4, 5, 5}};
        assertEquals(5, MST_Algorithm.spanningTree(6, 4, edges));
    }

    @Test
    public void testMST72() {
        // Test case with a graph containing six vertices forming a two-component disconnected graph with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {3, 4, -4}, {4, 5, -5}};
        assertEquals(-5, MST_Algorithm.spanningTree(6, 4, edges));
    }

    @Test
    public void testMST73() {
        // Test case with a graph containing six vertices forming a two-component disconnected graph with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {3, 4, 4}, {4, 5, -5}};
        assertEquals(-1, MST_Algorithm.spanningTree(6, 4, edges));
    }

    @Test
    public void testMST74() {
        // Test case with a graph containing six vertices forming a chain with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
        assertEquals(20, MST_Algorithm.spanningTree(6, 5, edges));
    }

    @Test
    public void testMST75() {
        // Test case with a graph containing six vertices forming a chain with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 3, -4}, {3, 4, -5}, {4, 5, -6}};
        assertEquals(-20, MST_Algorithm.spanningTree(6, 5, edges));
    }

    @Test
    public void testMST76() {
        // Test case with a graph containing six vertices forming a chain with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 4, -5}, {4, 5, 6}};
        assertEquals(4, MST_Algorithm.spanningTree(6, 5, edges));
    }

    @Test
    public void testMST77() {
        // Test case with a graph containing six vertices forming a chain with all zero weight edges
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 5, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(6, 5, edges));
    }

    @Test
    public void testMST78() {
        // Test case with a graph containing seven vertices forming a loop with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}, {5, 6, 7}, {6, 0, 8}};
        assertEquals(27, MST_Algorithm.spanningTree(7, 7, edges));
    }

    @Test
    public void testMST79() {
        // Test case with a graph containing seven vertices forming a loop with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 3, -4}, {3, 4, -5}, {4, 5, -6}, {5, 6, -7}, {6, 0, -8}};
        assertEquals(-33, MST_Algorithm.spanningTree(7, 7, edges));
    }

    @Test
    public void testMST80() {
        // Test case with a graph containing seven vertices forming a loop with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 4, -5}, {4, 5, 6}, {5, 6, -7}, {6, 0, 8}};
        assertEquals(-3, MST_Algorithm.spanningTree(7, 7, edges));
    }

    @Test
    public void testMST81() {
        // Test case with a graph containing seven vertices forming a loop with all zero weight edges
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 5, 0}, {5, 6, 0}, {6, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(7, 7, edges));
    }

    @Test
    public void testMST82() {
        // Test case with a graph containing eight vertices forming a combination of a chain and loop with positive weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}, {5, 6, 7}, {6, 7, 8}, {7, 0, 9}};
        assertEquals(35, MST_Algorithm.spanningTree(8, 8, edges));
    }

    @Test
    public void testMST83() {
        // Test case with a graph containing eight vertices forming a combination of a chain and loop with negative weight edges
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 3, -4}, {3, 4, -5}, {4, 5, -6}, {5, 6, -7}, {6, 7, -8}, {7, 0, -9}};
        assertEquals(-42, MST_Algorithm.spanningTree(8, 8, edges));
    }

    @Test
    public void testMST84() {
        // Test case with a graph containing eight vertices forming a combination of a chain and loop with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 4, -5}, {4, 5, 6}, {5, 6, -7}, {6, 7, 8}, {7, 0, -9}};
        assertEquals(-12, MST_Algorithm.spanningTree(8, 8, edges));
    }

    @Test
    public void testMST85() {
        // Test case with a graph containing eight vertices forming a combination of a chain and loop with all zero weight edges
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 5, 0}, {5, 6, 0}, {6, 7, 0}, {7, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(8, 8, edges));
    }

    @Test
    public void testMST86() {
        // Test case with a graph containing a single vertex and no edges
        int[][] edges = new int[][]{};
        assertEquals(0, MST_Algorithm.spanningTree(1, 0, edges));
    }

    @Test
    public void testMST87() {
        // Test case with a graph containing eight vertices forming a loop with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 4, -5}, {4, 5, 6}, {5, 6, -7}, {6, 7, 8}, {7, 0, -9}};
        assertEquals(-12, MST_Algorithm.spanningTree(8, 8, edges));
    }

    @Test
    public void testMST88() {
        // Test case with a graph containing eight vertices forming a loop with all zero weight edges
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 5, 0}, {5, 6, 0}, {6, 7, 0}, {7, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(8, 8, edges));
    }

    @Test
    public void testMST89() {
        // Test case with a graph containing nine vertices forming a loop with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 4, -5}, {4, 5, 6}, {5, 6, -7}, {6, 7, 8}, {7, 8, -9}, {8, 0, 10}};
        assertEquals(-4, MST_Algorithm.spanningTree(9, 9, edges));
    }

    @Test
    public void testMST90() {
        // Test case with a graph containing nine vertices forming a loop with all zero weight edges
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 5, 0}, {5, 6, 0}, {6, 7, 0}, {7, 8, 0}, {8, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(9, 9, edges));
    }

    @Test
    public void testMST91() {
        // Test case with a graph containing ten vertices forming a loop with alternating positive and negative weight edges
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, -3}, {2, 3, 4}, {3, 4, -5}, {4, 5, 6}, {5, 6, -7}, {6, 7, 8}, {7, 8, -9}, {8, 9, 10}, {9, 0, -11}};
        assertEquals(-15, MST_Algorithm.spanningTree(10, 10, edges));
    }

    @Test
    public void testMST92() {
        // Test case with a graph containing ten vertices forming a loop with all zero weight edges
        int[][] edges = new int[][]{{0, 1, 0}, {1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 5, 0}, {5, 6, 0}, {6, 7, 0}, {7, 8, 0}, {8, 9, 0}, {9, 0, 0}};
        assertEquals(0, MST_Algorithm.spanningTree(10, 10, edges));
    }

    @Test
    public void testMST93() {
        // Test case with all edges having large weights
        int[][] edges = new int[100][3];
        for (int i = 0; i < 100; i++) {
            edges[i] = new int[]{i, (i + 1) % 100, 1000000};
        }
        assertEquals(99000000, MST_Algorithm.spanningTree(100, 100, edges));
    }

    @Test
    public void testMST94() {
        // Test case with all edges having large weights and negative weights
        int[][] edges = new int[100][3];
        for (int i = 0; i < 100; i++) {
            edges[i] = new int[]{i, (i + 1) % 100, -1000000};
        }
        assertEquals(-99000000, MST_Algorithm.spanningTree(100, 100, edges));
    }

    @Test
    public void testMST95() {
        // Test case with all vertices connected in a line with large weights
        int[][] edges = new int[100][3];
        for (int i = 0; i < 99; i++) {
            edges[i] = new int[]{i, i + 1, 1000000};
        }
        assertEquals(99 * 1000000, MST_Algorithm.spanningTree(100, 99, edges));
    }

    @Test
    public void testMST96() {
        // Test case with all vertices connected in a star pattern with negative weights
        int[][] edges = new int[][]{{0, 1, -1}, {0, 2, -2}, {0, 3, -3}, {0, 4, -4}};
        assertEquals(-10, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST97() {
        // Test case with all edges having large weights and negative weights
        int[][] edges = new int[][]{{0, 1, -1000000}, {1, 2, -1000000}, {2, 3, -1000000}};
        assertEquals(-3000000, MST_Algorithm.spanningTree(4, 3, edges));
    }

    @Test
    public void testMST98() {
        // Test case with all vertices connected in a line with negative weights
        int[][] edges = new int[][]{{0, 1, -3}, {1, 2, -4}, {2, 3, -5}, {3, 4, -6}};
        assertEquals(-18, MST_Algorithm.spanningTree(5, 4, edges));
    }

    @Test
    public void testMST99() {
        // Test case with all vertices connected in a cycle with negative weights
        int[][] edges = new int[][]{{0, 1, -2}, {1, 2, -3}, {2, 0, -4}};
        assertEquals(-7, MST_Algorithm.spanningTree(3, 3, edges));
    }

    @Test
    public void testMST100() {
        // Test case with all edges having large weights and negative weights
        int[][] edges = new int[][]{{0, 1, -1000000}, {1, 2, -1000000}, {2, 3, -1000000}};
        assertEquals(-3000000, MST_Algorithm.spanningTree(4, 3, edges));
    }
}
