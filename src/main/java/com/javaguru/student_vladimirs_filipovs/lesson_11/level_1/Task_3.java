package com.javaguru.student_vladimirs_filipovs.lesson_11.level_1;

import java.util.ArrayList;

class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        int a = 4;
        int b = 3;
        int c = 7;

        numberList.add(a); //добавление элемента в конец списка
        numberList.add(a); //добавление элемента в конец списка
        numberList.add(b); //добавление элемента в конец списка
        numberList.add(0, c); //добавление элемента в начало списка
        System.out.println(numberList);
        System.out.println(numberList.size()); //длина списка
        numberList.remove(1); //удаляем второй элемент из списка
        System.out.println(numberList);
        System.out.println(numberList.isEmpty()); //проверка пустой ли список
        System.out.println("------");
        for (Integer integer : numberList) { //вывод на консоль каждый из элементов
            System.out.println(integer);
        }


    }
}
