package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class UserMenu {

    private Scanner scanner = new Scanner(System.in);
    private InsuranceType insuranceTypeChoice = null;
    private List<InsuranceObject> insuranceObjects = new ArrayList<>();
    List<InsuranceSubObject> subObjects = new ArrayList<>();
    private String userChoice;
    private int userInput;

    InsuranceType insuranceTypeChoice() {
        printMenu();
        do {
            userInput = scanner.nextInt();
            if (userInput == 1) {
                insuranceTypeChoice = InsuranceType.FIRE;
            } else if (userInput == 2) {
                insuranceTypeChoice = InsuranceType.THEFT;
            } else if (userInput == 3) {
                insuranceTypeChoice = InsuranceType.FULL;
            }
        } while (isUserEnteredValidType());

        return insuranceTypeChoice;
    }

    List<InsuranceObject> insuranceObjects() {
        System.out.println("Type 'YES' if you want to insure home, flat, car etc: ");
        userChoice = scanner.next();
        while (userChoice.equals("YES")) {
            System.out.println("First enter name of the object:");
            String objectName = scanner.next();
            InsuranceObject insuranceObject = new InsuranceObject(objectName, subObjects());
            insuranceObjects.add(insuranceObject);
            System.out.println("Type 'YES' if you want to add something to insurance");
            userChoice = scanner.next();
            if (!(userChoice.equals("YES"))) {
                break;
            }
        }

        return insuranceObjects;
    }

    List<InsuranceSubObject> subObjects() {
        System.out.println("Type 'YES' if you want to add items you want to insure: ");
        userChoice = scanner.next();
        while (isUsersAnswerIsYes()) {
            System.out.println("First enter name of the item:");
            String subObjectName = scanner.next();
            System.out.println("Now enter price of the items:");
            double subObjectPrice = scanner.nextDouble();
            InsuranceSubObject subObject = new InsuranceSubObject(subObjectName, subObjectPrice);
            subObjects.add(subObject);
            System.out.println("Type 'YES' if you want to add something to sub object insurance");
            userChoice = scanner.next();
            if (!isUsersAnswerIsYes()) {
                break;
            }
        }

        return subObjects;
    }

    void printMenu() {
        System.out.println("Please enter insurance type:");
        System.out.println("1. Fire insurance only.");
        System.out.println("2. Theft insurance only.");
        System.out.println("3. Fire and theft insurance.");
    }

    boolean isUserEnteredValidType() {
        return !Objects.equals(insuranceTypeChoice, InsuranceType.FULL) && !Objects.equals(insuranceTypeChoice, InsuranceType.FIRE) && !Objects.equals(insuranceTypeChoice, InsuranceType.THEFT);
    }

    boolean isUsersAnswerIsYes() {
        return userChoice.equals("YES");
    }

}
