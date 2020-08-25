package com.javaguru.student_vladimir_larin.lesson_2.level_2;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {

        System.out.println("Please enter your user name:");

        Scanner console = new Scanner(System.in);

        String userName = console.nextLine();

        System.out.println("Hello, " + userName + "!");
    }

}
