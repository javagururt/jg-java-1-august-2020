package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemoNewVersion {
    public static void main(String[]args){
        RobotNewVersion robotNewVersion = new RobotNewVersion("Rider");
        robotNewVersion.sayHello();
        robotNewVersion.sayYourName();

        RobotNewVersion robotNewVersion1 = new RobotNewVersion("John");
        robotNewVersion1.sayHello();
        robotNewVersion1.sayYourName();
    }
}
