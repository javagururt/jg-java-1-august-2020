package com.javaguru.student_ivan_shulga.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.HashSet;

class Task_4 {

    public static void main(String[] args) {

        // пример с возможностью хранения одинаковых эелементов
        ArrayList<Integer> test1 = new ArrayList<>(3);
        test1.add(1);
        test1.add(1);
        test1.add(1);

        for (Integer num : test1) {
            System.out.println(num);
        }

        System.out.println();

        // пример с невозможностью хранения одинаковых элементов
        HashSet<Integer> test2 = new HashSet<>(3);
        test2.add(1);
        test2.add(1);
        test2.add(1);

        for (Integer num : test2) {
            System.out.println(num);
        }

    }

}
/*
Некоторые могут, некоторые - нет.
 */
/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
 */