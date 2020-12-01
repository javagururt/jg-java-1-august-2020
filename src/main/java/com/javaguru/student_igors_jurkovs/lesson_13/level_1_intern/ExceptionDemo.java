package com.javaguru.student_igors_jurkovs.lesson_13.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Level 1 approved")
public class ExceptionDemo {

    public static void main(String[] args) throws Exception {

        System.err.println("Printing error");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput == 1) {
            throw new Error();
        } else if(userInput == 2) {
            throw new Exception("Throwing exception");
        } else throw new RuntimeException("Runtime exception");
    }

}
