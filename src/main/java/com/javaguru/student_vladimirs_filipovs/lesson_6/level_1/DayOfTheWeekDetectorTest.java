package com.javaguru.student_vladimirs_filipovs.lesson_6.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest testRunner = new DayOfTheWeekDetectorTest();
        testRunner.isDayMonday();
        testRunner.isDayTuesday();
        testRunner.isDayWednesday();
        testRunner.isDayThursday();
        testRunner.isDayFriday();
        testRunner.isDaySaturday();
        testRunner.isDaySunday();
        testRunner.isDayNoDay();
    }

    void isDayMonday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Monday";
        String actualResult = dayOfTheWeekDetector.detectDayName(1);
        assertResult(actualResult, expectedResult, "isDayMonday");
    }

    void isDayTuesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetector.detectDayName(2);
        assertResult(actualResult, expectedResult, "isDayTuesday");
    }

    void isDayWednesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Wednesday";
        String actualResult = dayOfTheWeekDetector.detectDayName(3);
        assertResult(actualResult, expectedResult, "isDayWednesday");
    }

    void isDayThursday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Thursday";
        String actualResult = dayOfTheWeekDetector.detectDayName(4);
        assertResult(actualResult, expectedResult, "isThursMonday");
    }

    void isDayFriday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetector.detectDayName(5);
        assertResult(actualResult, expectedResult, "isDayFriday");
    }

    void isDaySaturday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetector.detectDayName(6);
        assertResult(actualResult, expectedResult, "isDaySaturday");
    }

    void isDaySunday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Sunday";
        String actualResult = dayOfTheWeekDetector.detectDayName(7);
        assertResult(actualResult, expectedResult, "isDaySunday");
    }

    void isDayNoDay() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = dayOfTheWeekDetector.detectDayName(100);
        assertResult(actualResult, expectedResult, "isDayNoDay");
    }

    private void assertResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " SUCCESS");
        } else {
            System.out.println(testName + " FAIL, expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }
}

