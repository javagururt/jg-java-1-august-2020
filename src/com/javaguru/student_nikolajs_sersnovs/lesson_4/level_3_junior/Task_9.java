package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_3_junior;
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber)
            System.out.println("Increasing");
        else if (firstNumber > secondNumber && secondNumber > thirdNumber)
            System.out.println("Decreasing");
        else
            System.out.println("Neither increasing or decreasing order");

    }

}
