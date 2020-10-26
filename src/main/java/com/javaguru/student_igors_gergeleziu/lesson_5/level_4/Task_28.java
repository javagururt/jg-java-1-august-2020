package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import com.javaguru.student_igors_gergeleziu.lesson_5.level_5_and_6.ArrayUtil;

class Task_28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        int minNumber = arrayUtil.findMinNumber(array);
        System.out.println("Min number of array = " + minNumber);

    }
}
