package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_1;

class Context {

    private final SalaryCalculator salaryCalculator;

    public Context(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public double calculateSalary(int hours) {
        return salaryCalculator.calculateSalary(hours);
    }
}
