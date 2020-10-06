package com.javaguru.student_ivan_shulga.lesson_6.level_1_intern;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 7;
    public static final String OUT_OF_ZONE = "Please input a valid number between " + DayOfTheWeekDetector.MIN_NUMBER + " and " + DayOfTheWeekDetector.MAX_NUMBER + "!";

    static String detectDayName(int number) {

        if ((number >= MIN_NUMBER) && (number <= MAX_NUMBER)) {
            switch (number) {
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
            }
        }
        return OUT_OF_ZONE;
    }
}

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest tests = new DayOfTheWeekDetectorTest();
        tests.mondayTest();
        tests.tuesdayTest();
        tests.wednesdayTest();
        tests.thursdayTest();
        tests.fridayTest();
        tests.saturdayTest();
        tests.sundayTest();
        tests.outOfZoneTest0();
        tests.outOfZoneTest8();

    }

    void mondayTest() {
        String expected = "Monday";
        String actual = DayOfTheWeekDetector.detectDayName(1);
        testResult(expected, actual, "mondayTest");
    }

    void tuesdayTest() {
        String expected = "Tuesday";
        String actual = DayOfTheWeekDetector.detectDayName(2);
        testResult(expected, actual, "tuesdayTest");
    }

    void wednesdayTest() {
        String expected = "Wednesday";
        String actual = DayOfTheWeekDetector.detectDayName(3);
        testResult(expected, actual, "wednesdayTest");
    }

    void thursdayTest() {
        String expected = "Thursday";
        String actual = DayOfTheWeekDetector.detectDayName(4);
        testResult(expected, actual, "thursdayTest");
    }

    void fridayTest() {
        String expected = "Friday";
        String actual = DayOfTheWeekDetector.detectDayName(5);
        testResult(expected, actual, "fridayTest");
    }

    void saturdayTest() {
        String expected = "Saturday";
        String actual = DayOfTheWeekDetector.detectDayName(6);
        testResult(expected, actual, "saturdayTest");
    }

    void sundayTest() {
        String expected = "Sunday";
        String actual = DayOfTheWeekDetector.detectDayName(7);
        testResult(expected, actual, "wednesdayTest");
    }

    void outOfZoneTest0() {
        String expected = DayOfTheWeekDetector.OUT_OF_ZONE;
        String actual = DayOfTheWeekDetector.detectDayName(0);
        testResult(expected, actual, "outOfZoneTest0");
    }

    void outOfZoneTest8() {
        String expected = DayOfTheWeekDetector.OUT_OF_ZONE;
        String actual = DayOfTheWeekDetector.detectDayName(8);
        testResult(expected, actual, "outOfZoneTest8");
    }


    private void testResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED! Expected: " + expected + ", actual: " + actual);
        }
    }
}

/*
class DayOfTheWeekDetectorDemo { // для себя, чтобы видеть как работает программа

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a valid number between 1 and 7:");
        int number = scanner.nextInt();

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        System.out.println(detector.detectDayName(number));

    }
}
 */