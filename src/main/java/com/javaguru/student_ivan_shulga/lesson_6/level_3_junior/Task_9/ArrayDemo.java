package com.javaguru.student_ivan_shulga.lesson_6.level_3_junior.Task_9;

import com.javaguru.teacher.codereview.CodeReview;

// файл для самопроверки, как работает программа
// основа класса скопирована из задания lesson_5 -> level_5_middle дописаны текущие задачи из lesson_6
@CodeReview(approved = true)
class ArrayDemo {

    public static void main(String[] args) {

        ArrayUtil arrayDemo = new ArrayUtil();

        int[] array = arrayDemo.createArray(5);
        arrayDemo.fillArrayWithRandomNumbers(array);
        arrayDemo.printArrayToConsole(array);
        System.out.println("Максимальное число в массиве равно: " + arrayDemo.findMaxNumber(array));
        System.out.println("Минимальное число в массиве равно: " + arrayDemo.findMinNumber(array));


    }

}
