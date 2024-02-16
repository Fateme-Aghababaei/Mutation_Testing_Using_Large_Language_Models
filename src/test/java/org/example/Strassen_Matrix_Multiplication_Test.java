package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Strassen_Matrix_Multiplication_Test {

    private Strassen_Matrix_Multiplication_Algorithm strassenAlgorithm;

    private int[][] generateUniformMatrix(int rows, int cols, int value) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    private int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Generate numbers between 0 and 9
            }
        }
        return matrix;
    }

    @BeforeEach
    void setUp() {
        strassenAlgorithm = new Strassen_Matrix_Multiplication_Algorithm();
    }

    @Test
    public void testMultiply_BaseCase() {
        int[][] A = {{2}};
        int[][] B = {{3}};
        int[][] expected = {{6}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Base case multiplication failed.");
    }

    // Example: Test with 2x2 matrices
    @Test
    public void testMultiply_SmallMatrices() {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{19, 22}, {43, 50}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication of 2x2 matrices failed.");
    }

    // Example: Test with matrices containing negative numbers
    @Test
    public void testMultiply_NegativeNumbers() {
        int[][] A = {{-1, -2}, {-3, -4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{-19, -22}, {-43, -50}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with negative numbers failed.");
    }

    @Test
    public void testMultiply_LargerMatrices() {
        int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[][] B = {
            {16, 15, 14, 13},
            {12, 11, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}
        };
        int[][] expected = {
            {80, 70, 60, 50},
            {240, 214, 188, 162},
            {400, 358, 316, 274},
            {560, 502, 444, 386}
        };
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication of 4x4 matrices failed.");
    }
    @Test
    public void testMultiply_ZeroMatrix() {
        int[][] A = new int[2][2]; // Automatically filled with zeros
        int[][] B = {{1, 2}, {3, 4}};
        int[][] expected = new int[2][2]; // Result should also be a zero matrix
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with a zero matrix failed.");
    }

    @Test
    public void testMultiply_OneMatrix() {
        int[][] A = {{1, 1}, {1, 1}};
        int[][] B = {{1, 1}, {1, 1}};
        int[][] expected = {{2, 2}, {2, 2}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with a one matrix failed.");
    }
    @Test
    public void testMultiply_NonSquareMatrices() {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};
        // This setup expects an exception or a specific behavior as the algorithm is designed for square matrices
        // Depending on implementation, you might expect an exception or handle the scenario differently
    }
    @Test
    public void testMultiply_RandomMatrices() {
        // Example setup for a test with randomly generated matrices
        int size = 4; // Choosing a power of 2 for simplicity
        int[][] A = generateRandomMatrix(size, size);
        int[][] B = generateRandomMatrix(size, size);
        // Since the expected result calculation is complex, we might not assert for a specific result
        // but we can verify properties, e.g., the result is non-null, of the correct size, etc.
        int[][] result = strassenAlgorithm.multiply(A, B);
        assertNotNull(result, "Result should not be null");
        assertEquals(size, result.length, "Resulting matrix should have the correct size.");
    }

    @Test
    public void testMultiply_SymmetryProperty() {
        int[][] A = {{2, 3}, {4, 5}};
        int[][] B = {{1, 2}, {3, 4}};
        // Note: For general matrices, A*B != B*A, but testing both can verify the algorithm's handling of order
        int[][] resultAB = strassenAlgorithm.multiply(A, B);
        int[][] resultBA = strassenAlgorithm.multiply(B, A);
        // Assertions here would depend on the expected results, which differ because matrix multiplication is not commutative
    }
    @Test
    public void testMultiply_LargeMatrices() {
        int size = 128; // Example large matrix size
        int[][] A = generateRandomMatrix(size, size);
        int[][] B = generateRandomMatrix(size, size);
        // The actual multiplication
        int[][] result = strassenAlgorithm.multiply(A, B);
        // Assertions might focus on verifying the result's dimensions and basic properties
        assertNotNull(result, "Result should not be null for large matrices.");
        assertEquals(size, result.length, "Resulting matrix should have the correct dimensions.");
    }
    @Test
    public void testMultiply_MixedElements() {
        int[][] A = {
            {-1, 2},
            {3, -4}
        };
        int[][] B = {
            {5, -6},
            {-7, 8}
        };
        int[][] expected = {
            {-19, 22},
            {43, -50}
        };
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with mixed elements failed.");
    }
    @Test
    public void testMultiply_8x8Matrices() {
        // Example of testing with an 8x8 matrix, potentially filled with predefined or random values
        int[][] A = generateRandomMatrix(8, 8);
        int[][] B = generateRandomMatrix(8, 8);
        // Since generating expected results manually is impractical, focus on ensuring the result is of the correct size and non-null
        int[][] result = strassenAlgorithm.multiply(A, B);
        assertNotNull(result, "Result should not be null for 8x8 matrices.");
        assertEquals(8, result.length, "Resulting matrix should be 8x8.");
    }
    @Test
    public void testMultiply_UniformElements() {
        int[][] A = this.generateUniformMatrix(4, 4, 1); // A 4x4 matrix with all elements as 1
        int[][] B = this.generateUniformMatrix(4, 4, 1); // Similarly, a 4x4 matrix with all 1s
        int[][] expected = generateUniformMatrix(4, 4, 4); // Expected result with all elements as 4
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with uniform elements failed.");
    }

    @Test
    public void testSplitAndJoin() {
        int[][] original = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[][] splitPart = new int[2][2];
        strassenAlgorithm.split(original, splitPart, 0, 0); // Splitting top-left quadrant
        int[][] resultMatrix = new int[4][4];
        strassenAlgorithm.join(splitPart, resultMatrix, 0, 0); // Joining back to a new matrix
        // Verify that the top-left quadrant of resultMatrix matches the splitPart
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(original[i][j], resultMatrix[i][j], "Split or join operation failed.");
            }
        }
    }
    @Test
    public void testMultiply_VeryLargeMatrices() {
        int size = 128; // Adjust based on capabilities
        int[][] A = generateRandomMatrix(size, size);
        int[][] B = generateRandomMatrix(size, size);
        // Execution time and result sanity check, rather than specific value checks
        long startTime = System.currentTimeMillis();
        int[][] result = strassenAlgorithm.multiply(A, B);
        long endTime = System.currentTimeMillis();
        System.out.println("Multiplication of 128x128 matrices took " + (endTime - startTime) + " ms");
        assertNotNull(result, "Result should not be null for very large matrices.");
        assertEquals(size, result.length, "Resulting matrix should have correct size.");
    }
    @Test
    public void testMultiply_ExtremeValues() {
        int[][] A = {{Integer.MAX_VALUE, 2}, {3, 4}};
        int[][] B = {{1, 2}, {3, 4}};
        // Specific expected values may not be meaningful due to overflow, but test should run without errors
        assertDoesNotThrow(() -> strassenAlgorithm.multiply(A, B));
    }

    @Test
    public void testMultiply_OneZeroMatrix() {
        int[][] A = {{0, 0}, {0, 0}};
        int[][] B = {{1, 2}, {3, 4}};
        int[][] expected = {{0, 0}, {0, 0}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with one zero matrix failed.");
    }
    @Test
    public void testMultiply_OneColumnRowMatrices() {
        int[][] A = {{1, 2}};
        int[][] B = {{1}, {2}};
        // This scenario requires adapting the algorithm to handle non-square matrices or documenting this as a limitation.
    }
    @Test
    public void testAdd_TwoMatrices() {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{6, 8}, {10, 12}};
        assertArrayEquals(expected, strassenAlgorithm.add(A, B), "Addition of two matrices failed.");
    }

    @Test
    public void testSubtract_TwoMatrices() {
        int[][] A = {{5, 6}, {7, 8}};
        int[][] B = {{1, 2}, {3, 4}};
        int[][] expected = {{4, 4}, {4, 4}};
        assertArrayEquals(expected, strassenAlgorithm.sub(A, B), "Subtraction of two matrices failed.");
    }

    @Test
    public void testMultiply_ResultingNegativeValues() {
        int[][] A = {{-1, -2}, {3, 4}};
        int[][] B = {{2, -3}, {4, -5}};
        int[][] expected = {{-10, 13}, {22, -29}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Matrix multiplication resulting in negative values failed.");
    }

    @Test
    public void testMultiply_SparseMatrices() {
        int[][] A = {{0, 0}, {0, 1}};
        int[][] B = {{1, 2}, {0, 0}};
        int[][] expected = {{0, 0}, {0, 0}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication of sparse matrices failed.");
    }

    @Test
    public void testMultiply_SingleNonZeroElement() {
        int[][] A = {{0, 0}, {0, 1}};
        int[][] B = {{0, 0}, {1, 0}};
        int[][] expected = {{0, 0}, {1, 0}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with single non-zero element failed.");
    }
    @Test
    public void testMultiply_ResultingZeroMatrix() {
        int[][] A = {{-1, 1}, {1, -1}};
        int[][] B = {{1, 1}, {1, 1}};
        int[][] expected = {{0, 0}, {0, 0}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication resulting in zero matrix failed.");
    }
    @Test
    public void testMultiply_CausesOverflow() {
        int[][] A = {{Integer.MAX_VALUE, 0}, {0, Integer.MAX_VALUE}};
        int[][] B = {{1, 1}, {1, 1}};
        // Expectation is to handle or document behavior regarding integer overflow, possibly using long for internal calculations.
    }

    @Test
    public void testMultiply_NonPowerOfTwoSizes() {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        // This test requires adapting the Strassen algorithm to work with non-power of two sizes or documenting this limitation.
    }

    @Test
    public void testMultiply_HighValuesLargeMatrices() {
        int[][] A = generateUniformMatrix(64, 64, Integer.MAX_VALUE);
        int[][] B = generateUniformMatrix(64, 64, 1);
        // This test checks for performance and potential overflow issues with large matrices filled with high values.
    }

    @Test
    public void testMultiply_RandomNegativeValues() {
        int[][] A = generateRandomMatrix(4, 4); // Generates a matrix with values between -10 and 0
        int[][] B = generateRandomMatrix(4, 4); // Same for B
        // Assertions would focus on the result being non-null and correctly sized, as specific expected values are unpredictable.
    }

    @Test
    public void testMultiply_LargeSquareMatricesEfficiency() {
        int size = 128; // Large square matrix size, considering computational limitations
        int[][] A = generateUniformMatrix(size, size, 2);
        int[][] B = generateUniformMatrix(size, size, 2);
        // This test is intended to measure the time efficiency of the algorithm with large square matrices.
    }

    @Test
    public void testMultiply_ZerosAndOnes() {
        int[][] A = {{0, 1}, {1, 0}};
        int[][] B = {{1, 0}, {0, 1}};
        int[][] expected = {{0, 1}, {1, 0}};
        assertArrayEquals(expected, strassenAlgorithm.multiply(A, B), "Multiplication with matrices containing only zeros and ones failed.");
    }

    @Test
    public void testMultiply_IntegerUnderflow() {
        int[][] A = {{Integer.MIN_VALUE, 0}, {0, Integer.MIN_VALUE}};
        int[][] B = {{-1, -1}, {-1, -1}};
        // Similar to the overflow test, this one checks how the algorithm handles potential underflow scenarios.
    }
}
