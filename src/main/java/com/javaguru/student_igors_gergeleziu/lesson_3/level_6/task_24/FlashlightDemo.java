package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_24;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class FlashlightDemo {
    public static void main(String[] args) {
        Flashlight ledwise= new Flashlight("LED Ledwise");
        ledwise.info();
        ledwise.setBrightness(200);
        ledwise.powerOn();
        ledwise.info();
        ledwise.setBrightness(300);
        ledwise.setBrightness(350);
        ledwise.setBrightness(400);
        ledwise.info();
        ledwise.powerOff();
        ledwise.charging();
        ledwise.powerOn();
        ledwise.info();

    }

}
