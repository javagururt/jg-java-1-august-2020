package com.javaguru.student_vladimirs_filipovs.lesson_13.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String error = null;
        System.out.println(error.length());
    }
}
// NullPointerException происходит в момент, когда вызывается
// какой-то элемент, который является пустым (null).
