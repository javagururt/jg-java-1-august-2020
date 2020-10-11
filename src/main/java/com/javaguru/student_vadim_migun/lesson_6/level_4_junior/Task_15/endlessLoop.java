package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_15;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

/*
Напишите бесконечный цикл при помощи while и for.
 */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Название классов должны быть с заглавной буквы")
class endlessLoop {


    void endlessLoopWhile() {
        while (true) {
            System.out.println("hello");
        }
    }

    void endlessLoopFor() {
        for (int j = 0; ; j++) {
            System.out.println(j);
        }

    }
}

