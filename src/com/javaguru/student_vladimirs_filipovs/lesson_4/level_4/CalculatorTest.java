package com.javaguru.student_vladimirs_filipovs.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.sumTest();
        testRunner.deductTest();
        testRunner.multilpyTest();
        testRunner.divideTest();
        testRunner.isEvenTest();
        testRunner.maxDfTwoNumbersTest1();
        testRunner.maxDfTwoNumbersTest2();
        testRunner.maxDfTwoNumbersTest3();
        testRunner.maxDfThirdNumbersTest1();
        testRunner.maxDfThirdNumbersTest2();
        testRunner.maxDfThirdNumbersTest3();
        testRunner.maxDfThirdNumbersTest4();
        testRunner.maxDfThirdNumbersTest5();
        testRunner.maxDfThirdNumbersTest6();
        testRunner.maxDfThirdNumbersTest7();
    }

    void sumTest() {
        Calculator calc = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        int result = calc.sum(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("sumTest: LABI");
        } else {
            System.out.println("sumTest: FAIL");
        }
    }

    void deductTest() {
        Calculator calc = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int result = calc.deduct(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("deductTest: LABI");
        } else {
            System.out.println("deductTest: FAIL");
        }
    }

    void multilpyTest() {
        Calculator calc = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        int result = calc.multiply(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("multilpyTest: LABI");
        } else {
            System.out.println("multilpyTest: FAIL");
        }
    }

    void divideTest() {
        Calculator calc = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        int result = calc.divide(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("divideTest: LABI");
        } else {
            System.out.println("divideTest: FAIL");
        }
    }

    void isEvenTest() {
        Calculator calc = new Calculator();
        int number = 22;
        boolean expectedResult = true;
        boolean result = calc.isEven(number);
        if (result == expectedResult) {
            System.out.println("isEvenTest: LABI");
        } else {
            System.out.println("isEvenTest: FAIL");
        }
    }

    void maxDfTwoNumbersTest1() {
        Calculator calc = new Calculator();
        int firstNumber = 666;
        int secondNumber = 13;
        int expectedResult = 666;
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("maxDfTwoNumbersTest1 first number max: LABI");
        } else {
            System.out.println("maxDfTwoNumbersTest1 first number max: FAIL");
        }
    }

    void maxDfTwoNumbersTest2() {
        Calculator calc = new Calculator();
        int firstNumber = 13;
        int secondNumber = 666;
        int expectedResult = 666;
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("maxDfTwoNumbersTest2 second number max: LABI");
        } else {
            System.out.println("maxDfTwoNumbersTest2 second number max: FAIL");
        }
    }

    void maxDfTwoNumbersTest3() {
        Calculator calc = new Calculator();
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = 7;
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == expectedResult) {
            System.out.println("maxDfTwoNumbersTest3 numbers are equal: LABI");
        } else {
            System.out.println("maxDfTwoNumbersTest3 numbers are equal: FAIL");
        }
    }

    // 221 - 212 - 122 - 211 - 121 - 112 - 222

    void maxDfThirdNumbersTest1() {
        Calculator calc = new Calculator();
        int firstNumber = 666;
        int secondNumber = 666;
        int thirdNumber = 13;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest1 first & second numbers max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest1 first & second numbers max: FAIL");
        }
    }

    void maxDfThirdNumbersTest2() {
        Calculator calc = new Calculator();
        int firstNumber = 666;
        int secondNumber = 13;
        int thirdNumber = 666;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest2 first & third numbers max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest2 first & third numbers max: FAIL");
        }
    }

    void maxDfThirdNumbersTest3() {
        Calculator calc = new Calculator();
        int firstNumber = 13;
        int secondNumber = 666;
        int thirdNumber = 666;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest3 second & third numbers max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest3 second & third numbers max: FAIL");
        }
    }

    void maxDfThirdNumbersTest4() {
        Calculator calc = new Calculator();
        int firstNumber = 666;
        int secondNumber = 7;
        int thirdNumber = 13;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest4 first number max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest4 first number max: FAIL");
        }
    }

    void maxDfThirdNumbersTest5() {
        Calculator calc = new Calculator();
        int firstNumber = 7;
        int secondNumber = 666;
        int thirdNumber = 13;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest5 second number max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest5 second number max: FAIL");
        }
    }

    void maxDfThirdNumbersTest6() {
        Calculator calc = new Calculator();
        int firstNumber = 7;
        int secondNumber = 13;
        int thirdNumber = 666;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest6 third number max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest6 third number max: FAIL");
        }
    }

    void maxDfThirdNumbersTest7() {
        Calculator calc = new Calculator();
        int firstNumber = 666;
        int secondNumber = 666;
        int thirdNumber = 666;
        int expectedResult = 666;
        int result = calc.maxOfThirdNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == expectedResult) {
            System.out.println("maxDfThirdNumbersTest7 all numbers max: LABI");
        } else {
            System.out.println("maxDfThirdNumbersTest7 all numbers max: FAIL");
        }
    }
}
