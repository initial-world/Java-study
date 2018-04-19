package com.alglorithm;

/**
 * @CreatedBy cx
 * @CreateTime 2018/4/17 10:42
 * @description
 */
public class Fibonacci_07 {
    public int Fibonacci(int n) {
        int f = 0,g = 1;
        while(n-->0) {
            g += f;
            f = g - f;
        }
        return f;
    }
}
