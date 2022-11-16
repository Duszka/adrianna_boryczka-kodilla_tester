package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println("The area of the square is: " + square.calcSurfaceArea());
        System.out.println("The perimeter of the square is: " + square.calcPerimeter());

        Triangle triangle = new Triangle(2.5, 4, 5, 3);
        System.out.println("The area of the triangle is: " + triangle.calcSurfaceArea());
        System.out.println("The perimeter of the triangle is: " + triangle.calcPerimeter());

        Circle circle = new Circle(4.5);
        System.out.println("The area of the circle is: " + circle.calcSurfaceArea());
        System.out.println("The perimeter of the circle is: " + circle.calcPerimeter());
    }
}
