package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern.predicate;

import com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern.domain.Apple;

public class AppleLightWeightPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
