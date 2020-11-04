package com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle;

import com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models.Book;
import com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.models.Library;
import com.javaguru.student_igors_jurkovs.lesson_10.level_6_middle.services.BookReaderImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    private final Library library = new Library();
    private final BookReaderImpl victim = new BookReaderImpl(library);
    private final Book book = new Book("Test", "Test author");
    private final Book book2 = new Book("test", "test author");
    private final Book book3 = new Book("Test2", "Test author2");
    private final Book book4 = new Book(" ", "test author");
    private final Book book5 = new Book("Test", "");
    private final Book book6 = new Book("Test3", "Test author3");

    @Before
    public void addBookBeforeTests() {
        victim.addBook(book);
    }

    @Test
    public void addBook() {
        boolean result = victim.addBook(book3);
        assertTrue(result);
    }

    @Test
    public void addExistingBook() {
        boolean result = victim.addBook(book2);
        assertFalse(result);
    }

    @Test
    public void addBookWithBlankName() {
        boolean result = victim.addBook(book4);
        assertFalse(result);
    }

    @Test
    public void addBookWithBlankAuthor() {
        boolean result = victim.addBook(book5);
        assertFalse(result);
    }

    @Test
    public void deleteBook() {
        boolean result = victim.deleteBook(book);
        assertTrue(result);
    }

    @Test
    public void deleteNonExistingBook() {
        boolean result = victim.deleteBook(book3);
        assertFalse(result);
    }

    @Test
    public void printBookInfo() {
        String expected = "Test [Test author]";
        String result = victim.printBookInfo(book);
        assertEquals(expected, result);
    }

    @Test
    public void findByAuthor() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        List<Book> result = victim.findByAuthor("Test author");
        assertEquals(expected, result);
    }

    @Test
    public void shouldFindByAuthorUsingOneWord() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        expected.add(book3);
        victim.addBook(book3);
        List<Book> result = victim.findByAuthor("author");
        assertEquals(expected, result);
    }

    @Test
    public void shouldNotFindByAuthor() {
        List<Book> expected = new ArrayList<>();
        List<Book> result = victim.findByAuthor("Non existing author");
        assertEquals(expected, result);
    }

    @Test
    public void findByName() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        List<Book> result = victim.findByName("Test");
        assertEquals(expected, result);
    }

    @Test
    public void shouldFindByNameUsingOneWord() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        expected.add(book3);
        victim.addBook(book3);
        List<Book> result = victim.findByAuthor("Test");
        assertEquals(expected, result);
    }

    @Test
    public void shouldNotFindByName() {
        List<Book> expected = new ArrayList<>();
        List<Book> result = victim.findByName("Non existing name");
        assertEquals(expected, result);
    }

    @Test
    public void duplicateCheck() {
        boolean result = victim.duplicateCheck(book);
        assertTrue(result);
    }

    @Test
    public void isBookNameEmpty() {
        boolean result = victim.isBookFieldsEmpty(book4);
        assertTrue(result);
    }

    @Test
    public void isBookAuthorEmpty() {
        boolean result = victim.isBookFieldsEmpty(book5);
        assertTrue(result);
    }

    @Test
    public void bookIsRead() {
        boolean result = victim.markBookAsReadOrNot(book, true);
        assertTrue(result);
    }

    @Test
    public void markingNonExistingBookAsRead() {
        boolean result = victim.markBookAsReadOrNot(book3, true);
        assertFalse(result);
    }

    @Test
    public void bookIsNotRead() {
        boolean result = victim.markBookAsReadOrNot(book, false);
        assertTrue(result);
    }

    @Test
    public void markingNonExistingBookAsNotRead() {
        boolean result = victim.markBookAsReadOrNot(book3, false);
        assertFalse(result);
    }

    @Test
    public void findAllReadBooks() {
        victim.markBookAsReadOrNot(book, true);
        victim.addBook(book3);
        victim.markBookAsReadOrNot(book3, false);
        victim.addBook(book6);
        victim.markBookAsReadOrNot(book6, true);
        List<Book> expected = Arrays.asList(book, book6);
        List<Book> result = victim.findAllReadOrNotReadBooks(true);
        assertEquals(expected, result);
    }

    @Test
    public void printReadBookList() {
        victim.markBookAsReadOrNot(book, true);
        victim.addBook(book3);
        victim.markBookAsReadOrNot(book3, false);
        victim.addBook(book6);
        victim.markBookAsReadOrNot(book6, true);
        String expected = "[Test [Test author], Test3 [Test author3]]";
        List<Book> readBooks = victim.findAllReadOrNotReadBooks(true);
        String result = victim.printBookListInfo(readBooks, true);
        assertEquals(expected, result);
    }

    @Test
    public void findAllNotReadBooks() {
        victim.markBookAsReadOrNot(book, false);
        victim.addBook(book3);
        victim.markBookAsReadOrNot(book3, true);
        victim.addBook(book6);
        victim.markBookAsReadOrNot(book6, false);
        List<Book> expected = Arrays.asList(book, book6);
        List<Book> result = victim.findAllReadOrNotReadBooks(false);
        assertEquals(expected, result);
    }

    @Test
    public void printNotReadBookList() {
        victim.markBookAsReadOrNot(book, false);
        victim.addBook(book3);
        victim.markBookAsReadOrNot(book3, true);
        victim.addBook(book6);
        victim.markBookAsReadOrNot(book6, false);
        String expected = "[Test [Test author], Test3 [Test author3]]";
        List<Book> readBooks = victim.findAllReadOrNotReadBooks(false);
        String result = victim.printBookListInfo(readBooks, false);
        assertEquals(expected, result);
    }
}