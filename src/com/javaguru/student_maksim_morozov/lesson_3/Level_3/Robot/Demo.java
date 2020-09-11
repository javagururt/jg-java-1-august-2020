package com.javaguru.student_maksim_morozov.lesson_3.Level_3.Robot;

class Robot {
    public void sayHello() {
        System.out.println("Hello"); }

    private String name;
    public Robot(String robotName) {
        this.name = robotName;
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }
}


class RobotDemo {
    public static void main(String[] args){
        Robot newRobot = new Robot("RoboCop");
        newRobot.sayHello();
        newRobot.sayYourName();

        Robot robot1 = new Robot("R2-D2");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("C-3PO");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
