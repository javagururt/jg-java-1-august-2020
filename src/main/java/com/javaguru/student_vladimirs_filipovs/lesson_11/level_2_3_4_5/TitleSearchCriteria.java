package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equalsIgnoreCase(titleToSearch);
    }
}
