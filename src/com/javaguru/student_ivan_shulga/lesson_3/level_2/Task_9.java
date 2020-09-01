package com.javaguru.student_ivan_shulga.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {

        System.out.println("Enter your name, please!");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");

    }

}
