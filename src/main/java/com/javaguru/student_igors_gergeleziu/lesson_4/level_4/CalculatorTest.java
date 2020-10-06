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
    public void firstNumberBiggerThanSecondAndThirdNumbersTest() {
        int firstNumber = 13;
        int secondNumber = 6;
        int thirdNumber=5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result>secondNumber && result>thirdNumber) System.out.println("firstNumberBiggerThanSecondAndThirdNumbersTest= Success");
        else System.out.println("firstNumberBiggerThanSecondAndThirdNumbersTest= Fail");
    }
    public void secondNumberBiggerThanFirstAndThirdNumbersTest() {
        int firstNumber = 2;
        int secondNumber = 7;
        int thirdNumber=4;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result>firstNumber && result>thirdNumber) System.out.println("secondNumberBiggerThanFirstAndThirdNumbersTest= Success");
        else System.out.println("secondNumberBiggerThanFirstAndThirdNumbersTest= Fail");
    }
    public void thirdNumberBiggerThanFirstAndSecondNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber=9;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result>firstNumber && result>secondNumber) System.out.println("thirdNumberBiggerThanFirstAndSecondNumbersTest= Success");
        else System.out.println("thirdNumberBiggerThanFirstAndSecondNumbersTest= Fail");
    }
    public void firstAndSecondNumbersAreEqualAndBiggerThanThirdNumberTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber=2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result==firstNumber && result==secondNumber&& result>thirdNumber) System.out.println("firstAndSecondNumbersAreEqualAndBiggerThanThirdNumberTest= Success");
        else System.out.println("firstAndSecondNumbersAreEqualAndBiggerThanThirdNumberTest= Fail");
    }
    public void firstAndThirdNumbersAreEqualAndBiggerThanSecondNumberTest() {
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber=7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result==firstNumber && result==thirdNumber && result>secondNumber) System.out.println("firstAndThirdNumbersAreEqualAndBiggerThanSecondNumberTest= Success");
        else System.out.println("firstAndThirdNumbersAreEqualAndBiggerThanSecondNumberTest= Fail");
    }
    public void secondAndThirdNumbersAreEqualAndBiggerThanFirstNumberTest() {
        int firstNumber = 3;
        int secondNumber = 8;
        int thirdNumber=8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result==secondNumber && result==thirdNumber && result>firstNumber) System.out.println("secondAndThirdNumbersAreEqualAndBiggerThanFirstNumberTest= Success");
        else System.out.println("secondAndThirdNumbersAreEqualAndBiggerThanFirstNumberTest= Fail");
    }
    public void allThreeNumbersAreEqualTest() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber=6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (firstNumber==secondNumber && secondNumber==thirdNumber && result==0) System.out.println("allThreeNumbersAreEqualTest= Success");
        else System.out.println("allThreeNumbersAreEqualTest= Fail");
    }


}
