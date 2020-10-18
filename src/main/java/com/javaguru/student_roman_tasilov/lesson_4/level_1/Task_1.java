package com.javaguru.student_roman_tasilov.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;
import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "в задании были другие требования")
class Task_1 {

    public static void main(String[] args) {
        System.out.println("Please enter number int: ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        if(firstNumber < 0 || firstNumber >= 1) {
            System.out.println("Number  <= 0 || firstNumber >= 1");}
    }
}
