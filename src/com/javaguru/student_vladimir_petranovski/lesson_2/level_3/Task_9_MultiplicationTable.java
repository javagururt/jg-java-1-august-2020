package com.javaguru.student_vladimir_petranovski.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_9_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i < 11; i++) {
            int multiplicationTableNumber = number * i;
            System.out.println(multiplicationTableNumber);
        }
    }
}
