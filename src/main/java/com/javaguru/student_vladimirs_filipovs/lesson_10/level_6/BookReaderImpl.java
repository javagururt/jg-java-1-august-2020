package com.javaguru.student_vladimirs_filipovs.lesson_10.level_6;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {
    ArrayList<Book> bookLibrary = new ArrayList<>();

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
        if (!book.getTitle().isBlank() && !book.getAuthor().isBlank()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean putBookInLibrary(Book book) {
        if (chekIsBookExist(book) == false && chekAreNameAndAuthorOnTheBook(book) == true) {
            bookLibrary.add(book);
            return true;
        } else {
            System.out.println(book + " already exist or incorrect book's/author's name!");
        }
        return false;
    }

    @Override
    public boolean deleteBookFromLibrary(Book book) {
        if (chekIsBookExist(book) == true) {
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
    public ArrayList<Book> findBookByAuthor(String findAuthor) {
        ArrayList<Book> findByAuthorsList = new ArrayList<>();
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
    public ArrayList<Book> findBookByTitle(String findTitle) {
        ArrayList<Book> findByTitleList = new ArrayList<>();
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
/*
    @Override
    public void bookIsRead(Book book) {
        book.isRead() = true;
    }

 */
}

class BookReaderDemo {
    public static void main(String[] args) {
        BookReaderImpl reader = new BookReaderImpl();
        Book book1 = new Book("Denjgi", "Vovan");
        Book book2 = new Book("Kak bitj krutim", "Vovan");
        Book book3 = new Book("Java Learning form Vovan", "Vovan");
        Book book4 = new Book("", "");
        Book book5 = new Book("Dva stvola", "Keksik");
        Book book6 = new Book("Dva stvola", "Vov4ik");
        reader.putBookInLibrary(book1);
        reader.putBookInLibrary(book2);
        reader.putBookInLibrary(book3);
        reader.putBookInLibrary(book2);
        reader.putBookInLibrary(book4);
        reader.putBookInLibrary(book5);
        reader.putBookInLibrary(book6);
  /*      System.out.println(reader.bookLibrary);
        reader.deleteBookFromLibrary(book2);
        System.out.println(reader.bookLibrary);
        reader.deleteBookFromLibrary(book4);
        reader.showAllBooksInLibrary();
        System.out.println();

        reader.findBookByAuthorAndPutInFoundAuthorsList("Vovan");
        reader.showAllFoundBooksByAuthor();
        System.out.println();

        reader.findBookByTitleAndPutInFoundTitleList("Java Learning form Vovan");
        reader.showAllFoundBooksByTitle();

        System.out.println("Remove finder");
        reader.clearFoundBooksByAuthor();
        reader.clearFoundBooksByTitle();
        System.out.println(reader.foundAuthors);
        System.out.println(reader.foundTitle);
*/
        System.out.println("-------------------------------------------");
        ArrayList<Book> testList1 = new ArrayList<>();
        testList1 = reader.findBookByAuthor("v");
        System.out.println(testList1);

        System.out.println("-------------------------------------------");
        ArrayList<Book> testList2 = new ArrayList<>();
        testList2 = reader.findBookByTitle("D");
        System.out.println(testList2);
    }
}
