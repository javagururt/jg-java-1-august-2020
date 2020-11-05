package com.javaguru.student_vadim_migun.lesson_11.level_1.task_5;

import java.util.ArrayList;

class BookListContainsDemo {
    public static void main(String[] args) {

        Book book1 = new Book("B. Eckel", "Thinking in Java");
        Book book2 = new Book("G. Shildt", "Java");
        Book book3 = new Book("K. Syerra", "Head First Java");
        Book book4 = new Book("R. Martin", "Clean code");

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.remove(book4);

        System.out.println(books.toString());
        System.out.println(books.contains(book1));
        System.out.println(books.contains(book4));




    }
}
