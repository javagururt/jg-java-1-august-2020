package com.javaguru.student_vadim_migun.lesson_11.level_1.task_2;

import java.util.ArrayList;

/*
Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
 */
/*
Что хранит ArrayList?
Только ссылочные типы, любые объекты, включая сторонние классы. Строки, потоки вывода, другие коллекции.
Для хранения примитивных типов данных используются классы-обертки.
*/

class List {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.println(integers);

        ArrayList<String> name = new ArrayList<>();
        name.add("Vasya");
        name.add("Petya");
        name.add("Kolya");
        System.out.println(name);
    }

}
