package com.javaguru.student_igors_gergeleziu.lesson_3.level_3;


public class Robot {
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