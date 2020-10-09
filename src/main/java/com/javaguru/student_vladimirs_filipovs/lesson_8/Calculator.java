package com.javaguru.student_vladimirs_filipovs.lesson_8;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int deduct(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    // 221 - 212 - 122 - 211 - 121 - 112 - 222
    public int maxOfThirdNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (secondNumber > thirdNumber)) {
            return firstNumber;
        } else if ((firstNumber < thirdNumber) && (secondNumber <= thirdNumber)) {
            return thirdNumber;
        } else if ((firstNumber < secondNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
}

