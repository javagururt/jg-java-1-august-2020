package com.javaguru.student_igors_jurkovs.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
 */
@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args) {

        String hello = "Hello";
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = name.nextLine();
        String greeting = hello + " " + userName + "!";
        System.out.println(greeting);
    }
}
