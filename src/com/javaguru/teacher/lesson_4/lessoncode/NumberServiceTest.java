package com.javaguru.teacher.lesson_4.lessoncode;

class NumberServiceTest {

    /*
        Test 1:
        input - 0 0 входные данные
        output - 0 ожидаемый результат

        Test 2:
        input - -3 10
        output - 10

        Test 3:
        input - 9 1
        output - 9
         */

    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    void test1() {
        NumberService service = new NumberService();
        int actualResult = service.findMaxNumber(0, 0);
        int expectedResult = 0;

        if (expectedResult == actualResult) {
            System.out.println("Test 1: SUCCESS");
        } else {
            System.out.println("Test 1: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void test2() {
        NumberService service = new NumberService();
        int actualResult = service.findMaxNumber(-3, 10);
        int expectedResult = 10;

        if (expectedResult == actualResult) {
            System.out.println("Test 2: SUCCESS");
        } else {
            System.out.println("Test 2: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void test3() {
        NumberService service = new NumberService();
        int actualResult = service.findMaxNumber(9, 1);
        int expectedResult = 9;

        if (expectedResult == actualResult) {
            System.out.println("Test 3: SUCCESS");
        } else {
            System.out.println("Test 3: FAILURE, expected: " + expectedResult + ", but actual: " + actualResult);
        }
    }

}
