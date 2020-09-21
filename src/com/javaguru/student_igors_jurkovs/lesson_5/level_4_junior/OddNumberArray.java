package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OddNumberArray {
    public static void main(String[] args) {
        int index = (int) (Math.random() * 10);
        int numbers[] = new int[index];
        for (int i = 0; i < index; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println(numbers[i]);
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < index; i++) {
            if (!(numbers[i] % 2 == 0)) {
                System.out.println(numbers[i]);
            }
        }
    }
}
