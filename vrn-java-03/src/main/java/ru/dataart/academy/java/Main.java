package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Circle circ1 = new Circle(4);
        Circle circ2 = new Circle(10);
        Rectangle rect1 = new Rectangle(2, 3);

        System.out.println("Сумма площадей равна: " + calc.sumSquare(new Figure[]{circ1, circ2, rect1}));
    }
}