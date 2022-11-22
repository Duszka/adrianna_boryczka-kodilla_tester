package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {
    private int speed;
    private int acceleration;
    private int deceleration;

    public Renault (int speed, int acceleration, int deceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - deceleration;
    }

    @Override
    public int getIncreaseSpeed() {
        return acceleration;
    }
}
