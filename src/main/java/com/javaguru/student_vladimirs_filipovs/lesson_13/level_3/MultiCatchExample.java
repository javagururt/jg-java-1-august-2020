package com.javaguru.student_vladimirs_filipovs.lesson_13.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MultiCatchExample {
    public static void main(String[] args) {
        try { //важен правильный порядок поиска ошибок

        } catch (ArithmeticException a) { //сначала надо ловить конкретные ошибки

        } catch (Exception e) { //протом ловятся уже общие ошибки

        }
    }
}
