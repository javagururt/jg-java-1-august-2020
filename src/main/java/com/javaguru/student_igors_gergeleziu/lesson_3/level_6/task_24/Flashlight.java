package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_24;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Flashlight {
    private int brightness;
    private int chargeLevel=100;
    private boolean power=false;
    private String model;

    Flashlight(String model){
        this.model=model;
    }
    public void powerOn(){
        power=true;
        System.out.println("Flashlight is turned on.");
        System.out.println("");
    }
    public void powerOff(){
        power=false;
        brightness=0;
        System.out.println("Flashlight is turned off.");
        System.out.println("");
    }
    public void setBrightness(int changeBrightness){
        if(power){
            this.brightness=changeBrightness;
            chargeLevel-=5;
        }else System.out.println("Flashlight switched off.");

    }
    public void charging(){
        if(!power) {
            this.chargeLevel = 100;
            System.out.println("Charging flashlight to 100%");
        }else System.out.println("Flashlight cant charge, turn it off");
    }
    public void info(){
        if(power) {
            System.out.println("Flashlight model: " + model);
            System.out.println("Brightness: " + brightness);
            System.out.println("Charge level: " + chargeLevel);
            System.out.println("");
        }else System.out.println("Flashlight switched off.");
    }
}
