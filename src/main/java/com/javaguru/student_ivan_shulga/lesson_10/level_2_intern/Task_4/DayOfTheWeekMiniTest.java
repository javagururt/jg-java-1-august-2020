package com.javaguru.student_ivan_shulga.lesson_10.level_2_intern.Task_4;

import java.util.Scanner;

class DayOfTheWeekMiniTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorArrayVersion demo1 = new DayOfTheWeekDetectorArrayVersion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер дня недели от 1 до 7!");
        int dayNumber = scanner.nextInt();
        String dayName = demo1.detectDayName(dayNumber);
        System.out.println("This is : " + dayName);

    }

}
