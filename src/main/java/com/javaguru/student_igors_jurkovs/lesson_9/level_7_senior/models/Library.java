package com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models;

import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

@CodeReviewComment(teacher = "рекомендую посмотреть, что такое классы репозитории")
public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
