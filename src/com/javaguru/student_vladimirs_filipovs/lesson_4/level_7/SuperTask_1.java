package com.javaguru.student_vladimirs_filipovs.lesson_4.level_7;

class FizzBuzz {
    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}


class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz fiz = new FizzBuzz();
        String result = fiz.detect(22);
        System.out.println(result);
    }
}


class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest testRunner = new FizzBuzzTest();
        testRunner.testNumberCanDivide3And5();
        testRunner.testNumberCanDivide3();
        testRunner.testNumberCanDivide5();
        testRunner.testNumberCantDivide3And5();
    }

    void testNumberCanDivide3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String result = fizzBuzz.detect(15);
        if (expectedResult == result) {
            System.out.println("testNumberCanDivide3And5: OK");
        } else {
            System.out.println("testNumberCanDivide3And5: FAIL");
        }
    }

        void testNumberCanDivide3() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String expectedResult = "Fizz";
            String result = fizzBuzz.detect(9);
            if (expectedResult == result) {
                System.out.println("testNumberCanDivide3: OK");
            } else {
                System.out.println("testNumberCanDivide3: FAIL");
            }
    }

    void testNumberCanDivide5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String result = fizzBuzz.detect(20);
        if (expectedResult == result) {
            System.out.println("testNumberCanDivide5: OK");
        } else {
            System.out.println("testNumberCanDivide5: FAIL");
        }
    }

    //не понимаю как сделать последний тест, чтобы не было фэйла..
    void testNumberCantDivide3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "" + 22;
        String result = fizzBuzz.detect(22);
        if (expectedResult == result) {
            System.out.println("testNumberCantDivide3And5: OK");
        } else {
            System.out.println("testNumberCantDivide3And5: FAIL");
        }
    }

}