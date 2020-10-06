package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_1_intern;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.mustReturnFizz();
        fizzBuzzTest.mustReturnBuzz();
        fizzBuzzTest.mustReturnFizzBuzz();
    }

    public void mustReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(9);
        String expectResult = "Fizz";
        if (expectResult.equals(actualResult)) {
            System.out.println("Fizz - Test Success");
        } else {
            System.out.println("Fizz - Test Failure" + " Expected result: "
                    + expectResult + " but Actual result:" + actualResult);
        }
    }

    public void mustReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(10);
        String expectResult = "Buzz";
        if (expectResult.equals(actualResult)){
            System.out.println("Buzz - Test Success");}
        else {
            System.out.println("Buzz - Test Failure" + " Expected result: "
                    + expectResult + " but Actual result:" + actualResult);
        }
    }
    public void mustReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(15);
        String expectResult = "FizzBuzz";
        if (expectResult.equals(actualResult)){
            System.out.println("FizzBuzz - Test Success");}
        else {
            System.out.println("FizzBuzz - Test Failure" + " Expected result: "
                    + expectResult + " but Actual result:" + actualResult);
        }
    }
}

