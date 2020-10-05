package com.javaguru.student_igors_gergeleziu.lesson_4.level_4;

class Calculator {
    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public float division(int firstNumber, int secondNumber) {
        return firstNumber / (float) secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) return firstNumber;
        else if (secondNumber > firstNumber) return secondNumber;
        else return 0;
    }

}
