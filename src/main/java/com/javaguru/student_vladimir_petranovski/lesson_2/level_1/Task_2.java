package com.javaguru.student_vladimir_petranovski.lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Нет необходимости явно указывать в названии тип данных")
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstDoubleNumber = sc.nextDouble();
        double secondDoubleNumber = sc.nextDouble();
        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
    }
}
