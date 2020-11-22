package com.javaguru.student_igors_jurkovs.lesson_11.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
class BookListContainsDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Test", "Test name");
        Book book2 = new Book("Test", "Test2 name");
        Book book3 = new Book("Test", "Test3 name");
        Book book4 = new Book("Test", "Test4 name");

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.remove(book2);

        System.out.println(books.contains(book1));
        System.out.println(books.contains(book2));
    }
}
