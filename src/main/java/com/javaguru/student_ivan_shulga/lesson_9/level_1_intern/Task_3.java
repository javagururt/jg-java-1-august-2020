package com.javaguru.student_ivan_shulga.lesson_9.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

// Объявление полей класса похоже на объявление переменных, при создании экземпляра класса, все его поля инициализируются значениями по умолчанию.
// Для объектов значением по умолчанию является null. Для int - 0 и т.д.
@CodeReview(approved = true)
class Task_3 {

    private String fullName;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Task_3{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

class Task_3_Demo {

    public static void main(String[] args) {

        Task_3 testTask3 = new Task_3();

        System.out.println(testTask3);

    }

}


/*
Какие значения принимают свойства класса
(ссылки на объекты и примитивные типы данных)
при вызове дефолтного конструктора?

class Person {

    private String fullName;
    private int age;
    private Address address;

}

Напишите программу, которая продемонстрирует
ответ на этот вопрос.
 */