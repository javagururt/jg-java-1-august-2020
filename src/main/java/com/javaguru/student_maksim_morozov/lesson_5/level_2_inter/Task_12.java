package com.javaguru.student_maksim_morozov.lesson_5.level_2_inter;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_12 {
    public static void main(String[] args){
        int [] numbers = new int [3];
        for(int i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }
    }
}
