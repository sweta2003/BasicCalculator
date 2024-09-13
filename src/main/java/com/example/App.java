package com.example;

import java.util.Scanner;

/**
 * Basic Calculator - Main method
 * Git repository - https://github.com/sweta2003/BasicCalculator.git
 *
 */
public class App {
    public static final int TOTAL_CALLS_ALLOWED = 5;
    public static int counter = 1;
    public static double response = 0.0D;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            response = calculate(sc);
            System.out.println("The final result:");
            System.out.println("result --> " + response);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static double calculate(Scanner sc) {
        double result = 0.0D;
        result = callCalculator(sc);
        while (counter < TOTAL_CALLS_ALLOWED) {
            counter++;
            result = askForChaining(sc, result);
        }

        return result;
    }

    private static double callCalculator(Scanner sc) {
        // Stores two numbers
        double num1, num2;
        double total = 0.0D;
        try {
            if (counter == TOTAL_CALLS_ALLOWED) {
                System.out.println("Chaining is allowed only 5 times.");
            }
            System.out.println("Enter the numbers:");

            // Take the inputs
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            System.out.println("Enter the operator (+,-,*,/):");

            String op = "" + sc.next();
            total = BasicCalculator.calculate(num1, num2, op);
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + total);

        } catch (Exception exception) {
            exception.getMessage();
        }
        return total;
    }

    private static double askForChaining(Scanner sc, double total) {
        double result = 0.0D;
            System.out.println("Do you want to do operator chaining? Enter (Y or N)");
        char yes_no = sc.next().charAt(0);
        switch (yes_no) {
            case 'Y':
                System.out.println("Enter the number:");

                // Take the inputs
                double num1 = total;
                double num2 = sc.nextDouble();

                System.out.println("Enter the operator (+,-,*,/):");
                String op = "" + sc.next().charAt(0);

                result = BasicCalculator.calculate(num1, num2, op);
                System.out.println(num1 + " " + op + " " + num2
                        + " = " + result);
                break;

            case 'N':
                System.out.println("You entered N. Thanks for using the Calculator!");
                result = total;
                counter = 5;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        return result;
    }

}
