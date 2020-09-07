package com.javaguru.student_vladimir_larin.lesson_3.level_5;

class Dog {
    private String dogName;
    private int dogAge;
    private String dogColor;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;

    }

    public void voice() {
        System.out.println("Dog name: " + dogName + " " + dogName + " " + dogName);
        System.out.println("Dog age: " + dogAge);
        System.out.println("Dog color: " + dogColor);
    }

    public void happyBirthday() {
        dogAge += 1;
    }

    public void changeColor(String newColor) {
        dogColor = newColor;
    }

}
