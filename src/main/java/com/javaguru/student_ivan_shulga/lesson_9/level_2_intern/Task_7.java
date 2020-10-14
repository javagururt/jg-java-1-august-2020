package com.javaguru.student_ivan_shulga.lesson_9.level_2_intern;

/*
Если класс перенимает свойства другого класса, подкласс автоматически получает стандартный конструктор суперкласса.
Но если нужно вызвать параметризованный конструктор суперкласса, то необходимо использовать ключевое слово super для вызова параметризованного конструктора суперкласса.
 */


class Task_7 {

    int age;

    public Task_7(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

class Task_7_Extention extends Task_7 {

    Task_7_Extention(int age) {
        super(age); // вызываем конструктор родительского класса
    }

    public static void main(String[] args) {

        Task_7_Extention test = new Task_7_Extention(33);
        System.out.println(test.getAge());
    }

}


/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */