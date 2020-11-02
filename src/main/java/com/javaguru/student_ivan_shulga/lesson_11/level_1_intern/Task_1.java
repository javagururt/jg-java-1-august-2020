package com.javaguru.student_ivan_shulga.lesson_11.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
class Task_1 {

    public static void main(String[] args) {

        ArrayList<String> firstArrayList = new ArrayList<>();

        firstArrayList.add("Каждый");
        firstArrayList.add("Охотнк");
        firstArrayList.add("Желает");
        firstArrayList.add("Знать");
        firstArrayList.add("Где");
        firstArrayList.add("Сидит");
        firstArrayList.add("Фазан");

        System.out.println(firstArrayList);

        System.out.println(firstArrayList.get(2)); // выводим ячейку с индексом 2, т.е. третью ячейку

        firstArrayList.remove("Желает"); // удаление из списка по элементу
        firstArrayList.remove(5); // удаление из списка по индексу

        System.out.println(firstArrayList);

        firstArrayList.add(2, "Желает"); // добавление элемента по индексу
        firstArrayList.add("Соловей"); // добавление элемента в конец списка

        System.out.println(firstArrayList);

        firstArrayList.set(6, "Фазан"); // установка нового значения для ячейки с индексом 6

        System.out.println(firstArrayList);

        firstArrayList.set(0, "Хороший");

        System.out.println(firstArrayList);

        if (firstArrayList.contains("Хороший")) { // ищем в списке наличие элемента и если он есть, то заменяем его на другой
            firstArrayList.set(firstArrayList.indexOf("Хороший"), "Каждый");
        }

        System.out.println(firstArrayList);

        System.out.println("Список " + firstArrayList + " содержит " + firstArrayList.size() + " элементов.");

        System.out.println("Под индексом 0 лежит значение " + "\"" + firstArrayList.get(0) + "\".");

        if (firstArrayList.isEmpty()) { // проверка заполненности коллекции значениями
            System.out.println("Колекция пуста!");
        } else {
            System.out.println("Коллекция заполнена!");
        }

        for (String words : firstArrayList) { // вывод на консоль списка последовательным перебором
            System.out.println(words);
        }

    }

}

/*
- LinkedList лучше использовать, если Вы знаете, что будете часто добавлять и удалять элементы из списка.
- ArrayList лучше использовать, если Вам главное иметь быстрый доступ к элементам списка.
- Множество (Set) - это такой же способ хранения данных, как массив или список. Но особенность множества в том, что оно может хранить только уникальные значения.
Например, если у нас есть множество Integer-ов - в нем лежат числа 1, 2 , 3, 4 и 5.
HashSet хранит элементы в произвольном порядке, но зато быстро ищет. Подходит, если порядок Вам не важен, но важна скорость. Более того, для оптимизации поиска, HashSet будет хранить элементы так, как ему удобно.
LinkedHashSet будет хранить элементы в порядке добавления, но зато работает медленнее.
TreeSet хранит элементы отсортированными.
- Очередь (Queue)  - это очень интересный тип хранения данных. Мы можем проводить с ней ограниченное количество операций -
обычно только с верхним элементом, и не имеем доступа к "середине" очереди. Аналогия с очередью людей.
 */

/*
Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?
 */