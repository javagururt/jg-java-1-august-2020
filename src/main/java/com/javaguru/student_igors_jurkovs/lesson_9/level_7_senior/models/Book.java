package com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models;

import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.exceptions.BookIsTakenException;

public class Book {

    public static final int BOOK_USE_MAX_TIME = 14;
    public static final int BOOK_DELAY_FINE_PER_DAY = 2;

    private String name;
    private String author;
    private boolean isReserved;
    private int daysPassed;
    private int bookDelayFine;
    private boolean isTaken;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        isReserved = false;
        daysPassed = 0;
        bookDelayFine = 0;
        isTaken = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void takeBook() {
        isTaken = true;
    }

    public void returnBook() {
        isTaken = false;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReservation() {
        if (!isTaken) {
            isReserved = true;
        } else throw new BookIsTakenException("Book is taken");

    }

    public void withdrawReservation() {
        isReserved = false;
    }

    public int getDaysPassed() {
        return daysPassed;
    }

    public void setDaysPassed(int daysPassed) {
        this.daysPassed = daysPassed;
    }

    public int getBookDelayFine() {
        return bookDelayFine;
    }

    public void setBookDelayFine(int bookDelayFine) {
        this.bookDelayFine = bookDelayFine;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isReserved=" + isReserved +
                ", daysPassed=" + daysPassed +
                ", bookDelayFine=" + bookDelayFine +
                ", isTaken=" + isTaken +
                '}';
    }
}
