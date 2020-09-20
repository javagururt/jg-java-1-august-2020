package com.javaguru.student_maksim_morozov.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        int number = scan.nextInt();
        System.out.println("Number = " + number);
        if (number > 0){
            System.out.println("The number is positive!");
        }else {
            System.out.println("The number is negative!"); }
    }
}
