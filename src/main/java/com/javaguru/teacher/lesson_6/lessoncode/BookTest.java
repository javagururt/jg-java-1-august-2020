package com.javaguru.teacher.lesson_6.lessoncode;

class BookTest {

    public static void main(String[] args) {
        Book firstBook = new Book("TEST-1", 10);
        Book secondBook = new Book("TEST-2", 20);
        Book thirdBook = new Book("TEST-3", 30);

        BookUtils.printInformation(firstBook);
        System.out.println();
        BookUtils.printInformation(secondBook);
        System.out.println();
        BookUtils.printInformation(thirdBook);
    }
}
