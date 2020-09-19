package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;

class InsurancePolicyPremiumCalculator {

    Policy policy = new Policy();


    public static void main(String[] args) {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        insurancePolicyPremiumCalculator.policyTest1();
        insurancePolicyPremiumCalculator.policyTest2();
        insurancePolicyPremiumCalculator.policyTest3();

    }

    void policyTest3() {
        double insurancePrice = policy.calculate(policy, 3);
        policy.test(insurancePrice == 94.0, "Fire and theft insurance");
    }

    void policyTest2() {
        double insurancePrice = policy.calculate(policy, 2);
        policy.test(insurancePrice == 10.0, "Theft insurance");
    }

    void policyTest1() {
        double insurancePrice = policy.calculate(policy, 1);
        policy.test(insurancePrice == 84.0, "Fire insurance");
    }


}
