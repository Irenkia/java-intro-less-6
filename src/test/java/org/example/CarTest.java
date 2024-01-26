package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car car = new Car();

    @Test
    void mustEngineStartedTrue() {
        //given
        car.startEngine();

        //when
        boolean isEngineStarted = car.isEngineStarted();

        //then
        Assertions.assertTrue(isEngineStarted);
    }

    @Test
    void mustEngineStartedFalse() {
        //given
        car.stopEngine();

        //when
        boolean isEngineStarted = car.isEngineStarted();

        //then
        Assertions.assertFalse(isEngineStarted);
    }
}
