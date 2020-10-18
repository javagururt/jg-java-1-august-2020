package com.javaguru.student_anastasija_meiksane.Lesson_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReviewComment(teacher = "Название класса и название файла должны совпадать." +
        "Названия классов должны начинаться с заглавной буквы.")
@CodeReview(approved = true)
class human {

    public static void main(String[] args) {

        int age = 28;
        System.out.println(age);
        boolean hungry = true;
        System.out.println(hungry);
        System.out.println(age + "" + hungry);

        String name = "Anna";
        System.out.println(hungry + name + age);


    }
}

