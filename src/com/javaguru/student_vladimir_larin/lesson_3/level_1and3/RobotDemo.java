package com.javaguru.student_vladimir_larin.lesson_3.level_1and3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot("ROBO");
        robot.sayHello();
        robot.sayYourName();

        Robot robotAlpha = new Robot("Rider");
        robotAlpha.sayHello();
        robotAlpha.sayYourName();

        Robot robotBeta = new Robot("John");
        robotBeta.sayHello();
        robotBeta.sayYourName();
    }
}
