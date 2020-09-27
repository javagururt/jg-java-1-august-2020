package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_3_junior;
/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */
import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int thirdNumber = scanner.nextInt();



        if (firstNumber == secondNumber && secondNumber == thirdNumber)
            System.out.println("All numbers are equal");
        else if (firstNumber != secondNumber && secondNumber != thirdNumber)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}
