package com.javaguru.student_vladimirs_filipovs.lesson_11.level_2_3_4_5;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {
    List<Book> bookList = new ArrayList<>();
    long idCounter = 1;

    @Override
    public boolean chekIsBookExist(Book book) {
        for (Book myBook : bookList) {
            if (myBook.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean chekIsNoEmptyAuthorAndTitle(Book book) {
        return !book.getTitle().isBlank() && !book.getAuthor().isBlank();
    }

    @Override
    public Long save(Book book) {
        if (chekIsNoEmptyAuthorAndTitle(book) == true && chekIsBookExist(book) == false) {
            book.setId(idCounter++);
            bookList.add(book);
        } else {
            System.out.println(book + " incorrect book's or author's name!");
        }
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> findByAuthorList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().length() > 3 && author.length() > 3) {
                if (book.getAuthor().substring(0, 4).equalsIgnoreCase(author.substring(0, 4))) {
                    findByAuthorList.add(book);
                }
            } else if (book.getAuthor().length() > 2 && author.length() > 2) {
                if (book.getAuthor().substring(0, 3).equalsIgnoreCase(author.substring(0, 3))) {
                    findByAuthorList.add(book);
                }
            } else if (book.getAuthor().length() > 1 && author.length() > 1) {
                if (book.getAuthor().substring(0, 2).equalsIgnoreCase(author.substring(0, 2))) {
                    findByAuthorList.add(book);
                }
            } else if (book.getAuthor().length() > 0 && author.length() > 0) {
                if (book.getAuthor().substring(0, 1).equalsIgnoreCase(author.substring(0, 1))) {
                    findByAuthorList.add(book);
                }
            }
        }
        return findByAuthorList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> findByTitleList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().length() > 3 && title.length() > 3) {
                if (book.getTitle().substring(0, 4).equalsIgnoreCase(title.substring(0, 4))) {
                    findByTitleList.add(book);
                }
            } else if (book.getTitle().length() > 2 && title.length() > 2) {
                if (book.getTitle().substring(0, 3).equalsIgnoreCase(title.substring(0, 3))) {
                    findByTitleList.add(book);
                }
            } else if (book.getTitle().length() > 1 && title.length() > 1) {
                if (book.getTitle().substring(0, 2).equalsIgnoreCase(title.substring(0, 2))) {
                    findByTitleList.add(book);
                }
            } else if (book.getTitle().length() > 0 && title.length() > 0) {
                if (book.getTitle().substring(0, 1).equalsIgnoreCase(title.substring(0, 1))) {
                    findByTitleList.add(book);
                }
            }
        }
        return findByTitleList;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> deleteBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                deleteBookList.add(book);
            }
        }
        bookList.removeAll(deleteBookList);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> deleteBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                deleteBookList.add(book);
            }
        }
        bookList.removeAll(deleteBookList);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchBookByCriteriaList = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book) == true) {
                searchBookByCriteriaList.add(book);
            }
        }
        return searchBookByCriteriaList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authorsList = new HashSet<>();
        for (Book book : bookList) {
            authorsList.add(book.getAuthor());
        }
        return authorsList;
    }

    @Override
    public Set<String> findUniqueTitle() {
        Set<String> titleList = new HashSet<>();
        for (Book book : bookList) {
            titleList.add(book.getTitle());
        }
        return titleList;
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> booksMap = new HashMap<>();
        for (String authorName : findUniqueAuthors()){
            booksMap.put(authorName, findByAuthor(authorName));
        }
        return booksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> uniqueBooksCountByAuthor = new HashMap<>();
        for (String authorName : findUniqueAuthors()){
            uniqueBooksCountByAuthor.put(authorName, findByAuthor(authorName).size());
        }
        return uniqueBooksCountByAuthor;
    }
}


class BookDemo {
    public static void main(String[] args) {
        BookDatabaseImpl bookData = new BookDatabaseImpl();
        Book book1 = new Book("ggg", "aaa", 1999);
        Book book2 = new Book("ggg", "aaa", 1999);
        Book book3 = new Book("ggg", "aaa", 1999);
        Book book4 = new Book("ala", "aaa", 1999);
        Book book5 = new Book("ala", "aaa", 1999);
        Book book6 = new Book("ala", "aaa", 1999);
        Book book7 = new Book("alala", "aaa", 1999);

        bookData.save(book1);
        bookData.save(book2);
        bookData.save(book3);
        bookData.save(book4);
        bookData.save(book5);
        bookData.save(book6);
        bookData.save(book7);

        System.out.println("1 ---------------------");

        System.out.println(bookData.bookList);

        System.out.println("2 ---------------------");

        long myFirstBookId = 2;
        bookData.delete(myFirstBookId);
        System.out.println(bookData.bookList);

        System.out.println("3 ---------------------");

        long myThirdBook = 3;
        System.out.println(bookData.findById(myThirdBook));

        System.out.println("4 ---------------------");

        System.out.println(bookData.countAllBooks());

        System.out.println("5 ---------------------");

        bookData.deleteByAuthor("ala");
        System.out.println(bookData.bookList);

        System.out.println("6 ---------------------");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("ggg");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("aaa");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(1999);
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        OrSearchCriteria orOrSearchCriteria = new OrSearchCriteria(orSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println(bookData.find(andSearchCriteria));

        System.out.println("7 ---------------------");

        System.out.println(bookData.find(orOrSearchCriteria));

        System.out.println("8 ---------------------");

        System.out.println(bookData.findUniqueAuthors());

        System.out.println("9 ---------------------");

        System.out.println(bookData.contains(book2));
        System.out.println(bookData.contains(book3));

        System.out.println("10---------------------");

        bookData.getAuthorToBooksMap();

        System.out.println(bookData.bookList);
    }
}
