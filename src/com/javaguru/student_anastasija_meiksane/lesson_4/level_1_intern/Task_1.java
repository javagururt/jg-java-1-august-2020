package com.javaguru.student_anastasija_meiksane.lesson_4.level_1_intern;

import java.util.Scanner;

public class Task_1 {
    /*
    Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Please enter  number");
        int number = scanner.nextInt();

        if (number >= 0 ) { System.out.println ( "Positive number") ;  }
        else if (number < 0) {  System.out.println ( "Negative number"); }



    }
}
