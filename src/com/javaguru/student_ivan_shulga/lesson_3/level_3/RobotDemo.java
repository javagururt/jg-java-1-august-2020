package com.javaguru.student_ivan_shulga.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {

    public static void main(String[] args) {

        Robot newRobot = new Robot("NewRobot");

        newRobot.sayHello();
        newRobot.sayYourName();

        Robot robot1 = new Robot("FirstRobot");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("SecondRobot");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robotX = new Robot("RobotX");
        robotX.sayHello();
        robotX.sayYourName();

    }

}
