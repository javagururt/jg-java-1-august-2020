package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_22;

class DogDemo {

    public static void main(String[] args) {

        Dog newDog = new Dog("Gav", 9, "White");

        newDog.voice();
        newDog.happyBirthday();
        newDog.changeColor("Yellow");   // изменение цыета собаки на другой и вывод новых данных
    }

}
