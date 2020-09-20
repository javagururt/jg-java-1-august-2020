package com.javaguru.student_vladimirs_filipovs.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Sharik");
        dog1.setAge(3);
        dog1.setColour("Pink");
        dog1.voice();
        dog1.changeColour("Gray");
        dog1.newColour();
        dog1.happyBirthday();
        dog1.voice();
    }
}
