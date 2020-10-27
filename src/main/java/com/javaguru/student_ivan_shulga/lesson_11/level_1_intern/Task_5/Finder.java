package com.javaguru.student_ivan_shulga.lesson_11.level_1_intern.Task_5;

import java.util.ArrayList;

class Finder { // попытка реализации поиска по автору в списке книг

    public Book findBook(String author, ArrayList<Book> bookList) {
        for (Book someBook : bookList) {
            if (someBook.getAuthor().equals(author)) {
                return someBook;
            }
        }
        return null;
    }

}
