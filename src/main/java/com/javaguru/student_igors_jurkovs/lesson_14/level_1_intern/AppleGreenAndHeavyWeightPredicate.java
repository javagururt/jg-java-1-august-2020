package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
