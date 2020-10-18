package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_5_middle;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        System.out.println("---------------------------");
        arrayUtilTest.shouldFindMaxNumber();
        System.out.println("---------------------------");
        arrayUtilTest.shouldFindMinNumber();
        System.out.println("---------------------------");
        arrayUtilTest.shouldFillArrayWithRandomNumbers();
    }

    /*
    В этом классе напишите автоматический тест
    метода int[] createArray(int arrayLength)
    из предыдущего задания.
     */
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(5);
        int[] expectResult = new int[5];
        testResult(expectResult.length, actualResult.length, "shouldCreateArray");
    }

    /*
    В классе ArrayUtilTest напишите автоматический тест
    метода void fillArrayWithRandomNumbers(int[] array)
     */
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayLength = arrayUtil.createArray(5);
        int actualResult = arrayUtil.fillArrayWithRandomNumbers(arrayLength);
        int expectResult = 0;
        testResult(expectResult, actualResult, "shouldFillArrayWithRandomNumbers");
    }

    /*
    В классе ArrayUtilTest напишите автоматический тест
    для метода int findMaxNumber(int[] array)
    */
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 5, 60, 10, 40};
        int actualResult = arrayUtil.findMaxNumber(arrayNumber);
        int expectResult = 60;
        testResult(expectResult, actualResult, "shouldFindMaxNumber");
    }

    /*
    В классе ArrayUtilTest напишите автоматический тест
    для метода int findMinNumber(int[] array)
     */
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 5, 60, 10, 40};
        int actualResult = arrayUtil.findMinNumber(arrayNumber);
        int expectResult = 1;
        testResult(expectResult, actualResult, "shouldFindMinNumber");
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