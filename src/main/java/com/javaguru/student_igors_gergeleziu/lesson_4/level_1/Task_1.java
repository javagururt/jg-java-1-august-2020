package com.javaguru.student_igors_gergeleziu.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Лучше ставить фигурные скобки, чтобы явно указать область видимости")
class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        if (number < 0) System.out.println("Your number is negative");
        else if (number > 0) System.out.println("Your number is positive");
    }
}
