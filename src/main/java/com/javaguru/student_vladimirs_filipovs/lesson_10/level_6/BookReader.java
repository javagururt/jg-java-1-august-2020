package com.javaguru.student_vladimirs_filipovs.lesson_10.level_6;

import java.util.List;

interface BookReader {

    boolean chekIsBookExist(Book book);

    boolean chekAreNameAndAuthorOnTheBook(Book book);

    boolean putBookInLibrary(Book book);

    boolean deleteBookFromLibrary(Book book);

    void showAllBooksInLibrary();

    List<Book> findBookByAuthor(String findAuthor);

    List<Book> findBookByTitle(String findTitle);

    boolean markBookIsRead(Book book);

    boolean markBookIsNotRead(Book book);

    List<Book> returnAllIsReadBooks();

    List<Book> returnAllIsNotReadBooks();
}
