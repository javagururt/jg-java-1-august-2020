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
// Вариант через оператор if
@CodeReview(approved = true)
class DayOfTheWeek_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wednesday");
        }
        if (number == 4) {
            System.out.println("Thursday");
        }
        if (number == 5) {
            System.out.println("Friday");
        }
        if (number == 6) {
            System.out.println("Saturday");
        }
        if (number == 7) {
            System.out.println("Sunday");
        }

    }
}
