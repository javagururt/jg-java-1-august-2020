package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
