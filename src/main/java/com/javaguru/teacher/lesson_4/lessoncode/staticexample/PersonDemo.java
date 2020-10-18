package com.javaguru.teacher.lesson_4.lessoncode.staticexample;

class PersonDemo {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setAge(20);
        firstPerson.setName("Vasya");

        Person secondPerson = new Person();
        secondPerson.setAge(25);
        secondPerson.setName("Andrey");

        System.out.println("First person name: " + firstPerson.getName());
        System.out.println("First person age: " + firstPerson.getAge());

        System.out.println("Second person name: " + secondPerson.getName());
        System.out.println("Second person age: " + secondPerson.getAge());
    }
}
