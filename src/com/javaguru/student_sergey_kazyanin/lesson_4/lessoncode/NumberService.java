package com.javaguru.student_sergey_kazyanin.lesson_4.lessoncode;

class NumberService {

    public int findMaxNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
