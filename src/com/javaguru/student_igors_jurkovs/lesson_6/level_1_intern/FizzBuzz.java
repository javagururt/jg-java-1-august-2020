package com.javaguru.student_igors_jurkovs.lesson_6.level_1_intern;

class FizzBuzz {

    String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return String.valueOf(number);
    }
    void test(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED");
        }
    }
}

