package com.javaguru.student_anastasija_meiksane.lesson_3.level_5;

 class Dog {


     private String name;
     private int age;
     private String color;


     public  Dog(String name, int age, String color) {
         this.name = name;
         this.age = age;
         this.color = color;  }

     void voice() { System.out.println(name  +  age  +  color); }
     void happyBirthday() { this.age += 1 ;}
     void changeColor(String newColor) { this.color = newColor;}


     }


class DogDemo {
    public static void main(String[] args){
        Dog dogDemo = new Dog("Willson" , 21 , "Red ");
        dogDemo.voice();
        dogDemo.happyBirthday();
        dogDemo.changeColor("Black");
        dogDemo.voice();}
}
