package com.javaguru.student_roman_tasilov.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {
        System.out.println("Please enter number int: ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        if(firstNumber < 0 || firstNumber >= 1) {
            System.out.println("Number  <= 0 || firstNumber >= 1");}
    }
}
