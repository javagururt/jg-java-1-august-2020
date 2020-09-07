package com.javaguru.student_igors_raginskis.lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Тип данных необязательно указывать в названиях.")
class Task_2 {
    public static void main(String[] args) {

        System.out.println("Please, enter first FRACTIONAL number: ");

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Please, enter second FRACTIONAL nubmer: ");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Summ of your numbers: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Substraction of your numbers: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication of your numbers: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division of your numbers: " + (firstDoubleNumber / secondDoubleNumber));
    }

}
