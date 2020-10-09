package com.javaguru.student_vladimirs_filipovs.lesson_6.level_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorTest {
    private DayOfTheWeekDetector victim;

    @Before
    public void setUp() {
        victim = new DayOfTheWeekDetector();
    }

    @Test
    public void shouldDayIsMonday() {
        String actualResult = victim.detectDayName(1);
        assertEquals("Monday", actualResult);
    }

    @Test
    public void shouldDayIsTuesday() {
        String actualResult = victim.detectDayName(2);
        assertEquals("Tuesday", actualResult);
    }

    @Test
    public void shouldDayIsWednesday() {
        String actualResult = victim.detectDayName(3);
        assertEquals("Wednesday", actualResult);
    }

    @Test
    public void shouldDayIsThursday() {
        String actualResult = victim.detectDayName(4);
        assertEquals("Thursday", actualResult);
    }

    @Test
    public void shouldDayIsFriday() {
        String actualResult = victim.detectDayName(5);
        assertEquals("Friday", actualResult);
    }

    @Test
    public void shouldDayIsSaturday() {
        String actualResult = victim.detectDayName(6);
        assertEquals("Saturday", actualResult);
    }

    @Test
    public void shouldDayIsSunday() {
        String actualResult = victim.detectDayName(7);
        assertEquals("Sunday", actualResult);
    }

    @Test
    public void shouldDayNotExist() {
        String actualResult = victim.detectDayName(8);
        assertEquals("Please input a valid number between 1 and 7", actualResult);
    }

    @Test
    public void shouldDayNotExistWithNegativeNumber() {
        String actualResult = victim.detectDayName(-8);
        assertEquals("Please input a valid number between 1 and 7", actualResult);
    }
}