package com.javaguru.student_igors_jurkovs.lesson_13.level_4_junior;

class StackOverflowError {

    public static void main(String[] args) {

        StackOverflowError stackOverflowError = new StackOverflowError();
        stackOverflowError.stackOverFlow();

    }

    int stackOverFlow() {
        return stackOverFlow();
    }
}
