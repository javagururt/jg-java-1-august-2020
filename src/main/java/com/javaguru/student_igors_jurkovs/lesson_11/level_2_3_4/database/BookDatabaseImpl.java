package com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.database;

import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.exceptions.NoSuchIdException;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.search_service.SearchCriteria;
import com.javaguru.student_igors_jurkovs.lesson_11.level_2_3_4.domain.Book;
import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.*;
@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase {

    private static final Long ID = 0L;
    private final ArrayList<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    @CodeReviewComment(teacher = "id должен увеличиваться каждый раз после сохранения")
    @Override
    public Long save(Book book) {
        book.setId(ID + 1);
        bookList.add(book);

        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        Optional<Book> optionalBook = findById(bookId);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            bookList.remove(book);

            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Book book) {

        return bookList.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {

                return Optional.of(book);
            }
        }

        throw new NoSuchIdException("No such Id");
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }

        return authorList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                titleList.add(book);
            }
        }

        return titleList;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> deleteList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                deleteList.add(book);
            }
        }
        bookList.removeAll(deleteList);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> deleteList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                deleteList.add(book);
            }
        }
        bookList.removeAll(deleteList);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book)) {
                books.add(book);
            }
        }

        return books;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria, int from, int to) {
        List<Book> books = find(searchCriteria);
        List<Book> pagedList = new ArrayList<>();
        if (to >= books.size()) {
            to = books.size() - 1;
        }
        for (int i = from; i <= to; i++) {
            if (searchCriteria.match(books.get(i))) {
                pagedList.add(books.get(i));
            }
        }

        return pagedList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        HashSet<String> authorsHashSet = new HashSet<>();
        for (Book book : bookList) {
            authorsHashSet.add(book.getAuthor());
        }

        return authorsHashSet;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titlesHashSet = new HashSet<>();
        for (Book book : bookList) {
            titlesHashSet.add(book.getTitle());
        }

        return titlesHashSet;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookList);
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Set<String> find(String text) {
        String[] splitText = text.split(" ");

        return new HashSet<>(Arrays.asList(splitText));
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorHashMap = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            authorHashMap.put(author, findByAuthor(author));
        }

        return authorHashMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            eachAuthorBookCount.put(author, findByAuthor(author).size());
        }

        return eachAuthorBookCount;
    }
}
