package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

class OrSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

}