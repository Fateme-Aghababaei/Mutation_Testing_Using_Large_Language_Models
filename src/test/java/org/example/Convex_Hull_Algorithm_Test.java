package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class Convex_Hull_Algorithm_Test {
    @Test
    public void testConvexHull1() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull2() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull3() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull4() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(3, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull5() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull6() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull7() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 1));
        points.add(new Point(4, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(2, 2));
        expected.add(new Point(4, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull8() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull9() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull10() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        points.add(new Point(-1, 0));
        expected.add(new Point(-1, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull11() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(3, 1));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull12() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        points.add(new Point(0, 2));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(1, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull13() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull14() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(3, 1));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull15() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull16() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        points.add(new Point(5, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(5, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull17() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 2));
        points.add(new Point(5, 1));
        points.add(new Point(6, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(3, 3));
        expected.add(new Point(6, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull18() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(1, 2));
        points.add(new Point(2, 2));
        points.add(new Point(2, 1));
        points.add(new Point(2, 0));
        expected.add(new Point(2, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull19() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(1, 2));
        points.add(new Point(2, 2));
        points.add(new Point(3, 2));
        points.add(new Point(3, 1));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        expected.add(new Point(3, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(3, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull20() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(3, 2));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull21() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(3, 2));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(2, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull22() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(3, 2));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(2, 1));
        points.add(new Point(2, 3));
        points.add(new Point(1, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(1, 3));
        expected.add(new Point(2, 3));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull23() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(3, 2));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(2, 1));
        points.add(new Point(2, 3));
        points.add(new Point(1, 3));
        points.add(new Point(0, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 3));
        expected.add(new Point(2, 3));
        expected.add(new Point(3, 2));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull24() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(1, 2));
        points.add(new Point(2, 2));
        points.add(new Point(3, 2));
        points.add(new Point(3, 1));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 1));
        points.add(new Point(2, 3));
        points.add(new Point(1, 3));
        points.add(new Point(0, 3));
        expected.add(new Point(3, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 3));
        expected.add(new Point(2, 3));
        expected.add(new Point(3, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull25() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(2, 3));
        points.add(new Point(1, 3));
        points.add(new Point(0, 3));
        points.add(new Point(-1, 3));
        points.add(new Point(-1, 2));
        points.add(new Point(-1, 1));
        points.add(new Point(-1, 0));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(-1, 0));
        expected.add(new Point(-1, 3));
        expected.add(new Point(2, 3));
        expected.add(new Point(2, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull26() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        points.add(new Point(4, 1));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(4, 1));
        expected.add(new Point(4, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull27() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull28() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, -1));
        expected.add(new Point(1, -1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull29() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        expected.add(new Point(0, 0));
        expected.add(new Point(5, 5));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull30() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 4));
        points.add(new Point(6, 3));
        points.add(new Point(7, 2));
        points.add(new Point(8, 1));
        points.add(new Point(9, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        expected.add(new Point(5, 4));
        expected.add(new Point(9, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull31() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 4));
        points.add(new Point(6, 3));
        points.add(new Point(7, 2));
        points.add(new Point(8, 1));
        points.add(new Point(9, 0));
        points.add(new Point(4, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        expected.add(new Point(5, 4));
        expected.add(new Point(9, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull32() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull33() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(-1, -1));
        expected.add(new Point(-1, -1));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull34() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(4, 3));
        points.add(new Point(4, 2));
        points.add(new Point(4, 1));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        expected.add(new Point(4, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull35() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(4, 3));
        points.add(new Point(4, 2));
        points.add(new Point(4, 1));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(4, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull36() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        points.add(new Point(5, 0));
        points.add(new Point(5, 1));
        points.add(new Point(5, 2));
        points.add(new Point(5, 3));
        points.add(new Point(5, 4));
        points.add(new Point(5, 5));
        expected.add(new Point(0, 0));
        expected.add(new Point(5, 5));
        expected.add(new Point(5, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull37() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(4, 3));
        points.add(new Point(4, 2));
        points.add(new Point(4, 1));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));
        points.add(new Point(1, 4));
        points.add(new Point(2, 4));
        points.add(new Point(3, 4));
        points.add(new Point(4, 4));
        expected.add(new Point(4, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 4));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull38() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(6, 5));
        points.add(new Point(6, 4));
        points.add(new Point(6, 3));
        points.add(new Point(6, 2));
        points.add(new Point(6, 1));
        points.add(new Point(6, 0));
        points.add(new Point(5, 0));
        points.add(new Point(4, 0));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        expected.add(new Point(6, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(6, 6));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull39() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(6, 5));
        points.add(new Point(6, 4));
        points.add(new Point(6, 3));
        points.add(new Point(6, 2));
        points.add(new Point(6, 1));
        points.add(new Point(6, 0));
        points.add(new Point(5, 0));
        points.add(new Point(4, 0));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));
        points.add(new Point(0, 5));
        expected.add(new Point(6, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 5));
        expected.add(new Point(6, 6));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull40() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(6, 5));
        points.add(new Point(6, 4));
        points.add(new Point(6, 3));
        points.add(new Point(6, 2));
        points.add(new Point(6, 1));
        points.add(new Point(6, 0));
        points.add(new Point(5, 0));
        points.add(new Point(4, 0));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));
        points.add(new Point(0, 5));
        points.add(new Point(1, 5));
        points.add(new Point(2, 5));
        points.add(new Point(3, 5));
        points.add(new Point(4, 5));
        points.add(new Point(5, 5));
        expected.add(new Point(6, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 5));
        expected.add(new Point(6, 6));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull41() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        points.add(new Point(5, 0));
        points.add(new Point(6, 0));
        points.add(new Point(7, 0));
        points.add(new Point(8, 0));
        points.add(new Point(9, 0));
        points.add(new Point(9, 1));
        points.add(new Point(9, 2));
        points.add(new Point(9, 3));
        points.add(new Point(9, 4));
        points.add(new Point(9, 5));
        points.add(new Point(9, 6));
        points.add(new Point(9, 7));
        points.add(new Point(9, 8));
        points.add(new Point(9, 9));
        points.add(new Point(8, 9));
        points.add(new Point(7, 9));
        points.add(new Point(6, 9));
        points.add(new Point(5, 9));
        points.add(new Point(4, 9));
        points.add(new Point(3, 9));
        points.add(new Point(2, 9));
        points.add(new Point(1, 9));
        points.add(new Point(0, 9));
        points.add(new Point(0, 8));
        points.add(new Point(0, 7));
        points.add(new Point(0, 6));
        points.add(new Point(0, 5));
        points.add(new Point(0, 4));
        points.add(new Point(0, 3));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        expected.add(new Point(9, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull42() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(9, 8));
        points.add(new Point(9, 7));
        points.add(new Point(9, 6));
        points.add(new Point(9, 5));
        points.add(new Point(9, 4));
        points.add(new Point(9, 3));
        points.add(new Point(9, 2));
        points.add(new Point(9, 1));
        points.add(new Point(8, 0));
        points.add(new Point(7, 0));
        points.add(new Point(6, 0));
        points.add(new Point(5, 0));
        points.add(new Point(4, 0));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));
        points.add(new Point(0, 5));
        points.add(new Point(0, 6));
        points.add(new Point(0, 7));
        points.add(new Point(0, 8));
        points.add(new Point(0, 9));
        expected.add(new Point(9, 1));
        expected.add(new Point(8, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull43() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        points.add(new Point(5, 0));
        points.add(new Point(6, 0));
        points.add(new Point(7, 0));
        points.add(new Point(8, 0));
        points.add(new Point(9, 0));
        points.add(new Point(9, 1));
        points.add(new Point(9, 2));
        points.add(new Point(9, 3));
        points.add(new Point(9, 4));
        points.add(new Point(9, 5));
        points.add(new Point(9, 6));
        points.add(new Point(9, 7));
        points.add(new Point(9, 8));
        points.add(new Point(9, 9));
        points.add(new Point(8, 9));
        points.add(new Point(7, 9));
        points.add(new Point(6, 9));
        points.add(new Point(5, 9));
        points.add(new Point(4, 9));
        points.add(new Point(3, 9));
        points.add(new Point(2, 9));
        points.add(new Point(1, 9));
        points.add(new Point(0, 9));
        points.add(new Point(0, 8));
        points.add(new Point(0, 7));
        points.add(new Point(0, 6));
        points.add(new Point(0, 5));
        points.add(new Point(0, 4));
        points.add(new Point(0, 3));
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        expected.add(new Point(9, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull44() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(4, 0));
        points.add(new Point(5, 0));
        points.add(new Point(6, 0));
        points.add(new Point(7, 0));
        points.add(new Point(8, 0));
        points.add(new Point(9, 0));
        points.add(new Point(9, 1));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        expected.add(new Point(0, 0));
        expected.add(new Point(8, 8));
        expected.add(new Point(9, 1));
        expected.add(new Point(9, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull45() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(1, 9));
        points.add(new Point(2, 9));
        points.add(new Point(3, 9));
        points.add(new Point(4, 9));
        points.add(new Point(5, 9));
        points.add(new Point(6, 9));
        points.add(new Point(7, 9));
        points.add(new Point(8, 9));
        points.add(new Point(9, 9));
        expected.add(new Point(1, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull46() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(9, 1));
        points.add(new Point(9, 2));
        points.add(new Point(9, 3));
        points.add(new Point(9, 4));
        points.add(new Point(9, 5));
        points.add(new Point(9, 6));
        points.add(new Point(9, 7));
        points.add(new Point(9, 8));
        points.add(new Point(9, 9));
        points.add(new Point(8, 9));
        points.add(new Point(8, 1));
        expected.add(new Point(8, 1));
        expected.add(new Point(8, 9));
        expected.add(new Point(9, 9));
        expected.add(new Point(9, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull47() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull48() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull49() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull50() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(3, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull51() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(0, 2));
        points.add(new Point(2, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull52() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(3, 0));
        points.add(new Point(3, 1));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(3, 1));
        expected.add(new Point(3, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull53() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(2, 1));
        points.add(new Point(1, 2));
        points.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull54() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 2));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull55() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 2));
        points.add(new Point(0, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull56() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        points.add(new Point(0, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull57() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull58() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        expected.add(new Point(0, 0));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull59() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        points.add(new Point(0, 4));
        points.add(new Point(0, 5));
        points.add(new Point(0, 6));
        points.add(new Point(0, 7));
        points.add(new Point(0, 8));
        points.add(new Point(0, 9));
        points.add(new Point(1, 9));
        points.add(new Point(2, 9));
        points.add(new Point(3, 9));
        points.add(new Point(4, 9));
        points.add(new Point(5, 9));
        points.add(new Point(6, 9));
        points.add(new Point(7, 9));
        points.add(new Point(8, 9));
        points.add(new Point(9, 9));
        points.add(new Point(9, 8));
        points.add(new Point(9, 7));
        points.add(new Point(9, 6));
        points.add(new Point(9, 5));
        points.add(new Point(9, 4));
        points.add(new Point(9, 3));
        points.add(new Point(9, 2));
        points.add(new Point(9, 1));
        points.add(new Point(9, 0));
        points.add(new Point(8, 0));
        points.add(new Point(7, 0));
        points.add(new Point(6, 0));
        points.add(new Point(5, 0));
        points.add(new Point(4, 0));
        points.add(new Point(3, 0));
        points.add(new Point(2, 0));
        points.add(new Point(1, 0));
        expected.add(new Point(9, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull60() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull61() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull62() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull63() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(1, 2));
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(1, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull64() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 2));
        points.add(new Point(0, 1));
        points.add(new Point(0, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(2, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull65() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        expected.add(new Point(0, 0));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull66() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(9, 8));
        points.add(new Point(8, 9));
        points.add(new Point(7, 9));
        points.add(new Point(6, 9));
        points.add(new Point(5, 9));
        points.add(new Point(4, 9));
        points.add(new Point(3, 9));
        points.add(new Point(2, 9));
        points.add(new Point(1, 9));
        points.add(new Point(0, 9));
        expected.add(new Point(9, 8));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull67() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull68() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        points.add(new Point(2, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(2, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull69() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        points.add(new Point(0, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull70() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(2, 0));
        points.add(new Point(0, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull71() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(1, 3));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull72() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(3, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull73() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull74() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(3, 4));
        points.add(new Point(1, 0));
        points.add(new Point(3, 1));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        expected.add(new Point(3, 1));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(0, 2));
        expected.add(new Point(3, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull75() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        expected.add(new Point(0, 0));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull76() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(4, 8));
        points.add(new Point(8, 4));
        points.add(new Point(7, 4));
        points.add(new Point(6, 3));
        points.add(new Point(5, 9));
        points.add(new Point(4, 9));
        points.add(new Point(3, 4));
        points.add(new Point(2, 9));
        points.add(new Point(1, 9));
        points.add(new Point(0, 1));
        expected.add(new Point(8, 4));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull77() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(2, 1));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull78() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(2, 2));
        points.add(new Point(1, 2));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 2));
        expected.add(new Point(2, 2));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull79() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 3));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        expected.add(new Point(0, 1));
        expected.add(new Point(0, 3));
        expected.add(new Point(1, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull80() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull81() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 1));
        expected.add(new Point(1, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull82() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(3, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull83() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        expected.add(new Point(0, 0));
        expected.add(new Point(4, 4));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull84() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));
        points.add(new Point(3, 3));
        points.add(new Point(2, 2));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(3, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull85() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        expected.add(new Point(0, 0));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull86() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(9, 8));
        points.add(new Point(8, 9));
        points.add(new Point(7, 9));
        points.add(new Point(6, 9));
        points.add(new Point(5, 9));
        points.add(new Point(4, 9));
        points.add(new Point(3, 9));
        points.add(new Point(2, 9));
        points.add(new Point(1, 9));
        points.add(new Point(0, 9));
        expected.add(new Point(9, 8));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull87() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        expected.add(new Point(0, 0));
        expected.add(new Point(5, 5));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull88() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        expected.add(new Point(0, 0));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull89() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(9, 8));
        points.add(new Point(8, 7));
        points.add(new Point(7, 6));
        points.add(new Point(6, 5));
        points.add(new Point(5, 4));
        points.add(new Point(4, 3));
        points.add(new Point(3, 2));
        points.add(new Point(2, 1));
        points.add(new Point(1, 0));
        points.add(new Point(0, 9));
        expected.add(new Point(9, 8));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull90() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 3));
        points.add(new Point(2, 3));
        points.add(new Point(1, 1));
        points.add(new Point(1, 0));
        expected.add(new Point(1, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 3));
        expected.add(new Point(2, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull91() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(8, 5));
        points.add(new Point(5, 8));
        expected.add(new Point(8, 5));
        expected.add(new Point(0, 0));
        expected.add(new Point(5, 8));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull92() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 5));
        points.add(new Point(6, 6));
        points.add(new Point(7, 7));
        points.add(new Point(8, 8));
        points.add(new Point(9, 9));
        points.add(new Point(9, 5));
        points.add(new Point(5, 9));
        expected.add(new Point(9, 5));
        expected.add(new Point(0, 0));
        expected.add(new Point(5, 9));
        expected.add(new Point(9, 9));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull93() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));
        points.add(new Point(2, 1));
        points.add(new Point(1, 1));
        points.add(new Point(3, 1));
        expected.add(new Point(2, 0));
        expected.add(new Point(0, 0));
        expected.add(new Point(1, 1));
        expected.add(new Point(3, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull94() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(2, 0));
        points.add(new Point(1, 3));
        points.add(new Point(3, 1));
        points.add(new Point(0, 2));
        points.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(1, 3));
        expected.add(new Point(3, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull95() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(3, 3));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull96() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(0, 3));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull97() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        points.add(new Point(1, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(1, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull98() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        points.add(new Point(0, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull99() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 1));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 1));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }

    @Test
    public void testConvexHull100() {
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Point> expected = new ArrayList<>();
        points.add(new Point(2, 0));
        points.add(new Point(0, 0));
        points.add(new Point(0, 2));
        points.add(new Point(2, 2));
        expected.add(new Point(0, 0));
        expected.add(new Point(0, 2));
        expected.add(new Point(2, 2));
        expected.add(new Point(2, 0));
        assertEquals(expected, Convex_Hull_Algorithm.quickHull(points));
    }
}
