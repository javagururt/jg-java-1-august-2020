package com.javaguru.student_vladimirs_filipovs.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DaysOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetectorIfVersion dayOfTheWeekIf = new DayOfTheWeekDetectorIfVersion();
        String daysIfMethod = dayOfTheWeekIf.detectDayName(1);
        System.out.println(daysIfMethod);

        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekSwitch = new DayOfTheWeekDetectorSwitchVersion();
        String daysSwitchMethod = dayOfTheWeekSwitch.detectDayName(2);
        System.out.println(daysSwitchMethod);

        DayOfTheWeekDetectorArrayVersion dayOfTheWeekArray = new DayOfTheWeekDetectorArrayVersion();
        String daysArrayMethod = dayOfTheWeekArray.detectDayName(3);
        System.out.println(daysArrayMethod);
    }
}

