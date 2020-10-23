package com.javaguru.student_igors_gergeleziu.lesson_5.level_5_and_6;

class ArrayUtilTest {
    private final int arrayLength = 10;
    private final ArrayUtil arrayUtil = new ArrayUtil();
    private final int[] array = arrayUtil.createArray(arrayLength);

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldPrintArrayToConsole();
        test.shouldFindMaxValue();
        test.shouldFindMinValue();
    }

    public void shouldCreateArray() {
        arrayUtil.createArray(arrayLength);
    }

    public void shouldFillArrayWithRandomNumbers() {
        arrayUtil.fillArrayWithRandomNumbers(array);
    }

    public void shouldPrintArrayToConsole() {
        arrayUtil.printArrayToConsole(array);
    }

    public void shouldFindMaxValue() {
        System.out.println("Max value of array = " + arrayUtil.findMaxNumber(array));
    }

    public void shouldFindMinValue() {
        System.out.println("Min value of array = " + arrayUtil.findMinNumber(array));
    }

}
