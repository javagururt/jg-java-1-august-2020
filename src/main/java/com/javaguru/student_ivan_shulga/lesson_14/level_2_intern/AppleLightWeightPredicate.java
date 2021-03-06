package com.javaguru.student_ivan_shulga.lesson_14.level_2_intern;

import com.javaguru.student_ivan_shulga.lesson_14.level_1_intern.Apple;

public class AppleLightWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }

}
