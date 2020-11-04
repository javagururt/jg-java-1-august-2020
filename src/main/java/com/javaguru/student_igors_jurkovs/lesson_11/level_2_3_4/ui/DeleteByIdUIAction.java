package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.ui;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.database.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner userIdInput = new Scanner(System.in);
        System.out.println("Please enter books ID you would like to delete:");
        Long bookId = userIdInput.nextLong();
        if (bookDatabase.delete(bookId)) {
            System.out.println("Book was deleted.");
        } else {
            System.out.println("Cant find book with such ID.");
        }
    }

    @Override
    public String getAction() {
        return "Delete book";
    }

}
