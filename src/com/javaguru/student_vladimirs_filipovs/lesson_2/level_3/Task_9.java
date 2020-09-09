package com.javaguru.student_vladimirs_filipovs.lesson_2.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input whole number");
        int number = scan.nextInt();

        int result1 = 1 * number;
        int result2 = 2 * number;
        int result3 = 3 * number;
        int result4 = 4 * number;
        int result5 = 5 * number;
        int result6 = 6 * number;
        int result7 = 7 * number;
        int result8 = 8 * number;
        int result9 = 9 * number;
        int result10 = 10 * number;

        System.out.println("1 x " + number + " = " + result1);
        System.out.println("2 x " + number + " = " + result2);
        System.out.println("3 x " + number + " = " + result3);
        System.out.println("4 x " + number + " = " + result4);
        System.out.println("5 x " + number + " = " + result5);
        System.out.println("6 x " + number + " = " + result6);
        System.out.println("7 x " + number + " = " + result7);
        System.out.println("8 x " + number + " = " + result8);
        System.out.println("9 x " + number + " = " + result9);
        System.out.println("10 x " + number + " = " + result10);
    }
}
