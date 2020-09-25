package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

class PowerCalculator {

    int powerCalculator(int number, int power) {
        if (power == 0) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }

        int result = number;
        for (int i = 0; i < power - 1; i++) {
            result = result * number;
        }

        return result;
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
}
