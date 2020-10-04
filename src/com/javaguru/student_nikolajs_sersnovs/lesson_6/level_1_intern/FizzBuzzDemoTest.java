package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_1_intern;

class FizzBuzzDemoTest {
    public static void main(String[] args) {
        FizzBuzzDemoTest fizzBuzzDemoTest = new FizzBuzzDemoTest();
        fizzBuzzDemoTest.mustReturnFizz();
        fizzBuzzDemoTest.mustReturnBuzz();
        fizzBuzzDemoTest.mustReturnFizzBuzz();

    }

    public void mustReturnFizz() {
        FizzBuzzDemo fizzBuzzDemo = new FizzBuzzDemo();
        String actualResult = fizzBuzzDemo.detect(9);
        String expectResult = "Fizz";
        if (expectResult.equals(actualResult)) {
            System.out.println("Fizz - Test Success");
        } else {
            System.out.println("Fizz - Test Failure" + " Expected result: "
                    + expectResult + " but Actual result:" + actualResult);
        }
    }

    public void mustReturnBuzz() {
        FizzBuzzDemo fizzBuzzDemo = new FizzBuzzDemo();
        String actualResult = fizzBuzzDemo.detect(10);
        String expectResult = "Buzz";
        if (expectResult.equals(actualResult)){
            System.out.println("Buzz - Test Success");}
        else {
            System.out.println("Buzz - Test Failure" + " Expected result: "
                    + expectResult + " but Actual result:" + actualResult);
        }
    }
    public void mustReturnFizzBuzz(){
        FizzBuzzDemo fizzBuzzDemo = new FizzBuzzDemo();
        String actualResult = fizzBuzzDemo.detect(15);
        String expectResult = "FizzBuzz";
        if (expectResult.equals(actualResult)){
            System.out.println("FizzBuzz - Test Success");}
        else {
            System.out.println("FizzBuzz - Test Failure" + " Expected result: "
                    + expectResult + " but Actual result:" + actualResult);
        }
    }
}

