package com.javaguru.student_vladimirs_filipovs.lesson_9.level_1;

class DefaultConstructorDog {
    public DefaultConstructorDog(){
        System.out.println("Create dog!!");
    }
}
//Java автоматически добавит дефолтный конструктор при компиляции кода

class DefaultConstructorDogDemo {
    public static void main(String[] args) {
        DefaultConstructorDog dog = new DefaultConstructorDog(); //сработал дефолтный конструктор
    }
}