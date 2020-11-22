package com.javaguru.student_vadim_migun.lesson_11.level_1.task_1;
/*
Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?
 */
/*
ArrayList - это список на основе массива. LinkedList - связанный список на основе элементов и связи между ними.
В качестве LinkedList лучше всего подходит представление вагонов поезда сцепленных последовательно.

ArrayList следует использовать, когда в приоритете доступ по индексу, так как эти операции выполняются
за константное время.
Добавление в конец списка в среднем тоже выполняется за константное время. Кроме того в ArrayList нет
дополнительных расходов на хранение связки между элементами.
Минусы в скорости вставки/удаления элементов находящихся не в конце списка, так как при этой операции
все элементы правее добавляемого/удаляемого сдвигаются.

LinkedList удобен когда важнее быстродействие операций вставки/удаления, которые в LinkedList выполняются
за константное время. Операции доступа по индексу производятся перебором с начала или конца (смотря что ближе)
до нужного элемента. Дополнительные затраты на хранение связки между элементами.

Одним словом - если часто вставляете/удаляете - выбирайте в пользу LinkedList, в противном случае ArrayList!
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ArrayAndLinkedList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(3);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        System.out.println(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(2);
        linkedList.add(23);
        linkedList.add(7);

        System.out.println(linkedList);

    }


}
