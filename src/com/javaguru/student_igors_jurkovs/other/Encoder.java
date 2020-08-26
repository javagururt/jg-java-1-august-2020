package com.javaguru.student_igors_jurkovs.other;

import java.util.Scanner;

class Encoder{
    public void encode() {

        System.out.println("Enter ASCII code:" );
        Scanner userCode = new Scanner(System.in);
        int aCode = userCode.nextShort();
        char userChar = (char)aCode;
        System.out.println(userChar);
    }
    public void decode() {
        System.out.println("Enter symbol: " );
        Scanner userChar = new Scanner(System.in);
        String userInput = userChar.nextLine();
        char firstChar = userInput.charAt(0);
        int decodeAscCode = (int)firstChar;
        System.out.println(decodeAscCode);
    }
}
class EncoderDemo{
    public static void main(String[] args) {

        Scanner userChoice = new Scanner(System.in);
        Encoder myEncoder = new Encoder();
        System.out.println("Chose what you want to do:");
        System.out.println("1. Encode code to symbol");
        System.out.println("2. Decode symbol to ASCII");
        int choice = userChoice.nextInt();

        if (choice == 1) {
            myEncoder.encode();
        }

        if (choice == 2) {
            myEncoder.decode();
        }

        if (choice >2) {
            System.out.println("There is no such option, restart the app!");
        }

        if (choice < 1) {
            System.out.println("There is no such option, restart the app");
        }

    }
}