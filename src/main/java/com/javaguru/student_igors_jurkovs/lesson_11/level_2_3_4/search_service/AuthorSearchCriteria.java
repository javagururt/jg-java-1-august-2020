package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equalsIgnoreCase(authorToSearch);
    }

}

