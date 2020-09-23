package com.javaguru.student_anastasija_meiksane.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter your name: ");
        String userName = scanner.next();

        String greetings1 = "Hello " + userName + "!";
        String greetings2 = "Pleasure to see you " + userName + "!";

        System.out.println(greetings1);
        System.out.println(greetings2);

    }
}



