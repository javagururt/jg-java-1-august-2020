package com.javaguru.student_maksim_morozov.lesson_13.level_4_junior;

class Task_26 {
    static class StackOverflowError{
        public static void main(String[] args){
            StackOverflowError stackOverflowError = new StackOverflowError();
            stackOverflowError.stackOverFlow();
        }
        int stackOverFlow(){return stackOverFlow();}
    }
}
