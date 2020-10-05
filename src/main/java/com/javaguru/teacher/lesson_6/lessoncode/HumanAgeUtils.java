package com.javaguru.teacher.lesson_6.lessoncode;

class HumanAgeUtils {


    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 120;

    static boolean isValidAge(int age) {
        return age > MIN_AGE && age <= MAX_AGE;
    }

}
