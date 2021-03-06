package com.javaguru.student_igors_jurkovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

/*
Task_28
Дописать код программы, что бы она запускалась
и выводила на консоль производителя и модель компьютера.
Менять можно только класс Computer.
 */
@CodeReview(approved = true)
class Computer {

    private String manufacturer;
    private String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer () {
        return manufacturer;
    }
    String getModel () {
        return model;
    }

}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
