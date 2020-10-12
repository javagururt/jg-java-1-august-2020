package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_3_junior;


public class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldFindNumber();
        System.out.println("--------------------");
        arrayUtilTest.shouldRepeatingNumbers();
        System.out.println("--------------------");
        arrayUtilTest.shouldReplaceFirst();
        System.out.println("--------------------");
        arrayUtilTest.shouldReplaceAll();
        System.out.println("--------------------");
        arrayUtilTest.shouldFlippingAll();
        System.out.println("--------------------");
        arrayUtilTest.shouldSortAll();
        System.out.println("--------------------");


    }


    public void shouldFindNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int searchNumber = 13;
        int actualResult = arrayUtil.Contain(arrayNumber, searchNumber);
        int expectResult = 13;
        testResult(expectResult, actualResult, "shouldFindNumber");

    }

    public void shouldRepeatingNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 2, 3, 5, 8, 13, 21, 34, 55, 5, 89, 144, 5};
        int searchNumber = 5;
        int actualResult = arrayUtil.Repeating(arrayNumber, searchNumber);
        int expectResult = 3;
        testResult(expectResult, actualResult, "shouldRepeatingNumbers");
    }

    public void shouldReplaceFirst() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int numberToReplace = 1;
        int newNumber = 10;
        int actualResult = arrayUtil.replaceFirst(arrayNumber, numberToReplace, newNumber);
        int expectResult = 0;
        testResult(expectResult, actualResult, "shouldReplaceFirst");
    }

    public void shouldReplaceAll() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int numberReplace = 5;
        int newNumber = 25;
        int actualResult = arrayUtil.replaceAll(arrayNumber, numberReplace, newNumber);
        int expectResult = 3;
        testResult(expectResult, actualResult, "shouldReplaceAll");
    }

    public void shouldFlippingAll() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int actualResult = arrayUtil.flippingAll(arrayNumber);
        int expectResult = 0;
        testResult(expectResult, actualResult, "shouldFlippingAll");
    }

    public void shouldSortAll() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {13, 21, 144, 34, 55, 89, 1, 2, 3, 5, 8,};
        int actualResult = arrayUtil.sortAll(arrayNumber);
        int expectResult = 0;
        testResult(expectResult, actualResult, "shouldSortAll");
    }


    private void testResult(int expectResult, int actualResult, String testName) {
        if (actualResult == expectResult) {
            System.out.println(testName + ": SUCCESS " + " " + actualResult + " | " + expectResult);
        } else {
            System.out.println(testName + ": FAILURE " + "Expected result: " + expectResult
                    + " but Actual result: " + actualResult);
        }
    }


}














