package com.javaguru.student_igors_jurkovs.lesson_13.level_3_junior;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput = 0;

        try {
            System.out.println("Enter number");
            userInput = sc.nextInt();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Enter number, not letters");
            Scanner sc2 = new Scanner(System.in);
            userInput = sc2.nextInt();
        }

        System.out.println("Your number is" + userInput);
    }
}
