package com.javaguru.student_vladimirs_filipovs.lesson_6.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.numberCanDivideOn5and3();
        fizzBuzzTest.numberCanDivideOn3();
        fizzBuzzTest.numberCanDivideOn5();
        fizzBuzzTest.numberCantDivideOn5and3();
    }

    void numberCanDivideOn5and3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(15);
        assertResult(actualResult, expectedResult, "numberCanDivideOn5and3");
    }

    void numberCanDivideOn3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(9);
        assertResult(actualResult, expectedResult, "numberCanDivideOn3");
    }

    void numberCanDivideOn5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(10);
        assertResult(actualResult, expectedResult, "numberCanDivideOn5");
    }

    void numberCantDivideOn5and3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = Integer.toString(7);
        String actualResult = fizzBuzz.detect(7);
        assertResult(actualResult, expectedResult, "numberCantDivideOn5and3");
    }

    private void assertResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }
}
