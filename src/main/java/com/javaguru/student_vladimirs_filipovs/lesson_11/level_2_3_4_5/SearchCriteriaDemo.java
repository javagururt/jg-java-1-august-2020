package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        Book newBook1 = new Book("Kuper", "Zveroboi", 1890);
        Book newBook2 = new Book("Kup", "Zver", 1890);

        bookDatabaseImpl.save(newBook1);

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(1890);
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(searchCriteria3, yearOfIssueSearchCriteria);

        System.out.println(searchCriteria1.match(newBook1));
        System.out.println(searchCriteria2.match(newBook1));
        System.out.println(searchCriteria3.match(newBook1));
        System.out.println(searchCriteria4.match(newBook1));
        System.out.println("-----------------------------");
        System.out.println(searchCriteria1.match(newBook2));
        System.out.println(searchCriteria2.match(newBook2));
        System.out.println(searchCriteria3.match(newBook2));
        System.out.println(searchCriteria4.match(newBook2));
    }
}

