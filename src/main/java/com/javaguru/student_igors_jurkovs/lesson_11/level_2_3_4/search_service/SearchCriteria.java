package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;

public interface SearchCriteria {

    boolean match(Book book);

}
