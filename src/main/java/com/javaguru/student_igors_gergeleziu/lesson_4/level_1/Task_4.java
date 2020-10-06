package com.javaguru.student_igors_gergeleziu.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) System.out.println("Number " + number + " is even");
        else System.out.println("Number " + number + " is odd");
    }
}
