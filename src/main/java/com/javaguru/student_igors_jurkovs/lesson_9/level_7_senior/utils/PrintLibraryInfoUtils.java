package com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.utils;

import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models.Book;
import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models.Library;

public class PrintLibraryInfoUtils {

    private PrintLibraryInfoUtils() {
    }

    public static void printBookName(Book book) {
        book.getName();
        System.out.println();
    }

    public static void printBookState(Book book) {
        System.out.println("Book reserved: " + book.isReserved());
        System.out.println("Book on hands " + book.getDaysPassed() + " days");
        System.out.println("Delay fine is: " + book.getBookDelayFine());
        System.out.println("Book is available in library: " + !book.isTaken());
        System.out.println();
    }

    public static void printLibraryInfo(Library library) {
        System.out.println(library);
        System.out.println();
    }
}
