package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.ui;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.database.BookDatabase;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner userBookAuthorInput = new Scanner(System.in);
        System.out.println("Please enter books author:");
        String bookAuthor = userBookAuthorInput.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(bookAuthor);
        if (!bookList.isEmpty()) {
            System.out.println("You looked for: " + bookList);
        } else {
            System.out.println("There is no books with such author.");
        }
    }

    @Override
    public String getAction() {
        return "Find book by author.";
    }

}
