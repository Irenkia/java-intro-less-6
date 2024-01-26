package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BicycleTest {
    Bicycle bicycle = new Bicycle();

    @Test
    void mustMovementStartedTrue() {
        //given
        bicycle.startMovement();

        //when
        boolean isMovementStarted = bicycle.isMovementStarted();

        //then
        Assertions.assertTrue(isMovementStarted);
    }

    @Test
    void mustMovementStartedFalse() {
        //given
        bicycle.stopMovement();

        //when
        boolean isMovementStarted = bicycle.isMovementStarted();

        //then
        Assertions.assertFalse(isMovementStarted);
    }
}
