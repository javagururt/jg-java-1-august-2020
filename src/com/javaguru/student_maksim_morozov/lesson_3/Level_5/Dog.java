package com.javaguru.student_maksim_morozov.lesson_3.Level_5;

class Dog {
    private String name;
    private int age;
    private String color;

    public Dog (String dogName, int age, String color) {
    this.name = dogName;
    this.age = age;
    this.color = color; }

    public void voice(){
        System.out.println("Dog Name:" + name + ", Dog Age:" + age + ", Dog Color:" + color);
        System.out.println("Dog Name:" + name + ", Dog Age:" + age + ", Dog Color:" + color);
        System.out.println("Dog Name:" + name + ", Dog Age:" + age + ", Dog Color:" + color);
    }
    public void happyBirtDay(){this.age += 1; }
    public void changeColor (String newColor) {this.color = newColor;}
}
