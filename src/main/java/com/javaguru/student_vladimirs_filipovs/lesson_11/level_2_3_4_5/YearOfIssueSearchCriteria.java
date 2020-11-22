package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

class YearOfIssueSearchCriteria implements SearchCriteria {
    private Integer yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(Integer yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}
