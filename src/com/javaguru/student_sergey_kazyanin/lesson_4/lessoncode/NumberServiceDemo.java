package com.javaguru.student_sergey_kazyanin.lesson_4.lessoncode;

import java.util.Scanner;

class NumberServiceDemo {
    public static void main(String[] args) {
        NumberService service = new NumberService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int max = service.findMaxNumber(firstNumber,secondNumber);
        System.out.printf("Result: " + max);

        /*
        Test 1:
        input - 0 0
        output - 0

        Test 2:
        input - -3 10
        output - 10

        Test 3:
        input - 9 1
        output - 9
         */
    }
}
