package com.javaguru.student_vladimirs_filipovs.lesson_9.level_1.Task_3;

class Person {
    private String fullName;
    private int age;
    private String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }
}

class PersonDemo{
    public static void main(String[] args) {
    Person person = new Person("Vladimirs Filipovs", 28, "Traleru iela 19");
    }
}
