package com.javaguru.student_igors_gergeleziu.lesson_2.level_3;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args) {
        System.out.println("Test Data: ");
        System.out.println("Input a number: ");
        Scanner sc= new Scanner(System.in);
        int inputNumber=sc.nextInt();
        System.out.println("Expected Output : ");
        for(int i=1; i<=10; i++){
            System.out.println(inputNumber+" x "+i+" = "+inputNumber*i);
        }
    }
}
