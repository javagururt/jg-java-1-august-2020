package com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior;

import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models.Book;
import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.models.Library;
import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.services.LibraryService;
import com.javaguru.student_igors_jurkovs.lesson_9.level_7_senior.utils.PrintLibraryInfoUtils;

class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();
        LibraryService libraryService = new LibraryService(library);

        System.out.println("Adding 2 books to library");
        libraryService.addBookToLibrary("Book1", "Arthur");
        libraryService.addBookToLibrary("Book2", "Robert");
        PrintLibraryInfoUtils.printLibraryInfo(library);

        System.out.println("Taking Book1");
        Book book1 = libraryService.findBook("Book1");
        libraryService.takeBookFromLibrary(book1);
        PrintLibraryInfoUtils.printBookState(book1);
        System.out.println("Setting 30 days passed");
        book1.setDaysPassed(30);

        PrintLibraryInfoUtils.printBookState(book1);

        System.out.println("Trying to return book1");
        libraryService.returnBookToLibrary(book1);
        System.out.println();

        PrintLibraryInfoUtils.printBookState(book1);

        System.out.println("Paying fine");
        libraryService.payFine(book1);

        PrintLibraryInfoUtils.printBookState(book1);

        System.out.println("Trying to return book1");
        libraryService.returnBookToLibrary(book1);

        PrintLibraryInfoUtils.printBookState(book1);

        Book book2 = libraryService.findBook("Book2");

        System.out.println("Taking book2");
        libraryService.takeBookFromLibrary(book2);

        PrintLibraryInfoUtils.printBookState(book2);

        System.out.println("Setting 5 days passed");
        book2.setDaysPassed(5);

        PrintLibraryInfoUtils.printBookState(book2);

        System.out.println("Checking book2 deadline");
        libraryService.returnBookDeadLine(book2);
        System.out.println();

        System.out.println("Returning book2");
        libraryService.returnBookToLibrary(book2);

        PrintLibraryInfoUtils.printBookState(book2);

        System.out.println("Reserving book2");
        book2.setReservation();

        PrintLibraryInfoUtils.printBookState(book2);

        System.out.println("Canceling reservation book2");
        book2.withdrawReservation();

        PrintLibraryInfoUtils.printBookState(book2);

    }
}
