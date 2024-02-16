package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

public class Dijkstra_Algorithm_Test {
    @Test
    public void testDijkstra1() {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int[] expectedDistances = {0, 4, 12, 19, 21, 11, 9, 8, 14};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra2() {
        int[][] graph = {
                {0, 1, 0, 0, 0},
                {1, 0, 2, 0, 0},
                {0, 2, 0, 3, 0},
                {0, 0, 3, 0, 4},
                {0, 0, 0, 4, 0}
        };
        int[] expectedDistances = {0, 1, 3, 6, 10};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra3() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Tests 4 through 100: additional tests covering various scenarios and edge cases
    @Test
    public void testDijkstra4() {
        int[][] graph = {
                {0, 10, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 10, 11, 12, 13};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra5() {
        int[][] graph = {
                {0, 5, 0, 0, 0},
                {0, 0, 5, 0, 0},
                {0, 0, 0, 5, 0},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 5, 10, 15, 20};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra6() {
        int[][] graph = {
                {0, 1, 2},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra7() {
        int[][] graph = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra8() {
        int[][] graph = {
                {2, 0, 2, 1, 0},
                {3, 4, 3, 4, 3},
                {4, 4, 1, 0, 4},
                {4, 2, 0, 2, 0},
                {2, 3, 2, 1, 3},
        };
        int[] expectedDistances = {0, 3, 2, 1, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra9() {
        int[][] graph = {
                {4, 3, 1, 4, 3, 0, 1, 2, 3},
                {1, 4, 4, 4, 3, 1, 0, 2, 3},
                {2, 2, 0, 2, 1, 1, 1, 2, 0},
                {2, 4, 1, 3, 0, 3, 3, 4, 1},
                {2, 3, 2, 1, 0, 0, 3, 0, 3},
                {2, 0, 1, 4, 0, 0, 2, 0, 4},
                {2, 0, 3, 3, 2, 2, 0, 3, 2},
                {0, 3, 2, 0, 1, 0, 1, 0, 4},
                {3, 4, 2, 1, 3, 2, 0, 3, 0}
        };
        int[] expectedDistances = {0, 3, 1, 3, 2, 2, 1, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    @Test
    public void testDijkstra10() {
        int[][] graph = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 11
    @Test
    public void testDijkstra11() {
        int[][] graph = {
                {3, 0, 4, 0},
                {4, 0, 0, 3},
                {4, 1, 3, 4},
                {3, 3, 1, 1}
        };
        int[] expectedDistances = {0, 5, 4, 8};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 12
    @Test
    public void testDijkstra12() {
        int[][] graph = {
                {0, 2, 5, 0, 0, 0},
                {2, 0, 0, 7, 1, 0},
                {5, 0, 0, 0, 4, 3},
                {0, 7, 0, 0, 0, 0},
                {0, 1, 4, 0, 0, 6},
                {0, 0, 3, 0, 6, 0}
        };
        int[] expectedDistances = {0, 2, 5, 9, 3, 8};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 13
    @Test
    public void testDijkstra13() {
        int[][] graph = {
                {0, 10, 20, 0},
                {10, 0, 30, 5},
                {20, 30, 0, 15},
                {0, 5, 15, 0}
        };
        int[] expectedDistances = {0, 10, 20, 15};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 14
    @Test
    public void testDijkstra14() {
        int[][] graph = {
                {0, 3, 0, 5, 0, 0, 0},
                {3, 0, 2, 0, 0, 0, 0},
                {0, 2, 0, 1, 0, 0, 0},
                {5, 0, 1, 0, 4, 0, 0},
                {0, 0, 0, 4, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 1},
                {0, 0, 0, 0, 0, 1, 0}
        };
        int[] expectedDistances = {0, 3, 5, 5, 9, 11, 12};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 15
    @Test
    public void testDijkstra15() {
        int[][] graph = {
                {3, 4, 4, 0, 3},
                {3, 3, 2, 0, 1},
                {2, 3, 0, 1, 0},
                {4, 1, 1, 1, 4},
                {4, 0, 3, 3, 0}
        };
        int[] expectedDistances = {0, 4, 4, 5, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 16
    @Test
    public void testDijkstra16() {
        int[][] graph = {
                {0, 1, 1},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 17
    @Test
    public void testDijkstra17() {
        int[][] graph = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 1, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 18
    @Test
    public void testDijkstra18() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 19
    @Test
    public void testDijkstra19() {
        int[][] graph = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[] expectedDistances = {0, 1, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 20
    @Test
    public void testDijkstra20() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 21
    @Test
    public void testDijkstra21() {
        int[][] graph = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 22
    @Test
    public void testDijkstra22() {
        int[][] graph = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 23
    @Test
    public void testDijkstra23() {
        int[][] graph = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 24
    @Test
    public void testDijkstra24() {
        int[][] graph = {
                {0, 1, 0},
                {1, 0, 1},
                {1, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 25
    @Test
    public void testDijkstra25() {
        int[][] graph = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 1}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 26
    @Test
    public void testDijkstra26() {
        int[][] graph = {
                {0, 5, 10, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 2},
                {0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 5, 10, 8};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 27
    @Test
    public void testDijkstra27() {
        int[][] graph = {
                {0, 2, 0},
                {2, 0, 2},
                {0, 2, 0}
        };
        int[] expectedDistances = {0, 2, 4};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 28
    @Test
    public void testDijkstra28() {
        int[][] graph = {
                {0, 1, 2},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 29
    @Test
    public void testDijkstra29() {
        int[][] graph = {
                {0, 10, 0},
                {10, 0, 10},
                {0, 10, 0}
        };
        int[] expectedDistances = {0, 10, 20};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 30
    @Test
    public void testDijkstra30() {
        int[][] graph = {
                {0, 5, 0, 0, 0},
                {0, 0, 5, 0, 0},
                {0, 0, 0, 5, 0},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 5, 10, 15, 20};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 31
    @Test
    public void testDijkstra31() {
        int[][] graph = {
                {0, 1, 0},
                {1, 2, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 32
    @Test
    public void testDijkstra32() {
        int[][] graph = {
                {2, 1, 2},
                {1, 0, 1},
                {2, 1, 2}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 33
    @Test
    public void testDijkstra33() {
        int[][] graph = {
                {0, 2, 0},
                {1, 0, 1},
                {0, 2, 0}
        };
        int[] expectedDistances = {0, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 34
    @Test
    public void testDijkstra34() {
        int[][] graph = {
                {0, 1, 0},
                {2, 0, 2},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 35
    @Test
    public void testDijkstra35() {
        int[][] graph = {
                {0, 3, 0},
                {2, 0, 3},
                {0, 2, 0}
        };
        int[] expectedDistances = {0, 3, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 36
    @Test
    public void testDijkstra36() {
        int[][] graph = {
                {1, 1, 2},
                {1, 0, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 37
    @Test
    public void testDijkstra37() {
        int[][] graph = {
                {0, 1, 0},
                {1, 2, 4},
                {0, 3, 0}
        };
        int[] expectedDistances = {0, 1, 5};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 38
    @Test
    public void testDijkstra38() {
        int[][] graph = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 39
    @Test
    public void testDijkstra39() {
        int[][] graph = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int[] expectedDistances = {0, 1, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 40
    @Test
    public void testDijkstra40() {
        int[][] graph = {
                {0, 1},
                {1, 0}
        };
        int[] expectedDistances = {0, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 41
    @Test
    public void testDijkstra41() {
        int[][] graph = {
                {0, 1, 2},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 42
    @Test
    public void testDijkstra42() {
        int[][] graph = {
                {0, 10, 0},
                {10, 0, 10},
                {0, 10, 0}
        };
        int[] expectedDistances = {0, 10, 20};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 43
    @Test
    public void testDijkstra43() {
        int[][] graph = {
                {0, 5, 0, 0, 0},
                {0, 0, 5, 0, 0},
                {0, 0, 0, 5, 0},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 5, 10, 15, 20};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 44
    @Test
    public void testDijkstra44() {
        int[][] graph = {
                {3, 1, 2},
                {4, 0, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 45
    @Test
    public void testDijkstra45() {
        int[][] graph = {
                {0, 1, 4},
                {1, 4, 1},
                {0, 1, 4}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 46
    @Test
    public void testDijkstra46() {
        int[][] graph = {
                {4, 3, 0},
                {1, 4, 1},
                {2, 3, 0}
        };
        int[] expectedDistances = {0, 3, 4};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 47
    @Test
    public void testDijkstra47() {
        int[][] graph = {
                {2, 2, 2},
                {1, 1, 1},
                {0, 1, 0}
        };
        int[] expectedDistances = {0, 2, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 48
    @Test
    public void testDijkstra48() {
        int[][] graph = {
                {1, 1, 1},
                {0, 0, 0},
                {1, 1, 1}
        };
        int[] expectedDistances = {0, 1, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 49
    @Test
    public void testDijkstra49() {
        int[][] graph = {
                {1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 50
    @Test
    public void testDijkstra50() {
        int[][] graph = {
                {1, 1, 1, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {0, 0, 1, 0, 0, 1},
                {0, 1, 1, 1, 1, 1}
        };
        int[] expectedDistances = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 51
    @Test
    public void testDijkstra51() {
        int[][] graph = {
                {4, 3},
                {2, 3}
        };
        int[] expectedDistances = {0, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 52
    @Test
    public void testDijkstra52() {
        int[][] graph = {
                {4, 1, 3, 2, 0},
                {2, 4, 2, 3, 3},
                {2, 1, 4, 1, 2},
                {4, 4, 4, 1, 1},
                {2, 4, 0, 4, 3}
        };
        int[] expectedDistances = {0, 1, 3, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 53
    @Test
    public void testDijkstra53() {
        int[][] graph = {
                {0, 4, 2, 1, 0, 3, 0, 3, 1},
                {1, 4, 4, 4, 4, 4, 0, 4, 3},
                {2, 4, 4, 2, 3, 0, 0, 2, 1},
                {2, 2, 1, 3, 0, 2, 3, 4, 2},
                {4, 2, 0, 2, 3, 2, 4, 1, 1},
                {4, 4, 0, 4, 3, 1, 3, 1, 4},
                {3, 2, 3, 2, 0, 0, 4, 3, 2},
                {3, 0, 3, 2, 2, 0, 4, 2, 2},
                {0, 4, 1, 4, 3, 2, 3, 4, 3}
        };
        int[] expectedDistances = {0, 3, 2, 1, 4, 3, 4, 3, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 54
    @Test
    public void testDijkstra54() {
        int[][] graph = {
                {3, 2, 3},
                {3, 3, 2},
                {3, 3, 1}
        };
        int[] expectedDistances = {0, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 55
    @Test
    public void testDijkstra55() {
        int[][] graph = {
                {0, 1, 0, 4, 1, 4, 1, 4, 2, 3},
                {1, 0, 0, 4, 1, 4, 2, 1, 2, 2},
                {4, 2, 0, 3, 0, 4, 2, 2, 0, 1},
                {3, 2, 0, 3, 3, 0, 3, 1, 4, 2},
                {2, 3, 0, 0, 2, 3, 4, 0, 3, 4},
                {4, 4, 1, 4, 4, 3, 3, 3, 1, 1},
                {1, 4, 4, 4, 3, 1, 0, 1, 0, 0},
                {3, 1, 0, 1, 2, 4, 1, 4, 1, 2},
                {4, 0, 1, 2, 4, 0, 1, 4, 1, 1},
                {0, 4, 4, 0, 1, 2, 2, 2, 0, 0},
        };
        int[] expectedDistances = {0, 1, 3, 3, 1, 2, 1, 2, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 56
    @Test
    public void testDijkstra56() {
        int[][] graph = {
                {0, 3, 3, 4, 2, 2, 4},
                {3, 3, 4, 2, 2, 3, 3},
                {3, 4, 2, 0, 0, 0, 4},
                {3, 2, 3, 4, 1, 0, 1},
                {4, 0, 0, 0, 2, 3, 4},
                {0, 2, 2, 0, 3, 2, 1},
                {3, 1, 3, 3, 1, 1, 2}
        };
        int[] expectedDistances = {0, 3, 3, 4, 2, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 57
    @Test
    public void testDijkstra57() {
        int[][] graph = {
                {4, 4, 1, 4, 1, 3},
                {3, 3, 3, 2, 4, 3},
                {4, 4, 3, 1, 3, 0},
                {3, 0, 1, 1, 2, 1},
                {2, 1, 2, 1, 2, 1},
                {3, 3, 4, 2, 2, 4}
        };
        int[] expectedDistances = {0, 2, 1, 2, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 58
    @Test
    public void testDijkstra58() {
        int[][] graph = {
                {2, 2, 4, 0},
                {0, 3, 0, 3},
                {3, 0, 3, 3},
                {1, 4, 0, 2}
        };
        int[] expectedDistances = {0, 2, 4, 5};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 59
    @Test
    public void testDijkstra59() {
        int[][] graph = {
                {0, 4, 4, 4, 3},
                {1, 1, 1, 3, 1},
                {0, 1, 1, 0, 0},
                {0, 3, 2, 0, 2},
                {2, 0, 1, 2, 3}
        };
        int[] expectedDistances = {0, 4, 4, 4, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 60
    @Test
    public void testDijkstra60() {
        int[][] graph = {
                {3, 4, 4, 4, 1, 4},
                {0, 1, 2, 4, 1, 3},
                {0, 2, 2, 3, 2, 3},
                {2, 4, 0, 4, 3, 1},
                {1, 4, 1, 4, 1, 2},
                {3, 2, 0, 3, 4, 4}
        };
        int[] expectedDistances = {0, 4, 2, 4, 1, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 61
    @Test
    public void testDijkstra61() {
        int[][] graph = {
                {4, 4},
                {1, 4}
        };
        int[] expectedDistances = {0, 4};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 62
    @Test
    public void testDijkstra62() {
        int[][] graph = {
                {2, 3, 2, 3},
                {3, 4, 2, 2},
                {1, 4, 2, 2},
                {3, 0, 0, 0}
        };
        int[] expectedDistances = {0, 3, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 63
    @Test
    public void testDijkstra63() {
        int[][] graph = {
                {3, 4, 1, 1, 3, 4},
                {3, 1, 3, 2, 3, 4},
                {2, 3, 1, 2, 4, 1},
                {2, 1, 2, 2, 2, 2},
                {4, 1, 0, 4, 0, 0},
                {2, 2, 2, 0, 4, 2}
        };
        int[] expectedDistances = {0, 2, 1, 1, 3, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 64
    @Test
    public void testDijkstra64() {
        int[][] graph = {
                {0, 3, 4, 2},
                {2, 2, 0, 3},
                {1, 0, 0, 4},
                {3, 1, 1, 4}
        };
        int[] expectedDistances = {0, 3, 3, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 65
    @Test
    public void testDijkstra65() {
        int[][] graph = {
                {4, 1, 0},
                {3, 1, 2},
                {3, 1, 3}
        };
        int[] expectedDistances = {0, 1, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 66
    @Test
    public void testDijkstra66() {
        int[][] graph = {
                {4, 1, 3, 3},
                {3, 2, 1, 1},
                {4, 4, 4, 0},
                {3, 2, 3, 2}
        };
        int[] expectedDistances = {0, 1, 2, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 67
    @Test
    public void testDijkstra67() {
        int[][] graph = {
                {3, 1, 4, 0, 2},
                {4, 3, 0, 0, 2},
                {4, 2, 3, 3, 3},
                {1, 3, 2, 2, 4},
                {4, 0, 1, 2, 2}
        };
        int[] expectedDistances = {0, 1, 3, 4, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 68
    @Test
    public void testDijkstra68() {
        int[][] graph = {
                {4, 3, 0, 3, 1, 4, 3, 1, 1},
                {0, 0, 2, 1, 2, 1, 4, 2, 4},
                {2, 4, 2, 4, 1, 3, 3, 0, 2},
                {3, 4, 2, 1, 0, 1, 0, 1, 4},
                {2, 3, 0, 3, 4, 1, 3, 2, 4},
                {1, 1, 1, 3, 0, 2, 4, 2, 2},
                {2, 2, 3, 1, 0, 3, 0, 2, 1},
                {2, 2, 3, 3, 1, 1, 0, 1, 2},
                {0, 2, 2, 1, 4, 4, 3, 2, 2},
        };
        int[] expectedDistances = {0, 3, 3, 2, 1, 2, 3, 1, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 69
    @Test
    public void testDijkstra69() {
        int[][] graph = {
                {1, 2, 1},
                {0, 4, 2},
                {4, 3, 3}
        };
        int[] expectedDistances = {0, 2, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 70
    @Test
    public void testDijkstra70() {
        int[][] graph = {
                {2, 2, 0, 4, 3, 1, 2, 2, 3, 1},
                {0, 3, 3, 0, 1, 1, 0, 4, 4, 2},
                {1, 3, 4, 3, 4, 3, 2, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 4, 2, 2, 1},
                {1, 1, 0, 2, 0, 3, 0, 1, 1, 1},
                {3, 0, 2, 0, 3, 4, 3, 0, 4, 1},
                {3, 0, 4, 1, 2, 4, 4, 0, 2, 0},
                {3, 3, 3, 4, 2, 1, 2, 0, 0, 3},
                {3, 1, 2, 2, 0, 0, 4, 0, 4, 0},
                {4, 1, 2, 2, 0, 1, 0, 1, 0, 1},
        };
        int[] expectedDistances = {0, 2, 3, 3, 3, 1, 2, 2, 3, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 71
    @Test
    public void testDijkstra71() {
        int[][] graph = {
                {4, 0, 4, 4, 4, 4, 0},
                {0, 4, 4, 0, 0, 1, 4},
                {1, 0, 4, 0, 3, 3, 3},
                {3, 2, 4, 3, 2, 4, 0},
                {4, 2, 3, 3, 2, 2, 0},
                {1, 1, 2, 2, 0, 0, 4},
                {2, 1, 0, 4, 1, 0, 1}
        };
        int[] expectedDistances = {0, 5, 4, 4, 4, 4, 7};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 72
    @Test
    public void testDijkstra72() {
        int[][] graph = {
                {2, 0, 3, 2, 1, 0, 2},
                {0, 3, 0, 2, 3, 1, 3},
                {0, 0, 3, 0, 1, 3, 3},
                {1, 4, 0, 4, 2, 0, 0},
                {0, 3, 0, 1, 0, 4, 3},
                {1, 0, 0, 1, 1, 4, 2},
                {4, 4, 2, 4, 4, 3, 0}
        };
        int[] expectedDistances = {0, 4, 3, 2, 1, 5, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 73
    @Test
    public void testDijkstra73() {
        int[][] graph = {
                {3, 1},
                {3, 0}
        };
        int[] expectedDistances = {0, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 74
    @Test
    public void testDijkstra74() {
        int[][] graph = {
                {4, 0},
                {2, 4}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 75
    @Test
    public void testDijkstra75() {
        int[][] graph = {
                {1, 2, 0, 3, 1},
                {1, 2, 3, 0, 3},
                {0, 1, 1, 0, 3},
                {2, 2, 0, 2, 4},
                {1, 3, 3, 4, 1}
        };
        int[] expectedDistances = {0, 2, 4, 3, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 76
    @Test
    public void testDijkstra76() {
        int[][] graph = {
                {0, 3, 4, 4},
                {0, 0, 4, 0},
                {2, 2, 4, 4},
                {0, 1, 4, 0}
        };
        int[] expectedDistances = {0, 3, 4, 4};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 77
    @Test
    public void testDijkstra77() {
        int[][] graph = {
                {1, 1},
                {2, 0}
        };
        int[] expectedDistances = {0, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 78
    @Test
    public void testDijkstra78() {
        int[][] graph = {
                {3, 3},
                {2, 4}
        };
        int[] expectedDistances = {0, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 79
    @Test
    public void testDijkstra79() {
        int[][] graph = {
                {0, 2, 1},
                {4, 2, 2},
                {2, 3, 4}
        };
        int[] expectedDistances = {0, 2, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 80
    @Test
    public void testDijkstra80() {
        int[][] graph = {
                {2, 2, 0, 3, 1, 1, 0, 1},
                {1, 4, 0, 0, 1, 0, 0, 1},
                {2, 2, 2, 2, 1, 1, 4, 2},
                {2, 4, 4, 2, 0, 4, 4, 1},
                {1, 2, 4, 1, 2, 0, 3, 0},
                {4, 3, 1, 1, 0, 3, 2, 3},
                {1, 4, 2, 0, 1, 1, 4, 1},
                {4, 0, 1, 2, 1, 0, 1, 4}
        };
        int[] expectedDistances = {0, 2, 2, 2, 1, 1, 2, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 81
    @Test
    public void testDijkstra81() {
        int[][] graph = {
                {0, 5, 0},
                {0, 0, 3},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 5, 8};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 82
    @Test
    public void testDijkstra82() {
        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 3, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 83
    @Test
    public void testDijkstra83() {
        int[][] graph = {
                {0, 3, 0},
                {0, 0, 2},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 3, 5};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 84
    @Test
    public void testDijkstra84() {
        int[][] graph = {
                {0, 2, 0},
                {0, 0, 1},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 85
    @Test
    public void testDijkstra85() {
        int[][] graph = {
                {3, 2},
                {3, 4}
        };
        int[] expectedDistances = {0, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 86
    @Test
    public void testDijkstra86() {
        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 3, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 87
    @Test
    public void testDijkstra87() {
        int[][] graph = {
                {0, 2},
                {3, 4}
        };
        int[] expectedDistances = {0, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 88
    @Test
    public void testDijkstra88() {
        int[][] graph = {
                {4, 0, 0},
                {4, 1, 0},
                {0, 4, 0}
        };
        int[] expectedDistances = {0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 89
    @Test
    public void testDijkstra89() {
        int[][] graph = {
                {2, 0, 0, 3},
                {2, 1, 0, 3},
                {2, 4, 3, 3},
                {2, 3, 4, 0}
        };
        int[] expectedDistances = {0, 6, 7, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 90
    @Test
    public void testDijkstra90() {
        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 3, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 91
    @Test
    public void testDijkstra91() {
        int[][] graph = {
                {0, 4, 0},
                {2, 2, 0},
                {4, 0, 4}
        };
        int[] expectedDistances = {0, 4, Integer.MAX_VALUE};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 92
    @Test
    public void testDijkstra92() {
        int[][] graph = {
                {3, 1, 4},
                {0, 1, 4},
                {3, 1, 4}
        };
        int[] expectedDistances = {0, 1, 4};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 93
    @Test
    public void testDijkstra93() {
        int[][] graph = {
                {2, 1, 4},
                {3, 3, 3},
                {3, 0, 3}
        };
        int[] expectedDistances = {0, 1, 4};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 94
    @Test
    public void testDijkstra94() {
        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 3, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 95
    @Test
    public void testDijkstra95() {
        int[][] graph = {
                {4, 2, 1},
                {4, 2, 3},
                {4, 2, 1}
        };
        int[] expectedDistances = {0, 2, 1};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 96
    @Test
    public void testDijkstra96() {
        int[][] graph = {
                {2, 4, 2, 3},
                {2, 4, 3, 2},
                {1, 0, 1, 4},
                {2, 0, 1, 0}
        };
        int[] expectedDistances = {0, 4, 2, 3};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 97
    @Test
    public void testDijkstra97() {
        int[][] graph = {
                {0, 5, 0},
                {0, 0, 10},
                {0, 0, 0}
        };
        int[] expectedDistances = {0, 5, 15};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 98
    @Test
    public void testDijkstra98() {
        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 3},
                {0, 0, 0, 0}
        };
        int[] expectedDistances = {0, 1, 3, 6};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 99
    @Test
    public void testDijkstra99() {
        int[][] graph = {
                {0, 1, 0},
                {0, 2, 1},
                {3, 2, 1}
        };
        int[] expectedDistances = {0, 1, 2};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }

    // Test 100
    @Test
    public void testDijkstra100() {
        int[][] graph = {
                {1, 2, 0, 0},
                {3, 3, 1, 3},
                {3, 3, 3, 4},
                {1, 2, 2, 0}
        };
        int[] expectedDistances = {0, 2, 3, 5};
        assertArrayEquals(expectedDistances, Dijkstra_Algorithm.dijkstra(graph));
    }
}
