package com.javaguru.student_ivan_shulga.lesson_2.level_x;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SumTwoNumbers {

    public static void main(String[] args) {

     //   int numberOne;        // лишняя строка
     //   int numberTwo;        // лишняя строка

        int numberOne = 10;     //перенесена выше System.out.println
        int numberTwo = 20;     //перенесена выше System.out.println

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}
