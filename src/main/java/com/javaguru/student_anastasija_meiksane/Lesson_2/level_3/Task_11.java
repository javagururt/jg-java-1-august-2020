package com.javaguru.student_anastasija_meiksane.Lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {


    /*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).


 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ") ;
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number : ");
        int thirdNumber = scanner.nextInt();

        int result = (firstNumber + secondNumber + thirdNumber) / 3 ;

        System.out.println("Middle result: " + result);

    }

}
