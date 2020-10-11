/*
Упростите метод boolean isEven(int number).
Код внутри этого метода может быть записан в одну строку.
Перед изменением кода убедитесь, что у вас есть автоматические тесты для проверки этого кода.
Если автоматических тестов нет то напишите их, убедитесь, что они проходят и только тогда меняйте код.

 */
package com.javaguru.student_sergey_kazyanin.lesson_6.level_1_intern.Task_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "можно упростить до return number % 2 == 0")
class Calculator {

    public boolean isEven(int number) {
        return number % 2 == 0;

//        if (number % 2 == 0) {
//            return true;
//        } else {
//        return false;
    }
}

