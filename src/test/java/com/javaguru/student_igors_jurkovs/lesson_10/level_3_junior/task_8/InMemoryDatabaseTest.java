package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    private final InMemoryDatabase victim = new InMemoryDatabase();
    private final Product product = new Product("Test");

    @Before
    public void setUp() {
        victim.save(product);
    }

    @Test
    public void save() {
        boolean expected = victim.getDatabase().contains(product);
        assertTrue(expected);
    }

    @Test
    public void findByTitle() {
        Product result = victim.findByTitle("Test");
        assertEquals(product, result);
    }

    @Test
    public void cantFindByTitle() {
        Product result = victim.findByTitle("Test2");
        assertEquals(null, result);
    }

}