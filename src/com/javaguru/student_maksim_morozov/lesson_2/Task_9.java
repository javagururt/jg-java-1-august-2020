package com.javaguru.student_maksim_morozov.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
 class Task_9 {
     public static void main(String[] args){
         System.out.println("Input a number");
         Scanner sc = new Scanner(System.in);
         short number = sc.nextShort();
         for(int i = 1; i < 11; i++) {
             @CodeReviewComment(teacher = "multiplicationTableNumber не используется, лучше удалить")
             int multiplicationTableNumber = number * i;
             System.out.println("Expected Output   " + number + " x " + (i) + " = " + (number * i));
         }
     }
}
