package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import com.javaguru.student_igors_gergeleziu.lesson_5.level_5_and_6.ArrayUtil;

class Task_27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.newArrayWithRandomLength();
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        int maxNumber = arrayUtil.findMaxNumber(array);
        System.out.println("Max number of array = " + maxNumber);
    }
}
