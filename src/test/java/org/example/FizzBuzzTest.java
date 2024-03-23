package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void mustHaveText(){
        //given
        FizzBuzz game = new FizzBuzz();
        int length = 100;

        //when
        String[] myArray = game.fizzBuzzArray(length);

        //then
        for(String el: myArray){
            System.out.println(el + " ");
        }
    }
}
