package com.javaguru.student_igors_jurkovs.lesson_6.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeek {
    private final String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    String dayDetector(int numberToDay) {
        return daysOfTheWeek[numberToDay - 1];
    }

    void test(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED");
        }
    }
}

