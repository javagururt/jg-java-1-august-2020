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

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) return firstNumber;
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) return secondNumber;
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) return thirdNumber;
        else if (firstNumber == secondNumber && firstNumber > thirdNumber) return firstNumber;
        else if (secondNumber == thirdNumber && secondNumber > firstNumber) return secondNumber;
        else if (firstNumber == thirdNumber && firstNumber > secondNumber) return firstNumber;
        return 0;
    }
}
