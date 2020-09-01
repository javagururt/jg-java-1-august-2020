package com.javaguru.student_vladimir_larin.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = scanner.next();
        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);
    }
}
