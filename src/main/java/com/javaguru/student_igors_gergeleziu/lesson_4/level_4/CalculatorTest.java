package com.javaguru.student_igors_gergeleziu.lesson_4.level_4;

import java.util.concurrent.Callable;

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
    }

    public void additionTest() {
        int firstNumber = 2;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstNumber, secondNumber);
        if (result == 5) System.out.println("Addition test = Success");
        else System.out.println("Addition test = Fail");
    }

    public void subtractionTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 3) System.out.println("Subtraction test = Success");
        else System.out.println("Subtraction test = Fail");
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 25) System.out.println("Multiplication test = Success");
        else System.out.println("Multiplication test = Fail");
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        float result = calculator.division(firstNumber, secondNumber);
        if (result == 5) System.out.println("Division test = Success");
        else System.out.println("Divison test = Fail");
    }

    public void isEvenTest() {
        int evenNumber = 4;
        int oddNumber = 13;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(evenNumber);
        if (result == (evenNumber % 2 == 0)) System.out.println("isEven test = Success");
        else System.out.println("isEven test = Fail");
        boolean result2 = calculator.isEven(oddNumber);
        if (result2 == (oddNumber % 2 == 0)) System.out.println("isEven test = Success");
        else System.out.println("isEven test = Fail");

    }

    public void firstNumberBiggerThanSecondNumberTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result > secondNumber) System.out.println("firstNumberBiggerThanSecondNumberTest= Success");
        else System.out.println("firstNumberBiggerThanSecondNumberTest= Fail");
    }

    public void secondNumberBiggerThanFirstNumberTest() {
        int firstNumber = 1;
        int secondNumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result > firstNumber) System.out.println("secondNumberBiggerThanFirstNumberTest= Success");
        else System.out.println("secondNumberBiggerThanFirstNumberTest= Fail");
    }

    public void firstNumberAndSecondNumberAreEqualTest() {
        int firstNumber = 6;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 0) System.out.println("firstNumberAndSecondNumberAreEqualTest= Success");
        else System.out.println("firstNumberAndSecondNumberAreEqualTest= Fail");
    }
}
