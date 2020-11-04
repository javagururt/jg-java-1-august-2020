package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import com.javaguru.student_igors_gergeleziu.lesson_5.level_5_and_6.ArrayUtil;

class Task_30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.oddNumbersOfArray(array);
    }
}
