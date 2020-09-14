package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_4_junior;


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEven(10);
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfTwoNumbers1();
        calculatorTest.maxOfTwoNumbers2();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
    }


    public void additionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Addition test = OK");
        } else {
            System.out.println("Addition test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Your number is Even: ");
        } else {
            System.out.println("Your number is odd: ");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        if (firstNumber > secondNumber) {
            System.out.println("Max of two numbers : SUCCESS");
        } else {
            System.out.println("Max of two numbers : FAILURE");
        }
    }

    public void maxOfTwoNumbers1() {
        int firstNumber = 10;
        int secondNumber = 5;
        if (secondNumber > firstNumber) {
            System.out.println("Max of two numbers 1: SUCCESS");
        } else {
            System.out.println("Max of two numbers 1: FAILURE");
        }

    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 10;
        int secondNumber = 5;
        if (firstNumber == secondNumber) {
            System.out.println("Max of two numbers 2: SUCCESS");
        } else {
            System.out.println("Max of two numbers 2: FAILURE");
        }

    }

    public void maxOfThreeNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        if (firstNumber > secondNumber & firstNumber > thirdNumber) {
            System.out.println("Max of three numbers : SUCCESS");
        } else {
            System.out.println("Max of three numbers : FAILURE");
        }

    }

    public void maxOfThreeNumbers1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        if (secondNumber > firstNumber & secondNumber > thirdNumber) {
            System.out.println("Max of three numbers 1: SUCCESS");
        } else {
            System.out.println("Max of three numbers 1: FAILURE");
        }

    }

    public void maxOfThreeNumbers2() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        if (thirdNumber > firstNumber & thirdNumber > secondNumber) {
            System.out.println("Max of three numbers 2: SUCCESS");
        } else {
            System.out.println("Max of three numbers 2: FAILURE");
        }

    }

    public void maxOfThreeNumbers3() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        if (firstNumber == secondNumber & firstNumber > thirdNumber) {
            System.out.println("Max of three numbers 3: SUCCESS");
        } else {
            System.out.println("Max of three numbers 3: FAILURE");
        }

    }

    public void maxOfThreeNumbers4() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        if (secondNumber == firstNumber & secondNumber > thirdNumber) {
            System.out.println("Max of three numbers 4: SUCCESS");
        } else {
            System.out.println("Max of three numbers 4: FAILURE");
        }

    }

    public void maxOfThreeNumbers5() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
        if (thirdNumber == firstNumber & thirdNumber > secondNumber) {
            System.out.println("Max of three numbers 5: SUCCESS");
        } else {
            System.out.println("Max of three numbers 5: FAILURE");
        }

    }

    public void maxOfThreeNumbers6() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        if (firstNumber == secondNumber & firstNumber == thirdNumber) {
            System.out.println("Max of three numbers 6: SUCCESS");
        } else {
            System.out.println("Max of three numbers 6: FAILURE");
        }

    }

}




