package com.javaguru.student_igors_jurkovs.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int userNumber = sc.nextInt();
        int counter = 1;

        while (counter < 11) {

            int multiplyResult = userNumber * counter;
            System.out.println(userNumber + " x " + counter + " = " + multiplyResult);
            counter = counter + 1;
        }
    }
}
