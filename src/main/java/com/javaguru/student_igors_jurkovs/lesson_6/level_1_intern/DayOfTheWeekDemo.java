package com.javaguru.student_igors_jurkovs.lesson_6.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDemo {

    private static final DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

    public static void main(String[] args) {
        mondayTest();
        tuesdayTest();
        wednesdayTest();
        thursdayTest();
        fridayTest();
        saturdayTest();
        sundayTest();
    }

    static void mondayTest() {
        int daysNumber = 1;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Monday"), "Monday test");
    }

    static void tuesdayTest() {
        int daysNumber = 2;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Tuesday"), "Tuesday test");
    }

    static void wednesdayTest() {
        int daysNumber = 3;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Wednesday"), "Wednesday test");
    }

    static void thursdayTest() {
        int daysNumber = 4;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Thursday"), "Thursday test");
    }

    static void fridayTest() {
        int daysNumber = 5;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Friday"), "Friday test");
    }

    static void saturdayTest() {
        int daysNumber = 6;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Saturday"), "Saturday test");
    }

    static void sundayTest() {
        int daysNumber = 7;
        dayOfTheWeek.test(dayOfTheWeek.dayDetector(daysNumber).equals("Sunday"), "Sunday test");
    }
}
