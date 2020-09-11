package com.javaguru.student_igors_jurkovs.lesson_5.level_7_senior;

class Task_30 {

    public static void main(String[] args) {
        int length = 5;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(length);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.findOddNumbers(array);
    }
}
