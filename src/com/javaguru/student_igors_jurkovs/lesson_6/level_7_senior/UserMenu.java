package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class UserMenu {

    Scanner scanner = new Scanner(System.in);

    InsuranceType insuranceTypeChoice() {
        InsuranceType insuranceTypeChoice = null;
        do {
            System.out.println("Please enter insurance type:");
            System.out.println("1. Fire insurance only.");
            System.out.println("2. Theft insurance only.");
            System.out.println("3. Fire and theft insurance.");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                insuranceTypeChoice = InsuranceType.FIRE;
            } else if (userChoice == 2) {
                insuranceTypeChoice = InsuranceType.THEFT;
            } else if (userChoice == 3) {
                insuranceTypeChoice = InsuranceType.FULL;
            }
        } while (!Objects.equals(insuranceTypeChoice, InsuranceType.FULL) && !Objects.equals(insuranceTypeChoice, InsuranceType.FIRE) && !Objects.equals(insuranceTypeChoice, InsuranceType.THEFT));
        return insuranceTypeChoice;
    }

    List<InsuranceObject> insuranceObjects() {
        List<InsuranceObject> insuranceObjects = new ArrayList<>();
        String userChoice;
        System.out.println("Type 'YES' if you want to insure home, flat, car etc: ");
        userChoice = scanner.next();
        while(userChoice.equals("YES")) {
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
        List<InsuranceSubObject> subObjects = new ArrayList<>();
        String userChoice;
        System.out.println("Type 'YES' if you want to add items you want to insure: ");
        userChoice = scanner.next();
        while(userChoice.equals("YES")) {
            System.out.println("First enter name of the item:");
            String subObjectName = scanner.next();
            System.out.println("Now enter price of the items:");
            double subObjectPrice = scanner.nextDouble();
            InsuranceSubObject subObject = new InsuranceSubObject(subObjectName, subObjectPrice);
            subObjects.add(subObject);
            System.out.println("Type 'YES' if you want to add something to sub object insurance");
            userChoice = scanner.next();
            if (!(userChoice.equals("YES"))) {
                break;
            }
        }

        return subObjects;
    }

}
