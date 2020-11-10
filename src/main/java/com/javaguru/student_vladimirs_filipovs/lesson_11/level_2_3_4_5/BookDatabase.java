package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

interface BookDatabase {

    boolean chekIsBookExist(Book book);

    boolean chekIsNoEmptyAuthorAndTitle(Book book);

    Long save(Book book);

    boolean delete(Long bookId);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitle();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();
}
