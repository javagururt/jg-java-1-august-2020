package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


class Policy {

    private static final double FIRE_INSURANCE_COEFFICIENT_LESSER_2000 = 0.03;
    private static final double FIRE_INSURANCE_COEFFICIENT_GREATER_2000 = 0.04;
    private static final double THEFT_INSURANCE_COEFFICIENT_LESSER_2000 = 0.01;
    private static final double THEFT_INSURANCE_COEFFICIENT_GREATER_2000 = 0.02;

    private final double[] costArrayForFireInsurance = {500, 1200, 400};
    private final double[] costArrayForTheftInsurance = {300, 500, 200};




    double calculate(Policy policy, int insuranceType) {
        double finalPrice;
        if (insuranceType == 1) {
            finalPrice = policy.fireInsurancePrice();
        } else if (insuranceType == 2) {
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
        double totalCost = electronicsCost(costArrayForFireInsurance);
        return priceForInsurance(isGreaterThan2000ForFire(), totalCost, FIRE_INSURANCE_COEFFICIENT_GREATER_2000, FIRE_INSURANCE_COEFFICIENT_LESSER_2000);
    }

    double theftInsurancePrice() {
        double totalCost = electronicsCost(costArrayForTheftInsurance);
        return priceForInsurance(isGreaterThan2000ForTheft(), totalCost, THEFT_INSURANCE_COEFFICIENT_GREATER_2000, THEFT_INSURANCE_COEFFICIENT_LESSER_2000);
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

    boolean isGreaterThan2000ForFire() {
        return electronicsCost(costArrayForFireInsurance) >= 2000;
    }

    boolean isGreaterThan2000ForTheft() {
        return electronicsCost(costArrayForTheftInsurance) >= 2000;
    }

}
