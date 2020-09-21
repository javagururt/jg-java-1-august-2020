package com.javaguru.student_ivan_shulga.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;
@CodeReview(approved = true)
class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите желаемую длину массива (максимум 10)!");    // для практики ограничили длинну массива 10-ю ячейками

        int arrayLength = scanner.nextInt(); // получаем желаемую пользователем длинну массива

        if (arrayLength <= 10) {   // проверяем условие ограничения, если <= 10, то пользователь заполняет значения, если нет, то завершаем программу

            System.out.println("-----");
            System.out.println("Создан массив с длинной равной: " + arrayLength);
            System.out.println("-----");

                int[] newArray = new int[arrayLength];

                    for (int i = 0; i < newArray.length; i++) {
                        System.out.println("Введите значение ячейки массива под индексом " + i);
                        newArray[i] = scanner.nextInt();
                        System.out.println("-----");
                        System.out.println("Ячейке с индексом " + i + " присвоено значение " + newArray[i]);
                        System.out.println("-----");
                    }

                        System.out.println("В итоге вы получили массив со следующими значениями:");

                            for (int i = 0; i < newArray.length; i++) {
                                System.out.println("Ячейка " + i + " равна " + newArray[i]);
                            }

        } else {
            System.out.println("Введена неверная длинна массива! Пожалуйста, перезапустите программу и введите желаемую длину массива (максимум 10)!");
        }

    }

}

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
