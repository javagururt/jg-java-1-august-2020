package com.javaguru.student_igors_jurkovs.lesson_9.level_6_middle;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class VarArgsDemo {

    public static void main(String[] args) {

        VarArgsExample varArgsExample = new VarArgsExample();

        int totalSum = varArgsExample.sumOfAllNumbers(1, 3, 5, 6, 7, 2, 4, 6);
        System.out.println(totalSum);
    }
}
