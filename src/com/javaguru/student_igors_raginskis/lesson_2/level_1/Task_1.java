package com.javaguru.student_igors_raginskis.lesson_2.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {

        System.out.println("Please, enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter second nubmer: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Summ of your numbers: " + (firstNumber + secondNumber));
        System.out.println("Substraction of your numbers: " + (firstNumber - secondNumber));
        System.out.println("Multiplication of your numbers: " + (firstNumber * secondNumber));
        System.out.println("Division of your numbers: " + (firstNumber / secondNumber));

    }
}
