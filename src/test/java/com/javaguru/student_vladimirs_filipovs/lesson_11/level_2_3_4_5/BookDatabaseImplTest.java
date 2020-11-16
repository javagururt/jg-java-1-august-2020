package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    private BookDatabaseImpl victim;

    @Before
    public void setUp() {
        victim = new BookDatabaseImpl();
    }

    @Test
    public void saveOneBookAndGetId() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        long expectedId = 1;
        expectedList.add(book1);
        long actualId = victim.save(book1);
        assertEquals(expectedId, actualId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void saveTwoBooksAndGetId() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lexis", "Voina i mir", 1869);
        long expectedId = 2;
        expectedList.add(book1);
        expectedList.add(book2);
        victim.save(book1);
        long actualId = victim.save(book2);
        assertEquals(expectedId, actualId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void saveSimilarBooksAndGetId() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        long expectedId = 2;
        expectedList.add(book1);
        expectedList.add(book2);
        victim.save(book1);
        long actualId = victim.save(book2);
        assertEquals(expectedId, actualId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void saveOnly1BookAndGetId() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        long expectedId = 1;
        expectedList.add(book1);
        victim.save(book1);
        long actualId = victim.save(book1);
        assertEquals(expectedId, actualId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void saveOnly1BookAndGetId1() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        long expectedId = 1;
        expectedList.add(book2);
        victim.save(book1);
        long actualId = victim.save(book2);
        assertEquals(expectedId, actualId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void deleteBookById() {
        List<Book> expectedList = new ArrayList<>();
        long deleteBookId = 2;
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedList.add(book1);
        expectedList.add(book3);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.delete(deleteBookId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void deleteBookByIdNotExistsId() {
        List<Book> expectedList = new ArrayList<>();
        long bookId = 6;
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        expectedList.add(book1);
        expectedList.add(book2);
        victim.save(book1);
        victim.save(book2);
        victim.delete(bookId);
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void findBookById() {
        long bookId = 3;
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(book3, victim.findById(bookId));
    }

    @Test
    public void findBookByIdNotExistsId() {
        long bookId = 5;
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        victim.save(book1);
        victim.save(book2);
        assertEquals(Optional.empty(), victim.findById(bookId));
    }

    @Test
    public void countAllBooks() {
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        victim.bookList.add(book1);
        victim.bookList.add(book2);
        victim.bookList.add(book3);
        int actual = victim.countAllBooks();
        assertEquals(3, actual);
    }

    @Test
    public void countAllBooksZero() {
        int actual = victim.countAllBooks();
        assertEquals(0, actual);
    }

    @Test
    public void deleteBooksByAuthor() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedList.add(book3);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.deleteByAuthor("Lev");
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void deleteBooksByAuthorNotExist() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedList.add(book1);
        expectedList.add(book2);
        expectedList.add(book3);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.deleteByAuthor("Tigr");
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void deleteBooksByTitle() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i voina", 1869);
        expectedList.add(book3);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.deleteByTitle("Voina i mir");
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void deleteBooksByTitleNotExist() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedList.add(book1);
        expectedList.add(book2);
        expectedList.add(book3);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.deleteByTitle("vou vou vou, poleg4e");
        assertEquals(expectedList, victim.bookList);
    }

    @Test
    public void shouldFindBookByAuthorAndTitle() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Lev");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Voina i mir");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        expectedList.add(book1);
        expectedList.add(book2);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(expectedList, victim.find(andSearchCriteria));
    }

    @Test
    public void shouldFindBookByAuthorAndYear() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1899);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Lev");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(1869);
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        expectedList.add(book2);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(expectedList, victim.find(andSearchCriteria));
    }

    @Test
    public void shouldFindBookByAuthorOrTitle() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina", 1869);
        Book book2 = new Book("Lev4ik", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i voina", 1869);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Lev");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Voina i mir");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        expectedList.add(book1);
        expectedList.add(book2);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(expectedList, victim.find(orSearchCriteria));
    }

    @Test
    public void shouldFindBookByAuthorOrTitleOrYear() {
        List<Book> expectedList = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina", 1809);
        Book book2 = new Book("Lev4ik", "Voina i mir", 1809);
        Book book3 = new Book("Lexis", "Voina i voina", 1869);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Lev");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Voina i mir");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(1869);
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        OrSearchCriteria orOrSearchCriteria = new OrSearchCriteria(orSearchCriteria, yearOfIssueSearchCriteria);
        expectedList.add(book1);
        expectedList.add(book2);
        expectedList.add(book3);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(expectedList, victim.find(orOrSearchCriteria));
    }

    @Test
    public void shouldFindUniqueAuthors() {
        Set<String> expectedList = new HashSet<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i mir", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedList.add("Lev");
        expectedList.add("Lexis");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(expectedList, victim.findUniqueAuthors());
    }

    @Test
    public void shouldFindUniqueTitles() {
        Set<String> expectedList = new HashSet<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i voina", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedList.add("Voina i mir");
        expectedList.add("Voina i voina");
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        assertEquals(expectedList, victim.findUniqueTitle());
    }

    @Test
    public void shouldReturnBookHashMapAuthorsAndBookList() {
        Map<String, List<Book>> expectedMapList = new HashMap<>();
        List<Book> bookList1 = new ArrayList<>();
        List<Book> bookList2 = new ArrayList<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i voina", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        bookList1.add(book1);
        bookList1.add(book2);
        bookList2.add(book3);
        expectedMapList.put("Lev", bookList1);
        expectedMapList.put("Lexis", bookList2);

        victim.bookList.add(book1);
        victim.bookList.add(book2);
        victim.bookList.add(book3);
        assertEquals(expectedMapList, victim.getAuthorToBooksMap());
    }

    @Test
    public void shouldReturnBookHashMapAuthorsAndAmountOfBooks() {
        Map<String, Integer> expectedMapList = new HashMap<>();
        Book book1 = new Book("Lev", "Voina i mir", 1869);
        Book book2 = new Book("Lev", "Voina i voina", 1869);
        Book book3 = new Book("Lexis", "Voina i mir", 1869);
        expectedMapList.put("Lev", 2);
        expectedMapList.put("Lexis", 1);

        victim.bookList.add(book1);
        victim.bookList.add(book2);
        victim.bookList.add(book3);
        assertEquals(expectedMapList, victim.getEachAuthorBookCount());
    }
}
