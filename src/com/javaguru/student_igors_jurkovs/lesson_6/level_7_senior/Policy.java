package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


class Policy {

    private static final double FIRE_INSURANCE_COEFFICIENT_LESSER_2000 = 0.03;
    private static final double FIRE_INSURANCE_COEFFICIENT_GREATER_2000 = 0.04;
    private static final double THEFT_INSURANCE_COEFFICIENT_LESSER_2000 = 0.01;
    private static final double THEFT_INSURANCE_COEFFICIENT_GREATER_2000 = 0.02;

    UserMenu userMenu = new UserMenu();


    double calculate(Policy policy, UserMenu userMenu) {
        double finalPrice;
        int userInput = userMenu.insuranceTypeChoice();
        if (userInput == 1) {
            finalPrice = policy.fireInsurancePrice();
        } else if (userInput == 2) {
            finalPrice = policy.theftInsurancePrice();
        } else finalPrice = policy.fireInsurancePrice() + policy.theftInsurancePrice();
        return finalPrice;
    }

     double electronicsCost(double[] array) {
        double sum = 0;
        for (double ar : array) {
            sum += ar;
        }
        return sum;
    }
    double fireInsurancePrice() {
        double[] costArrayForFireInsurance = userMenu.electronicsArray("fire");
        double totalCost = electronicsCost(costArrayForFireInsurance);
        return priceForInsurance(totalCost >= 2000, totalCost, FIRE_INSURANCE_COEFFICIENT_GREATER_2000, FIRE_INSURANCE_COEFFICIENT_LESSER_2000);
    }

    double theftInsurancePrice() {
        double[] costArrayForTheftInsurance = userMenu.electronicsArray("theft");
        double totalCost = electronicsCost(costArrayForTheftInsurance);
        return priceForInsurance(totalCost >= 2000, totalCost, THEFT_INSURANCE_COEFFICIENT_GREATER_2000, THEFT_INSURANCE_COEFFICIENT_LESSER_2000);
    }

    void printInformation(double price) {
        System.out.println("Your insurance price is: " + price);
    }

    double priceForInsurance(boolean condition, double price, double coefficient1, double coefficient2) {
        if (condition) {
            return price * coefficient1;
        } else {
            return price * coefficient2;
        }

    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }


}
