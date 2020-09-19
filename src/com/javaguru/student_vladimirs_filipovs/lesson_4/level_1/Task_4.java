package com.javaguru.student_vladimirs_filipovs.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number (int)");
        int number = scan.nextInt();

        int remainderOfNumber = number % 2;

        if (number == 0) {
            System.out.println("You entered ZERO");
        } else if (remainderOfNumber == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
