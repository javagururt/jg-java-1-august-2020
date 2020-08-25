package com.javaguru.student_igors_gergeleziu.lesson_2.level_3;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
         int firstNumber, secondNumber, thirdNumber;
         float arithmeticAverage;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first number: ");
        firstNumber=sc.nextInt();
        System.out.println("Please enter second number: ");
        secondNumber=sc.nextInt();
        System.out.println("Please enter third number: ");
        thirdNumber=sc.nextInt();
        arithmeticAverage=(float)(firstNumber+secondNumber+thirdNumber)/3;
         System.out.println("Arithmetic Average of numbers "+firstNumber+","+secondNumber+","+thirdNumber+": "+arithmeticAverage);
    }


}
