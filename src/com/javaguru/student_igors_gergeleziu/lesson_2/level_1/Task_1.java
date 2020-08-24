package com.javaguru.student_igors_gergeleziu.lesson_2.level_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber=numberInput.nextInt();
        System.out.println("Input second number: ");
        int secondNumber=numberInput.nextInt();
        int addition= firstNumber+secondNumber;
        int subtraction= firstNumber-secondNumber;
        int multiplication= firstNumber*secondNumber;
        int division= firstNumber/secondNumber;
        System.out.println("Addition: "+firstNumber+"+"+secondNumber+"="+addition);
        System.out.println("Subtraction: "+firstNumber+"-"+secondNumber+"="+subtraction);
        System.out.println("Multiplication "+firstNumber+"*"+secondNumber+"="+ multiplication);
        System.out.println("Division "+firstNumber+"/"+secondNumber+"="+division);

    }
}
