package com.javaguru.student_vadim_migun.lesson_11.level_1.task_3;
/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.println(integers);

        integers.add(15); // добавление элемента в конец списка
        integers.add(0,-5); // добавление элемента в начало списка
        System.out.println(integers);

        System.out.println("Длина списка: " + integers.size()); // узнать длину списка

        System.out.println("Удаляем 1-ый элемент списка и число 30:");
        integers.remove(1); // удаление элемента под индексом 1
        integers.remove((Integer)30);   // удаление элемента по значению
        System.out.println(integers);

        System.out.println("Пустой список: " + integers.isEmpty());  // узнать пустой список или нет

        for (Integer integer : integers) {  // обойти список и вывести на консоль каждый элемент
            System.out.println(integer);
        }

    }
}
