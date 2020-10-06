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
         calculatorTest.maxOfTwoNumbers1();
         calculatorTest.maxOfTwoNumbers2();
         calculatorTest.maxOfTwoNumbers3();
         calculatorTest.maxOfThreeNumbers1();
         calculatorTest.maxOfThreeNumbers2();
         calculatorTest.maxOfThreeNumbers3();
         calculatorTest.maxOfThreeNumbers4();
         calculatorTest.maxOfThreeNumbers5();
         calculatorTest.maxOfThreeNumbers6();






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

         public void maxOfTwoNumbers1() {
         int firstNumber = 10;
         int secondNumber = 5;
         if (firstNumber > secondNumber) {
             System.out.println("Max of two numbers (first number) = OK");
         }
         else {
             System.out.println("Max of two numbers (second number) = Fail");
         }
         }
         public void maxOfTwoNumbers2() {
         int firstNumber = 10;
         int secondNumber = 5;
         if (secondNumber > firstNumber) {
             System.out.println("Max of two numbers (second number) = OK");}
         else {
             System.out.println("Max of two numbers (second number) = Fail");}}

             public void maxOfTwoNumbers3() {
                 int firstNumber = 10;
                 int secondNumber = 5;
                 if (firstNumber == secondNumber) {
                     System.out.println("Max of two numbers (first number equal second number) = OK"); }
                 else{
                     System.out.println("Max of two numbers (first number equal second number) = Fail");

                 }
             }
public void maxOfThreeNumbers1() {
         int firstNumber = 10;
         int secondNumber = 5;
         int thirdNumber = 20;
         if (firstNumber > secondNumber & firstNumber > thirdNumber) {
             System.out.println("Max of three numbers (first number) = OK");}
         else {
             System.out.println("Max of three numbers (first number) = Fail");

         }}
    public void maxOfThreeNumbers2() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 20;
        if (secondNumber > firstNumber & secondNumber > thirdNumber) {
            System.out.println("Max of three numbers (second number) = OK");
        } else {
            System.out.println("Max of three numbers (second number) = Fail");

        }}
     public void maxOfThreeNumbers3() {
         int firstNumber = 10;
         int secondNumber = 5;
         int thirdNumber = 20;
         if (thirdNumber > firstNumber & secondNumber < thirdNumber) {
             System.out.println("Max of three numbers (third number) = OK");
         } else {
             System.out.println("Max of three numbers (third number) = Fail");

         }}
     public void maxOfThreeNumbers4() {
         int firstNumber = 10;
         int secondNumber = 10;
         int thirdNumber = 20;
         if (firstNumber == secondNumber & secondNumber > thirdNumber) {
             System.out.println("Max of three numbers (first number equal secondNumber and more than third number) = OK");
         } else {
             System.out.println("Max of three numbers (first number equal secondNumber and more than third number) = Fail");

         }}
     public void maxOfThreeNumbers5() {
         int firstNumber = 10;
         int secondNumber = 20;
         int thirdNumber = 20;
         if (firstNumber < secondNumber & secondNumber == thirdNumber) {
             System.out.println("Max of three numbers (third number equal secondNumber and more than first number) = OK");
         } else {
             System.out.println("Max of three numbers (first number equal secondNumber and more than third number) = Fail");

         }}
     public void maxOfThreeNumbers6() {
         int firstNumber = 20;
         int secondNumber = 20;
         int thirdNumber = 20;
         if (firstNumber == secondNumber & secondNumber == thirdNumber) {
             System.out.println("Max of three numbers (numbers are equal) = OK");
         } else {
             System.out.println("Max of three numbers (numbers are equal) = Fail");

         }}

    }










