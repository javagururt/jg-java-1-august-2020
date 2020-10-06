package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_1_intern;

class FizzBuzzDemo {

    // private int initialNumber;
    public String detect(int number) {
        //this.initialNumber = number; - значению "initialNumber" присваиваем значение "number"
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }

}

