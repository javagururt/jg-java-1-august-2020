package com.javaguru.student_igors_jurkovs.lesson_2.level_x.Super_task_5;

import java.util.Scanner;

class TemperatureConverter {
    static double fahrenheitConverter(double a) {
        return a * 9 / 5 + 32;
    }
    static double celsiusConverter(double b) {
        return 5.0 / 9.0 * (b - 32);
    }
    public static void main(String[] args) {

        // Ознокамливаем пользователя с вожможности конвертера
        System.out.println("Chose type of conversion: ");
        System.out.println("1. From Celsius to Fahrenheit");
        System.out.println("2. From Fahrenheit to Celsius");
        int userInput;
        Scanner sc = new Scanner(System.in);

        do {
            userInput = sc.nextInt();
            if (userInput == 1) {
                System.out.println("Please enter celsius value:");
                double temperatureCelsius = sc.nextDouble();
                double temperatureFahrenheit = fahrenheitConverter(temperatureCelsius);
                System.out.println(temperatureFahrenheit + " fahrenheit");
            }
            if (userInput == 2) {
                System.out.println("Please enter fahrenheit value:");
                double temperatureFahrenheit = sc.nextDouble();
                double temperatureCelsius = celsiusConverter(temperatureFahrenheit);
                System.out.println(temperatureCelsius + " celsius");
            }
            if (userInput >= 3 || userInput <= 0) {
                System.out.println("There is no such option, please try again!");
            }
        } while (userInput >= 3 || userInput <= 0);

        // Для получения обратной связи можно использовать код ниже
        /* System.out.println("Please rate this program from 1 to 10: ");
        int rate = sc.nextInt();
        System.out.println("Your mark is " + rate + "! Thank you for testing my app!");*/

    }
}
