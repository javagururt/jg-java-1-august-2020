package com.javaguru.student_maksim_morozov.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the day of the week (in numbers): ");
        int number = scan.nextInt();
        switch (number){
            case 1: System.out.println("Monday!");
                break;
            case 2: System.out.println("Tuesday!");
                break;
            case 3: System.out.println("Wednesday!");
                break;
            case  4: System.out.println("Thursday!");
                break;
            case 5: System.out.println("Friday!");
                break;
            case 6: System.out.println("Saturday!");
                break;
            case 7: System.out.println("Sunday!");
                break;
        }
    }
}
