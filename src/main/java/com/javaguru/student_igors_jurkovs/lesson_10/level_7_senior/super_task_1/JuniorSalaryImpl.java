package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_1;

class JuniorSalaryImpl implements SalaryCalculator {

    @Override
    public double calculateSalary(int hours) {
        return 5 * hours;
    }
}
