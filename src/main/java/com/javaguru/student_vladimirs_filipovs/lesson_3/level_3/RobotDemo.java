package com.javaguru.student_vladimirs_filipovs.lesson_3.level_3;


class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider");
        String roboName1 = robot1.getName();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        String roboName2 = robot2.getName();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
