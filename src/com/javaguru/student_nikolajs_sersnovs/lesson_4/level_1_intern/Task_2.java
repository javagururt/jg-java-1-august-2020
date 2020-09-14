package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_1_intern;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */
import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number (Integer): ");
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("Number is positive");
        }
        else if (number == 0) {
            System.out.println("Number are equal to zero");
        }
        else {
            System.out.println("Number is negative");
        }

    }
}
