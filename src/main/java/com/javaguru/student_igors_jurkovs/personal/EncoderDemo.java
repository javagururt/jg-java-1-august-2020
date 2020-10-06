package com.javaguru.student_igors_jurkovs.personal;

import java.util.Scanner;

class EncoderDemo {
    public static void main(String[] args) {
        boolean restart;
        do {

            Scanner userChoice = new Scanner(System.in);
            Scanner decodeChar = new Scanner(System.in);
            Encoder myEncoder = new Encoder();
            System.out.println("Chose what you want to do:");
            System.out.println("1. Encode code to symbol");
            System.out.println("2. Decode symbol to ASCII");
            int choice = userChoice.nextInt();

            if (choice == 1) {
                System.out.println("Enter code: ");
                int userCode = userChoice.nextInt();
                myEncoder.encode(userCode);
            }

            if (choice == 2) {
                System.out.println("Enter symbol: ");
                String userInput = decodeChar.nextLine();
                char firstChar = userInput.charAt(0);
                myEncoder.decode(firstChar);
            }

            if (choice > 2) {
                System.out.println("There is no such option, restart the app!");
            }

            if (choice < 1) {
                System.out.println("There is no such option, restart the app");
            }
            System.out.println("Try again?");
            Scanner again = new Scanner(System.in);
            restart = again.nextBoolean();
        } while (restart);

    }
}
