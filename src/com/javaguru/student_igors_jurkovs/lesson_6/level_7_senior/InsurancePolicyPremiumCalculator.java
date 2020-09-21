package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;

import java.util.List;

class InsurancePolicyPremiumCalculator {

    private static final double FIRE_INSURANCE_COEFFICIENT_LESSER_2000 = 0.03;
    private static final double FIRE_INSURANCE_COEFFICIENT_GREATER_2000 = 0.04;
    private static final double THEFT_INSURANCE_COEFFICIENT_LESSER_2000 = 0.01;
    private static final double THEFT_INSURANCE_COEFFICIENT_GREATER_2000 = 0.02;

    private Policy policy;

    double calculate(Policy policy) {
        this.policy = policy;
        List<InsuranceSubObject> subObjects = policy.getAllPolicySubObjects();
        double allSubObjectsPriceSum = getAllSubObjectsPriceSum(subObjects);

        return calculatePrice(allSubObjectsPriceSum);
    }

    private double getAllSubObjectsPriceSum(List<InsuranceSubObject> subObjects) {
        double allSubObjectPriceSum = 0.0;

        for (InsuranceSubObject insuranceSubObject : subObjects) {
            allSubObjectPriceSum += insuranceSubObject.price;
        }

        return allSubObjectPriceSum;
    }

    private double calculatePrice(double allSubObjectsPriceSum) {
        double insurancePrice = 0;
        InsuranceType insuranceType = policy.insuranceType;
        double fireCoefficient = FIRE_INSURANCE_COEFFICIENT_LESSER_2000;
        double theftCoefficient = THEFT_INSURANCE_COEFFICIENT_LESSER_2000;

        if (allSubObjectsPriceSum >= 2000) {
            fireCoefficient = FIRE_INSURANCE_COEFFICIENT_GREATER_2000;
            theftCoefficient = THEFT_INSURANCE_COEFFICIENT_GREATER_2000;
        }

        if (insuranceType == InsuranceType.FIRE) {
            insurancePrice = allSubObjectsPriceSum * fireCoefficient;
        } else if (insuranceType == InsuranceType.THEFT) {
            insurancePrice = allSubObjectsPriceSum * theftCoefficient;
        } else if (insuranceType == InsuranceType.FULL) {
            insurancePrice = allSubObjectsPriceSum * fireCoefficient + allSubObjectsPriceSum * theftCoefficient;
        }

        return insurancePrice;
    }
}