package org.example;

public class FizzBuzz implements ReplacingNumbersWithWords{
    public String[] fizzBuzzArray(int length) {
        String[] arr = new String[length];
        for (int i = 0; i < arr.length; i++) {
            if (isDivisible(i + 1, 3) && isDivisible(i + 1, 5)) {
                arr[i] = "FizzBuzz";
            } else if (isDivisible(i + 1, 3)) {
                arr[i] = "Fizz";
            } else if (isDivisible(i + 1, 5)) {
                arr[i] = "Buzz";
            } else {
                arr[i] = String.valueOf(i + 1);
            }
        }
        return arr;
    }

    @Override
    public boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }

}
