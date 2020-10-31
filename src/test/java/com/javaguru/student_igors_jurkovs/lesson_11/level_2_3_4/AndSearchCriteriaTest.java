package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.AndSearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.AuthorSearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.SearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.TitleSearchCriteria;
import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    private final SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("test author");
    private final SearchCriteria titleSearchCriteria = new TitleSearchCriteria("test title");
    private final Book book = new Book("Test author", "Test title", 2000);
    private final Book book2 = new Book("Test author", "Test title2", 2001);
    private final SearchCriteria victim = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

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