package com.javaguru.student_igors_gergeleziu.lesson_3.level_4.task_14;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Book {
    private String bookTitle;

    Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getTitle() {
        return this.bookTitle;
    }

}
