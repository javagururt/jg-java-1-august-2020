package com.javaguru.student_igors_jurkovs.lesson_4.level_7_senior;

class FizzBuzz {

    String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.numberTest();

    }

    void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("FizzBuzz test: OK");
        } else {
            System.out.println("FizzBuzz test: FAILED");
        }

    }

    void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        if (result.equals("Fizz")) {
            System.out.println("Fizz test: OK");
        } else {
            System.out.println("Fizz test: FAILED");
        }
    }

    void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        if (result.equals("Buzz")) {
            System.out.println("Buzz test: OK");
        } else {
            System.out.println("Buzz test: FAILED");
        }
    }

    void numberTest() {
        int number = 16;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result.equals(String.valueOf(number))) {
            System.out.println("Number test: OK");
        } else {
            System.out.println("Number test: FAILED");
        }
    }
}