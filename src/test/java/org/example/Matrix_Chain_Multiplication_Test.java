package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Matrix_Chain_Multiplication_Test {
    @Test
    public void testMatrixChainMultiplication1() {
        int[] p = {10, 20}; // Only one matrix
        assertEquals(0, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 2));
    }

    @Test
    public void testMatrixChainMultiplication2() {
        int[] p = {10, 20, 30}; // Two matrices
        assertEquals(6000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 3));
    }

    @Test
    public void testMatrixChainMultiplication3() {
        int[] p = {10, 20, 30, 40}; // Three matrices
        assertEquals(18000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 4));
    }

    @Test
    public void testMatrixChainMultiplication4() {
        int[] p = {10, 20, 30, 40, 30}; // Four matrices
        assertEquals(30000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 5));
    }

    @Test
    public void testMatrixChainMultiplication5() {
        int[] p = {40, 20, 30, 10, 30}; // Edge case with unsorted dimensions
        assertEquals(26000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 5));
    }

    @Test
    public void testMatrixChainMultiplication6() {
        int[] p = {10, 10, 10, 10}; // Matrices with same dimensions
        assertEquals(2000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 4));
    }

    @Test
    public void testMatrixChainMultiplication7() {
        int[] p = {10}; // Smallest possible input
        assertEquals(0, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 1));
    }

    @Test
    public void testMatrixChainMultiplication8() {
        int[] p = {10, 20, 30, 40, 50, 60}; // Largest possible input
        assertEquals(68000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 6));
    }

    @Test
    public void testMatrixChainMultiplication9() {
        int[] p = {10, 20, 30, 40, 50, 60, 70}; // Largest possible input
        assertEquals(110000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 7));
    }

    @Test
    public void testMatrixChainMultiplication10() {
        int[] p = {10, 20, 30, 40, 50, 60, 70, 80}; // Largest possible input
        assertEquals(166000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 8));
    }

    @Test
    public void testMatrixChainMultiplication11() {
        int[] p = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // Largest possible input
        assertEquals(238000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 9));
    }

    @Test
    public void testMatrixChainMultiplication12() {
        int[] p = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Largest possible input
        assertEquals(328000, Matrix_Chain_Multiplication_Algorithm.MatrixChainOrder(p, 10));
    }
}
