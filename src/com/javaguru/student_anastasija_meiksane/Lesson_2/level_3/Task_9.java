package com.javaguru.student_anastasija_meiksane.Lesson_2.level_3;

import java.util.Scanner;

class Task_9 {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Multiply ten times");
        System.out.print("Choose a number from 1 till 10: ");


        int number = scanner.nextInt();

int one = 1 ;
int two = 2 ;
int three = 3 ;
int four = 4 ;
int five = 5 ;
int six = 6 ;
int seven = 7 ;
int eight = 8 ;
int nine = 9 ;
int ten = 10 ;

       int numberOne = (number*one);
       int numberTwo = (number*two);
       int numberThree = (number*three);
       int numberFour = (number*four);
       int numberFive = number*five;
       int numberSix = number * six;
       int numberSeven = number * seven;
       int numberEight = number * eight;
       int numberNine = number * nine ;
       int numberTen = number * ten ;


       System.out.println(number + " * " + one + " = " + numberOne  );
        System.out.println(number + " * " + two + " = " + numberTwo );
        System.out.println(number + " * " + three + " = " + numberThree);
        System.out.println(number + " * " + four + " = " + numberFour);
        System.out.println(number + " * " + five + " = " + numberFive);
        System.out.println(number + " * " + six + " = " + numberSix);
        System.out.println(number + " * " + seven + " = " + numberSeven);
        System.out.println(number + " * " + eight + " = " + numberEight);
        System.out.println(number + " * " + nine + " = " + numberNine);
        System.out.println(number + " * " + ten + " = " + numberTen);

    }
}
