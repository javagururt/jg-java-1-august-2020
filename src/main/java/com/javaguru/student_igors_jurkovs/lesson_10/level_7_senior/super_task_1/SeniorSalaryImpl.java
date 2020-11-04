package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SeniorSalaryImpl implements SalaryCalculator {

    @Override
    public double calculateSalary(int hours) {
        return 17.8 * hours;
    }
}
