package com.javaguru.student_maksim_morozov.lesson_13.level_3_junior;

import java.util.Scanner;

class Task_19 {
    static class WrongUserInputHandlingDemo{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int userInput = 0;

            try {
                System.out.println("Введите число:");
                userInput = scanner.nextInt();
            } catch (Exception e){
                System.err.println(e);
                System.out.println("Введите число,а не букву");
                Scanner scanner2 = new Scanner(System.in);
                userInput = scanner2.nextInt();
            }
            System.out.println("Ваше чило - " + userInput);
        }
    }
}
