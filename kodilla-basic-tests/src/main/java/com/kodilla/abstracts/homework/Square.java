package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calcSurfaceArea() {
        return sideA * sideA;
    }

    @Override
    public double calcPerimeter() {
        return 4*sideA;
    }
}
