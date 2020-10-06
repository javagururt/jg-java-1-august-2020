package com.javaguru.student_ivan_shulga.lesson_6.level_1_intern;

class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }

}

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest tests = new FizzBuzzTest();
        tests.test15();
        tests.test3();
        tests.test5();
        tests.test7();
    }

    void test15() {
        FizzBuzz numberTest = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = numberTest.detect(15);
        testResult(expected, actual, "test15");
    }

    void test3() {
        FizzBuzz numberTest = new FizzBuzz();
        String expected = "Fizz";
        String actual = numberTest.detect(3);
        testResult(expected, actual, "test3");
    }

    void test5() {
        FizzBuzz numberTest = new FizzBuzz();
        String expected = "Buzz";
        String actual = numberTest.detect(5);
        testResult(expected, actual, "test5");
    }

    void test7() {
        FizzBuzz numberTest = new FizzBuzz();
        String expected = "" + 7;
        String actual = numberTest.detect(7);
        testResult(expected, actual, "test7");
    }

    private void testResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED! Expected: " + expected + ", actual: " + actual);
        }
    }

}