package com.javaguru.student_vladimir_larin.lesson_6.level_1_intern;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest testRunner = new DayOfTheWeekDetectorTest();
        testRunner.shouldReturnMondayWhenOne();
        testRunner.shouldReturnTuesdayWhenTwo();
        testRunner.shouldReturnWednesdayWhenThree();
        testRunner.shouldReturnThursdayWhenFour();
        testRunner.shouldReturnFridayWhenFive();
        testRunner.shouldReturnSaturdayWhenSix();
        testRunner.shouldReturnSundayWhenSeven();
        testRunner.shouldReturnNotADayWhenElse();
    }

    static void shouldReturnMondayWhenOne() {
        String expected = "Monday";
        String actual = DayOfTheWeekDetector.detectDayName(1);
        assertResult(expected, actual, "shouldReturnMondayWhenOne");
    }

    static void shouldReturnTuesdayWhenTwo() {
        String expected = "Tuesday";
        String actual = DayOfTheWeekDetector.detectDayName(2);
        assertResult(expected, actual, "shouldReturnTuesdayWhenTwo");
    }

    static void shouldReturnWednesdayWhenThree() {
        String expected = "Wednesday";
        String actual = DayOfTheWeekDetector.detectDayName(3);
        assertResult(expected, actual, "shouldReturnWednesdayWhenThree");
    }

    static void shouldReturnThursdayWhenFour() {
        String expected = "Thursday";
        String actual = DayOfTheWeekDetector.detectDayName(4);
        assertResult(expected, actual, "shouldReturnThursdayWhenFour");
    }

    static void shouldReturnFridayWhenFive() {
        String expected = "Friday";
        String actual = DayOfTheWeekDetector.detectDayName(5);
        assertResult(expected, actual, "shouldReturnFridayWhenFive");
    }

    static void shouldReturnSaturdayWhenSix() {
        String expected = "Saturday";
        String actual = DayOfTheWeekDetector.detectDayName(6);
        assertResult(expected, actual, "shouldReturnSaturdayWhenSix");
    }

    static void shouldReturnSundayWhenSeven() {
        String expected = "Sunday";
        String actual = DayOfTheWeekDetector.detectDayName(7);
        assertResult(expected, actual, "shouldReturnSundayWhenSeven");
    }

    static void shouldReturnNotADayWhenElse() {
        String expected = "Not a day of the week.";
        String actual = DayOfTheWeekDetector.detectDayName(123);
        assertResult(expected, actual, "shouldReturnNotADayWhenElse");
    }

    private static void assertResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED. Expected: " + expected + ", actual: " + actual);
        }
    }
}

