package com.javaguru.student_ivan_shulga.lesson_5.level_2_intern;

class Task_10 {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        intArray[0] = 25;
        intArray[1] = 26;
        intArray[2] = 27;

        System.out.println("Всего ячеек: " + intArray.length);

        System.out.println();

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Индекс ячейки: " + i);
            System.out.println("Значение ячейки: " + intArray[i]);
        }

    }

}

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */