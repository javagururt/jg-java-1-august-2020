package com.javaguru.student_igors_gergeleziu.lesson_3.level_5;

 class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void voice(){
        System.out.println(name+", "+name+", "+name+"!");
        System.out.println("Im "+age+" years old.");
        System.out.println("I have "+color+" hair.");
    }
    public void happyBirthday(){
        System.out.println("Happy Birthday, "+name+"!");
        age+=1;
    }
    public void changeColor(String newColor){
        this.color=newColor;
    }
}
