package com.javaguru.student_maksim_morozov.lesson_4.level_4_junior;

import java.util.Scanner;

class CalculatorMyVersion {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Operation result: "+result);
    }
    public static int getInt(){
        System.out.println("Enter the first number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("You made a mistake entering the number. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Enter the second number:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake entering the number. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation not recognized.Enter again.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
