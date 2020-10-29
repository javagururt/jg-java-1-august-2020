package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

class TitleSearchCriteria implements SearchCriteria {

    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equalsIgnoreCase(titleToSearch);
    }

}
