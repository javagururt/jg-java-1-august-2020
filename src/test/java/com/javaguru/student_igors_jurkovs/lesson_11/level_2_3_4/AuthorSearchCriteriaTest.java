package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    private final String author = "test author";
    private final Book book = new Book("Test author", "Test title", 2000);
    private final Book book2 = new Book("Test author2", "Test title", 2000);
    private final SearchCriteria victim = new AuthorSearchCriteria(author);

    @Test
    public void shouldMatch() {
        boolean result = victim.match(book);
        assertTrue(result);
    }

    @Test
    public void shouldNotMatch() {
        boolean result = victim.match(book2);
        assertFalse(result);
    }

}