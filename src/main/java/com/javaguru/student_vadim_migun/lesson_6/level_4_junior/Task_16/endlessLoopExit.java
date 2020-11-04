package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_16;

import com.javaguru.teacher.codereview.CodeReview;

/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */
@CodeReview(approved = true)
class endlessLoopExit {


    void endlessLoopWhile() {
        while (true) {
            System.out.println("hello");
            break;
        }
    }

    void endlessLoopFor() {
        for (int j = 0; ; j++) {
            System.out.println(j);
            break;
        }

    }
}

