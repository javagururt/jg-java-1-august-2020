package com.javaguru.teacher.lesson_4.lessoncode;

import java.util.Scanner;

class ExampleIfElseIf {

    public static void main(String[] args) {
        System.out.println("Please enter number:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        if (firstNumber <= 0) {
            System.out.println("Hello");
        } else if (firstNumber <= -10) {
            System.out.println("Bye");
        }

    }
}
