package com.javaguru.student_vladimirs_filipovs.lesson_2.level_5;

import java.util.Scanner;

class Task_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi,friend! What is your name?");
        String name = scan.next();

        System.out.println("What is your lastname?");
        String lastName = scan.next();

        System.out.print("Good luck! ");
        System.out.print(name + " " + lastName);
    }
}
