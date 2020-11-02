package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Context {

    private final SalaryCalculator salaryCalculator;

    public Context(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public double calculateSalary(int hours) {
        return salaryCalculator.calculateSalary(hours);
    }
}
