package com.javaguru.student_vladimir_petranovski.lesson_10.level_2.task_4_task_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorIfVersionThirdImplementation implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] dayWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String day = null;
        if (number >= 1 && number <= 7) {
            for (int i = 0; i < dayWeek.length; i++) {
                if (i + 1 == number) {
                    day = dayWeek[i];
                }
            }
        } else {
            day = "Please input a valid number between 1 and 7";
        }
        return day;
    }
}
