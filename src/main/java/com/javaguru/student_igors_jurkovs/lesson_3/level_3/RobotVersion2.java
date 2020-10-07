package main.java.com.javaguru.student_igors_jurkovs.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotVersion2 {

    private String name;

    RobotVersion2(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + name);
    }
}

class RobotVersion2Demo {
    public static void main(String[] args) {

        RobotVersion2 robot1 = new RobotVersion2("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        RobotVersion2 robot2 = new RobotVersion2("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}