package com.javaguru.student_igors_jurkovs.lesson_10.level_3_junior.task_10;

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
    public void findByTitleNotNull() {
        Product result = victim.findByTitle("Test").get();
        assertEquals(product, result);
    }

    @Test
    public void findByTitleNull() {
        assertTrue(victim.findByTitle("Test2").isEmpty());
    }
}