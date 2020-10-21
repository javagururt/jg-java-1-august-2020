package com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models;

import java.util.Objects;

public class Book {

    private final String name;
    private final String author;
    private boolean isRead;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        isRead = false;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean getIsRead() {
        return isRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name.toLowerCase(), book.name.toLowerCase()) &&
                Objects.equals(author.toLowerCase(), book.author.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return name + " " + "[" + author + "]";
    }
}
