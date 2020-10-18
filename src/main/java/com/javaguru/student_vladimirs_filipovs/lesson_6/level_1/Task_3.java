package com.javaguru.student_vladimirs_filipovs.lesson_6.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    /*
        private int initialNumber;

        public String detect(int number) {
            this.initialNumber = number;
            if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
            else if (initialNumber % 3 == 0) return "Fizz";
            else if (initialNumber % 5 == 0) return "Buzz";
            else return "" + initialNumber; // Integer.toString(initialNumber);
        }
    */

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return Integer.toString(number);
    }
}
