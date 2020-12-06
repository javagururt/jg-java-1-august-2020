package com.javaguru.student_maksim_morozov.lesson_10.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private static DayOfTheWeekDetector dayOfTheWeekDetector;
    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        DayOfTheWeekDetectorDemo.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }
    DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
    DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();

    void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вставьте число от одного до семи:");
        int number = scanner.nextInt();
        ifVersion.detectDayName(number);
        switchVersion.detectDayName(number);
        System.out.println("День недели - " + ifVersion.detectDayName(number));
    }

    public static void main(String[] args){
        DayOfTheWeekDetectorDemo test = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);test.run();
    }
}
