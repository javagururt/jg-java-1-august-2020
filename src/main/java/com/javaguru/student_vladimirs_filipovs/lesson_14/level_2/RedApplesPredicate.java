package com.javaguru.student_vladimirs_filipovs.lesson_14.level_2;

class RedApplesPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColour().equalsIgnoreCase("red");
    }
}
