package com.javaguru.teacher.lesson_6.lessoncode;

class Book {

    private static String title;
    private static int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
