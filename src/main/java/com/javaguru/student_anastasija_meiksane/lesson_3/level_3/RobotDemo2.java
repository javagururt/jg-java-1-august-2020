package com.javaguru.student_anastasija_meiksane.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo2 {
    public static void main(String[] args) {
        Robot2 robotGalina = new Robot2("Galina");
        robotGalina.sayHello();
        robotGalina.sayName();
        System.out.println();
        robotGalina.introduce();
System.out.println();
        Robot2 robotVlad = new Robot2("Vlad");
        robotVlad.sayHello();
        robotVlad.sayName();
        System.out.println();
        robotVlad.introduce();
System.out.println();
        Robot2 robotMike = new Robot2("Mike");
        robotMike.sayHello();
        robotMike.sayName();
        System.out.println();
        robotMike.introduce();


    }
}