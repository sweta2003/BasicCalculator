package com.example;

import java.util.HashMap;
import java.util.Map;

public class BasicCalculator {

    public BasicCalculator() {
        signToOperationMap();
    }

    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        INVALID
    }

    public static final Map<String, Operation> mapSignToOperation = new HashMap<>();

    public static Map<String, Operation> signToOperationMap() {
        mapSignToOperation.put("+", Operation.ADD);
        mapSignToOperation.put("-", Operation.SUBTRACT);
        mapSignToOperation.put("*", Operation.MULTIPLY);
        mapSignToOperation.put("/", Operation.DIVIDE);
        return mapSignToOperation;
    }

    public static double calculate(double num1, double num2, String operator) {
        signToOperationMap();

        Operation op = Operation.INVALID;
        if (mapSignToOperation.containsKey(operator)) {
            op = mapSignToOperation.get(operator);
        }

        double o = 0;

        switch (op) {
            // case to add two numbers
            // case "+":
            case ADD:
                o = num1 + num2;
                break;

            // case to subtract two numbers
            case SUBTRACT:
                o = num1 - num2;
                break;

            // case to multiply two numbers
            case MULTIPLY:
                o = num1 * num2;
                break;

            // case to divide two numbers
            case DIVIDE:
                o = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }
        return o;
    }
}
