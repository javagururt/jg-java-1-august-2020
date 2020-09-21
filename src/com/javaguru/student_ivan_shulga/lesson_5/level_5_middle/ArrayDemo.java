package com.javaguru.student_ivan_shulga.lesson_5.level_5_middle;

// файл для самопроверки, как работает программа

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayDemo {

    public static void main(String[] args) {

        ArrayUtil arrayDemo = new ArrayUtil();

        int[] array = arrayDemo.createArray(5);
        arrayDemo.fillArrayWithRandomNumbers(array);
        arrayDemo.printArrayToConsole(array);
        arrayDemo.findMaxNumber(array);
        arrayDemo.findMinNumber(array);

    }

}
