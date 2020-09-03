package com.javaguru.student_ivan_shulga.lesson_3.level_5;

class Dog {

    private String name;
    private int age;

    public Dog(String name, int newAge) {
        this.name = name;
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void happyBirthday() {
        age +=1;
    }

    public void voice() {
        System.out.println("Dog name is " + name + "\nDog age is " + age);
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog newDog = new Dog("Gav", 9);
        String dogName = newDog.getName();
        int dogAge = newDog.getAge();

        newDog.voice();
        newDog.happyBirthday();

        newDog.voice();
        newDog.happyBirthday();

        newDog.voice();
        newDog.happyBirthday();

    }

}