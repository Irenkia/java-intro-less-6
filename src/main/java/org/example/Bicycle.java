package org.example;

public class Bicycle implements Vehicle{
    private boolean movementStarted;

    public Bicycle() {
    }

    public void setMovementStarted(boolean movementStarted) {
        this.movementStarted = movementStarted;
    }

    @Override
    public void startMovement() {
        if (!movementStarted) {
            movementStarted = true;
        }
    }

    @Override
    public void stopMovement() {
        if (movementStarted) {
            movementStarted = false;
        }
    }

    public boolean isMovementStarted() {
        return movementStarted;
    }
}
