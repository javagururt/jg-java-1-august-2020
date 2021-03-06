package com.javaguru.student_vladimir_petranovski.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {
    private static final Long ID = 0L;

    private final List<Book> database = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId(ID + 1);
        database.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        if (isExistBook(bookId)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return findBook(book) && database.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book books : database) {
            if (books.getId().equals(bookId)) {
                return Optional.of(books);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book books : database) {
            if (books.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(books);
            }
        }
        return authorList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book books : database) {
            if (books.getTitle().equalsIgnoreCase(title)) {
                titleList.add(books);
            }
        }
        return titleList;
    }

    @Override
    public int countAllBooks() {
        int count = 0;
        for (Book books : database) {
            count++;
        }
        return count; // database.size()
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book books : database) {
            if (books.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(books);
            }
        }
        database.removeAll(authorList);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book books : database) {
            if (books.getTitle().equalsIgnoreCase(title)) {
                titleList.add(books);
            }
        }
        database.removeAll(titleList);
    }

    public boolean findBook(Book book) {
        for (Book books : database) {
            if (book.equals(books)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistBook(Long bookId) {
        for (Book books : database) {
            if (books.getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }
}
