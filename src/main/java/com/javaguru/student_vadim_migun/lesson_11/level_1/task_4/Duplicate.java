package com.javaguru.student_vadim_migun.lesson_11.level_1.task_4;
/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
 */

import java.util.ArrayList;
import java.util.List;

class Duplicate {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();  // ArrayList может хранить дубликаты
        name.add("Vasya");
        name.add("Petya");
        name.add("Kolya");
        name.add("Vasya");
        name.add("Vasya");

        System.out.println(name.toString());
    }
}
