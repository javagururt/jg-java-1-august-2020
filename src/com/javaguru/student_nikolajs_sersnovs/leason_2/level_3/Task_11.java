package com.javaguru.student_nikolajs_sersnovs.leason_2.level_3;
/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter Third number:");
        int thirdNumber = scanner.nextInt();

        int avarage = (firstNumber + secondNumber + thirdNumber);
        System.out.println("среднее арифметическое = " + avarage / 3);

    }
}
