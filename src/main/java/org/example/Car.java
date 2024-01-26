package org.example;

public class Car implements VehicleWithEngine {
    private boolean engineStarted;

    public Car() {
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    @Override
    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    @Override
    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }
}
