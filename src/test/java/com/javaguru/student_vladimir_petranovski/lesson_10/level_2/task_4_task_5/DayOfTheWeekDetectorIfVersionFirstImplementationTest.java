package com.javaguru.student_vladimir_petranovski.lesson_10.level_2.task_4_task_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheWeekDetectorIfVersionFirstImplementationTest {

    @Test
    public void detectDayNameTest() {
        DayOfTheWeekDetectorIfVersionFirstImplementation test = new DayOfTheWeekDetectorIfVersionFirstImplementation();
        assertEquals("Monday", test.detectDayName(1));
    }
}