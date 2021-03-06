package main.java.com.javaguru.student_igors_jurkovs.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.*/
@CodeReview(approved = true)
class Book {

    private String title; // пропущена ";"

    Book(String bookTitle) {
//      this.title = newTitle пропущена ";" и вписана не правильная переменная
        this.title = bookTitle;
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
