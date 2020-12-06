package com.javaguru.student_maksim_morozov.lesson_10.level_2_intern;

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Понедельник";
        } else if (number == 2) {
            return "Вторник";
        } else if (number == 3) {
            return "Среда";
        } else if (number == 4) {
            return "Четверг";
        } else if (number == 5) {
            return "Пятница";
        } else if (number == 6) {
            return "Суббота";
        } else if (number == 7) {
            return "Воскресение";
        } else {
            return "Вставьте число от одного до семи";
        }
    }
}
