package com.javaguru.student_vladimirs_filipovs.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first number (int)");
        int firstNumber = scan.nextInt();

        System.out.println("Please input second number (int)");
        int secondNumber = scan.nextInt();

        System.out.println("Please input third number (int)");
        int thirdNumber = scan.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("Increasing");
        } else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
