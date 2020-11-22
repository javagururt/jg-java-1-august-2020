package com.javaguru.student_vadim_migun.lesson_11.level_2;

public interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);
}
