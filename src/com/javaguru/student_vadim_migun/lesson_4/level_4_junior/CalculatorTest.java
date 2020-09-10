package com.javaguru.student_vadim_migun.lesson_4.level_4_junior;

/*
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Подсказка:

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
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

}
 */

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }
    public void isEvenTest1(){
        int number = 4;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result == true){
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = Fail");
        }
    }
    public void isEvenTest2(){
        int number = 3;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result == true){
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = Fail");
        }
    }


}
