package org.example;

public class Fibonacci_Algorithm {

    public static long fibonacci(int n)
    {
        long a = 0, b = 1, c;
        if (n < 0)
            return -1;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
