package com.javaguru.student_ivan_shulga.lesson_4.level_4_junior;

// здесь также задания level_4_junior - Task_13, Task_14, Task_15, т.е весь level_4_junior

class Calculator {

    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean even(int number) {     //level_4_junior Task_13
        return number % 2 == 0;           //level_4_junior Task_13
    }                                     //level_4_junior Task_13

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {         // level_4_junior Task_14
        if (firstNumber > secondNumber) {                                   // level_4_junior Task_14
            return firstNumber;                                             // level_4_junior Task_14
            } else {                                                        // level_4_junior Task_14
                return secondNumber;                                        // level_4_junior Task_14
                }                                                           // level_4_junior Task_14
    }                                                                       // level_4_junior Task_14

//   ниже  // level_4_junior Task_15 \\  ниже   \\
//  ниже   // level_4_junior Task_15 \\  ниже   \\

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            return firstNumber;
            } else if (firstNumber < secondNumber && secondNumber > thirdNumber) {
                return secondNumber;
                } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
                    return thirdNumber;
                    } else if (firstNumber == secondNumber && secondNumber < thirdNumber) {
                        return thirdNumber;
                        } else if (firstNumber == secondNumber && secondNumber > thirdNumber) {
                            return firstNumber;
                            } else if (firstNumber > secondNumber && secondNumber == thirdNumber) {
                                return firstNumber;
                                    } else if (firstNumber < secondNumber && secondNumber == thirdNumber) {
                                        return secondNumber;
                                            } else {
                                                return firstNumber;
                                                }
    }

//  выше  // level_4_junior Task_15 \\  выше   \\
//  выше   // level_4_junior Task_15 \\  выше   \\

}

