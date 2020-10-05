package com.javaguru.student_igors_jurkovs.lesson_6.level_7_senior;

import java.util.List;

class InsuranceObject {

    private String name;
    List<InsuranceSubObject> subObjects;

    InsuranceObject(String name, List<InsuranceSubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }
}
