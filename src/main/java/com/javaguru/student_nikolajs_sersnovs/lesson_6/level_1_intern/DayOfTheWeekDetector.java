package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_1_intern;

/*
Создайте класс DayOfTheWeekDetector.
В классе DayOfTheWeekDetector создайте метод:

    String detectDayName(int number).

Этот метод должен по переданному в качестве параметра числу определять день недели.
Реализуйте этот метод (можно взять часть приведённого выше кода).

Создайте класс DayOfTheWeekDetectorTest и напишите
автоматические тесты для всех сценариев.
 */
class DayOfTheWeekDetector {

    public String detectDayName(int number) {
        String result = "";
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        }
        {
            return result;
        }
    }
}




