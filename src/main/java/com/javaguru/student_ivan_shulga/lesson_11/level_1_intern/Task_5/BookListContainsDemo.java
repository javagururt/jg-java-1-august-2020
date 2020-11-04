package com.javaguru.student_ivan_shulga.lesson_11.level_1_intern.Task_5;

import java.util.ArrayList;

class BookListContainsDemo {

    public static void main(String[] args) {

        Book firstBook = new Book("Author1", "Title1");
        Book secondBook = new Book("Author2", "Title2");
        Book thirdBook = new Book("Author3", "Title3");
        Book fourthBook = new Book("Author4", "Title4");
        Book fifthBook = new Book("Author5", "Title5");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(firstBook);
        bookList.add(secondBook);
        bookList.add(thirdBook);
        bookList.add(fourthBook);
        bookList.add(fifthBook);

        if (bookList.contains(firstBook)) { // проверка есть ли определённая книга в библотеке
            System.out.println("Такая книга есть в библиотеке!");
        } else {
            System.out.println("Такой книги нет в библиотеке!");
        }

        System.out.println();

        Finder finder = new Finder(); // попытка поиска по автору в билиотеке
        System.out.println(finder.findBook("Author3", bookList)); // есть в библиотеке
        System.out.println(finder.findBook("Author10", bookList)); // нет в бибилиотеке

    }

}
