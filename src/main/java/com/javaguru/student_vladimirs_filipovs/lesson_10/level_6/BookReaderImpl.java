package com.javaguru.student_vladimirs_filipovs.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    List<Book> bookLibrary = new ArrayList<>();

    @Override
    public boolean chekIsBookExist(Book book) {
        for (Book myBook : bookLibrary) {
            if (myBook.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean chekAreNameAndAuthorOnTheBook(Book book) {
        return !book.getTitle().isBlank() && !book.getAuthor().isBlank();
    }

    @Override
    public boolean putBookInLibrary(Book book) {
        if (!chekIsBookExist(book) && chekAreNameAndAuthorOnTheBook(book)) {
            bookLibrary.add(book);
            return true;
        } else {
            System.out.println(book + " already exist or incorrect book's/author's name!");
        }
        return false;
    }

    @Override
    public boolean deleteBookFromLibrary(Book book) {
        if (chekIsBookExist(book)) {
            bookLibrary.remove(book);
            return true;
        } else {
            System.out.println(book + " isn't exist!");
        }
        return false;
    }

    @Override
    public void showAllBooksInLibrary() {
        for (Book book : bookLibrary) {
            System.out.println("Book's title: " + book.getTitle() + ". Author's name: " + book.getAuthor());
        }
    }

    @Override
    public List<Book> findBookByAuthor(String findAuthor) {
        List<Book> findByAuthorsList = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.getAuthor().length() > 3 && findAuthor.length() > 3) {
                if (book.getAuthor().substring(0, 4).equalsIgnoreCase(findAuthor.substring(0, 4))) {
                    findByAuthorsList.add(book);
                }
            } else if (book.getAuthor().length() > 2 && findAuthor.length() > 2) {
                if (book.getAuthor().substring(0, 3).equalsIgnoreCase(findAuthor.substring(0, 3))) {
                    findByAuthorsList.add(book);
                }
            } else if (book.getAuthor().length() > 1 && findAuthor.length() > 1) {
                if (book.getAuthor().substring(0, 2).equalsIgnoreCase(findAuthor.substring(0, 2))) {
                    findByAuthorsList.add(book);
                }
            } else if (book.getAuthor().length() > 0 && findAuthor.length() > 0) {
                if (book.getAuthor().substring(0, 1).equalsIgnoreCase(findAuthor.substring(0, 1))) {
                    findByAuthorsList.add(book);
                }
            }
        }
        return findByAuthorsList;
    }

    @Override
    public List<Book> findBookByTitle(String findTitle) {
        List<Book> findByTitleList = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.getTitle().length() > 3 && findTitle.length() > 3) {
                if (book.getTitle().substring(0, 4).equalsIgnoreCase(findTitle.substring(0, 4))) {
                    findByTitleList.add(book);
                }
            } else if (book.getTitle().length() > 2 && findTitle.length() > 2) {
                if (book.getTitle().substring(0, 3).equalsIgnoreCase(findTitle.substring(0, 3))) {
                    findByTitleList.add(book);
                }
            } else if (book.getTitle().length() > 1 && findTitle.length() > 1) {
                if (book.getTitle().substring(0, 2).equalsIgnoreCase(findTitle.substring(0, 2))) {
                    findByTitleList.add(book);
                }
            } else if (book.getTitle().length() > 0 && findTitle.length() > 0) {
                if (book.getTitle().substring(0, 1).equalsIgnoreCase(findTitle.substring(0, 1))) {
                    findByTitleList.add(book);
                }
            }
        }
        return findByTitleList;
    }

    @Override
    public boolean markBookIsRead(Book book) {
        if (chekIsBookExist(book)) {
            book.setRead(true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean markBookIsNotRead(Book book) {
        if (chekIsBookExist(book)) {
            book.setRead(false);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Book> returnAllIsReadBooks() {
        List<Book> bookIsReadList = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (book.isRead()) {
                bookIsReadList.add(book);
                System.out.println(book.getTitle() + "[" + book.getAuthor() + "]");
            }
        }
        return bookIsReadList;
    }

    @Override
    public List<Book> returnAllIsNotReadBooks() {
        List<Book> bookIsNotReadList = new ArrayList<>();
        for (Book book : bookLibrary) {
            if (!book.isRead()) {
                bookIsNotReadList.add(book);
                System.out.println(book.getTitle() + "[" + book.getAuthor() + "]");
            }
        }
        return bookIsNotReadList;
    }
}

