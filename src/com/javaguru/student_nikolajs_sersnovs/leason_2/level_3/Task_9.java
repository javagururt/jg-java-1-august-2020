package com.javaguru.student_nikolajs_sersnovs.leason_2.level_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();
        for(int i =1 ; i <=10; i++) {
            System.out.println("Expected Output: " + number + " x " + (i) + " = " + (number * i));

        }

    }
}
