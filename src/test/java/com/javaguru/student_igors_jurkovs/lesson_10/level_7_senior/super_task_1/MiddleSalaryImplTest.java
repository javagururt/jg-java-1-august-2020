package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleSalaryImplTest {

    private MiddleSalaryImpl victim = new MiddleSalaryImpl();
    private int hours = 180;

    @Test
    public void calculateSalary() {
        double expected = 1674;
        double result = victim.calculateSalary(hours);
        assertEquals(expected, result, 0.01);
    }
}