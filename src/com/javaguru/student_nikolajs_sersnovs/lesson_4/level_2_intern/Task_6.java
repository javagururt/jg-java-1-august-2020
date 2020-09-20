package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_2_intern;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */
import java.util.Scanner;

class Task_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber){
            System.out.println("Min number are: " + firstNumber);
        }
        else if (secondNumber < firstNumber){
            System.out.println("Min number are: " + secondNumber);
        }
        else {
            System.out.println("Number are equals! ");
        }

    }


}
