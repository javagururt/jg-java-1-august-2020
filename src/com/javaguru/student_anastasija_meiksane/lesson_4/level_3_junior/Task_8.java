package com.javaguru.student_anastasija_meiksane.lesson_4.level_3_junior;

import java.util.Scanner;

public class Task_8 {
    /*
    Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
                int firstNumber = scanner.nextInt();
        System.out.println("enter second number");
                int secondNumber = scanner.nextInt();
        System.out.println("enter third number");
                int thirdNumber = scanner.nextInt();

       if (firstNumber == secondNumber && secondNumber == thirdNumber) {
           System.out.println("All numbers are equal"); }
       else if( firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber){
           System.out.println(" All numbers are different");}
       else if ( thirdNumber < firstNumber | thirdNumber > firstNumber && firstNumber == secondNumber)  {
           System.out.println ( " Neither all are equal or differ");}
       else if ( firstNumber < secondNumber | firstNumber > secondNumber && firstNumber == thirdNumber){
           System.out.println (" Neither all are equal or differ");}
       else if ( secondNumber > firstNumber | secondNumber < firstNumber && secondNumber == thirdNumber){
           System.out.println(" Neither all are equal or differ"); }
       else { System.out.println ( " Incorrect input") ; }
    }
}
