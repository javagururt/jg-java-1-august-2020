package com.javaguru.student_sergey_kazyanin.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName();

        System.out.println();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        System.out.println();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

    }
}
