package ru.dataart.academy.java.figures;

public class Circle extends Figure {
    public static final double PI = 3.14;

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * radius;
    }

}
