package com.javaguru.teacher.lesson_6.lessoncode;

import java.util.Scanner;

class HumanAgeUtilsTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age (" + HumanAgeUtils.MIN_AGE
                + " - "
                + HumanAgeUtils.MAX_AGE + "):");
        int age = scanner.nextInt();
        boolean isValidAge = HumanAgeUtils.isValidAge(age);
        if (isValidAge) {
            System.out.println("Age " + age + " valid.");
        } else {
            System.out.println("Age " + age + " not valid.");
        }
    }
}
