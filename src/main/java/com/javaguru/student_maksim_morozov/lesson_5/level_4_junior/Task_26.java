package com.javaguru.student_maksim_morozov.lesson_5.level_4_junior;

import java.util.Scanner;

class   Task_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }
    }
}
