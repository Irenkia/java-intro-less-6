package org.example;

public class Calculator {
    public double calculate(CalculatorOperation operation) {
        return operation.perform();
    }
}
