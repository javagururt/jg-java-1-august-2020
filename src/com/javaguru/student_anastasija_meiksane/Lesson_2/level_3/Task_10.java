package com.javaguru.student_anastasija_meiksane.Lesson_2.level_3;

import java.util.Scanner;

class Task_10 {

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Please enter circle radius: ");

        double radius = scanner.nextDouble() ;


        double area = Math.PI * (radius * radius) ;
                System.out.println("Area is " + area) ;

  double perimeter = 2 * Math.PI * radius ;
   System.out.println("Perimeter is " + perimeter);

    }
    }
