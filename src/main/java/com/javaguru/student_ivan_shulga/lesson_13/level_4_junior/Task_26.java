package com.javaguru.student_ivan_shulga.lesson_13.level_4_junior;

class Task_26 {

    public static void badRecursiveFunction() {
        badRecursiveFunction();
    }

    public static void main(String[] args) {

        badRecursiveFunction();

    }

}
/*
Напишите программу, которая вылетает с StackOverflowError.

Подсказка: Вызовите метод в рекурсии (сам себя).

Память JVM не безгранична!
 */