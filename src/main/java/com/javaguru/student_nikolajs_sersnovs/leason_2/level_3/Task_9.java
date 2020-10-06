package com.javaguru.student_nikolajs_sersnovs.leason_2.level_3;
/*
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_9 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Please Input a number: ");
        int number = in.nextInt();
        for(int i =1 ; i <=10; i++) {
            System.out.println("Expected Output: " + number + " x " + (i) + " = " + (number * i));

        }

    }
}
