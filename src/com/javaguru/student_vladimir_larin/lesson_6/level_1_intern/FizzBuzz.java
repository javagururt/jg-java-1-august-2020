package com.javaguru.student_vladimir_larin.lesson_6.level_1_intern;

class FizzBuzz {

    public static String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return Integer.toString(number);
    }

}