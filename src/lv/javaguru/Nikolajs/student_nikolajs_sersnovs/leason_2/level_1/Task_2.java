package lv.javaguru.Nikolajs.student_nikolajs_sersnovs.leason_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Input second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Choose operation: \n + Addition \n - Subtraction \n * Multiplication \n / Division ");
        double sumResult = firstNumber + secondNumber;
        System.out.println("Sum result = " + sumResult);
    }
}
