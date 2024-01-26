package org.example;

public class Division implements CalculatorOperation {
    private double number1;
    private double number2;
    private double result;

    public Division(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    @Override
    public double perform() {
        if (number2 == 0) {
            System.out.println("Error: you cannot divide by zero.");
            return 0;
        }
        return number1 / number2;
    }
}
