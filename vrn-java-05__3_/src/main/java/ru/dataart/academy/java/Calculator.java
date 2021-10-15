package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int sum = 0;
        for (int i = 0; i < firstNumber.size(); i++) {
            sum += firstNumber.get(i) * Math.pow(10, i);
        }
        for (int i = 0; i < secondNumber.size(); i++) {
            sum += secondNumber.get(i) * Math.pow(10, i);
        }
        return sum;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        var newList = new ArrayList<T>();
        int sw = 1;
        for (T el: list) {
            sw = (sw == 1) ? 0 : 1;
            if (sw == 0) {
                newList.add(el);
            }
        }
        return newList;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        var newList = new ArrayList<T>();
        newList.add(list.get(0));
        newList.add(list.get(list.size() - 1));
        return newList;
    }
}
