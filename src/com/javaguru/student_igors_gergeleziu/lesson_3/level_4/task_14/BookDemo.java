package com.javaguru.student_igors_gergeleziu.lesson_3.level_4.task_14;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
