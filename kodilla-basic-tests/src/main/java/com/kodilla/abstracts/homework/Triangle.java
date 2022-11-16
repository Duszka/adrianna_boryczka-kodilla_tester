package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public double sideA;
    public double sideB;
    public double sideC;
    public double altitude;

    public Triangle(double sideA, double sideB, double sideC, double altitude) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.altitude = altitude;
    }

    @Override
    public double calcSurfaceArea() {
        return sideA*altitude/2;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    }
}
