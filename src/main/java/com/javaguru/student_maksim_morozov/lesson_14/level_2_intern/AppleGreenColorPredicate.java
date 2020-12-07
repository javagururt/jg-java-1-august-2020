package com.javaguru.student_maksim_morozov.lesson_14.level_2_intern;

import com.javaguru.student_maksim_morozov.lesson_14.level_1_intern.Apple;

class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple){return "green".equals(apple.getColor());}
}
