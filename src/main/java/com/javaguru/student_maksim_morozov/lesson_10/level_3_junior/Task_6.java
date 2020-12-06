package com.javaguru.student_maksim_morozov.lesson_10.level_3_junior;


class Task_6 {
    @FunctionalInterface
    interface Consumer{
        void accept(String task_6);
    }
    public static void main(String[] args) {
        Consumer greetings = x -> System.out.println("Hello " + x + " !!!");
        greetings.accept("Maks");
    }
}
