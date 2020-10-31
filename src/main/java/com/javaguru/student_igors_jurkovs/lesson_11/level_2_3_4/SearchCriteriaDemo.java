package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.*;

/**
 * - автор книги "Kuper" и название "Zveroboi" searchCriteria1
 * - автор книги "Kuper" и год выпуска 1890 searchCriteria2
 * - автор книги "Kuper" или год выпуска 1890 или название "Zveroboi" searchCriteria3,4,5
 */
public class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        SearchCriteria searchCriteria4 = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);

        SearchCriteria searchCriteria5 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);


    }
}
