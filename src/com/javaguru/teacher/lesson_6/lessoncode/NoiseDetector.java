package com.javaguru.teacher.lesson_6.lessoncode;

class NoiseDetector {

    static String detect(int noiseLevel) {
        if (noiseLevel <= 50) {
            return "Talk";
        }
        if (noiseLevel <= 60) {
            return "Office";
        }
        return "Airplane";
    }
}
