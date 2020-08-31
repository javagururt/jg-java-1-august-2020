package com.javaguru.student_vladimir_larin.lesson_2.level_3;

import java.util.Scanner;

class Task_11 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (int):");

        int a = sc.nextInt();

        System.out.println("Enter second number (int):");

        int b = sc.nextInt();

        System.out.println("Enter third number (int):");

        int c = sc.nextInt();

        System.out.println("Arifmetical mean = " + (a + b + c) / 3);


    }
}
