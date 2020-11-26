package com.javaguru.student_ivan_shulga.lesson_13.level_4_junior;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Task_25 {

    public static void main(String[] args) {

        List<Integer> integers = new LinkedList<>(); // заполняем список рандомными значениями бесконечно
        Random random = new Random();
        while(true) {
            int randomValue = random.nextInt();
            integers.add(randomValue);
        }

    }

}
/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична!
 */