package com.javaguru.student_igors_gergeleziu.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1= new Robot("SRX-500");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2= new Robot("SRX-200");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3= new Robot("SXC-400");
        robot3.sayHello();
        robot3.sayYourName();
    }
}
