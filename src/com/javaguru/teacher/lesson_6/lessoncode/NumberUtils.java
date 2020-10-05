package com.javaguru.teacher.lesson_6.lessoncode;

class NumberUtils {

    static int pow(int number, int power) {
        if (power == 0 || number == 1) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }
        int powerResult = number;
        for (int i = 1; i < power; i++) {
            powerResult = powerResult * number;
        }
        return powerResult;
    }

}
