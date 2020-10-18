package com.javaguru.student_vadim_migun.lesson_7.level_6_middle;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class PowerCalculatorTest {

    PowerCalculator victim = new PowerCalculator();

    @Test

    public void shouldPowValue() {
        int actual = victim.pow(3,3);
        assertEquals(27,actual);

    }

}