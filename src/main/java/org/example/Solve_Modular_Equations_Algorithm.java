package org.example;

public class Solve_Modular_Equations_Algorithm {
    public static int calculateDivisors(int A, int B)
    {
        int N = (A - B);
        int noOfDivisors = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if ((N % i) == 0) {
                if (i > B)
                    noOfDivisors++;
                if ((N / i) != i && (N / i) > B)
                    noOfDivisors++;
            }
        }
        return noOfDivisors;
    }

    public static int numberOfPossibleWaysUtil(int A, int B)
    {
        if (A == B)
            return -1;
        if (A < B)
            return 0;
        int noOfDivisors = 0;
        noOfDivisors = calculateDivisors(A, B);
        return noOfDivisors;
    }
}
