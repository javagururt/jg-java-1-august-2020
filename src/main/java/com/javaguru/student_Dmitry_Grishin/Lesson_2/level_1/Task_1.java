package com.javaguru.student_Dmitry_Grishin.Lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;
import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "переменные лучше объявлять раздельно")
public class Task_1 {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Please, enter second nubmer: ");
        secondNumber = scanner.nextInt();

        System.out.println("Summ of your numbers: " + (firstNumber + secondNumber));
        System.out.println("Substraction of your numbers: " + (firstNumber - secondNumber));
        System.out.println("Multiplication of your numbers: " + (firstNumber * secondNumber));
        System.out.println("Division of your numbers: " + (firstNumber / secondNumber));

    }
}

