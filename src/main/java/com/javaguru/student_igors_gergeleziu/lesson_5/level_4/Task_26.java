package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import com.javaguru.student_igors_gergeleziu.lesson_5.level_5_and_6.ArrayUtil;

class Task_26 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthFromUser();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }
}
