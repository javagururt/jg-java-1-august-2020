package com.javaguru.student_vladimir_larin.lesson_4.level_4_junior;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstNumberMoreThanSecondNumber();
        calculatorTest.firstNumberLessThanSecondNumber();
        calculatorTest.firstNumberEqualsSecondNumber();
        calculatorTest.firstNumberMoreThanOtherNumbers();
        calculatorTest.secondNumberMoreThanOtherNumbers();
        calculatorTest.thirdNumberMoreThanOtherNumbers();
        calculatorTest.firstAndSecondEqualsMoreThanThirdNumber();
        calculatorTest.firstAndThirdEqualsMoreThanSecondNumber();
        calculatorTest.secondAndThirdEqualsMoreThanFirstNumber();
        calculatorTest.allNumbersAreEqual();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.divide(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 11;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Is even test = OK (even)");
        } else {
            System.out.println("Is even test = OK (not even)");
        }
    }

    public void firstNumberMoreThanSecondNumber() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfTwoNumbers test1 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test1 = FAIL");
        }
    }

    public void firstNumberLessThanSecondNumber() {
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfTwoNumbers test2 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test2 = FAIL");
        }
    }

    public void firstNumberEqualsSecondNumber() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfTwoNumbers test3 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test3 = FAIL");
        }
    }

    public void firstNumberMoreThanOtherNumbers() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbers test1 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test1 = FAIL");
        }
    }

    public void secondNumberMoreThanOtherNumbers() {
        int firstNumber = 3;
        int secondNumber = 4;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfThreeNumbers test2 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test2 = FAIL");
        }
    }

    public void thirdNumberMoreThanOtherNumbers() {
        int firstNumber = 3;
        int secondNumber = 4;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("MaxOfThreeNumbers test3 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test3 = FAIL");
        }
    }

    public void firstAndSecondEqualsMoreThanThirdNumber() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbers test4 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test4 = FAIL");
        }
    }


    public void firstAndThirdEqualsMoreThanSecondNumber() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbers test5 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test5 = FAIL");
        }
    }
    public void secondAndThirdEqualsMoreThanFirstNumber() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfThreeNumbers test6 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test6 = FAIL");
        }
    }

    public void allNumbersAreEqual() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbers test7 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test7 = FAIL");
        }
    }
}