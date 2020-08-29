package com.javaguru.student_maksim_morozov.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
        class Task_2{
            public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                double firstDoubleNumber = sc.nextDouble();
                double secondDoubleNumber = sc.nextDouble();
                System.out.println(firstDoubleNumber + secondDoubleNumber);
                System.out.println(firstDoubleNumber - secondDoubleNumber);
                System.out.println(firstDoubleNumber * secondDoubleNumber);
                System.out.println(firstDoubleNumber / secondDoubleNumber);
            }
            
        }