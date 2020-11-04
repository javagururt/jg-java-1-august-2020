package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.ui;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.database.BookDatabase;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner userBookInput = new Scanner(System.in);
        System.out.println("Please enter books author:");
        String author = userBookInput.nextLine();
        System.out.println("Please enter books title");
        String title = userBookInput.nextLine();
        System.out.println("Please enter books year of issue");
        int year = userBookInput.nextInt();
        Book book = new Book(author, title, year);
        bookDatabase.save(book);
    }

    @Override
    public String getAction() {
        return "Save book";
    }

}
