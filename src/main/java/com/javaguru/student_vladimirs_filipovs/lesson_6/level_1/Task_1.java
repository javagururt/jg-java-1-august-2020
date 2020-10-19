package com.javaguru.student_vladimirs_filipovs.lesson_6.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    /*
    public boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    */
    public boolean isEven(int number) {
        boolean isEvenNumber = number % 2 == 0;
        return isEvenNumber;
    }

}
