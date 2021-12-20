package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(1));
    }

    // fibonacci(0) = 0
    // fibonacci(1) = 1
    // fibonacci(2) = 1
    // fibonacci(3) = 2
    // ...
    // fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    public static int fibonacci(int n) {

        int output;

        if (n <= 0) {
            output = 0;
        } else if (n == 1) {
            output = 1;
        } else {
            output = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return output;
    }
}
