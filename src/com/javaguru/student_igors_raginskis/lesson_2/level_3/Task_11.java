package com.javaguru.student_igors_raginskis.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Let's do it again: ");
        int secondNumber = scanner.nextInt();

        System.out.println("And one more time: ");
        int thirdNumber = scanner.nextInt();

        int avNumber = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average of your numbers is = " + avNumber);
    }
}
