package com.javaguru.student_maksim_morozov.lesson_11.level_1_intern;

import java.util.ArrayList;

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

}

class BookListContainsDemo{
    public static void main(String[] args){
        Book book1 = new Book("Фёдор Достаевский", "Идиот");
        Book book2 = new Book("Джоан Роулинг","Гарри Поттер");
        Book book3 = new Book("Уильям Шекспир","Ромео и Джульета");

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.remove(book2);

        System.out.println(books.contains(book1));
        System.out.println(books.contains(book2));
        System.out.println(books.contains(book3));
    }
}
