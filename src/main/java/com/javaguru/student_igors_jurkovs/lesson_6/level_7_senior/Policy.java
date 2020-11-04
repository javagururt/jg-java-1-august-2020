package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;


import java.util.ArrayList;
import java.util.List;

class Policy {

    InsuranceType insuranceType;
    List<InsuranceObject> insuranceObjects;

    Policy(InsuranceType insuranceType, List<InsuranceObject> insuranceObjects) {
        this.insuranceType = insuranceType;
        this.insuranceObjects = insuranceObjects;
    }

    List<InsuranceSubObject> getAllPolicySubObjects() {
        List<InsuranceSubObject> allPolicySubObjects = new ArrayList<>();

        for (InsuranceObject insuranceobject : insuranceObjects
        ) {
            allPolicySubObjects.addAll(insuranceobject.subObjects);
        }

        return allPolicySubObjects;
    }

}
