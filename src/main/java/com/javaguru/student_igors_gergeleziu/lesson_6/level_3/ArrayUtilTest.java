package com.javaguru.student_igors_gergeleziu.lesson_6.level_3;

class ArrayUtilTest {
    private final ArrayUtil arrayUtil = new ArrayUtil();
    private final int[] array = arrayUtil.newArrayWithRandomLength();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.arrayContainsNumber5Test();
        test.arrayDoNotContainNumber11Test();
        test.arrayContains10Numbers5Test();
        test.replaceNumber3InArrayToNumber6Test();
        test.replaceAllNumbersInArrayTest();
        test.reverseArrayTest();
        test.sortArrayTest();
    }

    public void shouldCreateArrayWithRandomLength() {
        arrayUtil.createArray(array.length);
    }

    public void shouldCreateArrayWithLengthFromUser() {
        arrayUtil.createArray(arrayUtil.getArrayLengthFromUser());
    }

    public void shouldFillArrayWithNumbersFromUser() {
        arrayUtil.fillArray(array);
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

    public void arrayContainsNumber5Test() {
        int[] arrayTest = arrayUtil.newArrayOfIntegerNumbersFrom0To10();
        boolean result = arrayUtil.arrayContainsNumber(arrayTest, 5);
        arrayUtil.checkResults(result, "arrayContainsNumber5Test");
    }

    public void arrayDoNotContainNumber11Test() {
        int[] arrayTest = arrayUtil.newArrayOfIntegerNumbersFrom0To10();
        boolean result = arrayUtil.arrayContainsNumber(arrayTest, 11);
        arrayUtil.checkResults(!result, "arrayDoNotContainNumber11Test");
    }

    public void arrayContains10Numbers5Test() {
        int[] arrayTest = arrayUtil.newArrayOfIntegerNumbersFromUser(5);
        int result = arrayUtil.arrayContainsNumberCount(arrayTest, 5);
        arrayUtil.checkResults(result == 10, "arrayContains10Numbers5Test");
    }

    public void replaceNumber3InArrayToNumber6Test() {
        int[] arrayTest = arrayUtil.newArrayOfIntegerNumbersFrom0To10();
        arrayUtil.replaceFirst(arrayTest, 3, 6);
        boolean result = arrayUtil.arrayContainsNumber(arrayTest, 3);
        arrayUtil.checkResults(!result, "replaceNumber3InArrayToNumber6Test");
    }

    public void replaceAllNumbersInArrayTest() {
        int[] arrayTest = arrayUtil.newArrayOfIntegerNumbersFromUser(3);
        arrayUtil.replaceAll(arrayTest, 3, 7);
        int result = arrayUtil.arrayContainsNumberCount(arrayTest, 7);
        arrayUtil.checkResults(result == 10, "replaceAllNumbersInArrayTest");
    }

    public void reverseArrayTest() {
        int[] arrayTest = arrayUtil.newArrayOfIntegerNumbersFrom0To10();
        arrayUtil.reverseArray(arrayTest);
        int result = arrayUtil.returnIndexOfNumberInArray(arrayTest, 10);
        arrayUtil.checkResults(result == 0, "reverseArrayTest");
    }

    public void sortArrayTest() {
        int[] arrayTest = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(arrayTest);
        arrayUtil.sortArray(arrayTest);
        boolean result = arrayUtil.arraysCorrectSortCheck(arrayTest);
        arrayUtil.checkResults(result, "sortArrayTest");
    }
}
