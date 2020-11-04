package com.javaguru.student_vladimirs_filipovs.lesson_10.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_6_1 implements Task_6 {
    int a = 5;
    int b = 7;
    int c;

    @Override
    public void sumSomething() {
        c = a * b;
    }
}
