package com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.services;

import com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models.Book;
import com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models.Library;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    private final Library library;

    public BookReaderImpl(Library library) {
        this.library = library;
    }

    @Override
    public boolean addBook(Book book) {
        if (duplicateCheck(book) || isBookFieldsEmpty(book)) {

            return false;
        } else {
            library.saveBook(book);

            return true;
        }
    }

    @Override
    public boolean deleteBook(Book book) {
        if (library.getBooks().contains(book)) {
            library.deleteBook(book);
            return true;
        } else return false;
    }

    @Override
    public String printBookInfo(Book book) {
        return book.toString();
    }

    @Override
    public String printBookListInfo(List<Book> books, boolean isReadOrNot) {
        return findAllReadOrNotReadBooks(isReadOrNot).toString();
    }


    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for (Book book : library.getBooks()) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> findByName(String name) {
        List<Book> books = new ArrayList<>();
        for (Book book : library.getBooks()) {
            if (book.getName().toLowerCase().contains(name.toLowerCase())) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> findAllReadOrNotReadBooks(boolean isReadOrNot) {
        List<Book> books = new ArrayList<>();
        for (Book book : library.getBooks()) {
            if (book.getIsRead() == isReadOrNot) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public boolean markBookAsReadOrNot(Book book, boolean state) {
        if (library.getBooks().contains(book)) {
            library.setBookReadState(book, state);

            return true;

        } else return false;
    }

    @Override
    public boolean duplicateCheck(Book book) {
        for (Book bk : library.getBooks()) {
            if (bk.equals(book)) {

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isBookFieldsEmpty(Book book) {
        return book.getName().isBlank() || book.getAuthor().isBlank();
    }
}
