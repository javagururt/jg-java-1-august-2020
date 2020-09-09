package com.javaguru.student_vadim_migun.lesson_3.level_3;


class RobotVersion2 {

    private String name;

    RobotVersion2(String robotName) {
        this.name = robotName;
    }

        public void sayHello() {
            System.out.println("Hello!");

        }
        public void sayYourName() {
            System.out.println("My name is " + name);
        }


    }



class RobotVersion2Demo {
    public static void main(String[] args) {

        RobotVersion2 robot1 = new RobotVersion2("Rider"); // пусть этого робота зовут "Rider"
        robot1.sayHello();
        robot1.sayYourName();

        RobotVersion2 robot2 = new RobotVersion2("John"); // а этого робота зовут "John"
        robot2.sayHello();
        robot2.sayYourName();
    }

}
