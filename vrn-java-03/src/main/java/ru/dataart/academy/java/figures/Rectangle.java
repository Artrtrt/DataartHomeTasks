package ru.dataart.academy.java.figures;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcSquare() {
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (width + height);
    }
}
