package com.javaguru.student_igors_jurkovs.lesson_6.level_1_intern;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.numberTest();

    }

    void testFizzBuzz() {
        fizzBuzz.test(fizzBuzz.detect(15).equals("FizzBuzz"), "FizzBuzz test");
    }

    void testFizz() {
        fizzBuzz.test(fizzBuzz.detect(9).equals("Fizz"), "Fizz test");
    }

    void testBuzz() {
        fizzBuzz.test(fizzBuzz.detect(10).equals("Buzz"), "Buzz test");
    }

    void numberTest() {
        fizzBuzz.test(fizzBuzz.detect(16).equals("16"), "Number test");
    }
}
