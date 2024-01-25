package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        //given
        CalculatorOperation addition = new Addition(1.0, 1.0);

        //when
        double sum = calculator.calculate(addition);

        //then
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        //given
        CalculatorOperation subtraction = new Subtraction(5.0, 4.0);

        //when
        double subtract = calculator.calculate(subtraction);

        //then
        Assertions.assertEquals(1, subtract);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        //given
        CalculatorOperation multiplication = new Multiplication(3.0, 3.0);

        //when
        double multiply = calculator.calculate(multiplication);

        //then
        Assertions.assertEquals(9, multiply);
    }

    @Test
    void shouldDividedTwoNumbers() {
        //given
        CalculatorOperation division = new Division(10.0, 2.0);

        //when
        double divide = calculator.calculate(division);

        //then
        Assertions.assertEquals(5, divide);
    }
}
