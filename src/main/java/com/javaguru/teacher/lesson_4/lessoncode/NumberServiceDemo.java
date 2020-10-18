package com.javaguru.teacher.lesson_4.lessoncode;

import java.util.Scanner;

class NumberServiceDemo {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        int result = service.findMaxNumber(firstNumber, secondNumber);
        System.out.println("Result: " + result);
        /*
        Test 1:
        input - 0 0 входные данные
        output - 0 ожидаемый результат

        Test 2:
        input - -3 10
        output - 10

        Test 3:
        input - 9 1
        output - 9
         */
    }

}
