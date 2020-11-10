package com.javaguru.student_vladimirs_filipovs.lesson_11.level_1.Task_5;

import java.util.ArrayList;

class BookListContainsDemo {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Gogolj", "Prestupljenije i nakazanije");
        Book book2 = new Book("Mogolj", "Mjortvije dushi");

        bookList.add(book1);

        boolean isBook1Contains = bookList.contains(book1);
        boolean isBook2Contains = bookList.contains(book2);

        System.out.println("Is book " + book1 + " exist in library: " + isBook1Contains);
        System.out.println("Is book " + book2 + " exist in library: " + isBook2Contains);
    }
}
