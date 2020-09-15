package com.javaguru.student_vladimirs_filipovs.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scan.next();

        System.out.println("Hello " + userName + "!");
    }
}
