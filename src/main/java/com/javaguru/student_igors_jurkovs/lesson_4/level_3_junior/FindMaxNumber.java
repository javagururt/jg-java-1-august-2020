package com.javaguru.student_igors_jurkovs.lesson_4.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в комментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
@CodeReview(approved = true)
class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = sc.nextInt();
        int maxNumber = 0;
        //     ставим оператор >= чтобы охватить все случаи
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) { // 1. Первое число больше 2 и 3 числа
            maxNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) { // 2. Второе число больше 1 и 3 числа
            maxNumber = secondNumber;
        } else { // в любых других случаях 3 число будет больше двух предидущих
            maxNumber = thirdNumber;
        }
        System.out.println("Max number is " + maxNumber);
    }
}
