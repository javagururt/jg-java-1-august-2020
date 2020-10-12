package com.javaguru.student_igors_jurkovs.lesson_9.level_1_intern;

/*
При использовании дефаултного конструктора все свойства объекта автоматически присваиваются к дефолтным
значениям. В данном слачае String будут null, а int будет 0. В демонстрации класса это наглядно показано.
 */

class Person {

    private String fullName;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
