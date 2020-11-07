package com.javaguru.student_vadim_migun.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

// Сложная задача, не понимаю как все реализовать, хотелось бы разбирать на лекции подобные задачи!

class BookDatabaseImpl implements BookDatabase {

    public static final Long ID = 0L;

    private final List<Book> database = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId(ID + 1);
        database.add(book);
        return book.getId();
    }

    /*
    Добавьте в интерфейc BookDatabase следующий метод:

        boolean delete(Long bookId);

    Данный метод предназначен для удаления книги с указанным id в качестве параметра метода
    из базы данных. Медот возвращает true если книга с указанным id была найдена
    в базе данных и успешна удалена, иначе false.

    Реализуйте данный метод и протестируйте его.
     */

    @Override
    public boolean delete(Long bookId) {
        for (Book books : database) {
            if (books.getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }








}