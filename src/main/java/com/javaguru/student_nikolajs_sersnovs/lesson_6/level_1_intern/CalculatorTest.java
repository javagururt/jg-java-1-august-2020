package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_1_intern;

import java.sql.SQLOutput;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEven();
    }

    public void isEven() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.isEven(8));
    }


}




