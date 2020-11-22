package main.java.com.javaguru.student_anastasija_meiksane.lesson_4.level_2_intern;

import java.util.Scanner;

public class Task_6 {
    /*
    Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first  number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.print("Numbers are different - ");
            System.out.println("First number " + firstNumber + " is  less than second number " + secondNumber);}
        else if (secondNumber < firstNumber) {
            System.out.print("Numbers are different - ");
            System.out.println("Second number " + secondNumber + " is less than first number " + firstNumber); }
        else if (firstNumber == secondNumber) {
         System.out.println("Numbers are equal"); }
        else {
            System.out.println("Incorrect input");
        }
    }

}

