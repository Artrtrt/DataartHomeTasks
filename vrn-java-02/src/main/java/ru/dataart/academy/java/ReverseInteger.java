package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
            int numLength = String.valueOf(inputNumber).charAt(0) == '-' ? String.valueOf(inputNumber).length() - 1 :
                    String.valueOf(inputNumber).length();
            int reverseNumber = 0;
            for (int i = 0; i < numLength; i++) {
                reverseNumber *= 10;
                reverseNumber += inputNumber % 10;
                inputNumber /= 10;
            }
            return reverseNumber;
    }
}
