package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args){
        Dog dog = new Dog ("Grai", 5, "Brown");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Black");
        dog.voice();

    }

}
