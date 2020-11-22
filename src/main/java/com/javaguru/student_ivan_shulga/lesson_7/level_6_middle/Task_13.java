package com.javaguru.student_ivan_shulga.lesson_7.level_6_middle;

import java.util.Arrays;

class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int copyLength = 0; // проходим по массиву и считаем сколько цифр подходит под условия, т.к. длину уже созданого массива нельзя изменять (не создавая новый), поэтому надо заранее знать какая длина нам нужна
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                copyLength++;
            }
        }
        int[] copy = new int[copyLength]; // создаём массив размером вышеполученной длины
        int index = 0; // важная штука, не сразу до неё дошёл, т.к. массив другой длины, переиндексовываем элементы с 0 до количества подходящих элементов
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                copy[index] = in[i];
                index++;
            }
        }
        return copy;
    }
}

class copyMimiTest {

    public static void main(String[] args) {

        Copy test1 = new Copy();
        int[] testIn = {88, 54, -123, 5, 56, 78, 33, 21, 154};
        System.out.println(Arrays.toString(test1.copyInRange(testIn, 50, 80)));
    }

}


/*
Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int numberFrom, int numberTo)

вернуть новый массив, который содержит только те числа,
которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */