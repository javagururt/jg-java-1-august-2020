package com.javaguru.student_maksim_morozov.lesson_5.level_2_inter;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int [] number = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter " + (i+1) + " number:");
            number[i] = sc.nextInt(); }
        System.out.println("Number[0] = " + number[0]);
        System.out.println("Number[1] = " + number[1]);
        System.out.println("Number[2] = " + number[2]);
    }
}
