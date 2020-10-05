package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotNewVersion {
    private String name;
    public RobotNewVersion(String robotName) {
        this.name = robotName;
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void sayYourName(){
        System.out.println("My name is " + this.name);

    }








}
