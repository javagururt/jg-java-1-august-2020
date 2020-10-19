package com.javaguru.student_vladimirs_filipovs.lesson_9.level_2;

class Mufasa {
    protected String name;
    protected int age;

    public Mufasa(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

//чтобы не дублировать в классе Simba часть кода, вызываем конструктор родительского класса.
class Simba extends Mufasa {
    public Simba(String name, int age) {
        super(name, age);
    }

}
