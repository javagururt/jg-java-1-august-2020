package com.javaguru.student_ivan_shulga.lesson_11.level_1_intern.Task_5;

import java.util.Objects;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
/*
Дан класс Book:

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}

Создайте класс BookListContainsDemo в котором продемонстрируйте как
проверяют есть ли в списке данная книга или её нет. Если для правильной
работы выбранной вами функциональности требуется внести изменения в
класс Book, сделайте это!

PS: подсказка по функциональности в названии класса :).
 */