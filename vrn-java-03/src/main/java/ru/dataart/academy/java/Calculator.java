package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {
    public double sumSquare(Figure[] figures) {
        double sumSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            sumSquare += figures[i].calcSquare();
        }
        return sumSquare;
    }
}
