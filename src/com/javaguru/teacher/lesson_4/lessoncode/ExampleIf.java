package com.javaguru.teacher.lesson_4.lessoncode;

import java.util.Scanner;

class ExampleIf {

    public static void main(String[] args) {
        System.out.println("Please enter number:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        if (firstNumber == 1) {
            System.out.println("Your number: " + firstNumber);
        }
    }
}
