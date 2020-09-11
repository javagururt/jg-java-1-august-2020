package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;

import java.util.Arrays;

class MaxFromArrayV2 {
    public static void main(String[] args) {
        int index = 5;
        int numbers[] = new int[index];
        int max = 0;
        for (int i = 0; i < index; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Max number in array is = " + max);
    }

}
