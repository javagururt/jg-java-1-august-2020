package com.javaguru.student_igors_jurkovs.lesson_13.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StackOverflowError {

    public static void main(String[] args) {

        StackOverflowError stackOverflowError = new StackOverflowError();
        stackOverflowError.stackOverFlow();

    }

    int stackOverFlow() {
        return stackOverFlow();
    }
}
