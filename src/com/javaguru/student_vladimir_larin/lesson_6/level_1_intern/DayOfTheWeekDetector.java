package com.javaguru.student_vladimir_larin.lesson_6.level_1_intern;

class DayOfTheWeekDetector {
    static String detectDayName(int number) {
        if (number >= 1 && number <= 7)
            switch (number) {
                case 1 -> {
                    return "Monday";
                }
                case 2 -> {
                    return "Tuesday";
                }
                case 3 -> {
                    return "Wednesday";
                }
                case 4 -> {
                    return "Thursday";
                }
                case 5 -> {
                    return "Friday";
                }
                case 6 -> {
                    return "Saturday";
                }
                case 7 -> {
                    return "Sunday";
                }
            }
        return "Not a day of the week.";
    }
}
