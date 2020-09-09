package com.javaguru.student_igors_jurkovs.lesson_4.level_7_senior;

class Calculator {
    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
    void test(int expectedResult, int result, String action) {
        if (result == expectedResult) {
            System.out.println(action + " test = OK");
        } else {
            System.out.println(action + "test = FAIL");
        }
    }
    void evenTest(boolean expectedResult, boolean result) {
        if (expectedResult == result) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }
}


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(35,40, 75);
        calculatorTest.subTest(35,15,20);
        calculatorTest.mulTest(5,5,25);
        calculatorTest.divTest(40,8,5);
        calculatorTest.isEvenTest1(40, true);
        calculatorTest.isEvenTest2(41,false);
    }
/*
Старался убрать количество строчек по максимуму, поэтому сделал ввод данных в мейне. Мне кажется что удобнее
менять значения в одном месте.
 */
    void sumTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        calculator.test(expectedResult, result, "Sum");
    }

    void subTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        calculator.test(expectedResult, result, "Subtraction");
    }

    void mulTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        calculator.test(expectedResult, result, "Multiply");
    }

    void divTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        calculator.test(expectedResult, result, "Division");
    }

    void isEvenTest1(int number, boolean expectedResult) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        calculator.evenTest(expectedResult, result);
    }

    void isEvenTest2(int number, boolean expectedResult) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        calculator.evenTest(expectedResult, result);
    }
}
