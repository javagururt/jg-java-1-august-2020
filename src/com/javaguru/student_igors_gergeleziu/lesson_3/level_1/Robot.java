package com.javaguru.student_igors_gergeleziu.lesson_3.level_1;

public class Robot {
    String roboName;
    //Использовал конструктор для передачи имени робота при создании экземпляра класса
    public Robot(String roboName){
     this.roboName=roboName;
    }
    //Пустой по заданию конструктор
    public Robot(){

    }
    public void sayYourName() {
        System.out.println("My name is "+ roboName);
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
}
