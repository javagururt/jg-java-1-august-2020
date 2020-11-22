package com.javaguru.student_ivan_shulga.lesson_7.level_6_middle;

import java.util.Scanner;

class PowerCalculator { // тесты через org.junit.Test;

    static int powerCalc(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }

}

class PowerCalculatorMiniTest { // мимни калькулятор для ручной проверки

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор возведения числа в степень.");
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Введите степень:");
        int power = scanner.nextInt();
        System.out.println("Результат возведения в степень числа " + number + " равно " + PowerCalculator.powerCalc(number, power) + ".");

    }

}

/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */