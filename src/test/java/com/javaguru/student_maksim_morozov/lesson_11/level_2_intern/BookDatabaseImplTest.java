package com.javaguru.student_maksim_morozov.lesson_11.level_2_intern;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImplTest extends TestCase {
    private final BookDatabaseImpl test = new BookDatabaseImpl();
    private final List<Book> list = new ArrayList<>();
    private final Book book1 = new Book("Джордж Мартин","Игра пристолов");
    private final Book book2 = new Book("Стиг Ларссон","Девушка с татуировкай дракона");
    private final Book book3 = new Book("Фрэнсис Скотт Фицджеральд", "Великий Гетсби");
    private final Book book4 = new Book("Джоан Роулинг", "Гарри Поттер");

    @Before
    public void setUp(){
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);

        test.save(book1);
        test.save(book2);
        test.save(book3);
        test.save(book4);
    }

    public void testSave(){
        Long expected = 1L;
        assertEquals(expected, test.save(book3));
    }
    public void testDeletIdTrue(){assertTrue(test.delete(1L));}

    public void testDeleteIdFalse(){assertFalse(test.delete(5L));}

    public void testIsExistBookTrue() {
        assertTrue(test.isExistBook(1L));
    }

    public void testIsExistBookFalse() {
        assertFalse(test.isExistBook(2L));
    }

    public void testDeleteBookTrue() {
        assertTrue(test.delete(book1));
    }


    public void testFindBookTrue() {
        assertTrue(test.findBook(book2));
    }


    public void testFindByIdEmpty() {
        assertEquals(Optional.empty(), test.findById(2L));
    }

    public void testFindByAuthor() {
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        assertEquals(expected, test.findByAuthor("Стиг Ларссон"));
    }
    public void testFindByTitle() {
        List<Book> expected = new ArrayList<>();
        expected.add(book4);
        assertEquals(expected, test.findByTitle("Гарри Поттер"));
    }
    public void testCountAllBooks(){
        assertEquals(4, test.countAllBooks());
    }
}