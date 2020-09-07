package com.javaguru.student_ivan_shulga.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.
 */
@CodeReview(approved = true)
class Book {

    private String title;  // добавлено ";"

    Book(String bookTitle) {
        this.title = bookTitle; // newTitle заменено на bookTitle и добавлено ";"
    }
    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
