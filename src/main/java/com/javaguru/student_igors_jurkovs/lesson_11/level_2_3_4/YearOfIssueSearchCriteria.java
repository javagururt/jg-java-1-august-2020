package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private final String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return String.valueOf(book.getYearOfIssue()).equals(yearOfIssueToSearch);
    }

}
