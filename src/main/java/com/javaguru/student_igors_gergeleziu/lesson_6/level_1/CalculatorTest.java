package com.javaguru.student_igors_gergeleziu.lesson_6.level_1;

class CalculatorTest {
    private Calculator calculator = new Calculator();


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.number4IsEvenTest();
        calculatorTest.number1IsNotEvenTest();
        calculatorTest.number4isEvenTest_2();
        calculatorTest.number1IsNotEvenTest_2();

    }

    public void number4IsEvenTest() {
        boolean result = calculator.isEven(4);
        checkResults(result, "number4IsEvenTest");
    }

    public void number1IsNotEvenTest() {
        boolean result = calculator.isEven(1);
        checkResults(!result, "number1IsNotEvenTest");
    }

    public void number4isEvenTest_2() {
        boolean result = calculator.isEvenRemastered(4);
        checkResults(result, "number4IsEvenTest_2");
    }

    public void number1IsNotEvenTest_2() {
        boolean result = calculator.isEvenRemastered(1);
        checkResults(!result, "number1IsNotEvenTest_2");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
