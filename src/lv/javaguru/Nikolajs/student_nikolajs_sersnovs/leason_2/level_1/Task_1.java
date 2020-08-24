package lv.javaguru.Nikolajs.student_nikolajs_sersnovs.leason_2.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number:");
        int firstNumber = in.nextInt();
        System.out.println("Input second number:");
        int secondNumber = in.nextInt();
        System.out.println("Choose operation: \n + Addition \n - Subtraction \n * Multiplication \n / Division ");
        String operation = in.nextLine();
        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum result = " + sumResult);

    }
}
