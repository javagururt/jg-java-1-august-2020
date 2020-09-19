package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


import java.util.Scanner;

class UserMenu {

    Scanner scanner = new Scanner(System.in);

    double[] electronicsArray(String type) {
        System.out.println("Please enter number of items you want to insure against " + type + ":");
        int electronicsCount = scanner.nextInt();
        double[] array = new double[electronicsCount];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter items price:");
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    int insuranceTypeChoice() {
        int insuranceTypeChoice;
        do {
            System.out.println("Please enter insurance type:");
            System.out.println("1. Fire insurance only.");
            System.out.println("2. Theft insurance only.");
            System.out.println("3. Fire and theft insurance.");
            insuranceTypeChoice = scanner.nextInt();
        } while (insuranceTypeChoice > 3);
        return insuranceTypeChoice;
    }

}
