package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "тесты написаны некорректно. Тесты не проверяют методы в калькуляторе, а лишь отдельную логику (написанную в тесте)")
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        System.out.println();
        calculatorTest.isEven();
        System.out.println();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfTwoNumbers1();
        calculatorTest.maxOfTwoNumbers2();
        System.out.println();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
    }


    public void additionTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.addition(10, 5);
        int expectResult = 15;
        if (expectResult == actualResult) {
            System.out.println("Addition test = SUCCESS");
        } else {
            System.out.println("Addition test = FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }
    }

    public void subtractionTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtraction(10, 5);
        int expectResult = 5;
        if (expectResult == actualResult) {
            System.out.println("Subtraction test = SUCCESS");
        } else {
            System.out.println("Subtraction test = FAILURE" + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }
    }

    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(10, 5);
        int expectResult = 50;
        if (expectResult == actualResult) {
            System.out.println("Multiplication test = SUCCESS");
        } else {
            System.out.println("Multiplication test = FAILURE" + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }
    }

    public void divisionTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.division(10, 5);
        int expectResult = 2;
        if (expectResult == actualResult) {
            System.out.println("Division test = SUCCESS");
        } else {
            System.out.println("Division test = FAILURE" + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }
    }

    public void isEven() {
        Calculator calculator = new Calculator();
        if (calculator.isEven(5)) {
            System.out.println("Your number is Even: ");
        } else {
            System.out.println("Your number is odd: ");
        }
    }

    public void maxOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(7,3);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of two numbers : SUCCESS");
        } else {
            System.out.println("Max of two numbers : FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }
    }

    public void maxOfTwoNumbers1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(3, 7);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of two numbers 1: SUCCESS");
        } else {
            System.out.println("Max of two numbers 1: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfTwoNumbers2() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(3, 3);
        int expectResult = 3;
        if (expectResult == actualResult) {
            System.out.println("Max of two numbers 2: SUCCESS");
        } else {
            System.out.println("Max of two numbers 2: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(7, 3, 3);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers : SUCCESS");
        } else {
            System.out.println("Max of three numbers: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(3, 7, 3);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers 1: SUCCESS");
        } else {
            System.out.println("Max of three numbers 1: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers2() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(3, 3, 7);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers 2: SUCCESS");
        } else {
            System.out.println("Max of three numbers 2: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers3() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(7, 7, 3);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers 3: SUCCESS");
        } else {
            System.out.println("Max of three numbers 3: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers4() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(7, 7, 3);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers 4: SUCCESS");
        } else {
            System.out.println("Max of three numbers 4: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers5() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(7, 3, 7);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers 5: SUCCESS");
        } else {
            System.out.println("Max of three numbers 5: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

    public void maxOfThreeNumbers6() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(7, 7, 7);
        int expectResult = 7;
        if (expectResult == actualResult) {
            System.out.println("Max of three numbers 6: SUCCESS");
        } else {
            System.out.println("Max of three numbers 6: FAILURE " + "Expected result: " + expectResult + " but Actual result: " + actualResult);
        }

    }

}




