package com.javaguru.student_vladimirs_filipovs.lesson_10.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] array = new String[8];
        array[0] = "Please input a valid number between 1 and 7";
        array[1] = "Monday";
        array[2] = "Tuesday";
        array[3] = "Wednesday";
        array[4] = "Thursday";
        array[5] = "Friday";
        array[6] = "Saturday";
        array[7] = "Sunday";
        return array[number];
    }
}
