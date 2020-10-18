package com.javaguru.student_vadim_migun.lesson_9.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {

    public static void main(String[] args) {
        Circle test = new Circle(3);
        System.out.println("Circle area = " + test.calculateArea());
        System.out.println("Circle perimeter = " + test.calculatePerimeter());
    }



}

