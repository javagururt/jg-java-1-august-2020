/*
Добавьте в класс Calculator метод для определения
чётное число или не чётное.

Добавьте в класс CalculatorTest тесты для этого метода.

Подсказка:

class Calculator {

    public boolean isEven(int number) {
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
    }

}
}
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_4_junior.Task_13;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @CodeReviewComment(teacher = "можно сократить до return number % 2 == 0;")
    public boolean isEven(int number) {
        return number % 2 == 0;
    }


}
