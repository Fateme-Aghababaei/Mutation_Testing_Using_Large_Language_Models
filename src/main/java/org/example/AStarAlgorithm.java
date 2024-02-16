package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class AStarAlgorithm {
    public static List<Node> aStarSearch(Node start, Node goal) {
        if (start == null || goal == null) {
            throw new IllegalArgumentException("Start and goal nodes must not be null");
        }
        Set<Node> visited = new HashSet<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingDouble(Node::getTotalCost));
        Map<Node, Double> costSoFar = new HashMap<>();
        Map<Node, Node> cameFrom = new HashMap<>();

        queue.add(start);
        costSoFar.put(start, 0.0);
        start.setHeuristicCost(heuristic(start, goal));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.equals(goal)) {
                return reconstructPath(cameFrom, current);
            }

            visited.add(current);

            for (Edge edge : current.getNeighbors()) {
                Node neighbor = edge.getTarget();
                double newCost = costSoFar.get(current) + edge.getWeight();
                
                if (!visited.contains(neighbor) || newCost < costSoFar.getOrDefault(neighbor, Double.POSITIVE_INFINITY)) {
                    costSoFar.put(neighbor, newCost);
                    neighbor.setHeuristicCost(heuristic(neighbor, goal));
                    double priority = newCost + neighbor.getHeuristicCost();
                    queue.add(neighbor);
                    cameFrom.put(neighbor, current);
                }
            }
        }

        return null; // No path found
    }

    private static List<Node> reconstructPath(Map<Node, Node> cameFrom, Node current) {
        List<Node> path = new ArrayList<>();
        path.add(current);
        while (cameFrom.containsKey(current)) {
            current = cameFrom.get(current);
            path.add(0, current); // Add to the beginning of the list
        }
        return path;
    }

    private static double heuristic(Node a, Node b) {
        // This is a simple heuristic for demonstration purposes
        return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
    }
}

class Node {
    private int x;
    private int y;
    private double heuristicCost;
    private List<Edge> neighbors;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
        this.neighbors = new ArrayList<>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getHeuristicCost() {
        return heuristicCost;
    }

    public void setHeuristicCost(double heuristicCost) {
        this.heuristicCost = heuristicCost;
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Node neighbor, double weight) {
        neighbors.add(new Edge(neighbor, weight));
    }

    public double getTotalCost() {
        return heuristicCost;
    }

    public void removeNeighbor(Node neighbor) {
        neighbors.removeIf(edge -> edge.getTarget().equals(neighbor));
    }
}

class Edge {
    private Node target;
    private double weight;

    public Edge(Node target, double weight) {
        this.target = target;
        this.weight = weight;
    }

    public Node getTarget() {
        return target;
    }

    public double getWeight() {
        return weight;
    }
}
