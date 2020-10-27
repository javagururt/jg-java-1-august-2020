package com.javaguru.student_igors_jurkovs.lesson_11.level_2_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    private static final Long ID = 0L;
    private final ArrayList<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public Long save(Book book) {
        book.setId(ID + 1);
        bookList.add(book);

        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        Optional<Book> optionalBook = findById(bookId);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            bookList.remove(book);

            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Book book) {

        return bookList.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {

                return Optional.of(book);
            }
        }

        throw new NoSuchIdException("No such Id");
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }

        return authorList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                titleList.add(book);
            }
        }

        return titleList;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> deleteList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                deleteList.add(book);
            }
        }
        bookList.removeAll(deleteList);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> deleteList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                deleteList.add(book);
            }
        }
        bookList.removeAll(deleteList);
    }
}
