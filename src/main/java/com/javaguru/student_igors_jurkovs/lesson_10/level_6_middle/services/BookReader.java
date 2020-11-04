package com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.services;

import com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models.Book;

import java.util.List;

public interface BookReader {

    boolean addBook(Book book);
    boolean deleteBook(Book book);
    boolean duplicateCheck(Book book);
    boolean isBookFieldsEmpty(Book book);
    String printBookInfo(Book book);
    String printBookListInfo(List<Book> books, boolean isReadOrNot);
    List<Book> findByAuthor(String author);
    List<Book> findByName(String name);
    boolean markBookAsReadOrNot(Book book, boolean isReadOrNot);
    List<Book> findAllReadOrNotReadBooks(boolean isReadOrNot);
}
