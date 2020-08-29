package com.javaguru.student_vladimir_petranovski.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Для среднего лучше использовать double (дробное значение)")
public class Task_11_Average {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа:");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        System.out.println("Среднее арифметическое = " + ((firstNumber + secondNumber + thirdNumber) / 3));
    }
}
