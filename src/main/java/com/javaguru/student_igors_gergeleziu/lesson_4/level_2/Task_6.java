package com.javaguru.student_igors_gergeleziu.lesson_4.level_2;
import java.util.Scanner;
 class Task_6 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number: ");
         int number1 = sc.nextInt();
         System.out.println("Enter second number: ");
         int number2 = sc.nextInt();
         if (number1 == number2) System.out.println("Numbers " + number1 + " and " + number2 + " are equal");
         else if (number1 < number2) System.out.println("Number " + number1 + " is smaller than " + number2);
         else System.out.println("Number " + number2 + " is smaller than " + number1);
     }
}
