package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.AuthorSearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.OrSearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.SearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.YearOfIssueSearchCriteria;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    private final SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("test author");
    private final SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("2001");
    private final Book book = new Book("Test author", "Test title", 2000);
    private final Book book2 = new Book("Test author2", "Test title2", 2001);
    private final Book book3 = new Book("Test author3", "Test title3", 2002);
    private final SearchCriteria victim = new OrSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);

    @Test
    public void shouldMatchByAuthor() {
        boolean result = victim.match(book);
        assertTrue(result);
    }

    @Test
    public void shouldMatchByYear() {
        boolean result = victim.match(book2);
        assertTrue(result);
    }

    @Test
    public void shouldNotMatch() {
        boolean result = victim.match(book3);
        assertFalse(result);
    }

}