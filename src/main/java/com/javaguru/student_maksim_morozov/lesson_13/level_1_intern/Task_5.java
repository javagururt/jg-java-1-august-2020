package com.javaguru.student_maksim_morozov.lesson_13.level_1_intern;

import java.util.Scanner;


class ExceptionDemo {

        public static void main(String[] args) throws Exception {
            System.err.println("Ошибка печати");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                throw new Error();
            } else if (userInput == 2) {
                throw new Exception("Выброс исключения");
            } else throw new RuntimeException("Исключение времени выполнения");
        }
    }

