package com.javaguru.student_igors_gergeleziu.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        if (number < 0) System.out.println("Your number is negative");
        else if (number > 0) System.out.println("Your number is positive");
        else if (number == 0) System.out.println("Your number is 0");
    }
}
