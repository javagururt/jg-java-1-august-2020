package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern;

public class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }

}
