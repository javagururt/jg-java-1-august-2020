package com.javaguru.student_vladimirs_filipovs.lesson_10.level_6;

import java.util.ArrayList;

interface BookReader {

    boolean chekIsBookExist(Book book);

    boolean chekAreNameAndAuthorOnTheBook(Book book);

    boolean putBookInLibrary(Book book);

    boolean deleteBookFromLibrary(Book book);

    void showAllBooksInLibrary();

    ArrayList<Book> findBookByAuthor(String findAuthor);

    ArrayList<Book> findBookByTitle(String findTitle);

 //   void bookIsRead(Book book);
}
