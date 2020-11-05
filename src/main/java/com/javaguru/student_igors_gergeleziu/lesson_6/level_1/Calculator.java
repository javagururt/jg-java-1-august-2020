package com.javaguru.student_igors_gergeleziu.lesson_6.level_1;

class Calculator {

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEvenRemastered(int number) {
        return number % 2 == 0 ? true : false;
    }

}