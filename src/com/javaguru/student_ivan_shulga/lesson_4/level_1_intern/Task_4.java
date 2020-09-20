package com.javaguru.student_ivan_shulga.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number (integer):");

        if (scanner.hasNextInt()) {    // hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false)

            int number = scanner.nextInt();

                if (number % 2 == 0 && number != 0) {
                    System.out.println("Number " + number + " is even!");   //если число чётное и не ноль
                    } else if (number == 0) {
                        System.out.println("Your enter \"0\"!");    // если число ноль
                        } else {
                            System.out.println("Number " + number + " is odd!");    // если число не чётное
                        }

        } else {
            System.out.println("You didn't enter a number! Restart the program and enter the number!");     // выводится, если введено не число
        }

    }

}

//Even number!
//Odd number!