package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicCalculatorTest {
    @Test
    public void test_addition_of_two_positive_numbers() {
        double num1 = 5.0;
        double num2 = 3.0;
        double result = BasicCalculator.calculate(num1, num2, "+");
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void test_addition_of_very_large_positive_numbers() {
        double num1 = Double.MAX_VALUE;
        double num2 = Double.MAX_VALUE;
        double result = BasicCalculator.calculate(num1, num2, "+");
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }

    @Test
    public void test_confirm_addition_operation_with_calc_operator_add() {
        double num1 = 5.0;
        double num2 = 3.0;
        double result = BasicCalculator.calculate(num1, num2, "+");
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void test_addition_of_negative_numbers() {
        double num1 = -5.0;
        double num2 = -3.0;
        double result = BasicCalculator.calculate(num1, num2, "+");
        assertEquals(-8.0, result, 0.0001);
    }

    @Test
    public void test_subtraction_of_two_positive_numbers() {
        double num1 = 8.0;
        double num2 = 3.0;
        double result = BasicCalculator.calculate(num1, num2, "-");
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void test_multiplication_of_two_positive_numbers() {
        double num1 = 5.0;
        double num2 = 3.0;
        double result = BasicCalculator.calculate(num1, num2, "*");
        assertEquals(15.0, result, 0.0001);
    }

    @Test
    public void test_division_of_two_positive_numbers() {
        double num1 = 10.0;
        double num2 = 2.0;
        double result = BasicCalculator.calculate(num1, num2, "/");
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void test_addition_of_positive_and_negative_numbers() {
        double num1 = 5.0;
        double num2 = -3.0;
        double result = BasicCalculator.calculate(num1, num2, "+");
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void test_subtraction_positive_negative() {
        double num1 = 5.0;
        double num2 = -3.0;
        double result = BasicCalculator.calculate(num1, num2, "-");
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void test_multiplication_positive_negative() {
        double num1 = 5.0;
        double num2 = -3.0;
        double result = BasicCalculator.calculate(num1, num2, "*");
        assertEquals(-15.0, result, 0.0001);
    }

    @Test
    public void test_division_positive_negative() {
        double num1 = 10.0;
        double num2 = -2.0;
        double result = BasicCalculator.calculate(num1, num2, "/");
        assertEquals(-5.0, result, 0.0001);
    }

    @Test
    public void test_division_of_two_negative_numbers() {
        double num1 = -10.0;
        double num2 = -2.0;
        double result = BasicCalculator.calculate(num1, num2, "/");
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void test_addition_of_two_negative_numbers() {
        double num1 = -5.0;
        double num2 = -3.0;
        double result = BasicCalculator.calculate(num1, num2, "+");
        assertEquals(-8.0, result, 0.0001);
    }

    @Test
    public void test_invalid_operation_input() {
        double num1 = 10.0;
        double num2 = 5.0;
        double result = BasicCalculator.calculate(num1, num2, "");
        assertEquals(0.0, result, 0.0001);
    }
}
