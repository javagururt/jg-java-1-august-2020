package com.javaguru.student_ivan_shulga.lesson_10.level_4_junior.Task_12_with_UserAplication_Test.Task_12;
// тест менюшки консольной на основе предыдущего задания Task_12 lesson_10 для закрепления/повторения

import java.util.Scanner;

class MenuExecutor {

    private final TemperatureConverter[] menus;

    MenuExecutor(TemperatureConverter[] menus) {
        this.menus = menus;
    }

    void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < menus.length; i++) {
                System.out.println(i + ". " + menus[i].getMenuName());
            }
            System.out.println();
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            if (number >= menus.length || number < 0) {
                System.out.println("Incorrect value! Try again!");
                System.out.println();
            } else
                menus[number].convert();
        }
    }
}
