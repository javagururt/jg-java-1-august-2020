package com.javaguru.student_vladimirs_petrinaks.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число :");
        double firstDoubleNumber = sc.nextDouble();


        System.out.println("Введите второе число :");
        double secondDoubleNumber = sc.nextDouble();

        double sumOfNumbers = firstDoubleNumber + secondDoubleNumber;
        double subtractionOfNumbers = firstDoubleNumber - secondDoubleNumber;
        double multiplyOfNumbers = firstDoubleNumber * secondDoubleNumber;
        double divisionOfNumbers = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Сложение этих чисел равно " + sumOfNumbers);
        System.out.println("Вычитание 1-ого от 2-ого числа равно " + subtractionOfNumbers);
        System.out.println("Умножение этих чисел равно " + multiplyOfNumbers);
        System.out.println("Деление 1-ого на 2-ое число равно " + divisionOfNumbers);

        sc.close();
    }
}