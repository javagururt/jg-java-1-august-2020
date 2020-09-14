package com.javaguru.student_maksim_morozov.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum = scanner.nextInt();
        System.out.println();
        int tempMax = maxOfTwo(firstNum, secondNum);
        int max = maxOfTwo(tempMax, thirdNum);
        System.out.println("Largest number that consists tre digest: " + max);
    }
    static int maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }
}
