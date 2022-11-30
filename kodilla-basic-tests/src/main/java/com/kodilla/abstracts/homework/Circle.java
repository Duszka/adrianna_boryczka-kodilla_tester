package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    public double r;
    static final double PI = 3.1415927;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calcSurfaceArea() {
        return PI * r * r;
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * r;
    }
}
