package com.javaguru.student_igors_gergeleziu.lesson_4.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.concurrent.Callable;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstNumberBiggerThanSecondNumberTest();
        calculatorTest.secondNumberBiggerThanFirstNumberTest();
        calculatorTest.firstNumberAndSecondNumberAreEqualTest();

        calculatorTest.firstNumberBiggerThanSecondAndThirdNumbersTest();
        calculatorTest.secondNumberBiggerThanFirstAndThirdNumbersTest();
        calculatorTest.thirdNumberBiggerThanFirstAndSecondNumbersTest();
        calculatorTest.firstAndSecondNumbersAreEqualAndBiggerThanThirdNumberTest();
        calculatorTest.firstAndThirdNumbersAreEqualAndBiggerThanSecondNumberTest();
        calculatorTest.secondAndThirdNumbersAreEqualAndBiggerThanFirstNumberTest();
        calculatorTest.allThreeNumbersAreEqualTest();
    }

    public void additionTest() {
        int firstNumber = 2;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstNumber, secondNumber);
        checkResults(result == 5, "additionTest");
    }

    public void subtractionTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        checkResults(result == 3, "subtractionTest");
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        checkResults(result == 25, "multiplicationTest");
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        float result = calculator.division(firstNumber, secondNumber);
        checkResults(result == 5, "divisionTest");
    }

    public void isEvenTest() {
        int evenNumber = 4;
        int oddNumber = 13;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(evenNumber);
        checkResults(result == (evenNumber % 2 == 0), "isEvenTest");
        boolean result2 = calculator.isEven(oddNumber);
        checkResults(result2 == (oddNumber % 2 == 0), "isEvenTest");
    }

    public void firstNumberBiggerThanSecondNumberTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResults(result > secondNumber, "firstNumberBiggerThanSecondNumberTest");
    }

    public void secondNumberBiggerThanFirstNumberTest() {
        int firstNumber = 1;
        int secondNumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResults(result > firstNumber, "secondNumberBiggerThanFirstNumberTest");
    }

    public void firstNumberAndSecondNumberAreEqualTest() {
        int firstNumber = 6;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResults(result == 0, "firstNumberAndSecondNumberAreEqualTest");
    }

    public void firstNumberBiggerThanSecondAndThirdNumbersTest() {
        int firstNumber = 13;
        int secondNumber = 6;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(result > secondNumber && result > thirdNumber, "firstNumberBiggerThanSecondAndThirdNumbersTest");
    }

    public void secondNumberBiggerThanFirstAndThirdNumbersTest() {
        int firstNumber = 2;
        int secondNumber = 7;
        int thirdNumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(result > firstNumber && result > thirdNumber, "secondNumberBiggerThanFirstAndThirdNumbersTest");
    }

    public void thirdNumberBiggerThanFirstAndSecondNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber = 9;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(result > firstNumber && result > secondNumber, "thirdNumberBiggerThanFirstAndSecondNumbersTest");
    }

    public void firstAndSecondNumbersAreEqualAndBiggerThanThirdNumberTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(result == firstNumber && result == secondNumber && result > thirdNumber, "firstAndSecondNumbersAreEqualAndBiggerThanThirdNumberTest");
    }

    public void firstAndThirdNumbersAreEqualAndBiggerThanSecondNumberTest() {
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(result == firstNumber && result == thirdNumber && result > secondNumber, "firstAndThirdNumbersAreEqualAndBiggerThanSecondNumberTest");
    }

    public void secondAndThirdNumbersAreEqualAndBiggerThanFirstNumberTest() {
        int firstNumber = 3;
        int secondNumber = 8;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(result == secondNumber && result == thirdNumber && result > firstNumber, "secondAndThirdNumbersAreEqualAndBiggerThanFirstNumberTest");
    }

    public void allThreeNumbersAreEqualTest() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResults(firstNumber == secondNumber && secondNumber == thirdNumber && result == 0, "allThreeNumbersAreEqualTest");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + " = Fail");
        }
    }


}
