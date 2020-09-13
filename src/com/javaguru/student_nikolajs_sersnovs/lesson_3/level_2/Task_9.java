package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_2;
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
import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {

    public static void main(String[] args){
        @CodeReviewComment(teacher = "переменные называют с маленькой буквы. camelCase")
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Write your name:");
        String userName = Scanner.next();
        System.out.println("Hello " + userName + "!");

    }

}
