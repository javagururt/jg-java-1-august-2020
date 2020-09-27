package com.javaguru.teacher.lesson_6.lessoncode;

class ArrayUtilsTest {

    public static void main(String[] args) {
        ArrayUtilsTest runner = new ArrayUtilsTest();
        runner.shouldReturnSum20();
    }

    void shouldReturnSum20() {
        int[] array = {3, 7, 1, 8, 1};
        int expected = 20;
        int actual = ArrayUtils.sumElements(array);
        assertResult(expected, actual, "shouldReturnSum20");
    }

    private void assertResult(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED. Expected: " + expected + ", actual: " + actual);
        }
    }
}
