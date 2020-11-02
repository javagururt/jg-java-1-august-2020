package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SalaryCalculatorDemo {

    public static void main(String[] args) {

        int hours = 168;

        JuniorSalaryImpl juniorSalary = new JuniorSalaryImpl();
        MiddleSalaryImpl middleSalary = new MiddleSalaryImpl();
        SeniorSalaryImpl seniorSalary = new SeniorSalaryImpl();

        Context junior = new Context(juniorSalary);
        Context middle = new Context(middleSalary);
        Context senior = new Context(seniorSalary);

        System.out.println("Junior salary: " + junior.calculateSalary(hours));
        System.out.println("Middle salary: " + middle.calculateSalary(hours));
        System.out.println("Senior salary: " + senior.calculateSalary(hours));
    }
}
