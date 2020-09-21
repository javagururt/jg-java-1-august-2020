package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_4_junior;


import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }


    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber & secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber & secondNumber & thirdNumber;

    }


}










