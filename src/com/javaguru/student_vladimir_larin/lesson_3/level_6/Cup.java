package com.javaguru.student_vladimir_larin.lesson_3.level_6;

// Task_24

class Cup {
    public boolean isFull;
    public String color;
    public String material;

    public Cup (boolean isFull, String material,  String color) {
        this.color = color;
        this.material = material;
        this.isFull = isFull;
    }
    public void status() {
        System.out.println("Cup appearance: " + color + " " + material);
        System.out.println("Is it full? " + isFull);
    }
    public void drink() {
        isFull = false;
    }
}





