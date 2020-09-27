package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Arrays;

@CodeReview(approved = true)
class MinFromArrayV2 {
    public static void main(String[] args) {
        int index = 5;
        int numbers[] = new int[index];
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Min number in array is = " + min);
    }
}
