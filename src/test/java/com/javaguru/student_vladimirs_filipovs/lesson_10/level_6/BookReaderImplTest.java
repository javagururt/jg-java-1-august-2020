package com.javaguru.student_vladimirs_filipovs.lesson_10.level_6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    private BookReaderImpl victim;

    @Before
    public void setUp() {
        victim = new BookReaderImpl();
    }

    @Test
    public void checkIsBookExistShouldTrue() {
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        victim.bookLibrary.add(newBook1);
        boolean actual = victim.chekIsBookExist(newBook1);
        assertEquals(true, actual);
    }

    @Test
    public void checkIsBookExistShouldFalse() {
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        victim.bookLibrary.add(newBook1);
        boolean actual = victim.chekIsBookExist(newBook2);
        assertEquals(false, actual);
    }

    @Test
    public void checkIsTitleOrAuthorVoidAllIsOK() {
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        boolean actual = victim.chekAreNameAndAuthorOnTheBook(newBook1);
        assertEquals(true, actual);
    }

    @Test
    public void checkIsTitleOrAuthorVoidNoAuthor() {
        Book newBook1 = new Book(" ", "Donald Duck");
        boolean actual = victim.chekAreNameAndAuthorOnTheBook(newBook1);
        assertEquals(false, actual);
    }

    @Test
    public void checkIsTitleOrAuthorVoidNoTitle() {
        Book newBook1 = new Book("Suhoj zakon", "");
        boolean actual = victim.chekAreNameAndAuthorOnTheBook(newBook1);
        assertEquals(false, actual);
    }

    @Test
    public void shouldPutBookInLibraryTrue() {
        Book newBook1 = new Book("kosmoss", "Krutoj pisatelj");
        boolean actual = victim.putBookInLibrary(newBook1);
        assertEquals(true, actual);
    }

    @Test
    public void shouldPutBookInLibraryFalse1() {
        Book newBook1 = new Book("kosmoss", "Krutoj pisatelj");
        victim.bookLibrary.add(newBook1);
        boolean actual = victim.putBookInLibrary(newBook1);
        assertEquals(false, actual);
    }

    @Test
    public void shouldPutBookInLibraryFalse2() {
        Book newBook1 = new Book("", "Krutoj pisatelj");
        boolean actual = victim.putBookInLibrary(newBook1);
        assertEquals(false, actual);
    }

    @Test
    public void shouldDeleteFromLibraryTrue() {
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        boolean actual = victim.deleteBookFromLibrary(newBook2);
        assertEquals(true, actual);
    }

    @Test
    public void shouldDeleteFromLibraryFalse() {
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        victim.bookLibrary.add(newBook1);
        boolean actual = victim.deleteBookFromLibrary(newBook2);
        assertEquals(false, actual);
    }

    @Test
    public void shouldShowAllBooksInLibrary() {
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        victim.showAllBooksInLibrary();
    }

    @Test
    public void shouldFind1BookBy1Author() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        testList1.add(newBook1);
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        testList2 = victim.findBookByAuthor("Donald Duck");
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldFind2BookBy1Author() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        Book newBook3 = new Book("Motivacija", "Donald Duck");
        testList1.add(newBook1);
        testList1.add(newBook3);
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        victim.bookLibrary.add(newBook3);
        testList2 = victim.findBookByAuthor("Donald Duck");
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldNOTFindBookBy1Author() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        testList2 = victim.findBookByAuthor("Donald Trump");
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldFind1BookByTitle() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Paulik");
        testList1.add(newBook2);
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        testList2 = victim.findBookByTitle("Strannik");
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldFind2BookByTitle() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Shreder");
        Book newBook3 = new Book("Strannik", "Paulik");
        testList1.add(newBook2);
        testList1.add(newBook3);
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        victim.bookLibrary.add(newBook3);
        testList2 = victim.findBookByTitle("Strannik");
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldNOTFindBookByTitle() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        testList2 = victim.findBookByTitle("Strannik");
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldMarkBookIsReadTrue() {
        boolean expectedExecute = true;
        boolean expectedIsReadState = true;
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        victim.bookLibrary.add(newBook1);
        boolean actualExecute = victim.markBookIsRead(newBook1);
        boolean actualIsReadState = newBook1.isRead();
        assertEquals(expectedExecute, actualExecute);
        assertEquals(expectedIsReadState, actualIsReadState);
    }

    @Test
    public void shouldMarkBookIsReadFalse() {
        boolean expectedExecute = false;
        boolean expectedIsReadState = false;
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.remove(newBook1);
        boolean actualExecute = victim.markBookIsRead(newBook1);
        boolean actualIsReadState = newBook1.isRead();
        assertEquals(expectedExecute, actualExecute);
        assertEquals(expectedIsReadState, actualIsReadState);
    }

    @Test
    public void shouldMarkBookIsNotReadTrue() {
        boolean expectedExecute = true;
        boolean expectedIsNotReadState = false;
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        victim.bookLibrary.add(newBook1);
        newBook1.setRead(true);
        boolean actualExecute = victim.markBookIsNotRead(newBook1);
        boolean actualIsReadState = newBook1.isRead();
        assertEquals(expectedExecute, actualExecute);
        assertEquals(expectedIsNotReadState, actualIsReadState);
    }

    @Test
    public void shouldMarkBookIsNotReadFalse() {
        boolean expectedExecute = false;
        boolean expectedIsNotReadState = true;
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.remove(newBook1);
        newBook1.setRead(true);
        boolean actualExecute = victim.markBookIsNotRead(newBook1);
        boolean actualIsReadState = newBook1.isRead();
        assertEquals(expectedExecute, actualExecute);
        assertEquals(expectedIsNotReadState, actualIsReadState);
    }


    @Test
    public void shouldReturnAllIsReadBooks() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Shreder");
        Book newBook3 = new Book("Strannik", "Paulik");
        testList1.add(newBook2);
        testList1.add(newBook3);
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        victim.bookLibrary.add(newBook3);
        victim.markBookIsRead(newBook2);
        victim.markBookIsRead(newBook3);
        testList2 = victim.returnAllIsReadBooks();
        assertEquals(testList1, testList2);
    }

    @Test
    public void shouldReturnAllIsNotReadBooks() {
        List<Book> testList1 = new ArrayList<>();
        List<Book> testList2 = new ArrayList<>();
        Book newBook1 = new Book("Suhoj zakon", "Donald Duck");
        Book newBook2 = new Book("Strannik", "Shreder");
        Book newBook3 = new Book("Strannik", "Paulik");
        testList1.add(newBook1);
        testList1.add(newBook3);
        victim.bookLibrary.add(newBook1);
        victim.bookLibrary.add(newBook2);
        victim.bookLibrary.add(newBook3);
        victim.markBookIsRead(newBook2);
        testList2 = victim.returnAllIsNotReadBooks();
        assertEquals(testList1, testList2);
    }
}