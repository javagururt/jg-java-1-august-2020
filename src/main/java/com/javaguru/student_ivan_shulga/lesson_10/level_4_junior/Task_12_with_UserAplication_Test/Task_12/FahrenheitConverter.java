package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12_with_UserAplication_Test.Task_12;
// тест менюшки консольной на основе предыдущего задания Task_12 lesson_10 для закрепления/повторения

import java.util.Scanner;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Celsius temperature:");
        int celsTemp = scanner.nextInt();
        System.out.println("Fahrenheit temperature is " + (1.8 * celsTemp + 32));
        System.out.println();
    }

    public String getMenuName() {
        return "FahrenheitConverter.";
    }

}
