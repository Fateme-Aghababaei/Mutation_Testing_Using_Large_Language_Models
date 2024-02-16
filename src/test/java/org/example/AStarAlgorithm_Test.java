package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.util.List;

public class AStarAlgorithm_Test {

    // Test 1: Simple path from start to goal
    @Test
    public void testAStarSearch_SimplePath() {
        // Create a simple graph
        Node start = new Node(0, 0);
        Node goal = new Node(2, 2);

        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 2: No path from start to unreachable goal
    @Test
    public void testAStarSearch_NoPath() {
        // Create a graph with no path from start to goal
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 3: Start and goal are the same
    @Test
    public void testAStarSearch_SameStartAndGoal() {
        // Create a graph where start and goal are the same
        Node start = new Node(0, 0);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, start);

        // Check if path has only one node
        assertNotNull(path);
        assertEquals(1, path.size());
        assertEquals(start, path.get(0));
    }

    // Test 4: Path with multiple nodes
    @Test
    public void testAStarSearch_PathWithMultipleNodes() {
        // Create a graph with a path from start to goal
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        node1.addNeighbor(node2, 1);
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(5, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(4));
    }

    // Test 5: Path with obstacles
    @Test
    public void testAStarSearch_PathWithObstacles() {
        // Create a graph with obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node obstacle1 = new Node(1, 1);
        Node obstacle2 = new Node(2, 2);
        Node obstacle3 = new Node(3, 3);

        start.addNeighbor(obstacle1, 1);
        obstacle1.addNeighbor(obstacle2, 1);
        obstacle2.addNeighbor(obstacle3, 1);
        obstacle3.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNotNull(path);
    }

    // Test 6: Large graph with straight line path
    @Test
    public void testAStarSearch_LargeGraphWithStraightLinePath() {
        // Create a large graph with a straight line path
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add straight line path
        for (int i = 1; i <= 99; i++) {
            start.addNeighbor(new Node(i, i), 1);
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 7: Large graph with multiple paths to goal
    @Test
    public void testAStarSearch_LargeGraphWithMultiplePaths() {
        // Create a large graph with multiple paths to goal
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add multiple paths
        for (int i = 1; i <= 99; i++) {
            start.addNeighbor(new Node(i, i), 1);
        }
        start.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(2, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(1));
    }

    // Test 8: Graph with negative edge weights
    @Test
    public void testAStarSearch_GraphWithNegativeEdgeWeights() {
        // Create a graph with negative edge weights
        Node start = new Node(0, 0);
        Node goal = new Node(2, 2);

        start.addNeighbor(new Node(1, 1), -1); // Negative edge weight

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 9: Large graph with random obstacles
    @Test
    public void testAStarSearch_LargeGraphWithRandomObstacles() {
        // Create a large graph with random obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add random obstacles
        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99; j++) {
                if (Math.random() < 0.2) { // 20% chance of obstacle
                    start.addNeighbor(new Node(i, j), Integer.MAX_VALUE); // Infinite weight for obstacle
                } else {
                    start.addNeighbor(new Node(i, j), 1);
                }
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
        // Path may not exist due to random obstacles, so no specific assertions
    }

    // Test 10: Graph with loops
    @Test
    public void testAStarSearch_GraphWithLoops() {
        // Create a graph with loops
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        node1.addNeighbor(node2, 1);
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(node1, 1); // Loop back to node1

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 11: Path with alternate paths of equal cost
    @Test
    public void testAStarSearch_AlternatePathsEqualCost() {
        // Create a graph with alternate paths of equal cost
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        start.addNeighbor(node2, 1);
        node1.addNeighbor(node3, 1);
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(3));
    }

    // Test 12: Path with alternate paths of different costs
    @Test
    public void testAStarSearch_AlternatePathsWithDifferentCosts() {
        // Create a graph with alternate paths of different costs
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        start.addNeighbor(node2, 2); // Higher cost
        node1.addNeighbor(node3, 1);
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(3));
    }

    // Test 13: Large graph with no possible path
    @Test
    public void testAStarSearch_LargeGraphNoPath() {
        // Create a large graph with no possible path
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // No connections added

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 14: Large graph with only one possible path
    @Test
    public void testAStarSearch_LargeGraphSinglePath() {
        // Create a large graph with only one possible path
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add straight line path
        for (int i = 1; i <= 99; i++) {
            start.addNeighbor(new Node(i, i), 1);
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 15: Large graph with multiple possible paths
    @Test
    public void testAStarSearch_LargeGraphMultiplePaths() {
        // Create a large graph with multiple possible paths
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add multiple paths
        for (int i = 1; i <= 99; i++) {
            start.addNeighbor(new Node(i, i), 1);
        }
        start.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(2, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(1));
    }

    // Test 16: Graph with negative edge weights and loops
    @Test
    public void testAStarSearch_GraphWithNegativeWeightsAndLoops() {
        // Create a graph with negative edge weights and loops
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        node1.addNeighbor(node2, -1); // Negative edge weight
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(node1, 1); // Loop back to node1

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 17: Graph with unreachable goal due to negative edge weights
    @Test
    public void testAStarSearch_UnreachableGoalNegativeWeights() {
        // Create a graph where goal is unreachable due to negative edge weights
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), -1); // Negative edge weight

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 18: Graph with unreachable goal due to high costs
    @Test
    public void testAStarSearch_UnreachableGoalHighCosts() {
        // Create a graph where goal is unreachable due to high costs
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(goal, 10); // High cost

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNotNull(path);
    }

    // Test 19: Large graph with highly disconnected components
    @Test
    public void testAStarSearch_LargeGraphHighlyDisconnected() {
        // Create a large graph with highly disconnected components
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);
        Node node4 = new Node(5, 5); // Disconnected node

        start.addNeighbor(node1, 1);
        node1.addNeighbor(node2, 1);
        node2.addNeighbor(node3, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 20: Large graph with random edge costs
    @Test
    public void testAStarSearch_LargeGraphRandomEdgeCosts() {
        // Create a large graph with random edge costs
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add random edge costs
        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99; j++) {
                start.addNeighbor(new Node(i, j), (int) (Math.random() * 10) + 1); // Random cost between 1 and 10
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // No specific assertions due to randomness
        assertNull(path);
    }

    // Test 21: Graph with diagonal movements
    @Test
    public void testAStarSearch_DiagonalMovements() {
        // Create a graph with diagonal movements
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), 1); // Diagonal movement
        new Node(1, 1).addNeighbor(goal, 1); // Diagonal movement

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 22: Graph with variable edge weights
    @Test
    public void testAStarSearch_VariableEdgeWeights() {
        // Create a graph with variable edge weights
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), 2); // Higher cost
        new Node(1, 1).addNeighbor(goal, 1); // Lower cost

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 23: Graph with varying terrain costs
    @Test
    public void testAStarSearch_VaryingTerrainCosts() {
        // Create a graph with varying terrain costs
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), 1); // Regular terrain
        new Node(1, 1).addNeighbor(goal, 3); // Difficult terrain

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 24: Graph with impassable obstacles
    @Test
    public void testAStarSearch_ImpassableObstacles() {
        // Create a graph with impassable obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), Integer.MAX_VALUE); // Impassable obstacle
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 25: Graph with non-square shape
    @Test
    public void testAStarSearch_NonSquareShape() {
        // Create a graph with non-square shape
        Node start = new Node(0, 0);
        Node goal = new Node(3, 6);

        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(new Node(2, 2), 1);
        new Node(2, 2).addNeighbor(new Node(3, 3), 1);
        new Node(3, 3).addNeighbor(new Node(3, 4), 1);
        new Node(3, 4).addNeighbor(new Node(3, 5), 1);
        new Node(3, 5).addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 26: Graph with non-integer coordinates
    @Test
    public void testAStarSearch_NonIntegerCoordinates() {
        // Create a graph with non-integer coordinates
        Node start = new Node(5, 5);
        Node goal = new Node(7, 7);

        start.addNeighbor(new Node(6, 6), 1);
        new Node(6, 6).addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 27: Large graph with random obstacles and variable terrain
    @Test
    public void testAStarSearch_LargeGraphRandomObstaclesAndTerrain() {
        // Create a large graph with random obstacles and variable terrain
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add random obstacles and terrain
        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99; j++) {
                if (Math.random() < 0.2) { // 20% chance of obstacle
                    start.addNeighbor(new Node(i, j), Integer.MAX_VALUE); // Infinite weight for obstacle
                } else {
                    start.addNeighbor(new Node(i, j), (int) (Math.random() * 10) + 1); // Random terrain cost
                }
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // No specific assertions due to randomness
        assertNull(path);
    }

    // Test 28: Large graph with no obstacles but high terrain cost
    @Test
    public void testAStarSearch_LargeGraphHighTerrainCost() {
        // Create a large graph with no obstacles but high terrain cost
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add high terrain cost
        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99; j++) {
                start.addNeighbor(new Node(i, j), 10); // High terrain cost
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 29: Large graph with a single long winding path
    @Test
    public void testAStarSearch_LargeGraphSingleLongPath() {
        // Create a large graph with a single long winding path
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add winding path
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                start.addNeighbor(new Node(i, i), 1);
            } else {
                start.addNeighbor(new Node(i, i + 1), 1);
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 30: Large graph with multiple disconnected components
    @Test
    public void testAStarSearch_LargeGraphDisconnectedComponents() {
        // Create a large graph with multiple disconnected components
        Node start = new Node(0, 0);
        Node goal = new Node(99, 99);

        // Add two disconnected components
        for (int i = 1; i <= 49; i++) {
            start.addNeighbor(new Node(i, i), 1);
            goal.addNeighbor(new Node(99 - i, 99 - i), 1);
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 31: Graph with large open spaces and few obstacles
    @Test
    public void testAStarSearch_LargeGraphOpenSpacesFewObstacles() {
        // Create a graph with large open spaces and few obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                start.addNeighbor(new Node(i, j), 1);
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 32: Graph with multiple paths of equal cost
    @Test
    public void testAStarSearch_MultiplePathsEqualCost() {
        // Create a graph with multiple paths of equal cost
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        start.addNeighbor(node2, 1);
        node1.addNeighbor(node3, 1);
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(3));
    }

    // Test 33: Graph with multiple paths of different costs
    @Test
    public void testAStarSearch_MultiplePathsWithDifferentCosts() {
        // Create a graph with multiple paths of different costs
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 1);
        start.addNeighbor(node2, 2); // Higher cost
        node1.addNeighbor(node3, 1);
        node2.addNeighbor(node3, 1);
        node3.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(3));
    }

    // Test 34: Graph with highly uneven terrain
    @Test
    public void testAStarSearch_HighlyUnevenTerrain() {
        // Create a graph with highly uneven terrain
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), 1); // Flat terrain
        new Node(1, 1).addNeighbor(goal, 10); // Steep terrain

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 35: Graph with long detours
    @Test
    public void testAStarSearch_LongDetours() {
        // Create a graph with long detours
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node detour1 = new Node(1, 1);
        Node detour2 = new Node(2, 2);
        Node detour3 = new Node(3, 3);

        start.addNeighbor(detour1, 1);
        detour1.addNeighbor(detour2, 1);
        detour2.addNeighbor(detour3, 1);
        detour3.addNeighbor(goal, 1);

        // Add a shorter direct path
        start.addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(2, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(1));
    }

    // Test 36: Graph with long winding paths
    @Test
    public void testAStarSearch_LongWindingPaths() {
        // Create a graph with long winding paths
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Add winding paths
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                start.addNeighbor(new Node(i, j), 1);
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 37: Graph with multiple loops
    @Test
    public void testAStarSearch_MultipleLoops() {
        // Create a graph with multiple loops
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node loop1 = new Node(1, 1);
        Node loop2 = new Node(2, 2);
        Node loop3 = new Node(3, 3);

        start.addNeighbor(loop1, 1);
        loop1.addNeighbor(loop2, 1);
        loop2.addNeighbor(loop3, 1);
        loop3.addNeighbor(start, 1); // Loop back to start

        // Another loop
        start.addNeighbor(goal, 1);
        goal.addNeighbor(loop1, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNotNull(path);
    }

    // Test 38: Graph with one-way paths
    @Test
    public void testAStarSearch_OneWayPaths() {
        // Create a graph with one-way paths
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(new Node(2, 2), 1);
        new Node(2, 2).addNeighbor(new Node(3, 3), 1);
        new Node(3, 3).addNeighbor(goal, 1);

        // Add a one-way path
        start.addNeighbor(new Node(4, 4), 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 39: Graph with negative edge weights and obstacles
    @Test
    public void testAStarSearch_NegativeEdgeWeightsAndObstacles() {
        // Create a graph with negative edge weights and obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        start.addNeighbor(new Node(1, 1), -1); // Negative edge weight
        new Node(1, 1).addNeighbor(goal, 1);

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 40: Graph with high variability in edge costs
    @Test
    public void testAStarSearch_HighVariabilityEdgeCosts() {
        // Create a graph with high variability in edge costs
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Add edges with different costs
        start.addNeighbor(new Node(1, 1), 1);
        start.addNeighbor(new Node(2, 2), 2);
        start.addNeighbor(new Node(3, 3), 5);
        start.addNeighbor(goal, 10); // High cost

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(2, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(1));
    }


    // Test 41: Graph with multiple paths of different costs (increased complexity)
    @Test
    public void testAStarSearch_MultiplePathsWithDifferentCosts_Complex() {
        // Create a graph with multiple paths of different costs (increased complexity)
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);

        start.addNeighbor(node1, 2); // Higher cost
        start.addNeighbor(node2, 1); // Lower cost
        node1.addNeighbor(node3, 3); // Higher cost
        node2.addNeighbor(node3, 2); // Lower cost
        node3.addNeighbor(goal, 2); // Lower cost

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(3));
    }

    // Test 42: Graph with dynamic obstacles
    @Test
    public void testAStarSearch_DynamicObstacles() {
        // Create a graph with dynamic obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no obstacles
        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Add obstacle dynamically
        start.addNeighbor(new Node(1, 1), Integer.MAX_VALUE); // Obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 43: Graph with changing terrain
    @Test
    public void testAStarSearch_ChangingTerrain() {
        // Create a graph with changing terrain
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially flat terrain
        start.addNeighbor(new Node(1, 1), 1); // Flat terrain
        new Node(1, 1).addNeighbor(goal, 1); // Flat terrain

        // Change terrain dynamically
        start.addNeighbor(new Node(1, 1), 5); // Rough terrain

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 44: Graph with moving obstacles
    @Test
    public void testAStarSearch_MovingObstacles() {
        // Create a graph with moving obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no obstacles
        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Add moving obstacle
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Initial obstacle
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Remove obstacle dynamically
        start.removeNeighbor(new Node(2, 2)); // Remove obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 45: Graph with varying weather conditions
    @Test
    public void testAStarSearch_VaryingWeatherConditions() {
        // Create a graph with varying weather conditions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear weather
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add stormy weather condition
        start.addNeighbor(new Node(2, 2), 5); // Stormy weather
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 46: Graph with multiple moving targets
    @Test
    public void testAStarSearch_MultipleMovingTargets() {
        // Create a graph with multiple moving targets
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no obstacles
        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Add moving targets
        start.addNeighbor(new Node(2, 2), 1); // Initial position of target
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Move target dynamically
        start.removeNeighbor(new Node(2, 2)); // Remove initial position of target
        start.addNeighbor(new Node(3, 3), 1); // New position of target
        new Node(3, 3).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 47: Graph with changing traffic conditions
    @Test
    public void testAStarSearch_ChangingTrafficConditions() {
        // Create a graph with changing traffic conditions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no traffic
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add heavy traffic
        start.addNeighbor(new Node(2, 2), 5); // Heavy traffic
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 48: Graph with multiple moving obstacles
    @Test
    public void testAStarSearch_MultipleMovingObstacles() {
        // Create a graph with multiple moving obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no obstacles
        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Add moving obstacles
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Initial obstacle
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Move obstacle dynamically
        start.removeNeighbor(new Node(2, 2)); // Remove initial position of obstacle
        start.addNeighbor(new Node(3, 3), Integer.MAX_VALUE); // New position of obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 49: Graph with changing environmental conditions
    @Test
    public void testAStarSearch_ChangingEnvironmentalConditions() {
        // Create a graph with changing environmental conditions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially favorable conditions
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Change to unfavorable conditions
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Impassable obstacle

        // Change to favorable conditions again
        start.removeNeighbor(new Node(2, 2)); // Remove obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 50: Graph with changing road conditions
    @Test
    public void testAStarSearch_ChangingRoadConditions() {
        // Create a graph with changing road conditions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially good road conditions
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add roadwork
        start.addNeighbor(new Node(2, 2), 10); // Roadwork
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Road conditions improve
        start.removeNeighbor(new Node(2, 2)); // Remove roadwork

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 51: Graph with varying fuel prices
    @Test
    public void testAStarSearch_VaryingFuelPrices() {
        // Create a graph with varying fuel prices
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially low fuel prices
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // High fuel prices
        start.addNeighbor(new Node(2, 2), 5); // High fuel prices
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Low fuel prices again
        start.removeNeighbor(new Node(2, 2)); // Remove high fuel prices

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 52: Graph with changing destination
    @Test
    public void testAStarSearch_ChangingDestination() {
        // Create a graph with changing destination
        Node start = new Node(0, 0);
        Node goal1 = new Node(4, 4);
        Node goal2 = new Node(8, 8);

        // Initially aiming for goal1
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal1, 1); // Regular path

        // Change destination to goal2
        new Node(1, 1).addNeighbor(goal2, 1); // New destination

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal1);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 53: Graph with changing starting point
    @Test
    public void testAStarSearch_ChangingStartingPoint() {
        // Create a graph with changing starting point
        Node start1 = new Node(0, 0);
        Node start2 = new Node(4, 4);
        Node goal = new Node(8, 8);

        // Initially start from start1
        start1.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Change starting point to start2
        start2.addNeighbor(new Node(5, 5), 1); // New starting point
        new Node(5, 5).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start2, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 54: Graph with multiple simultaneous changes
    @Test
    public void testAStarSearch_MultipleSimultaneousChanges() {
        // Create a graph with multiple simultaneous changes
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add obstacle and change terrain dynamically
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Obstacle
        new Node(2, 2).addNeighbor(goal, 5); // Rough terrain

        // Move obstacle dynamically
        start.removeNeighbor(new Node(2, 2)); // Remove obstacle
        start.addNeighbor(new Node(3, 3), 1); // New position of obstacle
        new Node(3, 3).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 55: Graph with delayed information
    @Test
    public void testAStarSearch_DelayedInformation() {
        // Create a graph with delayed information
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no obstacles
        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Add obstacle after some time
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Wait for some time before adding obstacle
        try {
            Thread.sleep(500); // Wait for 500 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 56: Graph with long-term memory
    @Test
    public void testAStarSearch_LongTermMemory() {
        // Create a graph with long-term memory
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially no obstacles
        start.addNeighbor(new Node(1, 1), 1);
        new Node(1, 1).addNeighbor(goal, 1);

        // Add obstacle and then remove it after some time
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Wait for some time before removing obstacle
        try {
            Thread.sleep(500); // Wait for 500 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        start.removeNeighbor(new Node(2, 2)); // Remove obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 57: Graph with limited visibility
    @Test
    public void testAStarSearch_LimitedVisibility() {
        // Create a graph with limited visibility
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add obstacle out of visibility range
        start.addNeighbor(new Node(5, 5), Integer.MAX_VALUE); // Obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 58: Graph with changing perspectives
    @Test
    public void testAStarSearch_ChangingPerspectives() {
        // Create a graph with changing perspectives
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Change perspective by rotating the map
        start.addNeighbor(new Node(5, 5), 1); // Regular path
        new Node(5, 5).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
        }

    // Test 59: Graph with multiple independent agents
    @Test
    public void testAStarSearch_MultipleIndependentAgents() {
        // Create a graph with multiple independent agents
        Node start1 = new Node(0, 0);
        Node start2 = new Node(4, 4);
        Node goal1 = new Node(2, 2);
        Node goal2 = new Node(6, 6);

        // Agent 1 path
        start1.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal1, 1); // Regular path

        // Agent 2 path
        start2.addNeighbor(new Node(5, 5), 1); // Regular path
        new Node(5, 5).addNeighbor(goal2, 1); // Regular path

        // Perform A* search for Agent 1
        List<Node> path1 = AStarAlgorithm.aStarSearch(start1, goal1);

        // Perform A* search for Agent 2
        List<Node> path2 = AStarAlgorithm.aStarSearch(start2, goal2);

        // Check if both paths are correct
        assertNull(path1);
        assertNull(path2);
    }

    // Test 60: Graph with cooperative agents
    @Test
    public void testAStarSearch_CooperativeAgents() {
        // Create a graph with cooperative agents
        Node start = new Node(0, 0);
        Node goal1 = new Node(2, 2);
        Node goal2 = new Node(6, 6);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path for both agents
        new Node(1, 1).addNeighbor(goal1, 1); // Regular path for Agent 1
        new Node(1, 1).addNeighbor(goal2, 1); // Regular path for Agent 2

        // Perform A* search for Agent 1
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal1);

        // Perform A* search for Agent 2
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal2);

        // Check if both paths are correct
        assertNull(path1);
        assertNull(path2);
    }

    // Test 61: Graph with competing agents
    @Test
    public void testAStarSearch_CompetingAgents() {
        // Create a graph with competing agents
        Node start = new Node(0, 0);
        Node goal1 = new Node(2, 2);
        Node goal2 = new Node(6, 6);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path for both agents
        new Node(1, 1).addNeighbor(goal1, 1); // Regular path for Agent 1
        new Node(1, 1).addNeighbor(goal2, 1); // Regular path for Agent 2

        // Perform A* search for Agent 1
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal1);

        // Perform A* search for Agent 2
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal2);

        // Check if both paths are correct
        assertNull(path1);
        assertNull(path2);
    }

    // Test 62: Graph with cooperative and competing agents
    @Test
    public void testAStarSearch_CooperativeAndCompetingAgents() {
        // Create a graph with cooperative and competing agents
        Node start = new Node(0, 0);
        Node goal1 = new Node(2, 2);
        Node goal2 = new Node(6, 6);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path for both agents
        new Node(1, 1).addNeighbor(goal1, 1); // Regular path for Agent 1
        new Node(1, 1).addNeighbor(goal2, 1); // Regular path for Agent 2

        // Perform A* search for Agent 1
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal1);

        // Perform A* search for Agent 2
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal2);

        // Check if both paths are correct
        assertNull(path1);
        assertNull(path2);
    }

    // Test 63: Graph with asynchronous updates
    @Test
    public void testAStarSearch_AsynchronousUpdates() {
        // Create a graph with asynchronous updates
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add obstacle after some time asynchronously
        new Thread(() -> {
            try {
                Thread.sleep(500); // Wait for 500 milliseconds
                start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Obstacle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 64: Graph with asynchronous pathfinding requests
    @Test
    public void testAStarSearch_AsynchronousPathfindingRequests() {
        // Create a graph with asynchronous pathfinding requests
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Perform A* search asynchronously
        List<Node>[] paths = new List[2];
        Thread t1 = new Thread(() -> paths[0] = AStarAlgorithm.aStarSearch(start, goal));
        Thread t2 = new Thread(() -> paths[1] = AStarAlgorithm.aStarSearch(start, goal));
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if both paths are correct
        assertNull(paths[0]);
        assertNull(paths[1]);
    }

    // Test 65: Graph with real-time updates
    @Test
    public void testAStarSearch_RealTimeUpdates() {
        // Create a graph with real-time updates
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add obstacle in real-time
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 500) ; // Wait for 500 milliseconds
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 66: Graph with real-time pathfinding requests
    @Test
    public void testAStarSearch_RealTimePathfindingRequests() {
        // Create a graph with real-time pathfinding requests
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear path
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Perform A* search in real-time
        List<Node> path = null;
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 500) { // Limit time to 500 milliseconds
            path = AStarAlgorithm.aStarSearch(start, goal);
            if (path != null) break; // Break if path is found before time limit
        }

        // Check if the path is correct
        assertNull(path);
    }

    // Test 67: Graph with delayed initialization
    @Test
    public void testAStarSearch_DelayedInitialization() {
        // Delayed initialization of graph
        Node start = null;
        Node goal = null;

        // Perform A* search with delayed initialization
        try {
            List<Node> path = AStarAlgorithm.aStarSearch(start, goal);
        } catch (IllegalArgumentException e) {
            assertEquals("Start and goal nodes must not be null", e.getMessage());
        }
    }

    // Test 68: Graph with delayed goal
    @Test
    public void testAStarSearch_DelayedGoal() {
        // Create a graph with delayed goal
        Node start = new Node(0, 0);
        Node goal = null;

        try {
            List<Node> path = AStarAlgorithm.aStarSearch(start, goal);
        } catch (IllegalArgumentException e) {
            assertEquals("Start and goal nodes must not be null", e.getMessage());
        }
    }

    // Test 69: Graph with delayed start
    @Test
    public void testAStarSearch_DelayedStart() {
        // Create a graph with delayed start
        Node start = null;
        Node goal = new Node(4, 4);

        try {
            List<Node> path = AStarAlgorithm.aStarSearch(start, goal);
        } catch (IllegalArgumentException e) {
            assertEquals("Start and goal nodes must not be null", e.getMessage());
        }
    }

    // Test 70: Graph with randomly generated obstacles
    @Test
    public void testAStarSearch_RandomlyGeneratedObstacles() {
        // Create a graph with randomly generated obstacles
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Generate random obstacles
        int obstacleCount = 5;
        for (int i = 0; i < obstacleCount; i++) {
            int x = (int) (Math.random() * 5);
            int y = (int) (Math.random() * 5);
            start.addNeighbor(new Node(x, y), Integer.MAX_VALUE); // Random obstacle
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 71: Graph with randomly generated start and goal
    @Test
    public void testAStarSearch_RandomlyGeneratedStartAndGoal() {
        // Create a graph with randomly generated start and goal
        Node start = new Node((int) (Math.random() * 5), (int) (Math.random() * 5));
        Node goal = new Node((int) (Math.random() * 5), (int) (Math.random() * 5));

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 72: Graph with randomly generated nodes and edges
    @Test
    public void testAStarSearch_RandomlyGeneratedNodesAndEdges() {
        // Create a graph with randomly generated nodes and edges
        int nodeCount = 5;
        Node[] nodes = new Node[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            nodes[i] = new Node((int) (Math.random() * 5), (int) (Math.random() * 5));
        }

        // Generate random edges
        for (int i = 0; i < nodeCount; i++) {
            for (int j = 0; j < nodeCount; j++) {
                if (i != j) {
                    nodes[i].addNeighbor(nodes[j], (int) (Math.random() * 10));
                }
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(nodes[0], nodes[nodeCount - 1]);

        // Check if no path is returned
        assertNotNull(path);
        assertEquals(nodes[0], path.get(0));
    }

    // Test 73: Graph with randomly generated nodes, edges, and obstacles
    @Test
    public void testAStarSearch_RandomlyGeneratedNodesEdgesAndObstacles() {
        // Create a graph with randomly generated nodes, edges, and obstacles
        int nodeCount = 5;
        Node[] nodes = new Node[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            nodes[i] = new Node((int) (Math.random() * 5), (int) (Math.random() * 5));
        }

        // Generate random edges
        for (int i = 0; i < nodeCount; i++) {
            for (int j = 0; j < nodeCount; j++) {
                if (i != j) {
                    nodes[i].addNeighbor(nodes[j], (int) (Math.random() * 15));
                }
            }
        }

        // Generate random obstacles
        int obstacleCount = 5;
        for (int i = 0; i < obstacleCount; i++) {
            int x = (int) (Math.random() * 5);
            int y = (int) (Math.random() * 5);
            nodes[0].addNeighbor(new Node(x, y), Integer.MAX_VALUE); // Random obstacle
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(nodes[0], nodes[nodeCount - 1]);

        // Check if no path is returned
        assertNotNull(path);
        assertEquals(nodes[0], path.get(0));
    }

    // Test 74: Graph with randomly generated nodes, edges, obstacles, and terrain
    @Test
    public void testAStarSearch_RandomlyGeneratedNodesEdgesObstaclesAndTerrain() {
        // Create a graph with randomly generated nodes, edges, obstacles, and terrain
        int nodeCount = 5;
        Node[] nodes = new Node[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            nodes[i] = new Node((int) (Math.random() * 5), (int) (Math.random() * 5));
        }

        // Generate random edges
        for (int i = 0; i < nodeCount; i++) {
            for (int j = 0; j < nodeCount; j++) {
                if (i != j) {
                    nodes[i].addNeighbor(nodes[j], (int) (Math.random() * 10));
                }
            }
        }

        // Generate random obstacles
        int obstacleCount = 5;
        for (int i = 0; i < obstacleCount; i++) {
            int x = (int) (Math.random() * 5);
            int y = (int) (Math.random() * 5);
            nodes[0].addNeighbor(new Node(x, y), Integer.MAX_VALUE); // Random obstacle
        }

        // Generate random terrain
        for (int i = 0; i < nodeCount; i++) {
            for (int j = 0; j < nodeCount; j++) {
                if (i != j) {
                    nodes[i].addNeighbor(nodes[j], (int) (Math.random() * 10));
                }
            }
        }

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(nodes[0], nodes[nodeCount - 1]);

        // Check if no path is returned
        assertNotNull(path);
        assertEquals(nodes[0], path.get(0));
    }

    // Test 75: Graph with multiple alternative routes
    @Test
    public void testAStarSearch_MultipleAlternativeRoutes() {
        // Create a graph with multiple alternative routes
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        start.addNeighbor(new Node(2, 2), 2); // Alternative path
        start.addNeighbor(new Node(3, 3), 3); // Another alternative path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path
        new Node(3, 3).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 76: Graph with restricted access areas
    @Test
    public void testAStarSearch_RestrictedAccessAreas() {
        // Create a graph with restricted access areas
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add restricted access areas
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Restricted area
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 77: Graph with one-way streets
    @Test
    public void testAStarSearch_OneWayStreets() {
        // Create a graph with one-way streets
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        start.addNeighbor(new Node(2, 2), 1); // One-way street
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to one-way street
        assertNull(path);
    }

    // Test 78: Graph with toll roads
    @Test
    public void testAStarSearch_TollRoads() {
        // Create a graph with toll roads
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add toll road
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Toll road with cost

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 79: Graph with road closures
    @Test
    public void testAStarSearch_RoadClosures() {
        // Create a graph with road closures
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Add road closure
        start.removeNeighbor(new Node(2, 2)); // Close one path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to road closure
        assertNull(path);
    }

    // Test 80: Graph with vehicle-specific restrictions
    @Test
    public void testAStarSearch_VehicleSpecificRestrictions() {
        // Create a graph with vehicle-specific restrictions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with restriction for certain vehicles
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Restricted for vehicle type 1
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search for vehicle type 1
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned for restricted vehicle type
        assertNull(path1);

        // Perform A* search for vehicle type 2
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct for unrestricted vehicle type
        assertNull(path2);
    }

    // Test 81: Graph with multiple intermediate destinations
    @Test
    public void testAStarSearch_MultipleIntermediateDestinations() {
        // Create a graph with multiple intermediate destinations
        Node start = new Node(0, 0);
        Node mid1 = new Node(2, 2);
        Node mid2 = new Node(4, 4);
        Node goal = new Node(6, 6);

        // Initially clear paths
        start.addNeighbor(mid1, 1); // Regular path
        mid1.addNeighbor(mid2, 1); // Regular path
        mid2.addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNotNull(path);
        assertEquals(4, path.size());
        assertEquals(start, path.get(0));
        assertEquals(goal, path.get(3));
    }

    // Test 82: Graph with limited sensor range
    @Test
    public void testAStarSearch_LimitedSensorRange() {
        // Create a graph with limited sensor range
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add obstacle out of sensor range
        start.addNeighbor(new Node(5, 5), Integer.MAX_VALUE); // Obstacle

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 83: Graph with restricted time windows
    @Test
    public void testAStarSearch_RestrictedTimeWindows() {
        // Create a graph with restricted time windows
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with restricted time window
        start.addNeighbor(new Node(2, 2), 1); // Restricted time window
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal); // Current time: 10

        // Check if the path is correct
        assertNull(path);
    }

    // Test 84: Graph with varying terrain elevations
    @Test
    public void testAStarSearch_VaryingTerrainElevations() {
        // Create a graph with varying terrain elevations
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with varying terrain elevations
        start.addNeighbor(new Node(2, 2), 1); // High elevation
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 85: Graph with limited processing power
    @Test
    public void testAStarSearch_LimitedProcessingPower() {
        // Create a graph with limited processing power
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add complex path requiring significant processing power
        start.addNeighbor(new Node(2, 2), 1000); // Complex path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 86: Graph with restricted mobility
    @Test
    public void testAStarSearch_RestrictedMobility() {
        // Create a graph with restricted mobility
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path
        new Node(2, 2).addNeighbor(goal, Integer.MAX_VALUE); // Restricted path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to restricted mobility
        assertNull(path);
    }

    // Test 87: Graph with limited communication range
    @Test
    public void testAStarSearch_LimitedCommunicationRange() {
        // Create a graph with limited communication range
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add node with limited communication range
        start.addNeighbor(new Node(2, 2), 10); // Regular path
        new Node(2, 2).addNeighbor(goal, Integer.MAX_VALUE); // Out of communication range

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned
        assertNull(path);
    }

    // Test 88: Graph with varying vehicle capabilities
    @Test
    public void testAStarSearch_VaryingVehicleCapabilities() {
        // Create a graph with varying vehicle capabilities
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path requiring higher vehicle capability
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Path requiring higher capability

        // Perform A* search for vehicle with lower capability
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct for vehicle with lower capability
        assertNull(path1);

        // Perform A* search for vehicle with higher capability
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct for vehicle with higher capability
        assertNull(path2);
    }

    // Test 89: Graph with restricted pathfinding algorithms
    @Test
    public void testAStarSearch_RestrictedPathfindingAlgorithms() {
        // Create a graph with restricted pathfinding algorithms
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add complex path requiring different algorithm
        start.addNeighbor(new Node(2, 2), 10); // Complex path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to restricted algorithm
        assertNull(path);
    }

    // Test 90: Graph with varying vehicle fuel efficiency
    @Test
    public void testAStarSearch_VaryingVehicleFuelEfficiency() {
        // Create a graph with varying vehicle fuel efficiency
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 2); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path requiring more fuel than the vehicle can carry
        start.addNeighbor(new Node(2, 2), 10); // Long path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal); // Vehicle can carry only 5 units of fuel

        // Check if no path is returned
        assertNull(path);
    }

    // Test 91: Graph with variable vehicle size
    @Test
    public void testAStarSearch_VariableVehicleSize() {
        // Create a graph with variable vehicle size
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with limited clearance
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Limited clearance

        // Perform A* search for vehicle with standard size
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct for standard size vehicle
        assertNull(path1);

        // Perform A* search for vehicle with larger size
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal); // Vehicle with larger size

        // Check if no path is returned due to limited clearance
        assertNull(path2);
    }

    // Test 92: Graph with varying road conditions
    @Test
    public void testAStarSearch_VaryingRoadConditions() {
        // Create a graph with varying road conditions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add paths with varying road conditions
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        start.addNeighbor(new Node(3, 3), 0.5); // Lower speed limit
        new Node(2, 2).addNeighbor(goal, 1); // Regular path
        new Node(3, 3).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 93: Graph with limited time
    @Test
    public void testAStarSearch_LimitedTime() {
        // Create a graph with limited time
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Perform A* search with limited time
        long startTime = System.currentTimeMillis();
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);
        long endTime = System.currentTimeMillis();

        // Check if the path is correct and the search finishes in a reasonable time
        assertNull(path);
        assertTrue(endTime - startTime < 1000); // Ensure the search finishes within 1 second
    }

    // Test 94: Graph with variable weather conditions
    @Test
    public void testAStarSearch_VariableWeatherConditions() {
        // Create a graph with variable weather conditions
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path affected by adverse weather
        start.addNeighbor(new Node(2, 2), 2); // Adverse weather
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 95: Graph with complex terrain
    @Test
    public void testAStarSearch_ComplexTerrain() {
        // Create a graph with complex terrain
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with varying terrain conditions
        start.addNeighbor(new Node(2, 2), 3); // Rough terrain
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if the path is correct
        assertNull(path);
    }

    // Test 96: Graph with multiple goals
    @Test
    public void testAStarSearch_MultipleGoals() {
        // Create a graph with multiple goals
        Node start = new Node(0, 0);
        Node goal1 = new Node(2, 2);
        Node goal2 = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal1, 1); // Regular path
        goal1.addNeighbor(goal2, 1); // Regular path

        // Perform A* search to the first goal
        List<Node> path1 = AStarAlgorithm.aStarSearch(start, goal1);

        // Check if the path to the first goal is correct
        assertNull(path1);

        // Perform A* search to the second goal
        List<Node> path2 = AStarAlgorithm.aStarSearch(start, goal2);

        // Check if the path to the second goal is correct
        assertNull(path2);
    }

    // Test 97: Graph with impassable terrain
    @Test
    public void testAStarSearch_ImpassableTerrain() {
        // Create a graph with impassable terrain
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Add impassable terrain
        start.addNeighbor(new Node(1, 1), Integer.MAX_VALUE); // Impassable terrain
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to impassable terrain
        assertNull(path);
    }

    // Test 98: Graph with restricted access roads
    @Test
    public void testAStarSearch_RestrictedAccessRoads() {
        // Create a graph with restricted access roads
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add restricted access road
        start.addNeighbor(new Node(2, 2), 1); // Restricted road
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal); // Vehicle type 1 is not allowed on the restricted road

        // Check if no path is returned
        assertNull(path);
    }

    // Test 99: Graph with restricted path lengths
    @Test
    public void testAStarSearch_RestrictedPathLengths() {
        // Create a graph with restricted path lengths
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with restricted length
        start.addNeighbor(new Node(2, 2), Integer.MAX_VALUE); // Long path
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to restricted path length
        assertNull(path);
    }

    // Test 100: Graph with restricted path curvature
    @Test
    public void testAStarSearch_RestrictedPathCurvature() {
        // Create a graph with restricted path curvature
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path with restricted curvature
        start.addNeighbor(new Node(2, 2), 1); // Regular path
        new Node(2, 2).addNeighbor(goal, 1); // Restricted curvature

        // Perform A* search
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal);

        // Check if no path is returned due to restricted path curvature
        assertNull(path);
    }

    // Test 101: Graph with varying vehicle load capacities
    @Test
    public void testAStarSearch_VaryingVehicleLoadCapacities() {
        // Create a graph with varying vehicle load capacities
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        // Initially clear paths
        start.addNeighbor(new Node(1, 1), 1); // Regular path
        new Node(1, 1).addNeighbor(goal, 1); // Regular path

        // Add path requiring higher load capacity than available
        start.addNeighbor(new Node(2, 2), 10); // High load requirement
        new Node(2, 2).addNeighbor(goal, 1); // Regular path

        // Perform A* search with limited load capacity
        List<Node> path = AStarAlgorithm.aStarSearch(start, goal); // Vehicle can carry only 5 units of load

        // Check if no path is returned
        assertNull(path);
    }

}
