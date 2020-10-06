package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_1_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mustReturnMonday();
        dayOfTheWeekDetectorTest.mustReturnTuesday();
        dayOfTheWeekDetectorTest.mustReturnWednesday();
        dayOfTheWeekDetectorTest.mustReturnThursday();
        dayOfTheWeekDetectorTest.mustReturnFriday();
        dayOfTheWeekDetectorTest.mustReturnSaturday();
        dayOfTheWeekDetectorTest.mustReturnSunday();
    }

    public void mustReturnMonday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Monday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Monday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }
    public void mustReturnTuesday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Tuesday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Tuesday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }public void mustReturnWednesday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Wednesday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Wednesday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }public void mustReturnThursday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Thursday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Thursday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }public void mustReturnFriday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Friday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Friday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }public void mustReturnSaturday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Saturday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Saturday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }public void mustReturnSunday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write day of the week (Integer): " );
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        String expectResult = "Sunday";
        if (expectResult.equals(actualResult)) {
            System.out.println("Day of the week: " + "Sunday! " + "Test SUCCESS");
        } else {
            System.out.println("Day of the week: FAILURE " + "Expected result: "
                    + expectResult + " but Actual result: " + actualResult);
        }
    }


}
