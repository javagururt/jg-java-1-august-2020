package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.ui;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.database.BookDatabase;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner userBookIdInput = new Scanner(System.in);
        System.out.println("Please enter books ID:");
        Long bookId = userBookIdInput.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(bookId);
        if (bookOpt.isPresent()) {
            System.out.println("You looked for: " + bookOpt.get());
        } else {
            System.out.println("There is no books with such ID.");
        }
    }

    @Override
    public String getAction() {
        return "Find book by ID.";
    }

}
