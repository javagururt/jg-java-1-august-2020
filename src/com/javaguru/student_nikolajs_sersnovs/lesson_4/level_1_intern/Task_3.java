package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_1_intern;

import java.time.MonthDay;
import java.util.Scanner;

/*\
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.
 */
class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number (Integer): ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wednesday ");
        }
        if (number == 4) {
            System.out.println("Thursday ");
        }
        if (number == 5) {
            System.out.println("Friday ");
        }
        if (number == 6) {
            System.out.println("Saturday ");
        }
        if (number == 7) {
            System.out.println("Sunday");
        }
    }
}
