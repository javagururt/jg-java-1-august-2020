package main.java.com.javaguru.student_anastasija_meiksane.lesson_4.level_2_intern;

import java.util.Scanner;

public class Task_5 {
    /*
    Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first  number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(" First number " + firstNumber + " is higher than the second number " + secondNumber);}
        else if (secondNumber > firstNumber) {
            System.out.println("Second number " + secondNumber + "is bigger than the first number  " + secondNumber);}
        else if (firstNumber == secondNumber) { System.out.println("Numbers are equal"); }
        else {
            System.out.println("Incorrect input");
        }
    }

}
