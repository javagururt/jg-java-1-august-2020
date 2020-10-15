package com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.services;

import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.exceptions.NoSuchBookException;
import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models.Book;
import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models.Library;

public class LibraryService {

    private final Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void addBookToLibrary(String name, String author) {
        Book book = new Book(name, author);
        library.addBook(book);
    }

    public void takeBookFromLibrary(Book book) {
        book.takeBook();
    }

    public void returnBookDeadLine(Book book) {
        if (daysRemaining(book) >= 0) {
            System.out.println("You should return book in " + daysRemaining(book));
        } else {
            fineNotification(book);
        }
    }

    public void returnBookToLibrary(Book book) {
        if (daysRemaining(book) < 0) {
            fineNotification(book);
        } else {
            book.setDaysPassed(0);
            book.returnBook();
        }
    }

    public int issueFine(Book book) {
       return (book.getDaysPassed() - Book.BOOK_USE_MAX_TIME) * Book.BOOK_DELAY_FINE_PER_DAY;
    }

    public void payFine(Book book) {
        book.setBookDelayFine(0);
        book.setDaysPassed(0);
    }

    public Book findBook(String name) {
        for (Book book: library.getBooks()) {
            if (book.getName().contains(name)) {
                return book;
            }

        } throw new NoSuchBookException("Can't find such book in library");
    }

    private int daysRemaining(Book book) {
        return Book.BOOK_USE_MAX_TIME - book.getDaysPassed();
    }

    private void fineNotification(Book book) {
        book.setBookDelayFine(issueFine(book));
        System.out.println("You have overdue book, please pay fine: " + issueFine(book));
    }
}
