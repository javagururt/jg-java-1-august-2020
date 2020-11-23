package com.javaguru.student_maksim_morozov.lesson_5.level_4_junior;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Элементы массива: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + array[i]);
        }
    }

}

