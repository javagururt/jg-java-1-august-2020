package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Operationable operation = ((a, b, c) -> a + b - c);

        int result = operation.operate(5,10, 4);
        System.out.println(result);
    }
}
