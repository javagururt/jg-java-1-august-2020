package com.javaguru.student_igors_jurkovs.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    public Robot() {

    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is ROBO");
    }
}

class RobotDemo {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
