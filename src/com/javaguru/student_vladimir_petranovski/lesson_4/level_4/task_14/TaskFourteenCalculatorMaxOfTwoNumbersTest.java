package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_14;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "тесты написаны неверно. Нет вызова класса," +
        " который тестируют. Для работы используют переменные, которые хранят какие-то значения")
public class TaskFourteenCalculatorMaxOfTwoNumbersTest {
    public void maxOfTwoNumbersTest1() {
        int firstNumber = 3;
        int secondNumber = 1;
        if(3 > 1) {
            System.out.println("Первое число больше второго");
        } else if( 3 < 1) {
            System.out.println("Второе число больше второго");;
        } else
            System.out.println("Числа равны");
    }
    public void maxOfTwoNumbersTest2() {
        int firstNumber = 2;
        int secondNumber = 7;
        if(2 > 7) {
            System.out.println("Первое число больше второго");
        } else if( 2 < 7) {
            System.out.println("Второе число больше второго");;
        } else
            System.out.println("Числа равны");
    }
    public void maxOfTwoNumbersTest3() {
        int firstNumber = -5;
        int secondNumber = -5;
        if(-5 > -5) {
            System.out.println("Первое число больше второго");
        } else if( -5 < -5) {
            System.out.println("Второе число больше второго");;
        } else
            System.out.println("Числа равны");
    }

    public static void main(String[] args) {
        TaskFourteenCalculatorMaxOfTwoNumbersTest max = new TaskFourteenCalculatorMaxOfTwoNumbersTest();
        max.maxOfTwoNumbersTest1();
        max.maxOfTwoNumbersTest2();
        max.maxOfTwoNumbersTest3();
    }
}
