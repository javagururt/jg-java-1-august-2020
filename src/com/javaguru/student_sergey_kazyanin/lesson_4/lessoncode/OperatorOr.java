package com.javaguru.student_sergey_kazyanin.lesson_4.lessoncode;

import java.util.Scanner;

class OperatorOr {
    public static void main(String[] args) {
        System.out.println("Please enter number:");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        boolean isGreaterEqThan10 = firstNumber >=10;
        boolean isLessEqThan50 = firstNumber <= 50;

        System.out.println("isGreaterEqThan10 " + isGreaterEqThan10);
        System.out.println("isLessEqThan50 " + isLessEqThan50);

        if (isGreaterEqThan10 || isLessEqThan50) {
            System.out.println("WIN!");
        }
    }
}

