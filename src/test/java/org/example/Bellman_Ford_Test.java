package org.example;

import static org.junit.Assert.*;
import org.junit.Test;


public class Bellman_Ford_Test {
    @Test
    public void testBellmanFord1() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(5, 8);
        // Set up edges
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 2;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;

        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 1;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 7;

        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = -2;

        graph.edge[5].src = 3;
        graph.edge[5].dest = 4;
        graph.edge[5].weight = 3;

        graph.edge[6].src = 2;
        graph.edge[6].dest = 4;
        graph.edge[6].weight = 5;

        graph.edge[7].src = 4;
        graph.edge[7].dest = 1;
        graph.edge[7].weight = 2;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, 2, 3, 1, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord2() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(1, 0);
        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord3() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(100, 500);
        for (int i = 1; i < 100; i++) {
            graph.edge[i - 1].src = 0;
            graph.edge[i - 1].dest = i;
            graph.edge[i - 1].weight = 1;
        }

        int[] result = graph.BellmanFord(graph, 0);
        // Assert the results
        int[] expected = new int[100];
        for (int i = 0; i < 100; i++) {
            expected[i] = i == 0 ? 0 : 1;
        }
        assertArrayEquals(expected, result);
    }


    @Test
    public void testBellmanFord4() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(3, 3);
        // Set up edges with negative weights
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -2;

        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -3;

        graph.edge[2].src = 2;
        graph.edge[2].dest = 0;
        graph.edge[2].weight = -1;

        try {
            graph.BellmanFord(graph, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Graph contains negative weight cycle", e.getMessage());
        }
    }


    @Test
    public void testBellmanFord5() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(4, 2);
        // Set up edges for a disconnected graph
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 1;

        graph.edge[1].src = 2;
        graph.edge[1].dest = 3;
        graph.edge[1].weight = 2;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, result);
    }


    @Test
    public void testBellmanFord6() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(3, 3);
        // Set up edges with a negative weight cycle
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 2;

        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -5;

        graph.edge[2].src = 2;
        graph.edge[2].dest = 0;
        graph.edge[2].weight = 3;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = new int[]{0, 2, -3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord7() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(4, 4);
        // Set up edges with negative weights and a disconnected graph
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -2;

        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 3;

        graph.edge[2].src = 2;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = -1;

        graph.edge[3].src = 3;
        graph.edge[3].dest = 0;
        graph.edge[3].weight = 2;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, -2, 1, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord8() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(1, 0);
        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord9() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(3, 3);
        // Set up edges with negative weights and a negative weight cycle
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -2;

        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -3;

        graph.edge[2].src = 2;
        graph.edge[2].dest = 0;
        graph.edge[2].weight = 2;

        try {
            graph.BellmanFord(graph, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Graph contains negative weight cycle", e.getMessage());
        }
    }

    @Test
    public void testBellmanFord10() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(3, 3);
        // Set up edges with a self-loop
        graph.edge[0].src = 0;
        graph.edge[0].dest = 0;
        graph.edge[0].weight = 2;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 1;
        graph.edge[1].weight = 3;

        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 4;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, 3, 7};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord11() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(2, 1);
        // Set up edge with a negative self-loop
        graph.edge[0].src = 0;
        graph.edge[0].dest = 0;
        graph.edge[0].weight = -2;

        try {
            graph.BellmanFord(graph, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Graph contains negative weight cycle", e.getMessage());
        }
    }

    @Test
    public void testBellmanFord12() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(3, 3);
        // Set up edges with only negative weights
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -5;

        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -3;

        graph.edge[2].src = 0;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = -8;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, -5, -8};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord13() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(3, 3);
        // Set up edges with all zero weights
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 0;

        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 0;

        graph.edge[2].src = 0;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 0;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord14() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(2, 1);
        // Set up a single edge with negative weight
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -5;

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, -5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord15() {
        Bellman_Ford_Algorithm graph = new Bellman_Ford_Algorithm(4, 4);
        // Set up edges with all negative weights except one
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -3;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -5;

        graph.edge[2].src = 1;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = -7;

        graph.edge[3].src = 2;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 2;  // One positive weight

        int[] result = graph.BellmanFord(graph, 0);
        int[] expected = {0, -3, -5, -10};  // Distance to vertex 3 should be 2
        assertArrayEquals(expected, result);
    }

}
