package com.javaguru.student_anastasija_meiksane.Lesson_2.level_2;

import java.util.Scanner;

 class Task_8 {

    /*
    Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");


    String name = scanner.next();

    System.out.println("Hello " + name + "! ");
    }
}
