package com.javaguru.student_sergey_kazyanin.lesson_4.lessoncode;

import java.util.Scanner;

class ExampleSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter number:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        switch (firstNumber) {
            case 0:
                System.out.println("Hello");
                break;
            case -10:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Default");
        }
    }
}
