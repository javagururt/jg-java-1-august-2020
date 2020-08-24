package com.javaguru.student_igors_gergeleziu.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Input first number: ");
        double firstNumber=numberInput.nextDouble();
        System.out.println("Input second number: ");
        double secondNumber=numberInput.nextDouble();
        double addition= firstNumber+secondNumber;
        double subtraction= firstNumber-secondNumber;
        double multiplication= firstNumber*secondNumber;
        double division= firstNumber/secondNumber;
        System.out.println("Addition: "+firstNumber+"+"+secondNumber+"="+addition);
        System.out.println("Subtraction: "+firstNumber+"-"+secondNumber+"="+subtraction);
        System.out.println("Multiplication "+firstNumber+"*"+secondNumber+"="+ multiplication);
        System.out.println("Division "+firstNumber+"/"+secondNumber+"="+division);

    }
}
