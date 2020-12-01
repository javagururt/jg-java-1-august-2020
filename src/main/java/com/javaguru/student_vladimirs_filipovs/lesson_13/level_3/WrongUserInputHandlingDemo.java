package com.javaguru.student_vladimirs_filipovs.lesson_13.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.InputMismatchException;
import java.util.Scanner;
@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        int inputNumber = 0;

        while (inputNumber == 0) {
            System.out.println("Please enter number!");
            try {
                Scanner scan = new Scanner(System.in);
                inputNumber = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Error, please enter correct data.");
            }
        }
        System.out.println("Your number is: " + inputNumber);
    }
}
