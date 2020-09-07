package com.javaguru.student_anastasija_meiksane.Lesson_2.level_1;

import java.util.Scanner;

 class Task_2 {

    /*
    Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: " );


        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Please enter second number" );

        double secondDoubleNumber = scanner.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber ;
        double minResult = firstDoubleNumber - secondDoubleNumber ;
        double multipleresult = firstDoubleNumber * secondDoubleNumber ;
        double divideResult = firstDoubleNumber / secondDoubleNumber ;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = "+ sumResult);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + minResult  ) ;
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + multipleresult);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + divideResult);





    }

    }
