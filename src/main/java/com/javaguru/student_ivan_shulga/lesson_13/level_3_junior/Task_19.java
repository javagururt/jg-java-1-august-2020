package com.javaguru.student_ivan_shulga.lesson_13.level_3_junior;

import java.util.Scanner;

class Task_19 {
}

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        System.out.println("Please enter integer:");
        Scanner scanner = new Scanner(System.in);

        String customString = scanner.nextLine();
        int validInteger;

        try {
            validInteger = Integer.parseInt(customString);
            System.out.println("You enter number -> " + validInteger);
        } catch (Exception e) {
            System.out.printf("You enter \"%s\" it is not a number!%n", customString);
            System.out.println("Please enter numbers only!");
        }
    }

}
/*
Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */