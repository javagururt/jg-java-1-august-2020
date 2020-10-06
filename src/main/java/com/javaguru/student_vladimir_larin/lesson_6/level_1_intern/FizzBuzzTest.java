package com.javaguru.student_vladimir_larin.lesson_6.level_1_intern;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest testRunner = new FizzBuzzTest();
        testRunner.shouldReturnFizzBuzzWhenThirty();
        testRunner.shouldReturnFizzWhenThree();
        testRunner.shouldReturnBuzzWhenFive();
        testRunner.shouldReturnTwentyThreeWhenTwentyThree();
    }

    void shouldReturnFizzBuzzWhenThirty() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.detect(30);
        assertResult(expected, actual, "shouldReturnFizzBuzzWhenThirty");
    }

    void shouldReturnFizzWhenThree() {
        String expected = "Fizz";
        String actual = FizzBuzz.detect(3);
        assertResult(expected, actual, "shouldReturnFizzWhenThree");
    }

    void shouldReturnBuzzWhenFive() {
        String expected = "Buzz";
        String actual = FizzBuzz.detect(5);
        assertResult(expected, actual, "shouldReturnBuzzWhenFive");
    }

    void shouldReturnTwentyThreeWhenTwentyThree() {
        String expected = "23";
        String actual = FizzBuzz.detect(23);
        assertResult(expected, actual, "shouldReturnTwentyThreeWhenTwentyThree");
    }

    private void assertResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED. Expected: " + expected + ", actual: " + actual);
        }
    }
}
