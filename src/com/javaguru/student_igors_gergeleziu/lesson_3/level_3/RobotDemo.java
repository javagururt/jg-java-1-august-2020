package com.javaguru.student_igors_gergeleziu.lesson_3.level_3;

import java.util.Scanner;

class RobotDemo {
    /*
    I already done exercise with robot name parameter in constructor in lesson_3.level_1,so
    I decided to experiment with loop and class instance.
    */
    public static void main(String[] args) {
        Scanner scCount= new Scanner(System.in);
        Scanner scText=new Scanner(System.in);
        System.out.println("How many robots u want to develop? ");
        int roboCount=scCount.nextInt();
        String roboName;
        for(int i=1; i<=roboCount; i++){
            System.out.println("Please name your robot No "+i+": ");
            roboName=scText.nextLine();
            Robot robot= new Robot(roboName);
            robot.sayHello();
            robot.sayYourName();
        }

    }
}
