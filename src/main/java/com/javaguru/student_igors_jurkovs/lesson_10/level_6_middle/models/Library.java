package com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void saveBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void setBookReadState(Book book, boolean state) {
        book.setRead(state);
    }

}
