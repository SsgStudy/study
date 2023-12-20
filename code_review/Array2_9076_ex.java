package com.example.string2;

public class Array2_9076_ex {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 10; i <= n; i+=10) {
            int result = fibonacci(i);
            System.out.printf("피보나치 수열 %d항 : %d\n", i, result);
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
