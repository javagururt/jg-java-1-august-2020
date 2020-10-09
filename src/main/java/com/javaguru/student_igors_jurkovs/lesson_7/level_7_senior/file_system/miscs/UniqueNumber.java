package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system.miscs;

public class UniqueNumber {

    private static int objectUniqueNumber = 1;

    private UniqueNumber() {
    }

    public static int uniqueNumberGeneration() {
        return objectUniqueNumber++;
    }

    public static void resetUniqueNumber() {
        objectUniqueNumber = 1;
    }
}
