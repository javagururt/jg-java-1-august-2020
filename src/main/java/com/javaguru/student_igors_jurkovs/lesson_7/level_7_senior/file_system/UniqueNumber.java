package com.javaguru.student_igors_jurkovs.lesson_7.level_7_senior.file_system;

class UniqueNumber {

    private static int objectUniqueNumber = 1;

    private UniqueNumber() {
    }

    static int uniqueNumberGeneration() {
        return objectUniqueNumber++;
    }

    static void resetUniqueNumber() {
        objectUniqueNumber = 1;
    }
}
