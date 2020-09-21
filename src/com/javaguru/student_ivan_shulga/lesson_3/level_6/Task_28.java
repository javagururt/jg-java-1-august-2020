package com.javaguru.student_ivan_shulga.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

/*
Дописать код программы, что бы она запускалась
и выводила на консоль производителя и модель компьютера.
Менять можно только класс Computer.
*/
@CodeReview(approved = true)
class Computer {

    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() { return manufacturer; }   // добавлено
    public String getModel() { return model; }                  // добавлено

}
@CodeReview(approved = true)
class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
