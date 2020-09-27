package com.javaguru.student_igors_jurkovs.personal;

public class Calculator {
    public static int calculator(int num1, char operator, int num2) {
        if(operator == '+') {
            return num1 + num2;
        } else if(operator == '-') {
            return num1 - num2;
        } else if(operator == '*') {
            return num1 * num2;
        } else if(operator == '/' && num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }
}