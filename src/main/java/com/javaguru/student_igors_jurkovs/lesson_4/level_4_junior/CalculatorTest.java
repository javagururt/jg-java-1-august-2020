package com.javaguru.student_igors_jurkovs.lesson_4.level_4_junior;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
    }

    void sumTest() {
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

    void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    void multiplyTest() {
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

    void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void isEvenTest1() {
        int number = 6;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test(even number) = OK");
        } else {
            System.out.println("IsEven test(even number) = FAIL");
        }
    }

    void isEvenTest2() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (!result) {
            System.out.println("IsEven test(odd number) = OK");
        } else {
            System.out.println("IsEven test(odd number) = FAIL");
        }
    }

    void maxOfTwoNumbersTest1() {
        int firstNumber = 6;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 6) {
            System.out.println("Max of two numbers test(first number is greater) = OK");
        } else {
            System.out.println("Max of two numbers test(first number is greater) = FAIL");
        }
    }

    void maxOfTwoNumbersTest2() {
        int firstNumber = 6;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Max of two numbers test(second number is greater) = OK");
        } else {
            System.out.println("Max of two numbers test(second number is greater) = FAIL");
        }
    }

    void maxOfTwoNumbersTest3() {
        int firstNumber = 6;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 6) {
            System.out.println("Max of two numbers test(numbers are equal) = OK");
        } else {
            System.out.println("Max of two numbers test(numbers are equal) = FAIL");
        }
    }

    void maxOfThreeNumbersTest1() { // первое число больше второго и третьего
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(first number greater then 2 and 3 numbers) = OK");
        } else {
            System.out.println("Max of three numbers test(first number greater then 2 and 3 numbers) = FAIL");
        }
    }

    void maxOfThreeNumbersTest2() { // второе число больше первого и третьего
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(second number greater then 1 and 3 numbers) = OK");
        } else {
            System.out.println("Max of three numbers test(second number greater then 1 and 3 numbers) = FAIL");
        }
    }

    void maxOfThreeNumbersTest3() { // третье число больше первого и второго
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(third number greater then 1 and 2 numbers) = OK");
        } else {
            System.out.println("Max of three numbers test(third number greater then 1 and 2 numbers) = FAIL");
        }
    }

    void maxOfThreeNumbersTest4() { //первые два равны и больше третьего
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(1 and 2 numbers are equals and greater than 3 number) = OK");
        } else {
            System.out.println("Max of three numbers test(1 and 2 numbers are equals and greater than 3 number) = FAIL");
        }
    }

    void maxOfThreeNumbersTest5() { // второе и третье число равно и больше первого
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(2 and 3 numbers are equals and greater than 1 number) = OK");
        } else {
            System.out.println("Max of three numbers test(2 and 3 numbers are equals and greater than 1 number) = FAIL");
        }
    }

    void maxOfThreeNumbersTest6() { // первое и треть число равны и больше второго
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(1 and 3 numbers are equals and greater than 2 number) = OK");
        } else {
            System.out.println("Max of three numbers test(1 and 3 numbers are equals and greater than 2 number) = FAIL");
        }
    }

    void maxOfThreeNumbersTest7() { // три числа равны
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 3) {
            System.out.println("Max of three numbers test(all numbers are equal) = OK");
        } else {
            System.out.println("Max of three numbers test(all numbers are equal) = FAIL");
        }
    }

}
