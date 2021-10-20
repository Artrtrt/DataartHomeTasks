package ru.dataart.academy.java;

import java.util.stream.Stream;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        int numLength = String.valueOf(inputNumber).charAt(0) == '-' ? String.valueOf(inputNumber).length() - 1 :
                String.valueOf(inputNumber).length();
        long reverseNumber = 0;
        for (int i = 0; i < numLength; i++) {
            reverseNumber *= 10;
            reverseNumber += inputNumber % 10;
            inputNumber /= 10;
        }
        if (inputNumber >= -2147483648 || inputNumber <= 2147483647) {
            return (int) reverseNumber;
        } else {
            throw new MyException("Введено число, которое не может быть конвертировано");
        }
    }
}
