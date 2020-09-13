package com.javaguru.student_vladimirs_filipovs.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the radius of the circle");
        double circleRadius = scan.nextDouble();

        double perimeter = circleRadius * 2 * 3.14159;
        double area = circleRadius * circleRadius * 3.14159;

        System.out.println("Circle perimeter is " + perimeter);
        System.out.println("Circle area ie " + area);
    }
}
