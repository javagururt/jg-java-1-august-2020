package com.javaguru.student_igors_jurkovs.lesson_6.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class DayOfTheWeekTest {

    private final DayOfTheWeek victim = new DayOfTheWeek();

    @Test
    public void stringDetector() {
        String expected = "Thursday";
        String result = victim.dayDetector(4);
        assertEquals(expected, result);
    }

}