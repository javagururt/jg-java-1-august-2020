package com.javaguru.student_ivan_shulga.lesson_10.level_2_intern.Task_4_and_Task_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionTest {

    @Test
    public void detectDayNameTestIf1() {
        DayOfTheWeekDetectorIfVersion testIfVersion = new DayOfTheWeekDetectorIfVersion();
        assertEquals("Saturday", testIfVersion.detectDayName(6));
    }

    @Test
    public void detectDayNameTestIf2() {
        DayOfTheWeekDetectorIfVersion testIfVersion2 = new DayOfTheWeekDetectorIfVersion();
        assertEquals("Please input a valid number between 1 and 7", testIfVersion2.detectDayName(8));
    }
// -----------------------------------
    @Test
    public void detectDayNameTestSwitch1() {
        DayOfTheWeekDetectorSwitchVersion testSwitchVersion1 = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals("Please input a valid number between 1 and 7", testSwitchVersion1.detectDayName(8));
    }

    @Test
    public void detectDayNameTestSwitch2() {
        DayOfTheWeekDetectorSwitchVersion testSwitchVersion2 = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals("Sunday", testSwitchVersion2.detectDayName(7));
    }
// -----------------------------------
    @Test
    public void detectDayNameTestArray1() {
        DayOfTheWeekDetectorArrayVersion testArrayVersion1 = new DayOfTheWeekDetectorArrayVersion();
        assertEquals("Please input a valid number between 1 and 7", testArrayVersion1.detectDayName(8));
    }

    @Test
    public void detectDayNameTestArray2() {
        DayOfTheWeekDetectorArrayVersion testArrayVersion2 = new DayOfTheWeekDetectorArrayVersion();
        assertEquals("Monday", testArrayVersion2.detectDayName(1));
    }

    @Test
    public void detectDayNameTestArray3() {
        DayOfTheWeekDetectorArrayVersion testArrayVersion3 = new DayOfTheWeekDetectorArrayVersion();
        assertEquals("Sunday", testArrayVersion3.detectDayName(7));
    }

}