package com.javaguru.student_igors_jurkovs.personal;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "методы encode/decode могут принимать аргументы из вне" +
        " (к примеру аргументы можно получить в мейн методе, а затем уже передать в encode," +
        " это позволит переиспользовать код.")
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
        System.out.println((int)firstChar);
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