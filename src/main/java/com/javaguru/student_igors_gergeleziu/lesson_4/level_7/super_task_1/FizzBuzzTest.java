package com.javaguru.student_igors_gergeleziu.lesson_4.level_7.super_task_1;

class FizzBuzzTest {
    public static void main(String[] args) {
     FizzBuzzTest fizzBuzzTest= new FizzBuzzTest();
     fizzBuzzTest.fizzBuzzTest();
     fizzBuzzTest.fizzTest();
     fizzBuzzTest.buzzTest();
     fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(30).equals("FizzBuzz"), "FizzBuzzTest");
    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(9).equals("Fizz"), "FizzTest");
    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(10).equals("Buzz"), "BuzzTest");
    }

    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(7).equals("7"), "NotFizzBuzzTest");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
