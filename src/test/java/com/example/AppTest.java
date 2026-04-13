package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testFibonacciBaseCases() {
        // F(0) should be 0
        assertEquals(0, App.fibonacci(0), "Fibonacci(0) failed");
        // F(1) should be 1
        assertEquals(1, App.fibonacci(1), "Fibonacci(1) failed");
    }

    @Test
    public void testFibonacciSequence() {
        // F(5) is 5 (0, 1, 1, 2, 3, 5)
        assertEquals(5, App.fibonacci(5), "Fibonacci(5) failed");
        // F(10) is 55
        assertEquals(55, App.fibonacci(10), "Fibonacci(10) failed");
    }
}