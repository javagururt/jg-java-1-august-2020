package com.javaguru.student_vladimirs_filipovs.lesson_10.level_3.Task_8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {
    private InMemoryDatabase victim;

    @Before
    public void setUp() {
        victim = new InMemoryDatabase();
    }

    @Test
    public void shouldSaveMilkInArray() {
        Product ourProduct = new Product("Milky");
        victim.save(ourProduct);
    }

    @Test
    public void shouldFindProductInArray() {
        Product ourProduct = new Product("Milky");
        victim.save(ourProduct);
        Product actual = victim.findByTitle("Milky");
        assertEquals(ourProduct, actual);
    }
}