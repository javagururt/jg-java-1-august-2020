package com.javaguru.student_ivan_shulga.lesson_4.level_4_junior;

// здесь также задания level_4_junior - Task_13, Task_14, Task_15, т.е весь level_4_junior

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();

        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();

        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
    }

    public void additionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.addition(firstNumber, secondNumber);
                    if (result == 15) {
                        System.out.println("Addition test = OK");
                        } else {
                            System.out.println("Addition test = FAIL");
                            }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.subtraction(firstNumber, secondNumber);
                    if (result == 5) {
                        System.out.println("Subtraction test = OK");
                        } else {
                            System.out.println("Subtraction test = FAIL");
                            }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.multiplication(firstNumber, secondNumber);
                    if (result == 50) {
                        System.out.println("Multiplication test = OK");
                        } else {
                            System.out.println("Multiplication test = FAIL");
                            }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.division(firstNumber, secondNumber);
                    if (result == 2) {
                        System.out.println("Division test = OK");
                        } else {
                            System.out.println("Division test = FAIL");
                            }
    }

    public void evenTest() {                                         //level_4_junior Task_13
        int number = 10;                                             //level_4_junior Task_13
            Calculator calculator = new Calculator();                //level_4_junior Task_13
                boolean result = calculator.even(number);            //level_4_junior Task_13
                    if (result == true) {                            //level_4_junior Task_13
                        System.out.println("Even test = OK");        //level_4_junior Task_13
                        } else {                                     //level_4_junior Task_13
                            System.out.println("Even test = FAIL");  //level_4_junior Task_13
                            }                                        //level_4_junior Task_13
    }                                                                //level_4_junior Task_13

//   ниже  // level_4_junior Task_14 \\  ниже   \\
//  ниже   // level_4_junior Task_14 \\  ниже   \\

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
                    if (result == 10) {
                        System.out.println("MaxOfTwoNumbers1 test = OK");
                        } else {
                            System.out.println("MaxOfTwoNumbers1 test = FAIL");
                            }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 5;
        int secondNumber = 10;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
                    if (result == 10) {
                        System.out.println("MaxOfTwoNumbers2 test = OK");
                        } else {
                            System.out.println("MaxOfTwoNumbers2 test = FAIL");
                            }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 10;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
                    if (result == 10) {
                        System.out.println("MaxOfTwoNumbers3 test = OK");
                        } else {
                            System.out.println("MaxOfTwoNumbers3 test = FAIL");
                            }
    }

//  выше  // level_4_junior Task_14 \\  выше   \\
//  выше   // level_4_junior Task_14 \\  выше   \\

// -------------------------------------------------------

//   ниже  // level_4_junior Task_15 \\  ниже   \\
//  ниже   // level_4_junior Task_15 \\  ниже   \\

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest1 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest1 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 7;
        int secondNumber = 10;
        int thirdNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest2 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest2 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 5;
        int secondNumber = 7;
        int thirdNumber = 10;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest3 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest3 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest4 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest4 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 10;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest5 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest5 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 10;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest6 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest6 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest7() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                if (result == 10) {
                    System.out.println("MaxOfThreeNumbersTest7 test = OK");
                    } else {
                        System.out.println("MaxOfThreeNumbersTest7 test = FAIL");
                        }
    }

    public void maxOfThreeNumbersTest8() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 10;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest8 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest8 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest9() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 5;
            Calculator calculator = new Calculator();
                int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                    if (result == 10) {
                        System.out.println("MaxOfThreeNumbersTest9 test = OK");
                        } else {
                            System.out.println("MaxOfThreeNumbersTest9 test = FAIL");
                            }
    }

    public void maxOfThreeNumbersTest10() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 5;
            Calculator calculator = new Calculator();
            int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                if (result == 10) {
                    System.out.println("MaxOfThreeNumbersTest10 test = OK");
                    } else {
                        System.out.println("MaxOfThreeNumbersTest10 test = FAIL");
                        }
    }

//  выше  // level_4_junior Task_15 \\  выше   \\
//  выше   // level_4_junior Task_15 \\  выше   \\

}


/*
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего - 1
- второе число больше первого и третьего - 2
- третье число больше первого и второго - 3
- первые два равны и больше третьего - 4
- второе и третье числа равны и больше первого - 5
- первое и третье числа равны и больше второго - 6
- три числа равны - 7
- первые два равны и меньше третьего - 8
- второе и третье числа равны и меньше первого - 9
- первое и третье числа равны и меньше второго - 10
*/
