package com.javaguru.student_ivan_shulga.lesson_11.level_1_intern;

class Task_5 {

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

}

class BookListContainsDemo {

    // как-то создать список книг???
    // а в списке уже найти значения

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