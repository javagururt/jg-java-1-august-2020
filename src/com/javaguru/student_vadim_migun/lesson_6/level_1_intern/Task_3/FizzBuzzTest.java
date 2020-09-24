package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_3;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.detectDivideByThreeAndFife();
        test.detectDivideByThree();
        test.detectDivideByFive();
        test.detectNotDivideByTheeAndFive();

    }

    FizzBuzz number = new FizzBuzz();

    void detectDivideByThreeAndFife() {
        String expected = "FizzBuzz";
        String actual = number.detect(15);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void detectDivideByThree() {
        String expected = "Fizz";
        String actual = number.detect(12);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void detectDivideByFive() {
        String expected = "Buzz";
        String actual = number.detect(10);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void detectNotDivideByTheeAndFive() {
        String expected = "" + 11;
        String actual = number.detect(11);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

}


