package com.javaguru.student_sergey_kazyanin.lesson_4.lessoncode;

class NumberServiceTest {

    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void test1() {
        NumberService service = new NumberService();
        int actualResult = service.findMaxNumber(0, 0);
        int expectedResult = 0;

        if (actualResult == expectedResult) {
            System.out.println("test 1: SUCCESS");
        } else {
            System.out.println("test 1: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
    public void test2() {
        NumberService service = new NumberService();
        int actualResult = service.findMaxNumber(-3, 10);
        int expectedResult = 10;

        if (actualResult == expectedResult) {
            System.out.println("test 2: SUCCESS");
        } else {
            System.out.println("test 2: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    public void test3() {
        NumberService service = new NumberService();
        int actualResult = service.findMaxNumber(9, 1);
        int expectedResult = 9;

        if (actualResult == expectedResult) {
            System.out.println("test 3: SUCCESS");
        } else {
            System.out.println("test 3: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

}
