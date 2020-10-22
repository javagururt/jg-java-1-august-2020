package com.javaguru.student_igors_gergeleziu.lesson_4.level_7.super_task_1;

class FizzBuzz {
    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else return "" + number;
    }
}
