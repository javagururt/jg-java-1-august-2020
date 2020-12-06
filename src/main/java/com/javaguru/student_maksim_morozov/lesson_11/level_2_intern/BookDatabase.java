package com.javaguru.student_maksim_morozov.lesson_11.level_2_intern;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);
    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(Book author);
    List<Book> findByTitle(String title);

    int countAllBooks();
    void deleteByAuthor(String author);
    void deleteByTitle(String title);

}
