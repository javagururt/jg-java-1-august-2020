package com.javaguru.student_maksim_morozov.lesson_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first number (integer) ");
    int firstNumber = scanner.nextInt();
    System.out.println("First number " + firstNumber);
    System.out.println("Please enter second number (integer) ");
    int secondNumber = scanner.nextInt();
    System.out.println("Second number " + secondNumber);
    System.out.println("Please enter third number (integer) ");
    int thirdNumber = scanner.nextInt();
    System.out.println("Third number = " + thirdNumber);
    System.out.println("Average is = " + (firstNumber + secondNumber + thirdNumber) / 3);

}

}
