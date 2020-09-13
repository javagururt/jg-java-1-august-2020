package com.javaguru.student_igors_gergeleziu.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Robot {
    String roboName;
    public Robot(String roboName){
     this.roboName=roboName;
    }
    public void sayYourName() {
        System.out.println("My name is "+ roboName);
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
}
