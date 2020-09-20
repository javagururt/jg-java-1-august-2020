package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


import java.util.List;

class InsurancePolicyPremiumCalculatorTest {

    public static void main(String[] args) {
        UserMenu userMenu = new UserMenu();

//        InsuranceSubObject subObject1 = new InsuranceSubObject("TV", 1400);
//        InsuranceSubObject subObject2 = new InsuranceSubObject("Microwave", 700);
//        List<InsuranceSubObject> subObjects = new ArrayList<>();
//        subObjects.add(subObject1);
//        subObjects.add(subObject2);

//        InsuranceObject insuranceObject = new InsuranceObject("Home", subObjects);
//        List<InsuranceObject> insuranceObjects = new ArrayList<>();
//        insuranceObjects.add(insuranceObject);

        Policy policy = new Policy(userMenu.insuranceTypeChoice(), userMenu.insuranceObjects());

        InsurancePolicyPremiumCalculator calculator = new InsurancePolicyPremiumCalculator();
        System.out.println(calculator.calculate(policy));
    }
}
