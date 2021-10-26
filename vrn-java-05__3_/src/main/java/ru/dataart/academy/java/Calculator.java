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
        int num1 = listInNumber(firstNumber);
        int num2 = listInNumber(secondNumber);
        return num1 + num2;
    }

    public Integer listInNumber(List<Integer> list) {
        int number = 0;
        for (int i = 0; i < list.size(); i++) {
            number += list.get(i) * Math.pow(10, i);
        }
        return number;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        var newList = new ArrayList<T>();
        for (int i = 0; i < list.size(); i += 2) {
                newList.add(list.get(i));
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
        if (list.size() == 1) {
            return list;
        }
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        var newList = new ArrayList<T>();
        newList.add(list.get(0));
        newList.add(list.get(list.size() - 1));
        return newList;
    }
}
