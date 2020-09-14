package com.javaguru.student_igors_jurkovs.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday
 */
// Вариант без оператора if
@CodeReview(approved = true)
class DayOfTheWeek {
    public static void main(String[] args) {

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int userInput = sc.nextInt();

        System.out.println(daysOfTheWeek[userInput - 1]);
    }

}
