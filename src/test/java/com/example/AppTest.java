package com.example;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_calculate_valid_add_operator() {
        Scanner sc = new Scanner("5\n3\n+\nN\n");
        double result = App.calculate(sc);
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void test_calculate_valid_substract_operator() {
        Scanner sc = new Scanner("5\n3\n-\nN\n");
        double result = App.calculate(sc);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void test_calculate_valid_multiply_operator() {
        Scanner sc = new Scanner("5\n3\n*\nN\n");
        double result = App.calculate(sc);
        assertEquals(15.0, result, 0.001);
    }

    @Test
    public void test_calculate_valid_divide_operator() {
        Scanner sc = new Scanner("6\n3\n/\nN\n");
        double result = App.calculate(sc);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void test_invalid_operator_input() {
        Scanner sc = new Scanner("5\n3\n$\n");
        double result = App.calculate(sc);
        assertEquals(0.0, result, 0.001);
    }

    // Does not crash when non-numeric input is entered
    @Test
    public void test_non_numeric_input_handling() {
        String input = "abc\ndef\n+\n";
        Scanner sc = new Scanner(input);
        double result = App.calculate(sc);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void test_counter_equals_total_calls_allowed() {
        Scanner sc = new Scanner("1\n2\n+\nY\n");
        App.counter = App.TOTAL_CALLS_ALLOWED;
        double result = App.calculate(sc);
        assertEquals(3.0, result, 0.001);
    }
}
