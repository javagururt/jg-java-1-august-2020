package com.javaguru.student_roman_tasilov.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        String hello = "Hello";
        String getting = hello + " " + userName +"!";
        System.out.println(getting);

    }

}

