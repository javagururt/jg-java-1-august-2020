package com.javaguru.student_igors_jurkovs.lesson_6.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

/*
Task 15 and 16
 */
@CodeReview(approved = true)
public class EndlessWhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i >= 0) {
            System.out.println(i);
            i++;
            if (i == 101) {
                break;
            }
        }
    }
}
