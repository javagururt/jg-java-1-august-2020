package com.javaguru.student_igors_raginskis.lesson_2.level_2;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please, enter your name: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
