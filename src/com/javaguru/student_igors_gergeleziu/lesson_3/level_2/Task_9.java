package com.javaguru.student_igors_gergeleziu.lesson_3.level_2;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Please, introduce yourself!");
        Scanner sc= new Scanner(System.in);
        String userName=sc.nextLine();
        String greeting="Hi "+ userName+ "!";
        System.out.println(greeting);
    }
}
