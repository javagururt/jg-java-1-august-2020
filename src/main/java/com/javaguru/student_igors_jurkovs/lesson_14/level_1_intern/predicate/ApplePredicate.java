package com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern.predicate;

import com.javaguru.student_igors_jurkovs.lesson_14.level_1_intern.domain.Apple;

@FunctionalInterface
public interface ApplePredicate {

    boolean test (Apple apple);

}
