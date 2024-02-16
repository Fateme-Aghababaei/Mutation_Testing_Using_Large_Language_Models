package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TSP_Algorithm_Test {
    @Test
    public void testTSP1() {
        double[][] distance = {{0, 10, 15}, {10, 0, 20}, {15, 20, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(45, tspSolver.getTourCost());
    }

    @Test
    public void testTSP2() {
        double[][] distance = {{0, 5, 8, 15}, {5, 0, 10, 12}, {8, 10, 0, 18}, {15, 12, 18, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(0, distance);
        assertNotNull(tspSolver);
        assertEquals(43, tspSolver.getTourCost());
    }

    @Test
    public void testTSP3() {
        double[][] distance = {{0, 20, 42, 35, 28}, {20, 0, 30, 34, 40}, {42, 30, 0, 12, 24}, {35, 34, 12, 0, 10}, {28, 40, 24, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(100, tspSolver.getTourCost());
    }

    @Test
    public void testTSP4() {
        double[][] distance = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(0, tspSolver.getTourCost());
    }

    @Test
    public void testTSP5() {
        double[][] distance = {{0, 2, 0}, {2, 0, 1}, {0, 1, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(3, tspSolver.getTourCost());
    }

    @Test
    public void testTSP6() {
        double[][] distance = {{0, 5, 1}, {5, 0, 1}, {1, 1, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(7, tspSolver.getTourCost());
    }

    @Test
    public void testTSP7() {
        double[][] distance = {{0, 2, 3, 4}, {2, 0, 5, 6}, {3, 5, 0, 7}, {4, 6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP8() {
        double[][] distance = {{0, 2, 3, 4}, {2, 0, 5, 6}, {3, 4, 0, 7}, {4, 6, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP9() {
        double[][] distance = {{0, 2, 3, 4}, {2, 0, 1, 6}, {3, 5, 0, 7}, {4, 6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(14, tspSolver.getTourCost());
    }

    @Test
    public void testTSP10() {
        double[][] distance = {{0, 2, 5, 4}, {1, 0, 5, 6}, {3, 5, 0, 7}, {4, 6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(3, distance);
        assertNotNull(tspSolver);
        assertEquals(17, tspSolver.getTourCost());
    }

    @Test
    public void testTSP11() {
        double[][] distance = {{0, 5, 7, 9}, {5, 0, 10, 15}, {7, 10, 0, 8}, {9, 15, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(32, tspSolver.getTourCost());
    }

    @Test
    public void testTSP12() {
        double[][] distance = {{0, 0, 2}, {2, 0, 0}, {3, 4, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(3, tspSolver.getTourCost());
    }

    @Test
    public void testTSP13() {
        double[][] distance = {{0, 5, 8}, {5, 0, 10}, {8, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(23, tspSolver.getTourCost());
    }

    @Test
    public void testTSP14() {
        double[][] distance = {{0, 2, 3}, {2, 0, 4}, {3, 4, 0}};
        try {
            TSP_Algorithm tspSolver = new TSP_Algorithm(-1, distance);
            tspSolver.getTourCost();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid start node.", e.getMessage());
        }
    }

    @Test
    public void testTSP15() {
        double[][] distance = {{0, 5, 7}, {5, 0, 10}, {7, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(22, tspSolver.getTourCost());
    }

    @Test
    public void testTSP16() {
        double[][] distance = {{0, 2, 3}, {2, 0, 4}, {3, 4, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(0, distance);
        assertNotNull(tspSolver);
        assertEquals(9, tspSolver.getTourCost());
    }

    @Test
    public void testTSP17() {
        double[][] distance = {{0, 2, 3}, {2, 0, 4}, {3, 4, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(9, tspSolver.getTourCost());
    }

    @Test
    public void testTSP18() {
        double[][] distance = {{0, 2, 3}, {2, 0, 4}, {3, 4, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(9, tspSolver.getTourCost());
    }

    @Test
    public void testTSP19() {
        double[][] distance = {{0, 5, 8}, {5, 0, 10}, {8, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(23, tspSolver.getTourCost());
    }

    @Test
    public void testTSP20() {
        double[][] distance = {{0, 5, 8, 10}, {5, 0, 15, 20}, {8, 15, 0, 25}, {10, 20, 25, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(53, tspSolver.getTourCost());
    }

    @Test
    public void testTSP21() {
        double[][] distance = {{0, 3, 6, 7}, {3, 0, 2, 5}, {6, 2, 0, 4}, {7, 5, 4, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP22() {
        double[][] distance = {{0, 4, 5, 6}, {4, 0, 7, 8}, {5, 7, 0, 9}, {6, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(26, tspSolver.getTourCost());
    }

    @Test
    public void testTSP23() {
        double[][] distance = {{0, 10, 15}, {10, 0, 20}, {15, 20, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(45, tspSolver.getTourCost());
    }

    @Test
    public void testTSP24() {
        double[][] distance = {{0, 3, 6}, {3, 0, 5}, {6, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(14, tspSolver.getTourCost());
    }

    @Test
    public void testTSP25() {
        double[][] distance = {{0, 4, 7}, {4, 0, 6}, {7, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(17, tspSolver.getTourCost());
    }

    @Test
    public void testTSP26() {
        double[][] distance = {{0, 2, 3}, {2, 0, 4}, {3, 4, 0}};
        try {
            TSP_Algorithm tspSolver = new TSP_Algorithm(3, distance);
            tspSolver.getTourCost();
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid start node.", e.getMessage());
        }
    }

    @Test
    public void testTSP27() {
        double[][] distance = {{0, 3, 5}, {3, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(14, tspSolver.getTourCost());
    }

    @Test
    public void testTSP28() {
        double[][] distance = {{0, 4, 7}, {4, 0, 8}, {7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(19, tspSolver.getTourCost());
    }

    @Test
    public void testTSP29() {
        double[][] distance = {{0, 4, 5, 6}, {4, 0, 7, 8}, {5, 7, 0, 9}, {6, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(26, tspSolver.getTourCost());
    }

    @Test
    public void testTSP30() {
        double[][] distance = {{0, 3, 4, 5}, {3, 0, 6, 7}, {4, 6, 0, 8}, {5, 7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(22, tspSolver.getTourCost());
    }

    @Test
    public void testTSP31() {
        double[][] distance = {{0, 4, 5, 6}, {4, 0, 7, 8}, {5, 7, 0, 9}, {6, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(26, tspSolver.getTourCost());
    }

    @Test
    public void testTSP32() {
        double[][] distance = {{0, 2, 4}, {2, 0, 6}, {4, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(12, tspSolver.getTourCost());
    }

    @Test
    public void testTSP33() {
        double[][] distance = {{0, 3, 5}, {3, 0, 7}, {5, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP34() {
        double[][] distance = {{0, 4, 6}, {4, 0, 8}, {6, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP35() {
        double[][] distance = {{0, 3, 6}, {3, 0, 9}, {6, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP36() {
        double[][] distance = {{0, 4, 5}, {4, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP37() {
        double[][] distance = {{0, 2, 3, 5}, {2, 0, 4, 6}, {3, 4, 0, 7}, {5, 6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP38() {
        double[][] distance = {{0, 3, 4}, {3, 0, 5}, {4, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(12, tspSolver.getTourCost());
    }

    @Test
    public void testTSP39() {
        double[][] distance = {{0, 4, 5}, {4, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP40() {
        double[][] distance = {{0, 3, 5}, {3, 0, 7}, {5, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP41() {
        double[][] distance = {{0, 2, 4}, {2, 0, 6}, {4, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(12, tspSolver.getTourCost());
    }

    @Test
    public void testTSP42() {
        double[][] distance = {{0, 4, 5}, {4, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP43() {
        double[][] distance = {{0, 3, 5}, {3, 0, 7}, {5, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP44() {
        double[][] distance = {{0, 4, 6}, {4, 0, 7}, {6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(17, tspSolver.getTourCost());
    }

    @Test
    public void testTSP45() {
        double[][] distance = {{0, 2, 4, 6}, {2, 0, 5, 7}, {4, 5, 0, 8}, {6, 7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(21, tspSolver.getTourCost());
    }

    @Test
    public void testTSP46() {
        double[][] distance = {{0, 5, 8}, {5, 0, 10}, {8, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(23, tspSolver.getTourCost());
    }

    @Test
    public void testTSP47() {
        double[][] distance = {{0, 6, 8}, {6, 0, 3}, {8, 3, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(0, distance);
        assertNotNull(tspSolver);
        assertEquals(17, tspSolver.getTourCost());
    }

    @Test
    public void testTSP48() {
        double[][] distance = {{0, 4, 7}, {4, 0, 8}, {7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(19, tspSolver.getTourCost());
    }

    @Test
    public void testTSP49() {
        double[][] distance = {{0, 5, 7}, {5, 0, 8}, {7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(20, tspSolver.getTourCost());
    }

    @Test
    public void testTSP50() {
        double[][] distance = {{0, 2, 6}, {2, 0, 8}, {6, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP51() {
        double[][] distance = {{0, 3, 4}, {3, 0, 5}, {4, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(12, tspSolver.getTourCost());
    }

    @Test
    public void testTSP52() {
        double[][] distance = {{0, 2, 5, 7}, {2, 0, 6, 8}, {5, 6, 0, 9}, {7, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(24, tspSolver.getTourCost());
    }

    @Test
    public void testTSP53() {
        double[][] distance = {{0, 3, 7}, {3, 0, 6}, {7, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP54() {
        double[][] distance = {{0, 2, 5}, {2, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(13, tspSolver.getTourCost());
    }

    @Test
    public void testTSP55() {
        double[][] distance = {{0, 4, 6}, {4, 0, 8}, {6, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP56() {
        double[][] distance = {{0, 3, 6}, {3, 0, 9}, {6, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP57() {
        double[][] distance = {{0, 2, 5}, {2, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(13, tspSolver.getTourCost());
    }

    @Test
    public void testTSP58() {
        double[][] distance = {{0, 4, 7}, {4, 0, 8}, {7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(19, tspSolver.getTourCost());
    }

    @Test
    public void testTSP59() {
        double[][] distance = {{0, 2, 4, 6}, {2, 0, 5, 7}, {4, 5, 0, 8}, {6, 7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(21, tspSolver.getTourCost());
    }

    @Test
    public void testTSP60() {
        double[][] distance = {{0, 4, 6, 8}, {4, 0, 7, 9}, {6, 7, 0, 10}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(29, tspSolver.getTourCost());
    }

    @Test
    public void testTSP61() {
        double[][] distance = {{0, 2, 4, 6}, {2, 0, 7, 8}, {4, 7, 0, 9}, {6, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(23, tspSolver.getTourCost());
    }

    @Test
    public void testTSP62() {
        double[][] distance = {{0, 3, 6}, {3, 0, 7}, {6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP63() {
        double[][] distance = {{0, 2, 4}, {2, 0, 5}, {4, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(11, tspSolver.getTourCost());
    }

    @Test
    public void testTSP64() {
        double[][] distance = {{0, 3, 5}, {3, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(14, tspSolver.getTourCost());
    }

    @Test
    public void testTSP65() {
        double[][] distance = {{0, 2, 5, 7}, {2, 0, 6, 8}, {5, 6, 0, 9}, {7, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(24, tspSolver.getTourCost());
    }

    @Test
    public void testTSP66() {
        double[][] distance = {{0, 3, 6, 8}, {3, 0, 7, 9}, {6, 7, 0, 10}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(28, tspSolver.getTourCost());
    }

    @Test
    public void testTSP67() {
        double[][] distance = {{0, 4, 6, 8}, {4, 0, 7, 9}, {6, 7, 0, 10}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(29, tspSolver.getTourCost());
    }

    @Test
    public void testTSP68() {
        double[][] distance = {{0, 3, 6}, {3, 0, 7}, {6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP69() {
        double[][] distance = {{0, 3, 5, 7}, {3, 0, 6, 8}, {5, 6, 0, 9}, {7, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(25, tspSolver.getTourCost());
    }

    @Test
    public void testTSP70() {
        double[][] distance = {{0, 2, 3}, {2, 0, 5}, {3, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(10, tspSolver.getTourCost());
    }

    @Test
    public void testTSP71() {
        double[][] distance = {{0, 4, 8}, {4, 0, 9}, {8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(21, tspSolver.getTourCost());
    }

    @Test
    public void testTSP72() {
        double[][] distance = {{0, 4, 7, 8}, {4, 0, 10, 9}, {7, 10, 0, 11}, {8, 9, 11, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(31, tspSolver.getTourCost());
    }

    @Test
    public void testTSP73() {
        double[][] distance = {{0, 3, 6, 8}, {3, 0, 7, 9}, {6, 7, 0, 10}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(28, tspSolver.getTourCost());
    }

    @Test
    public void testTSP74() {
        double[][] distance = {{0, 2, 4, 6}, {2, 0, 5, 7}, {4, 5, 0, 8}, {6, 7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(21, tspSolver.getTourCost());
    }

    @Test
    public void testTSP75() {
        double[][] distance = {{0, 4, 7, 8}, {4, 0, 10, 9}, {7, 10, 0, 11}, {8, 9, 11, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(31, tspSolver.getTourCost());
    }

    @Test
    public void testTSP76() {
        double[][] distance = {{0, 2, 3}, {2, 0, 5}, {3, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(10, tspSolver.getTourCost());
    }

    @Test
    public void testTSP77() {
        double[][] distance = {{0, 4, 8, 6}, {4, 0, 7, 9}, {8, 7, 0, 10}, {6, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(27, tspSolver.getTourCost());
    }

    @Test
    public void testTSP78() {
        double[][] distance = {{0, 4, 6, 8}, {4, 0, 7, 9}, {6, 7, 0, 10}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(29, tspSolver.getTourCost());
    }

    @Test
    public void testTSP79() {
        double[][] distance = {{0, 3, 5}, {3, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(14, tspSolver.getTourCost());
    }

    @Test
    public void testTSP80() {
        double[][] distance = {{0, 3, 6}, {3, 0, 7}, {6, 7, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP81() {
        double[][] distance = {{0, 4, 8, 6}, {4, 1, 2, 5}, {8, 7, 0, 10}, {6, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(22, tspSolver.getTourCost());
    }

    @Test
    public void testTSP82() {
        double[][] distance = {{0, 2, 4, 6}, {2, 0, 5, 7}, {4, 5, 8, 3}, {6, 7, 2, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(3, distance);
        assertNotNull(tspSolver);
        assertEquals(15, tspSolver.getTourCost());
    }

    @Test
    public void testTSP83() {
        double[][] distance = {{0, 4, 7}, {4, 1, 8}, {7, 8, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(19, tspSolver.getTourCost());
    }

    @Test
    public void testTSP84() {
        double[][] distance = {{0, 3, 6, 8}, {3, 0, 7, 9}, {6, 7, 0, 10}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(3, distance);
        assertNotNull(tspSolver);
        assertEquals(28, tspSolver.getTourCost());
    }

    @Test
    public void testTSP85() {
        double[][] distance = {{0, 4, 7, 8}, {4, 0, 10, 9}, {7, 10, 0, 11}, {8, 9, 11, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(3, distance);
        assertNotNull(tspSolver);
        assertEquals(31, tspSolver.getTourCost());
    }

    @Test
    public void testTSP86() {
        double[][] distance = {{0, 3, 6}, {3, 2, 7}, {6, 7, 2}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP87() {
        double[][] distance = {{0, 2, 6}, {2, 0, 5}, {4, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(11, tspSolver.getTourCost());
    }

    @Test
    public void testTSP88() {
        double[][] distance = {{0, 3, 5}, {3, 1, 6}, {5, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(distance);
        assertNotNull(tspSolver);
        assertEquals(13, tspSolver.getTourCost());
    }

    @Test
    public void testTSP89() {
        double[][] distance = {{0, 2, 5, 7}, {2, 0, 6, 8}, {5, 6, 0, 9}, {7, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(3, distance);
        assertNotNull(tspSolver);
        assertEquals(24, tspSolver.getTourCost());
    }

    @Test
    public void testTSP90() {
        double[][] distance = {{0, 3, 6, 8}, {3, 0, 7, 9}, {6, 7, 0, 9}, {8, 9, 10, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(27, tspSolver.getTourCost());
    }

    @Test
    public void testTSP91() {
        double[][] distance = {{0, 3, 5, 7}, {3, 0, 6, 8}, {5, 6, 0, 9}, {7, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(25, tspSolver.getTourCost());
    }

    @Test
    public void testTSP92() {
        double[][] distance = {{0, 2, 4}, {2, 0, 5}, {4, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(11, tspSolver.getTourCost());
    }

    @Test
    public void testTSP93() {
        double[][] distance = {{0, 3, 5, 7}, {2, 0, 6, 8}, {5, 6, 0, 9}, {7, 8, 9, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(24, tspSolver.getTourCost());
    }

    @Test
    public void testTSP94() {
        double[][] distance = {{0}};
        try {
            TSP_Algorithm tspSolver = new TSP_Algorithm(0, distance);
            tspSolver.getTourCost();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException e) {
            assertEquals("N <= 2 not yet supported.", e.getMessage());
        }
    }

    @Test
    public void testTSP95() {
        double[][] distance = {{0, 2, 5}, {2, 0, 6}, {5, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(13, tspSolver.getTourCost());
    }

    @Test
    public void testTSP96() {
        double[][] distance = {{0, 2, 9}, {2, 0, 5}, {9, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(16, tspSolver.getTourCost());
    }

    @Test
    public void testTSP97() {
        double[][] distance = {{0, 8, 1}, {8, 0, 4}, {1, 4, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(13, tspSolver.getTourCost());
    }

    @Test
    public void testTSP98() {
        double[][] distance = {{0, 4, 9}, {4, 0, 5}, {9, 5, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(2, distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP99() {
        double[][] distance = {{0, 3, 9}, {3, 0, 6}, {9, 6, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(18, tspSolver.getTourCost());
    }

    @Test
    public void testTSP100() {
        double[][] distance = {{0, 5, 7}, {5, 0, 2}, {7, 2, 0}};
        TSP_Algorithm tspSolver = new TSP_Algorithm(1, distance);
        assertNotNull(tspSolver);
        assertEquals(14, tspSolver.getTourCost());
    }
}
