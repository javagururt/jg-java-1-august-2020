package com.javaguru.student_roman_tasilov.lesson_4.level_4;
/*Создайте класс CalculatorTest и напишите тесты для
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

}*/


 class CalculatorTest {
     public static void main(String [] args) {
         CalculatorTest calculatorTest = new CalculatorTest();
         calculatorTest.sumTest();
         calculatorTest.subtractionTest();
         calculatorTest.divisionTest();
         calculatorTest.multiplicationTest();
         calculatorTest.isEven();
         calculatorTest.greatestOfTwoNumbers();


     }
         public void sumTest() {
         int firstNumber = 10;
         int secondNumber = 5;
         Calculator calculator = new Calculator();
         int result = calculator.sum(firstNumber,secondNumber);
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
                System.out.println("Substaction test = OK");
            } else {
                System.out.println("Substraction test = FAIL");
            }
        }
     public void divisionTest() {

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
     public void multiplicationTest() {

         int firstNumber = 10;
         int secondNumber = 5;
         Calculator calculator = new Calculator();
         int result = calculator.multiplication(firstNumber, secondNumber);
         if (result == 50) {
             System.out.println("Multiplication test = OK");
         } else {
             System.out.println("Multiplication test = FAIL");
         }
     }
     public void isEven() {
         int number = 5;
         if (number % 2 == 0) {
             System.out.println("Number is event"); }
         else {
             System.out.println("Number isn't even"); }

         }

         public void greatestOfTwoNumbers() {
         int firstNumber = 10;
         int secondNumber = 5;
         if (firstNumber > secondNumber) {
             System.out.println("Greatest of two numbers = OK");
         }
         }

     }





