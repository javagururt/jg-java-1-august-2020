package com.javaguru.student_Dmitry_Grishin.Lesson_5.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        System.out.println("---------------------------");
        arrayUtilTest.shouldFindMaxNumber();
        System.out.println("---------------------------");
        arrayUtilTest.shouldFindMinNumber();
        System.out.println("---------------------------");
    }

    /*
    В этом классе напишите автоматический тест
    метода int[] createArray(int arrayLength)
    из предыдущего задания.
     */
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(7);
        int[] expectResult = new int[7];
        testResult(expectResult.length, actualResult.length, "shouldCreateArray");
    }

    /*
    В классе ArrayUtilTest напишите автоматический тест
    метода void fillArrayWithRandomNumbers(int[] array)
     */

    /*
    В классе ArrayUtilTest напишите автоматический тест
    для метода int findMaxNumber(int[] array)
    */
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {1, 120, 60, 10, 40, 70, 100};
        int actualResult = arrayUtil.findMaxNumber(arrayNumber);
        int expectResult = 120;
        testResult(expectResult, actualResult, "shouldFindMaxNumber");
    }

    /*
    В классе ArrayUtilTest напишите автоматический тест
    для метода int findMinNumber(int[] array)
     */
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = {8, 5, 60, 10, 40, 30, 55};
        int actualResult = arrayUtil.findMinNumber(arrayNumber);
        int expectResult = 5;
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