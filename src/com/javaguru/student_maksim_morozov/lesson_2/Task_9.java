package com.javaguru.student_maksim_morozov.lesson_2;

import java.util.Scanner;

 class Task_9 {
     public static void main(String[] args){
         System.out.println("Input a number");
         Scanner sc = new Scanner(System.in);
         short number = sc.nextShort();
         for(int i = 1; i < 11; i++) {
             int multiplicationTableNumber = number * i;
             System.out.println("Expected Output   " + number + " x " + (i) + " = " + (number * i));
         }
     }
}
