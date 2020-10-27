package com.javaguru.student_igors_jurkovs.lesson_11.level_2_intern;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    private final BookDatabaseImpl victim = new BookDatabaseImpl();
    private final Book book1 = new Book("Test author1", "Test title1");
    private final Book book2 = new Book("Test author2", "Test title2");
    private final Book book3 = new Book("Test author3", "Test title3");
    private final Book book4 = new Book("Test author2", "Test title4");
    private final Book book5 = new Book("Test author5", "Test title1");

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void addBookToBookList() {
        victim.save(book1);
    }

    @Test
    public void save() {
        Long expected = 1L;
        Long result = victim.save(book2);
        assertEquals(expected, result);
    }

    @Test
    public void findById() {
        Optional<Book> expected = Optional.of(book1);
        Optional<Book> result = victim.findById(1L);
        assertEquals(expected, result);
    }

    @Test
    public void cantFindById() {
        exception.expect(NoSuchIdException.class);
        victim.findById(4L);
    }

    @Test
    public void delete() {
        boolean result = victim.delete(1L);
        assertTrue(result);
    }

    @Test
    public void testDelete() {
        boolean result = victim.delete(book1);
        assertTrue(result);
    }

    @Test
    public void findByAuthor() {
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        List<Book> expected = Arrays.asList(book2, book4);
        List<Book> result = victim.findByAuthor("test author2");
        assertEquals(expected, result);
    }

    @Test
    public void findByTitle() {
        victim.save(book2);
        victim.save(book4);
        victim.save(book5);
        List<Book> expected = Arrays.asList(book1, book5);
        List<Book> result = victim.findByTitle("test title1");
        assertEquals(expected, result);
    }

    @Test
    public void countAllBooks() {
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        int expected = 5;
        int result = victim.countAllBooks();
        assertEquals(expected, result);
    }

    @Test
    public void deleteByAuthor() {
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        List<Book> expected = Arrays.asList(book1, book3, book5);
        victim.deleteByAuthor("test author2");
        assertEquals(expected, victim.getBookList());
    }

    @Test
    public void deleteByTitle() {
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        List<Book> expected = Arrays.asList(book2, book3, book4);
        victim.deleteByTitle("test title1");
        assertEquals(expected, victim.getBookList());
    }
}