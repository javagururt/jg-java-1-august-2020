package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.database.BookDatabaseImpl;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.*;

/**
 * - автор книги "Kuper" и название "Zveroboi" searchCriteria1
 * - автор книги "Kuper" и год выпуска 1890 searchCriteria2
 * - автор книги "Kuper" или год выпуска 1890 или название "Zveroboi" searchCriteria3,4,5
 */
public class SearchCriteriaDemo {

    public static void main(String[] args) {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Kuper", "Zveroboi", 1890);

        for (int i = 0; i < 50; i++) {
            String title = String.valueOf(i);
            String author = String.valueOf(1);
            int year = 2000 + i;
            bookDatabase.save(new Book(author, title, year));
        }

        bookDatabase.save(book);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        SearchCriteria searchCriteria4 = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);

        SearchCriteria searchCriteria5 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        System.out.println(searchCriteria.match(book));
        System.out.println(searchCriteria2.match(book));
        System.out.println(searchCriteria3.match(book));
        System.out.println(searchCriteria4.match(book));
        System.out.println(searchCriteria5.match(book));

        System.out.println(bookDatabase.find(searchCriteria));

        System.out.println("--------------");

        SearchCriteria authorSearchCriteria2 = new AuthorSearchCriteria("1");

        System.out.println(bookDatabase.find(authorSearchCriteria2, 0, 9));
        System.out.println(bookDatabase.find(authorSearchCriteria2, 10, 19));
        System.out.println(bookDatabase.find(authorSearchCriteria2, 43, 50));
    }
}
