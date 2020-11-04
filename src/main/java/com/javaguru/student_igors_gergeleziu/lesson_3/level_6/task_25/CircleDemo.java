package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_25;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
 class CircleDemo {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Please enter radius of a circle: ");
double radius=sc.nextDouble();
Circle circle1= new Circle();
System.out.println("Radius of a circle: "+circle1.calculateArea(radius));
    }
}
