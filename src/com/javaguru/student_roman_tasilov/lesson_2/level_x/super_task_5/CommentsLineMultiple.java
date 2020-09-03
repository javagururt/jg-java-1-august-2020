package com.javaguru.student_roman_tasilov.lesson_2.level_x.super_task_5;

import java.util.Scanner;

public class CommentsLineMultiple {
    public static void main(String[] args) {
    System.out.println("Enter amount of Euro:");
    Scanner sc = new Scanner(System.in);
    double euro = sc.nextDouble();
    double usdRate = 1.18;
    double rubRate = 88.90;
    double chfRate = 1.07;
    double gbpRate = 0.89;
    double usdResult = euro * usdRate;
    double rubResult = euro * rubRate;
    double chfResult = euro * chfRate;
    double gbpResult = euro * gbpRate;

    //System.out.println("USD: " + usdResult);
    System.out.println("RUB: " + rubResult);
    /*System.out.println("CHF: " + chfResult);
    System.out.println("GBP: " + gbpResult);*/

    }
}
